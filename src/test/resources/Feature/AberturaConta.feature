@tag
Feature: Abertura de conta

  @tag1
  Scenario Outline: Abertura de conta
  Given que o usuario acesse a url "https://www.bancointer.com.br/"
  And selecionar o botao abrir conta
  #When preencher o formulario de abertura de conta
  And preencher o campo com o nome "<nome>"
  And preencher o campo com o telefone "<telefone>"
  And preencher o campo com o email "<email>"
  And preencher o campo com o cpf "<cpf>"
  And preencher o campo com a data de nascimento "<data de nascimento>"
  And selecionar o checkbox de autorização
 	And selecionar o botao continuar
  Then sera exibido o testo prontinho! recebemos os seus dados 
  
  