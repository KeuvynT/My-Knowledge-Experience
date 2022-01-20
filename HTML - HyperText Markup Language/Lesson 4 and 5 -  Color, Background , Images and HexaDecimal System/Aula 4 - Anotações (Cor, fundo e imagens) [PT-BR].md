#### <u>**ANOTACOES DA QUARTA AULA - CORES, FUNDO E IMAGENS**</u>

##### O que sao Codigos Hexadecimais?

Codigos Hexadecimais possuem 6 digitos que representam uma cor.

> **#000000** : Preto.
> **#FF0000** : Vermelho.
> **#FFF000** : Amarelo.
> *Estes parametros podem ser aplicados em tags como `<font>` e `<body>`.*

##### Utilizando Hexa Decimais

De forma pratica pode se aplicar os parametros da seguinte maneira: 

```HTML
<font color="#000000">texto</font>
<body bgcolor="#000000">fundo da pagina muda de cor</body>
```

##### Colocando imagem como tela de fundo

- Para colocar imagens de fundo e importante entender **o que ? URL**. Trata-se do caminho onde se encontra o arquivo ou imagem que deseja buscar, se a imagem estiver na mesma pasta de "index.html", basta coloca o nome da imagem e extensao do arquivo utilizando o parametro "background".

- Tambem e possivel buscar uma imagem dentro de uma pasta. De forma pratica o codigo se dara da seguinte maneira. Considere a pasta onde esta **index.html** como raiz. 

  `<body background="nomeImagem.png">`: Localizacao da imagem junto a index.html.

  `<body background="pasta/nomeImagem.png">`: Localizacao da imagem dentro de uma pasta.

----------------------------------------------------------------------------