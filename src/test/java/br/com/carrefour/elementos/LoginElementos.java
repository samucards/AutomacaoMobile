package br.com.carrefour.elementos;

import org.openqa.selenium.By;

public class LoginElementos {

	private By campoCpf = By.xpath(

			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.widget.EditText");
	private By btnVamos = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.widget.Button");
	private By campoSenha = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText");
	private By btnContinuar = By.id("nextStepButton");

	private By meuPerfil = By.id("profile_title");
	private By campoEmail = By.id("edtCredential");

	private By btnEntrar = By.id("btnLoginDialog");
	private By btnEntrar2 = By.id("sign_in_up_click_area");
	                               
	private By btnOkVamosLa = By.id("btnLoginDialog");
	private By saldo = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]");

	public By getSaldo() {
		return saldo;
	}

	public By getBtnOkVamosLa() {
		return btnOkVamosLa;
	}

	public By getBtnEntrar2() {
		return btnEntrar2;
	}

	public By getBtnEntrar() {
		return btnEntrar;
	}

	public By getMeuPerfil() {
		return meuPerfil;

	}

	public By getCampoEmail() {
		return campoEmail;
	}

	public By getCampoCpf() {
		return campoCpf;
	}

	public By getBtnVamos() {
		return btnVamos;
	}

	public By getCampoSenha() {
		return campoSenha;
	}

	public By getBtnContinuar() {
		return btnContinuar;
	}

}
