<u>**LESSON NOTES - INTERNAL LINKS AND DIV'S**</u>

##### :globe_with_meridians: Page Language

- Set a language for the page always before the `<html>` tag to avoid problems with accents in Portuguese. just put the following
  code before `<html>`: `<!DOCTYPE html>`
  
  Thus, with HTML 5 it will already identify the language used.

##### Targeting within the Page (Internal Links)

Os links internos servem para navegar facilmente dentro da mesma página, isto é muito útil quando a página é verticalmente grande.

For this it is necessary to create a link with `<a href>` but using "#" where we should put the URL, when we do this it will not be assigned a URL, but an identification that we can call with the tag `<a = name ="nameID"></a>`. In practice it will look like this:

```html
<a href=#centerOfPage></a> #This must be placed on the button or text.
<a name="centerOfPage"></a> #This must be placed at the point you want to take the user.
```

In this way, the first code references the second, which in turn leads the user to the location of the second point within the page.

##### DIV'S

DIV's are basically blocks within the page. They are really powerful in addition to the CSS programming language. With them, it is possible to create one or several compact layouts within the WEB page, such as several pieces of layout that we call a div.

`<div id="name"></div>`: Open a div and identify it.

----------------------------------------------------------------------
