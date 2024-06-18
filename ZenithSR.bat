@echo off

rem YOUR JAVA CONFIGS HERE
set JAVA_EXE="java"

:generateproto
    choice /c yn /m "Do you want to generateproto ? "
    if errorlevel 2 goto jar
    if errorlevel 1 goto process_proto

:process_proto
    call gradlew generateproto
    goto jar

:jar
    choice /c yn /m "Do you want to build jar ? "
    if errorlevel 2 goto execute
    if errorlevel 1 goto process_jar

:process_jar
    call gradlew jar
    goto execute

:execute
    choice /c yn /m "Do you want to run ZenthSR ? "
    if errorlevel 2 goto end
    if errorlevel 1 goto process_execute

:process_execute
    %JAVA_EXE% -jar ZenithSR.jar
    echo Press any key to exit...
    pause > nul
    goto end

:end
