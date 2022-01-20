### :abcd: <u>Configuração para VS CODE</u> 

Como utilizo o [Visual Studio Code](https://code.visualstudio.com/) como IDE principal, aqui deixei registrado a configuração necessária para que se possa executar e depurar algoritmos do tipo C/C++.

<u>**Extensões necessárias para o VSCode**</u>

Essas extensões são necessárias para executar algoritmos de execução e depuração em linguagem C/C++.

- **C/C++:** A extensão adiciona suporte de linguagem para C/C++ ao Visual Studio Code, incluindo recursos como IntelliSense e depuração.
- **C/C++ Compile Run: **Extensão de execução no [Visual Studio Code](https://code.visualstudio.com/).
    - *Requisitos*
      - *Se você estiver no linux você deve instalar o gcc ([ver instruções](https://github.com/danielpinto8zz6/c-cpp-compile-run/blob/HEAD/docs/COMPILER_SETUP.md#Linux))*
      - *Se você estiver na janela, deve instalar o mingw ([ver instruções](https://github.com/danielpinto8zz6/c-cpp-compile-run/blob/HEAD/docs/COMPILER_SETUP.md#Windows))*
      - *Se você estiver no mac os, deve instalar o clang ([ver instruções](https://github.com/danielpinto8zz6/c-cpp-compile-run/blob/HEAD/docs/COMPILER_SETUP.md#MacOS))*

<u>**Configurando Variável de Ambiente**</u>

1. Para que se possa utilizar comandos Java será necessário configurar as **Variáveis de Ambiente**.

> **<u>Para Windows 10</u>**
>
> 1 - Vá em **Meu Computador** e abra **Propriedades\Configurações Avançadas do Sistema\**
> 2 - Siga para aba "Avançado" e clique em "Variáveis de Ambiente..."
> 3 - Em "Path" clique em "Novo".
> 4 - Coloque o caminho do executor C *(C:\Program Files (x86)\mingw-w64\i686-8.1.0-posix-dwarf-rt_v6-rev0\mingw32\bin)
> 5 - Se tudo der certo você já poderá executar os algoritmos.

<u>**Configurando idioma do Terminal**</u>

Caso tenha problemas com acentuação em português mesmo com a biblioteca de idioma. O problema deva estar no prompt de comando do windows; Em suas propriedades o unicode por padrão esta como: 850 (OEM - Multilingual Latin I). Utilize o comando a seguir para definir o terminal como UTF-8. 

```powershell
chcp 65001
```

<u>**Configuration of Debbugger in VS-Code**</u>

Na ala de Execução e Depuração (Crtl + Shift + D), use a opção "Crie um arquivo launch.json". E escolha a opção C++ - GDB/LLB. O arquivo será criado automaticamente.
