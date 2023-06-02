# Dados #
nome = input('Qual é o seu primeiro nome?\n').upper()
sobrenome = input('Qual é o seu sobrenome?\n').upper()
while True:
	tel = input('Qual é o seu ddd + número de celular?(somente números) \n')
	if len(tel) == 11: break
	else:
		print('O número do celular é obrigatório ter 11 digitos...')
while True:
	cep = input('Qual é o seu CEP?(somente números) \n')
	if len(cep) == 8: break
	else:
		print('O número do CEP é obrigatório ter 8 digitos...')
endereço = input('Qual é o seu Endereço?\n')
tel = '({}) {} {}-{}'.format(tel[:2], tel[2:3], tel[3:7], tel[7:11])
cep = '{}-{}'.format(cep[:5], cep[5:8])
print('\n Seu nome é: %s ' % nome + sobrenome, '.')
print('\n Seu telefone é: %s.' % tel)
print('\n Seu CEP é: %s.' % cep)
print('\n Seu endereço é: %s.' % endereço, '\n')

# End Dados #

# Pizza Tupla #
pizzas = ('1 - Portuguesa','R$ 27,90',
					'2 - 4 Queijos','R$ 30,99',
					'3 - Califórnia','R$ 40,90',
					'4 - Beijinho','R$ 29,99',
					'5 - Baiana','R$ 35,90',
					'6 - Atum','R$ 38,99',
					'7 - Dois Amores','R$ 25,90',
					'8 - Chocolate','R$ 30,99',
					'9 - Nutella','R$ 39,90',
					'10 - Personalizada','R$ 50,00'
				 )
# End Pizza Tupla #

"""
# Pizza List #
[
	[1,'Portuguesa',27.90],[2,'4 Queijos', 30.99],
	[3,'Califórnia',40.90],[4,'Beijinho',29.99],
	[5,'Baiana',35.90],[6,'Atum',38.99],
	[7,'Dois Amores',25.90],[8,'Chocolate',30.99],
	[9,'Nutella',39.90],[10,'Personalizada',50.00]
]
# End Pizza List #
"""

# If + Input #
pergunta = input(nome + ', você confere todos os dados apresentados? S ou N \n').upper()
if pergunta == 'SIM' or 'SI' or 'YES' or 'S':
	print('-' * 50)
	print(f'{"CARDAPIO DAS PIZZAS":^50}')
	print('-' * 50)
	for pos in range (0, len(pizzas)):
		if pos % 2 == 0:
			print(f'{pizzas[pos]:.<40}', end='')
		else:
			print(f'{pizzas[pos]:>10}')
	print('-' * 50)
elif pergunta == 'NÃO' or 'NAO' or 'NO' or 'N':
	print(nome)
# End If + Input #

# Escolha #
escolher = input('\n Escolha uma pizza: \n').upper()
for escolha in escolher:
	if escolha == '1' or 'PORTUGUESA':
		print(nome + ', você escolheu a pizza de Portuguesa')
	elif escolha == '2' or '4 QUEIJOS' or '4QUEIJOS':
		print(nome + ', você escolheu a pizza de 4 Queijos')
	elif escolha == '3' or 'CALIFORNIA' or 'CALIFÓRNIA':
		print(nome + ', você escolheu a pizza de Califórnia')
	elif escolha == '4' or 'BEIJINHO':
		print(nome + ', você escolheu a pizza de Beijinho')
	elif escolha == '5' or 'BAIANA':
		print(nome + ', você escolheu a pizza de Baiana')
	elif escolha == '6' or 'ATUM':
		print(nome + ', você escolheu a pizza de Atum')
	elif escolha == '7' or 'DOIS AMORES' or 'DOISAMORES':
		print(nome + ', você escolheu a pizza de Dois Amores')
	elif escolha == '8' or 'CHOCOLATE':
		print(nome + ', você escolheu a pizza de Chocolate')
	elif escolha == '9' or 'NUTELLA' or 'NUTELA':
		print(nome + ', você escolheu a pizza de Nutella')
	elif escolha == '10' or 'PERSONALIZADO':
		print(nome + ', você escolheu a pizza Personalizada')
# End Escolha #

# Preços #
	print('O valor total é de R$')
if escolha == '1' or 'PORTUGUESA':
	print(27.90)
elif escolha == '2' or '4 QUEIJOS' or '4QUEIJOS':
	print(30.99)
elif escolha == '3' or 'CALIFORNIA' or 'CALIFÓRNIA':
	print(40.90)
elif escolha == '4' or 'BEIJINHO':
	print(29.99)
elif escolha == '5' or 'BAIANA':
	print(35.90)
elif escolha == '6' or 'ATUM':
	print(38.99)
elif escolha == '7' or 'DOIS AMORES' or 'DOISAMORES':
	print(25.90)
elif escolha == '8' or 'CHOCOLATE':
	print(30.99)
elif escolha == '9' or 'NUTELLA' or 'NUTELA':
	print(39.90)
elif escolha == '10' or 'PERSONALIZADO':
	print(50.00)
# End Preços #

# Outra Pizza #
outra = input('\n Deseja escolher outra pizza? S ou N \n').upper()
if outra == 'SIM' or 'SI' or 'YES' or 'S':
	print(escolher)
elif outra == 'NÃO' or 'NAO' or 'NO' or 'N':
	print('Ok o pagamento será feito com cartão ou dinheiro')
# End Outra Pizza #