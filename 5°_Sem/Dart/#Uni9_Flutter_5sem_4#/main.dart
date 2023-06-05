import 'package:flutter/material.dart';

void main() {
  runApp(MaterialApp(
    home: Home(),
    debugShowCheckedModeBanner: false,
  ));
}

class Home extends StatefulWidget {
  const Home({Key? key}) : super(key: key);

  @override
  _HomeState createState() => _HomeState();
}

class _HomeState extends State<Home> {
  // Variáveis de controle dos campos de texto
  final TextEditingController etanolCtrl = TextEditingController();
  final TextEditingController gasolinaCtrl = TextEditingController();
  final TextEditingController resultadoCtrl = TextEditingController();

  // Função que calcula o custo-benefício
  void _calcularMelhorCombustivel() {
    // Antes de calcular o custo-benefício, verifique se as entradas são números válidos.
    try {
      double valEtanol = double.parse(etanolCtrl.text);
      double valGasolina = double.parse(gasolinaCtrl.text);

      // Faz o cálculo
      double custoBeneficio = valEtanol / valGasolina;

      // Exibe resultado na tela
      resultadoCtrl.text = "O custo-benefício é de ${custoBeneficio.toStringAsPrecision(2)}";
      
    } catch (e) {
      // Se as entradas não forem válidas, exibe mensagem de erro para o usuário
      resultadoCtrl.text = "Valores inválidos. Por favor, digite números válidos.";
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Etanol ou Gasolina?"),
        backgroundColor: Colors.lightBlue[900],
        centerTitle: true,
        actions: <Widget>[
          IconButton(onPressed: () {
            _resetarCampos(); // Adicionamos função para limpar os campos
          },
              icon: const Icon(Icons.refresh))
        ],
      ),
      body: SingleChildScrollView(
        padding: const EdgeInsets.fromLTRB(10, 0, 10, 0),
        child: Form(
          child: Column(
            crossAxisAlignment: CrossAxisAlignment.stretch,
            children: [
              const Icon(
                Icons.local_gas_station,
                size: 120,
                color: Colors.lightBlue,
              ),
              TextFormField(
                controller: etanolCtrl,
                textAlign: TextAlign.center,
                keyboardType: const TextInputType.numberWithOptions(decimal: true),
                decoration: InputDecoration(
                    labelText: "Valor do Etanol",
                    labelStyle: TextStyle(color: Colors.lightBlue[900])),
                style: const TextStyle(fontSize: 26, color: Colors.lightBlue),
              ),
              TextFormField(
                controller: gasolinaCtrl,
                textAlign: TextAlign.center,
                keyboardType: const TextInputType.numberWithOptions(decimal: true),
                decoration: InputDecoration(
                    labelText: "Valor da Gasolina",
                    labelStyle: TextStyle(color: Colors.lightBlue[900])),
                style: const TextStyle(fontSize: 26, color: Colors.lightBlue),
              ),
              Padding(
                padding: const EdgeInsets.only(top: 10),
                child: ElevatedButton(
                  onPressed: _calcularMelhorCombustivel,
                  child: const Text("Calcular", style: TextStyle(fontSize: 20)),
                ),
              ),
              TextFormField(
                controller: resultadoCtrl,
                textAlign: TextAlign.center,
                readOnly: true,
                style: const TextStyle(fontSize: 26, color: Colors.lightBlue),
              )
            ],
          ),
        ),
      ),
    );
  }

  void _resetarCampos() {
    etanolCtrl.text = "";
    gasolinaCtrl.text = "";
    resultadoCtrl.text = "";
  }
}