<u>**CLASS NOTES - LISTS**</u>

Lists are commonly used to define characteristics. There are two types of list, they are:

> - List not ordered by numbers. `<ul>`
> - List ordered by numbers. `<ol>`

To create a list, first define the sorting type you want and then use the `<li></li>` tag to open a topic as shown in the following example:

```html
<ul> ## Unordered list by numbers.
    <li>Topic 1</li>
    <li>Topic 2</li>
</ul>
```

###### Separation between topics

You can separate topics if desired with a line. The tag can receive parameters such as width, height, color, align, etc.

`<hr width="500px" color ="#00FF00">`

###### Other types of ordered lists

There are other types of ordered lists, to change the type you want just use the type parameter.

> **Type a:** Sort the list alphabetically with lowercase letters (a, b, c, d, etc.);
>
> **Type A:** Sort the list alphabetically with capital letters (A, B, C, D, etc.);
>
> **Type I:** Sort the list in Roman numerals (I, II, III, IV etc.);

```html
<ol type="a"> ##Sort the list alphabetically with lowercase letters
    <li>Item 1</li>
</ol>

<ol type="A"> ##Sort the list alphabetically with capital letters
    <li>Item 1</li>
</ol>

<ol type="I"> ##Sort the list in Roman numerals
    <li>Item 1</li>
</ol>
```
