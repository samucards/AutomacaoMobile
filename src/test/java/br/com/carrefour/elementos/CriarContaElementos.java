package br.com.carrefour.elementos;

import org.openqa.selenium.By;

public class CriarContaElementos {

	private By btnCriarConta = By.id("createAccountLogin");
	private By campoCpf = By.id("edit_text_document_cpf");
	private By btnOkVamosla = By.id("button_go");
	private By campoNome = By.id("edit_text_first_name");
	private By campoSobreNome = By.id("edit_text_last_name");
	private By campoDataNascimento = By.id("edit_text_date_of_birth");
	private By btnAvancar = By.id("button_save");
	private By btnAvancar1 = By.id("button_save");
	private By campoEmail = By.id("edit_text_email");
	private By campoConfirmeEmail = By.id("edit_text_email_confirm");
	private By campotelefone = By.id("edit_text_phone_number");
	private By btnAvancar2 = By.id("button_next");
	private By checkboxTermo = By.id("check_box_accepted_terms_of_use");
	private By campoSenha = By.id("edit_text_password");
	private By campoConfirmarSenha = By.id("edit_text_confirm_password");
	private By btnFinalizar = By.id("button_finish");
	private By verificacaoConta = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[3]/android.view.View/android.app.Dialog/android.view.View[1]");
	private By checkboxemail = By.id("checkbox_email");
	private By entre = By.id("sign_in_up_click_area");
	
	
	public By getEntre() {
		return entre;
	}

	public By getCheckboxemail() {
		return checkboxemail;
	}

	public By getBtnCriarConta() {
		return btnCriarConta;
	}

	public By getCampoCpf() {
		return campoCpf;
	}

	public By getBtnOkVamosla() {
		return btnOkVamosla;
	}

	public By getCampoNome() {
		return campoNome;
	}

	public By getCampoSobreNome() {
		return campoSobreNome;
	}

	public By getCampoDataNascimento() {
		return campoDataNascimento;
	}

	public By getBtnAvancar() {
		return btnAvancar;
	}

	public By getBtnAvancar1() {
		return btnAvancar1;
	}

	public By getCampoEmail() {
		return campoEmail;
	}

	public By getCampoConfirmeEmail() {
		return campoConfirmeEmail;
	}

	public By getCampotelefone() {
		return campotelefone;
	}

	public By getBtnAvancar2() {
		return btnAvancar2;
	}

	public By getCheckboxTermo() {
		return checkboxTermo;
	}

	public By getCampoSenha() {
		return campoSenha;
	}

	public By getCampoConfirmarSenha() {
		return campoConfirmarSenha;
	}

	public By getBtnFinalizar() {
		return btnFinalizar;
	}

	public By getVerificacaoConta() {
		return verificacaoConta;
	}

}
