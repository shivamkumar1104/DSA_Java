@echo off
echo Starting Auto-Push script for DSA...
echo It will check and push your code to GitHub every 4 hours.
echo Keep this window open while you are coding.
echo Press Ctrl+C to stop.
echo.

:loop
echo [%time%] Checking for changes...
git add -A
git commit -m "Auto-commit: update DSA practice" >nul 2>&1
git push origin main >nul 2>&1

timeout /t 14400 /nobreak >nul
goto loop
