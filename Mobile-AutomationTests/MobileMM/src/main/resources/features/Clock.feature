#language: pt
#encoding: UTF-8

Funcionalidade: Clock mobile

Eu como utilizador gostaria de adicionar um novo alarme.

Cenario: Adicionar novo alarme


Dado que o usuario acione o menu alarme
Quando o utilizador acionar o botao adicionar alarme
E configurar a hora desejada para "3:30","AM"
Entao o app adiciona o novo alarme com as informacoes:
 |Repeat                  |
 |Default (Cesium)        |
 |Label                   |
 |Google Assistant Routine|
 |Delete                  |
