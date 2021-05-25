SET NEWLINE=^& echo.

FIND /C /I "activate.adobe.com" %WINDIR%\system32\drivers\etc\hosts
IF %ERRORLEVEL% NEQ 0 ECHO %NEWLINE%^127.0.0.1                   dposoft.net>>%WINDIR%\system32\drivers\etc\hosts

FIND /C /I "practivate.adobe.com" %WINDIR%\system32\drivers\etc\hosts
IF %ERRORLEVEL% NEQ 0 ECHO ^127.0.0.1                   www.dposoft.net>>%WINDIR%\system32\drivers\etc\hosts