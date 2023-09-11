  @regressao
  Feature: Criar conta


  Background:
  Given gerar massa


  @criarcontacarrefour
  Scenario: Criar conta carrefour
  Given que o usuario acesse o app carrefour
  And selecione o botao criar nova conta
  And preencher o campo CPF
  And selecionar o botao ok vamos la
  And preencher os dados pessoais
  And selecionar o botao avancar
  And preenhcer os dados de email
  And selecioanar o botao avancar
  And selecionar botao avancar
  And selecionar o checkbox dos termos de aceite
  And selecionar o botao avancar novamente
  When preenhcer a senha
  And selecionar o botao Finalizar cadastro 
  Then realizo validacao de cadastro
  
  
  