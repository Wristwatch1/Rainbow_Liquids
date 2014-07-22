@echo off

echo welcome to freddag's gradle interface.

if exist build (
goto q1   
) else (
goto q2
)

:q1
echo would you like to update or build?(e to exit)
set INPUT=
set /P INPUT=B/U: %=%


if /I "%INPUT%"=="u" goto setup-1
if /I "%INPUT%"=="b" goto build
if /I "%INPUT%"=="e" goto end
if /I "%INPUT%"=="c" goto setup-3
goto error1

:q2
echo would you like to run gradle setup for the first time for this mod?

set /P INPUT=Y/N: %=%

if /I "%INPUT%"=="y" goto setup-1
if /I "%INPUT%"=="n" goto end
if /I "%INPUT%"=="e" goto end
goto error2


:setup-1
call gradlew setupDevWorkspace


goto setup-2

:setup-2
call gradlew eclipse

goto end
:setup-3
echo cleaning build folder
call gradlew clean

goto setup-1

:build
echo have you set up your build.gradle correctly?

set INPUT=
set /P INPUT=Y/N: %=%

if /I "%INPUT%"=="y" goto build2
if /I "%INPUT%"=="n" goto error3

:build2
call gradlew.bat build
goto end

:end
pause
cls
echo thank you for using freddag's gradle interface.
pause
exit

:error1
echo sorry i didnt understand please try agian.

goto q1

:error2
echo sorry i didnt understand please try agian.

goto q2

:error3
cls
echo please setup your build.gradle correctly for information of this vist http://www.minecraftforge.net/forum/index.php?topic=14048.0
pause
goto q1

