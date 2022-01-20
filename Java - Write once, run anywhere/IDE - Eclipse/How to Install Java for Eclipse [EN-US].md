## How to Install and Configure Eclipse :arrow_down:

**TIP: To run the CMD directly in the desired path, navigate to the location and then hold (Shift) and right-clicking choose the option "Open PowerShell Window Here".**

1. Install the program **jdk-8u241-windows-x64 (for x64 systems)**.

2. Test the following commands in CMD:

   ```powershell
   #Run both, installation went well there will be a message when running the first one.
   java -version
   javac #This command probably won't get a response yet.
   ```

3. In order to use Java commands it will be necessary to configure the **Environment Variables**.

> **<u>For Windows 10 or later</u>**
>
> 1 - Go to **My Computer** and open **Properties\Advanced System Settings\**
> 2 - Go to the "Advanced" tab and click on "Environment Variables..."
> 3 - In "System Variables" click on "New".
> 4 - Put the name of the variable *(Ex: JAVA_HOME, javac etc)*..
> 5 - Click on "Directory" and go to *(C\Program Files\Java\Jdk)* and confirm.
> 6 - At the top of the "Variable" tab, click on "Path" and then on the "Edit" button.
> 7 - Click on new and type "%JAVA_HOME%\bin".
> 8 - Now open a new CMD and test it by typing "javac -version" or "javac".
> 9 - If everything goes well the terminal should return an answer, enjoy!
>
> **<u>For Windows 7</u>**
>
> 1 - Go to **My Computer** and open **Properties\Advanced System Settings\**
> 2 - Go to the "Advanced" tab and click on "Environment Variables..."
> 3 - In "System Variables" click on "New".
> 4 - Put the name of the variable *(Ex: JAVA_HOME, javac etc)*..
> 5 - Click on "Directory" and go to *(C\Program Files\Java\Jdk)* and confirm.
> 6 - Still in "System Variables", search for "Path" and then click the "Edit" button.
> 8 - At the end of "Variable Value" add "*(\;C\Program Files\Java\Jdk\bin)*. Confirm.
> 9 - Again in "System Variables", click on new. In "Variable Name" put "CLASS_PATH", and in variable value put *(C\Program Files\Java\Jdk\lib)* and at the end add ";."
> 10 - Now open a new CMD and test it by typing "javac -version" or "javac".
> 11 - If everything goes well, the terminal should return an answer, enjoy!

4. After that just install **Eclipse** normally.