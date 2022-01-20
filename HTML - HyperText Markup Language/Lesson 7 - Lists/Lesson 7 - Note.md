<u>**ANOTAÇÕES DA AULA - LISTAS**</u>

Listas normalmente são usadas para definir características. Existem dois tipos de lista, são elas:

> - Lista não ordenada em números. `<ul>`
> - Lista ordenada em números. `<ol>`

Para criar uma lista, defina primeiro tipo de ordenação que deseja e então utilize a tag `<li></li>` para abrir um tópico conforme o exemplo a seguir:

```html
<ul> ## Lista não ordenada em números.
    <li>Topico 1</li>
    <li>Topico 2</li>
</ul>
```

###### Separação entre tópicos

É possível separar os tópicos se desejar com uma linha. A tag pode receber parametros como width (largura), height (altura), color, align etc.

`<hr width="500px" color ="#00FF00">`

###### Outros tipos de listas ordenadas

Existem outros tipos de listas ordenadas, para mudar o tipo que deseja basta utilizar o parâmetro type.

> **Type a:** Ordena a lista em ordem alfabética com letras minúsculas (a, b, c, d etc.)
>
> **Type A:** Ordena a lista em ordem alfabética com letras maiúsculas (A, B, C, D etc.)
>
> **Type I:** Ordena a lista em algarismos romanos (I, II, III, IV etc.)

```html
<ol type="a"> ##Ordem alfab?tica com letras minusculas.
    <li>Item 1</li>
</ol>

<ol type="A"> ##Ordem alfab?tica com letras maiusculas.
    <li>Item 1</li>
</ol>

<ol type="I"> ##Ordena a lista em algarismos romanos.
    <li>Item 1</li>
</ol>
```
