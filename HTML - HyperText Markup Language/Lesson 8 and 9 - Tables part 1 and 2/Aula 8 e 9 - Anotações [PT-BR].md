<u>**ANOTAÇÕES DA  AULA - TABELAS PARTE 1 E 2**</u>

* A tag ``<table>`` aceita parâmetros que já conhecemos como width (largura), height (altura), align (alinhamento) além de outros que serão mencionados abaixo.

:asterisk: **TAGs aprendidas nesta aula:**

``<table></table>``: Abrir tabela.

``<table border="1"></table>``: Define espessura da borda da tabela.

``<table bordercolor="#FF0000"></table>``: Define uma cor para borda da tabela.

``<tr></tr>``: Cria uma linha na  tabela. Aceita os parâmetros width e height.

``<td></td>``: Cria uma coluna na  tabela. Aceita os parâmetros width e height.

`<table cellpadding="5"></table>`: Distancia do texto das bordas da Tabela.

`<table colspan ="numeroDeColuna"></table>`: Mescla um número de colunas da tabela horizontalmente.

`<table rowspan="numeroDeColuna"></table>`: Mescla um número de colunas da tabela verticalmente.

**Na prática o código de uma tabela é construído da seguinte maneira:** No exemplo, uma tabela de produtos e preços.

```html
<table width ="400" height="" border="1" bordercolor ="#FF0000">
	<tr> ## Cria uma linha
		<td><strong>Camisetas</td></strong> ## Cria uma coluna
		<td><strong>Calças</td></strong>
		<td><strong>Meias</td></strong>
	</tr>
	<tr> ## Cria uma nova linha
    	<td>R$ 10,00</td>
    	<td>R$ 6,00</td>
    	<td>R$ 3,00</td>
	</tr>
<table>	
```
