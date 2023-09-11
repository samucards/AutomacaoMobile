
@regressao
Feature: Login
 

  @realizarloginValido
  Scenario: Realizar login valido
    Given que o usuario execute o app carrefour
    When  preencher os dados validos do login
    Then  realizo a validacao de login efetuado com sucesso

