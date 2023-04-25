docker run ^
-it --rm ^
-p 80:80 -p 3306:3306 ^
--mount type=bind,src=%~dp0,dst=/root/host_fs ^
se-jets-sp2023

REM --network host ^