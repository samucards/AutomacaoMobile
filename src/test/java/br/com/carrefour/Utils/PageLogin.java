package br.com.carrefour.Utils;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.carrefour.elementos.LoginElementos;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PageLogin {

	public AndroidDriver<MobileElement> mobiledriver;
	LoginElementos login = new LoginElementos();
	BaseActions base = new BaseActions();
	public WebDriverWait wait;
	DesiredCapabilities capabilities = new DesiredCapabilities();
	public static WebDriver driver;

	public void RealizarLogin() throws IOException, InterruptedException {
		// base.Wait(login.getCampoEmail());
		//base.Wait(login.getBtnEntrar());
		//base.click(login.getBtnEntrar(), "selecionando botao entrar");
		//base.preencher(login.getCampoEmail(), "ambev99749596@gmail.com", "Preenchendo email");
		base.Wait(login.getBtnEntrar2());
		base.click(login.getBtnEntrar2(), "Selecionar botao entrar ");
		//base.Wait(login.getCampoCpf());
		//base.preencher(login.getCampoCpf(), "85645010078", "preenchendo campo com CPF");
		base.preencher(login.getCampoEmail(), "samuel001@yopmail.com", "Preenchendo campo Email");
		base.click(login.getBtnOkVamosLa(), "Selecionando botão vamos la");
		base.Wait(login.getCampoSenha());
		base.preencher(login.getCampoSenha(), "Teste@123", "preenchendo senha");
		base.Wait(login.getBtnContinuar());
		base.click(login.getBtnContinuar(), "Selecionando botao continuar");

	}

	public void ValidarLogin() throws IOException, InterruptedException {
		String evidencia = "Validação de Login";
		base.Wait(login.getMeuPerfil());
		base.validarTexto(login.getMeuPerfil(), "Meu perfil", "validação de texto");
		base.screnShoot("./Evidencia/" + evidencia + ".png");
		;
	}

	public void ExecutarEmulator() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Carrefour");
		caps.setCapability("udid", "emulator-5554");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "10.0");
		caps.setCapability("noReset", "false");
		caps.setCapability("app", "C:\\Users\\brext7142\\Downloads\\2100000123.apk");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		wait = new WebDriverWait(driver, 10);

	}
}
