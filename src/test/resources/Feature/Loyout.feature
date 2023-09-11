
@regressao @loyout
Feature: Loyout
  
  
  Background: Realizar Login
   Given que o usuario execute o app carrefour
   When  preencher os dados validos do login
  
  
  
  @validarrecompemsa
  Scenario:  Validar tela de Recompensa
   When selecioner o icone de recompensa
   Then valido a tela de minhas recompesas 
   
   
   
   
   @fluxoresgate
   Scenario: Validar fluxo de resgate
    And selecione o botao  quero usar
    And Selecione o produto
    And selecione o botao quero Resgatar
    Then Resgate sera realizado com sucesso

  
