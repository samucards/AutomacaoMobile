package br.com.carrefour.elementos;

import org.openqa.selenium.By;

public class MassaElementos {

	private By btnGerarPessoas = By.cssSelector("#top-nav > li:nth-child(23) > a");
	private By btngerarPessoa = By.id("bt_gerar_pessoa");
	private By nome = By.id("nome");
	private By cpf = By.id("cpf");
	private By dataNascimento = By.id("data_nasc");
	private By email = By.id("email");
	private By telefone = By.id("telefone_fixo");

	public By getBtnGerarPessoas() {
		return btnGerarPessoas;
	}

	public By getBtngerarPessoa() {
		return btngerarPessoa;
	}

	public By getNome() {
		return nome;
	}

	public By getCpf() {
		return cpf;
	}

	public By getDataNascimento() {
		return dataNascimento;
	}

	public By getEmail() {
		return email;
	}

	public By getTelefone() {
		return telefone;
	}

}
