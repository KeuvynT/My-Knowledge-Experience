<u>**Extensões no VS-Code**</u>

- **Prettier-Code Formatter:** Impõe um estilo de código consistente em toda base do código deixando-o mais bonito.
- **Editor Config for VS-Code:** Facilita a adoção e padronização de código para vários editores e IDES.
- **Markdown Preview Github Styling:** Abre uma aba para visualização em tempo real de edição md.
- **ESLint:** Ferramenta de Análise de Código para identificar padrões problemáticos encontrados em JavaScript.

<u>**Extensões Chrome**</u>

- **Wappalyzer:** Mostra as tecnologias utilizadas em um site.

* **WhatFont:** Mostra as fontes utilizadas.

* **ColorPick Eyedroppert:** Mostra a cor utilizada no pixel da página.

* **Gofullpage:** Captura uma pagina inteira na web como foto.

* **SimilarWeb:** Mostra o indice de visitação do site.

  

<u>**Explicação Adicional Sobre Extensões**</u>

**Editor Config for VSCode**:

1. **É necessário configurar, crie um arquivo chamado (.editorconfig).**

2. **Defina as pastas em que serão aplicadas as regras de formatação.** 

   ````
   ## EXEMPLOS
   
   ## Aplica a formatação em ambos os arquivos especificos.
   [{package.json,.travis.yml}]
   
   ## Aplica a formatação em todos os arquivos do projeto.
   [*]
   
   ## Aplica a formatação em todos os arquivos do projeto.
   [*]
   
   ## Aplica a formatação em todos os arquivos desta extensão.
   [*.json]
   
   ## Aplica a formatação em todos os arquivos no diretório assets.
   [src/assets/**/*]
   ````

   

3. **Defina as propriedades de formatação. Qualquer arquivo editado após a configuração as regras serão aplicadas.**

```
## Faz com que o EditorConfig pare de procurar outros arquivos .editorconfig
root = true

## Define o tipo de endentação.
indent_style = (space/tab)

## Define o tamanho da endentação.
indent_size = (numero inteiro)

## Define o tipo de caractere para quebra de linha.
end_of_line = (cr/crlf/lf/unset)

## Define o tipo de caracteres.
charset = (valor, padrão utf-8)

## Define se adiciona ou não uma linha em branco no final dos arquivos.
trim_trailing_whitespace = true/false/unset
```

