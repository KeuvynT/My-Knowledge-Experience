<u>**LESSON NOTES - IMAGE MAPPING, FAVICON AND META-TAGS**</u>

##### :framed_picture: Creating Image Mapping

Most of the image mapping is done in the `<head>` header.

**The commands are described below:**

`<map></map>`: Enables image mapping, must be inside `<head>`.

`<area></area>`: Allows defining an area to be mapped, the definition must be given through parameters.

```html
<area shape="rect"></area> #Defines a rectangular mapping shape.

<area shape="circ"></area> #Defines a circular mapping shape.

<area coords="x,y,radius"></area> #Defines mapping coordinates.

<area href="URL"></area> #Define a destination link when clicking mapped area.

<area href="URL"></area> #Define a destination link when clicking on the mapped area.

<area title="title"></area> #Defines a title for the mapped area (appears when hovering over the area).

<area alt="name"></area> #Defines a name to help the browser identify the image.
```

###### How to find image coordinates

To find the coordinate point in the image where you want to map, we use [Paint](https://support.microsoft.com/en-us/windows/abrir-o-microsoft-paint-ead1dc5c-abc4-fd2c -d81e-ebb013fbc113).

> 1. After opening the image in paint, move the mouse to the point where you want to create the rectangle or circle mapping object.
> 2. With the image open in paint, place the mouse over the point where you want to open the rectangle/circle.
> 3. The coordinates appear in the lower left corner of the program something like (100,1000 px), where the first symbolizes the X, and the second the Y.
> 4. The radius is used for circles, which is the distance between the center point and the edge of the circle. You can set the value that best suits your purpose.

##### How to assign the map to the image

Just use the **usemap** parameter. Such as: `<img src="url" usemap="mapName">`

### Defining Meta-Tags in `<head>`

The function of meta tags is to help the google search engine find your website. That's why it's necessary to put keywords.

> **How to:**
>
> 1. Inside `<head>` use the `<meta>` tag.
>
> 2. In it, use the `name` and `content` parameters to define a name and a short description.
>
> ```html
> <head>
> <meta name ="roses" content="roses of all kinds only here!">
> </head>
> ```
>
> The ideal is to define up to 5 meta-tags.

### :dagger: Adding icon to the site

The website icon must be defined inside the `<head>` header. Just use the following command:

`<link rel="shortcut icon" type="image/x-icon" href="localIcon.ico" />`

> *Ideally, the icon is on an image server to avoid problems when browsing.*
