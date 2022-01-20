<u>**ANOTACOES DA  AULA - MAPEAMENTO DE IMAGENS, FAVICON E META-TAGS**</u>

##### :framed_picture: Criando Mapeamento de Imagens

Para fazer mapeamento de imagens grande parte e feita no proprio cabecalho `<head>`. 

**Os comandos estão descritos a seguir:** 

`<map></map>`: Habilita o mapeamento de imagens, necessario estar dentro de `<head>`.

`<area></area>`: Permite definir uma area a ser mapeada, a definicao deve ser dada atraves de parametros.

```html
<area shape="rect"></area> #Define um formato retangular de mapeamento.

<area shape="circ"></area> #Define um formato circular de mapeamento.

<area coords="x,y,raio"></area> #Define as coordenadas do mapeamento.

<area href="URL"></area> #Define um link de destino ao clicar area mapeada.

<area href="URL"></area> #Define um link de destino ao clicar na area mapeada.

<area title="titulo"></area> #Define um titulo para a area mapeada (aparece ao posicionar o mouse sobre a area).

<area alt="nome"></area> #Define um nome para auxiliar o navegador a identificar a imagem.
```

###### Como descobrir as coordenadas da imagem

Para descobrir o ponto de coordenadas na imagem em que deseja fazer o mapeamento, utilizamos o [Paint](https://support.microsoft.com/pt-br/windows/abrir-o-microsoft-paint-ead1dc5c-abc4-fd2c-d81e-ebb013fbc113).

>  	1. Apos abrir a imagem no paint, mova o mouse para o ponto que deseja criar o objeto de mapeamento retangulo ou circulo.
>  	2. Com a imagem aberta no paint, coloque o mouse sobre o ponto que deseja abrir o retangulo/circulo.
>  	3. As coordenadas aparecem no canto inferior esquerdo do programa algo como (100,1000 px), aonde o primeiro simboliza o X, e o segundo o Y.
>  	4. O raio e utilizado para circulos, que e a distancia entre o ponto central e a borda do circulo. Voce pode definir o valor que mais se encaixar com o proposito.

##### Como atribuir o mapa a imagem

Basta utilizar o parametro **usemap**. Tal como: `<img src="url" usemap="nomeDoMapa">`

### Definindo Meta-Tags em `<head>`
A funcao de meta-tags e de auxiliar o motor de busca do google a encontrar o seus site. Por isso e necessario colocar palavras chaves.

> **Como fazer:**
>
> 1. Dentro de `<head>` utilize a tag `<meta>`.
>
> 2. Nela utilize os parâmetros `name` e `content` para definir um nome e uma descricao breve.
>
> ```html
> <head>
>     <meta name ="rosas" content="rosas de todo tipo somente aqui!">
> </head>
> ```
>
> O ideal e que se defina ate 5 meta-tags.

### :dagger: Adicionando icone para o site

O icone do website deve ser definido dentro do cabeçalho `<head>`. Basta utilizar o comando a seguir:

`<link rel="shortcut icon" type="image/x-icon" href="localIcon.ico" />`

> *O ideal e que o icone esteja em um servidor de imagem para evitar problemas na hora da navegacao.*
