<u>**ANOTAÇÕES DA  AULA - LINKS INTERNOS E DIV'S**</u>

##### :globe_with_meridians: Linguagem da Página

- Defina uma linguagem para página sempre antes da tag `<html>` para evitar problemas com acentuação em português. Basta colocar o seguinte
  codigo antes de `<html>`: `<!DOCTYPE html>`
  
  Assim, com HTML 5 ele ja identificara a linguagem utilizada.

##### Direcionamento dentro da Página (Links Internos)

Os links internos servem para navegar facilmente dentro da mesma página, isto é muito útil quando a página é verticalmente grande.

Para isso é necessário criar um link com `<a href>` porém utilizando "#" aonde deveriamos colocar a URL, ao fazermos isso não será atribuído a ele uma URL, mas uma identificação que poderemos chamar com a tag `<a = name="nomeID"></a>`. Na prática ficara desta maneira:

```html
<a href=#centroPagina></a> #Este deve ser colocado no botao ou texto.
<a name="centroPagina"></a> #Este deve ser colocado no ponto que deseja levar o usuario.
```

Desta forma, o primeiro  código faz referencia ao segundo, que por sua vez, conduz o usuário ao local em que está o segundo ponto dentro da página.

##### DIV'S

As DIV's são basicamente blocos dentro da página. Elas são realmente poderosas somadas com a linguagem de programação CSS. Com elas, é possível criar um ou vários layout compactos dentro da página WEB, como diversos pedaços de layout que chamamos de div.

`<div id="nome"></div>`: Abre uma div e a identifica.

----------------------------------------------------------------------
