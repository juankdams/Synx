@echo off
title Projet Syn Par Crystal
:loop
java -jar -javaagent:Syn_lib/aspectjweaver-1.7.1.jar -Xmx24m -Xms8m Syn.jar
goto loop
PAUSE