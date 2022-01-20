#### <u>**LESSON NOTES - COLORS, BACKGROUND AND IMAGES**</u>

##### What are Hexadecimal Codes?

Hexadecimal codes have 6 digits that represent a color.

> **#000000** : Black.
> **#FF0000** : Red.
> **#FFF000** : Yellow.
> *These parameters can be applied to tags such as `<font>` and `<body>`.*

##### Using Hexa Decimals

Practically, the parameters can be applied as follows:

```HTML
<font color="#000000">text</font>
<body bgcolor="#000000">page background changes color</body>
```

##### Setting image as background

- To place background images it is important to understand **what is URL**. This is the path where the file or image you want to find is located, if the image is in the same folder as "index.html", just put the image name and file extension using the "background" parameter.

- It is also possible to search for an image within a folder. Practically, the code will be as follows. Consider the folder where **index.html** is located as root.

  `<body background="imageName.png">`: Image location next to index.html.

  `<body background="folder/imageName.png">`: Image location within a folder.

----------------------------------------------------------------------------