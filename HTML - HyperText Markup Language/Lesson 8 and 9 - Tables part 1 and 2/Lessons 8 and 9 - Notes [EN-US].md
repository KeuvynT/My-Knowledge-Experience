<u>**LESSON NOTES - TABLES PART 1 AND 2**</u>

* The ``<table>`` tag accepts parameters that we already know like width, height, align and others that will be mentioned below.

:asterisk: **TAGs learned in this class:**

``<table></table>``: Open table.

``<table border="1"></table>``: Sets table border thickness.

``<table bordercolor="#FF0000"></table>``: Sets a color for the table border.

``<tr></tr>``: Creates a row in the table. Accepts width and height parameters.

``<td></td>``: Creates a column in the table. Accepts width and height parameters.

`<table cellpadding="5"></table>`: Distance of the text from the edges of the Table.

`<table colspan ="numberColumns"></table>`: Merges a number of table columns horizontally.

`<table rowspan="numberColumns"></table>`: Merges a number of table columns vertically.

**In practice, the code of a table is constructed as follows:** In the example, a table of products and prices.

```html
<table width ="400" height="" border="1" bordercolor ="#FF0000">
	<tr> ## Create a line
		<td><strong>T-shirts</td></strong> ## Create a Column
		<td><strong>Pants</td></strong>
		<td><strong>Socks</td></strong>
	</tr>
	<tr> ## Create a new line
    	<td>$ 10,00</td>
    	<td>$ 6,00</td>
    	<td>$ 3,00</td>
	</tr>
<table>	
```
