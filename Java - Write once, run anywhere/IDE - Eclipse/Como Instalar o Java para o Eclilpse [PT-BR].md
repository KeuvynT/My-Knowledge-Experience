## Como Instalar e configurar o Eclipse :arrow_down:

**DICA: Para executar o CMD diretamente no caminho desejado, navegue até o local e então segure (Shift) e clicando com o botão direito do mouse escolha a opção "Abrir Janela do PowerShell aqui".**

1. Instale o programa **jdk-8u241-windows-x64 (para sistemas x64)**.

2. Teste no CMD os comandos a seguir:

   ```powershell
   #Execute ambos, a instalação ocorreu bem haverá uma mensagem ao executar o primeiro.
   java -version
   javac #Este comando provavelmente não trará resposta ainda.
   ```

3. Para que se possa utilizar comandos Java será necessário configurar as **Variáveis de Ambiente**.

> **<u>Para Windows 10 ou mais</u>**
>
> 1 - Vá em **Meu Computador** e abra **Propriedades\Configurações Avançadas do Sistema\**
> 2 - Siga para aba "Avançado" e clique em "Variáveis de Ambiente..."
> 3 - Em "Variáveis do Sistema" clique em "Novo".
> 4 - Coloque o nome da variável *(Ex: JAVA_HOME, javac etc)*..
> 5 - Clique em "Diretório" e vá em *(C\Arquivos de Programas\Java\Jdk)* e confirme.
> 6 - Em cima na aba "Variável" clique em "Path" e em seguida no botão "Editar".
> 7 - Clique em novo e digite "%JAVA_HOME%\bin".
> 8 - Agora abra um novo CMD e faça o teste digitando "javac -version" ou "javac".
> 9 - Se tudo der certo o terminal deverá retornar uma resposta, aproveite!
>
> **<u>Para Windows 7</u>**
>
> 1 - Vá em **Meu Computador** e abra **Propriedades\Configurações Avançadas do Sistema\**
> 2 - Siga para aba "Avançado" e clique em "Variáveis de Ambiente..."
> 3 - Em "Variáveis do Sistema" clique em "Novo".
> 4 - Coloque o nome da variável *(Ex: JAVA_HOME, javac etc)*..
> 5 - Clique em "Diretório" e vá em *(C\Arquivos de Programas\Java\Jdk)* e confirme.
> 6 - Ainda em "Variáveis do Sistema", procurar por "Path" e então clique no botão "Editar."
> 8 - Ao final de "Valor da Variável" adicione "*(\;C\Arquivos de Programas\Java\Jdk\bin)*. Confirme.
> 9 - Novamente em "Variáveis do Sistema", clique em novo. Em "Nome da Variável" coloque "CLASS_PATH", e em valor da variável coloque *(C\Arquivos de Programas\Java\Jdk\lib)* e no final adicione ";."
> 10 - Agora abra um novo CMD e faça o teste digitando "javac -version" ou "javac".
> 11 - Se tudo der certo o terminal deverá retornar uma resposta, aproveite!

4. Após isto basta instalar o **Eclipse** normalmente.