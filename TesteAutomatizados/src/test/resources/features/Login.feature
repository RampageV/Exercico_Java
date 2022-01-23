#language: pt
#enconding: UTF-8

@Login
Funcionalidade: Login

Cenario: Usuario invalido
Quando eu informar o usuario "1"
E informar a senha "1"
E clica no botao login
Entao o sistema exibe a mensagem de usuario invalido

@loginComSucesso
Cenario: Realizar login
Quando eu informar o usuario "Admin"
E informar a senha "admin123"
E clica no botao login
Entao o sistema exibe usuario logado


