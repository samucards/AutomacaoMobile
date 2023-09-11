package br.com.carrefour.Steps;

import java.io.IOException;

import br.com.carrefour.Utils.PageRecompensa;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoyoutSteps  extends PageRecompensa{


	@When("selecioner o icone de recompensa")
	public void selecioner_o_icone_de_recompensa() throws IOException {
	   selecionarIconeRecompensa();
	}

	@Then("valido a tela de minhas recompesas")
	public void valido_a_tela_de_minhas_recompesas() throws IOException, InterruptedException {
        validarTelaRecompensa();
	}
	@When("selecione o botao  quero usar")
	public void selecione_o_botao_quero_usar() throws IOException {
	 selecionarBotaoQueroUsar();
		
	}

	@When("Selecione o produto")
	public void selecione_o_produto() throws IOException {
	  selecionadoProduto();
	}

	@When("selecione o botao quero Resgatar")
	public void selecione_o_botao_quero_resgatar() throws IOException {
	  selecionarBotaoQueroResgatar();
	}

	@Then("Resgate sera realizado com sucesso")
	public void resgate_sera_realizado_com_sucesso() throws IOException {
	  validarResgate();
	}

}
