### :abcd: <u>Configuration for  VS CODE</u>

As I use [Visual Studio Code](https://code.visualstudio.com/) as the main IDE, here I have registered the necessary configuration to be able to run and debug C/C++ algorithms.

<u>**Required extensions for VSCode**</u>

These extensions are needed to run C/C++ language execution and debugging algorithms.

- **C/C++:** The extension adds language support for C/C++ to Visual Studio Code, including features like IntelliSense and debugging.
- **C/C++ Compile Run: **Run extension in [Visual Studio Code](https://code.visualstudio.com/).
  - *Requirements*
    - *If you are on linux you must install gcc ([see instructions](https://github.com/danielpinto8zz6/c-cpp-compile-run/blob/HEAD/docs/COMPILER_SETUP.md#Linux))*
    - *If you are in window, you must install mingw ([see instructions](https://github.com/danielpinto8zz6/c-cpp-compile-run/blob/HEAD/docs/COMPILER_SETUP.md#Windows))*
    - *If you are on mac os you must install clang ([see instructions](https://github.com/danielpinto8zz6/c-cpp-compile-run/blob/HEAD/docs/COMPILER_SETUP.md#MacOS)) *

<u>**Setting Environment Variable**</u>

In order to use Java commands it will be necessary to configure the **Environment Variables**.

> **<u>For Windows 10</u>**
>
> 1 - Go to **My Computer** and open **Properties\Advanced System Settings\**
> 2 - Go to the "Advanced" tab and click on "Environment Variables..."
> 3 - In "Path" click on "New".
> 4 - Put the path of the C executor *(C:\Program Files (x86)\mingw-w64\i686-8.1.0-posix-dwarf-rt_v6-rev0\mingw32\bin)
> 5 - If everything goes well you will be able to run the algorithms.

<u>**Configuration of Debbugger in VS-Code**</u>

In the Execution and Debugging wing (Crtl + Shift + D), use the option "Create a launch.json file". And choose C++ - GDB/LLB option. The file will be created automatically.
