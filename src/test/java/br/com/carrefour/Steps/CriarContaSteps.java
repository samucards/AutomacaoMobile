package br.com.carrefour.Steps;

import java.io.IOException;
import java.net.MalformedURLException;

import br.com.carrefour.Utils.BaseActions;
import br.com.carrefour.Utils.PageCriarConta;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CriarContaSteps extends PageCriarConta {

	BaseActions base = new BaseActions();

	@Given("que o usuario acesse o app carrefour")
	public void que_o_usuario_acesse_o_app_carrefour() throws MalformedURLException, InterruptedException {
		base.ExecutarEmulator();
	}

	@Given("selecione o botao criar nova conta")
	public void selecione_o_botao_criar_nova_conta() throws IOException {
		selecionarBotaoNovaConta();
	}

	@Given("preencher o campo CPF")
	public void preencher_o_campo_cpf() throws IOException {
		preencherCampoCpf();
	}

	@Given("selecionar o botao ok vamos la")
	public void selecionar_o_botao_ok_vamos_la() throws IOException {
		selecionarBotaovamosLa();
	}

	@Given("preencher os dados pessoais")
	public void preencher_os_dados_pessoais() throws IOException {
		preencherDadosPessoais();
	}

	@Given("selecionar o botao avancar")
	public void selecionar_o_botao_avancar() throws IOException {
		selecionarBotaoAvancar();
	}

	@Given("preenhcer os dados de email")
	public void preenhcer_os_dados_de_email() throws IOException {
		preencherCampoEmail();
	}

	@Given("selecioanar o botao avancar")
	public void selecioanar_o_botao_avancar() throws IOException, InterruptedException {
		selecionarBotaoavancar1();
	}

	@Given("selecionar o checkbox email")
	public void selecionar_o_checkbox_email() {

	}

	@Given("selecionar botao avancar")
	public void selecionar_botao_avancar() throws Exception {
		checkboxemail();
		selecionarAvancar2();
	}

	@Given("selecionar o checkbox dos termos de aceite")
	public void selecionar_o_checkbox_dos_termos_de_aceite() throws IOException {
		selecionarTermosAceite();
	}

	@When("preenhcer a senha")
	public void preenhcer_a_senha() throws IOException {
		preenhcerCampoSenha();
	}

	@When("selecionar o botao Finalizar cadastro")
	public void selecionar_o_botao_finalizar_cadastro() throws IOException {
		selecionarBotaoFinalizar();
	}

	@Then("realizo validacao de cadastro")
	public void realizo_validacao_de_cadastro() throws IOException {
      validar();
	}

	@Given("gerar massa")
	public void gerar_massa() throws IOException, InterruptedException {
		abrirUrl();
	}

	@Given("selecionar o botao avancar novamente")
	public void selecionar_o_botao_avancar_novamente() throws IOException {
		selecionarAvancar2();
	}
}
