package br.com.carrefour.Steps;

import java.io.IOException;
import java.net.MalformedURLException;

import br.com.carrefour.Utils.BaseActions;
import br.com.carrefour.Utils.PageLogin;
import br.com.carrefour.elementos.LoginElementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseActions  {

	LoginElementos e = new LoginElementos();
	PageLogin p = new PageLogin();
	

	
	
	@Given("que o usuario execute o app carrefour")
	public void que_o_usuario_execute_o_app_carrefour() throws MalformedURLException, InterruptedException {
	   ExecutarEmulator();
	}

	@When("preencher os dados validos do login")
	public void preencher_os_dados_validos_do_login() throws IOException, InterruptedException {
	    p.RealizarLogin();
	}

	@Then("realizo a validacao de login efetuado com sucesso")
	public void realizo_a_validacao_de_login_efetuado_com_sucesso() throws IOException, InterruptedException {
	    p.ValidarLogin();
	}

}
