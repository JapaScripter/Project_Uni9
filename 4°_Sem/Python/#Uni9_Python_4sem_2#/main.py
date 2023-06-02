#Include de Biblioteca que cria plot#
import matplotlib.pyplot as plt

#Include de Biblioteca que cria uma imagem 3d do plot#
import mpl_toolkits.mplot3d  # noqa: F401


#Include Biblioteca de aprendizado e máquina#
from sklearn import datasets
from sklearn.decomposition import PCA

#Import datasets#
iris = datasets.load_iris()
X = iris.data[:, :2]  # we only take the first two features.
y = iris.target

x_min, x_max = X[:, 0].min() - 0.5, X[:, 0].max() + 0.5
y_min, y_max = X[:, 1].min() - 0.5, X[:, 1].max() + 0.5

plt.figure(2, figsize=(8, 6))
plt.clf()

#Plotar Bolhas#
plt.scatter(X[:, 0], X[:, 1], c=y, cmap=plt.cm.Set1, edgecolor="k")
plt.xlabel("Sepal length")
plt.ylabel("Sepal width")

plt.xlim(x_min, x_max)
plt.ylim(y_min, y_max)
plt.xticks(())
plt.yticks(())

#Plotar a Primeira Árvore PCA (Principal Component Analysis)#
fig = plt.figure(1, figsize=(8, 6))
ax = fig.add_subplot(111, projection="3d", elev=-150, azim=110)

X_reduced = PCA(n_components=3).fit_transform(iris.data)
ax.scatter(
    X_reduced[:, 0],
    X_reduced[:, 1],
    X_reduced[:, 2],
    c=y,
    cmap=plt.cm.Set1,
    edgecolor="k",
    s=40,
)

ax.set_title("First three PCA directions")
ax.set_xlabel("1st eigenvector")
ax.w_xaxis.set_ticklabels([])
ax.set_ylabel("2nd eigenvector")
ax.w_yaxis.set_ticklabels([])
ax.set_zlabel("3rd eigenvector")
ax.w_zaxis.set_ticklabels([])

plt.show()

"""
# Sistema de produção (Jogo Herói e Vilão) Objetivo do jogo é que o herói ande pelas células até encontrar o vilão.
# Mundo do jogo
mundo = [
  [0, 'V', 0, 0], 
  [0, 0, 0, 0], 
  [0, 0, 'H', 0], 
  [0, 0, 0, 0],
]

# Defini a posição inicial do vilão e do herói
posicao_heroi = (2, 2)
posicao_vilao = (0, 1)

def dar_passo_esquerda(linha, coluna):
  print("Um passo para a esquerda");
  mundo[linha][coluna - 1] = 'H';
  mundo[linha][coluna] = '*';
  imprimir_mundo(),

def dar_passo_direita(linha, coluna):
  print("Um passo para a direita");
  mundo[linha][coluna + 1] = 'H';
  mundo[linha][coluna] = '*';
  imprimir_mundo(),

def dar_passo_cima(linha, coluna):
  print("Um passo para cima");
  mundo[linha - 1][coluna] = 'H'
  mundo[linha][coluna] = '*'
  imprimir_mundo(),

def dar_passo_baixo(linha, coluna):
  print("Um passo para baixo");
  mundo[linha + 1][coluna] = 'H';
  mundo[linha][coluna] = '*';
  imprimir_mundo(),

def imprimir_mundo():
  for linha in range(0, 4):
    for coluna in range(0, 4):
      print(f'[{mundo[linha][coluna]:^3}]', end='');
    print()

# regras definidas
vilao_vivo = True
while (vilao_vivo):
  if posicao_heroi == posicao_vilao:
    vilao_vivo = False;
  if posicao_heroi[1] > posicao_vilao[1]:
      dar_passo_esquerda(posicao_heroi[0], posicao_heroi[1]);
  posicao_heroi = (posicao_heroi[0], posicao_heroi[1] - 1);
  if posicao_heroi[1] < posicao_vilao[1]:
      dar_passo_direita(posicao_heroi[0], posicao_heroi[1]);
  posicao_heroi = (posicao_heroi[0], posicao_heroi[1] + 1);
  if posicao_heroi[0] > posicao_vilao[0] :
      dar_passo_cima(posicao_heroi[0], posicao_heroi[1]);
  posicao_heroi = (posicao_heroi[0] - 1, posicao_heroi[1]);
  if posicao_heroi[0] < posicao_vilao[0] :
      dar_passo_baixo(posicao_heroi[0], posicao_heroi[1]);
  posicao_heroi = (posicao_heroi[0] + 1, posicao_heroi[1]);
  print()