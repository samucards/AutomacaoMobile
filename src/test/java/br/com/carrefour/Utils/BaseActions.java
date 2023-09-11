package br.com.carrefour.Utils;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseActions {

	public static WebDriver driver;
	public WebDriverWait wait;
	DesiredCapabilities capabilities = new DesiredCapabilities();
	public AndroidDriver<MobileElement> mobiledriver;

	public void pausa(int tempo, String descricaoPasso) throws InterruptedException {

		try {
			Thread.sleep(tempo);
		} catch (NoSuchElementException e) {
			Assert.fail(LocalDateTime.now() + " erro no passo \" + descricaoDoPasso");
		}

	}

	public void preencher(By elemento, String texto, String descricaoPasso) throws IOException {
		try {

			driver.findElement(elemento).sendKeys(texto);

		} catch (Exception e) {
			String evidencia = "Erro ao Preencher";
			screnShoot("./Print/" + evidencia + ".png");
			Assert.fail(LocalDateTime.now() + " -- erro ao tentar " + descricaoPasso);
			screnShoot(descricaoPasso);

		}
	}

	public void click(By elemento, String descricaoPasso) throws IOException {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			String evidencia = "Erro ao clicar";
			screnShoot("./Print/" + evidencia + ".png");
			Assert.fail(LocalDateTime.now() + " --erro ao tentar " + descricaoPasso);
			

		}
	}

	public void btnEnter(By elemento, String descricaoPasso) throws IOException {
		try {
			driver.findElement(elemento).submit();
		} catch (Exception e) {
			String evidencia = "Erro apertar a tecla Enter";
			screnShoot("./Print/" + evidencia + ".png");
			Assert.fail(LocalDateTime.now() + " --erro ao tentar " + descricaoPasso);
			
		}
	}

	public void screnShoot(String print) throws IOException {

		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(print);
		FileUtils.copyFile(SrcFile, DestFile);
	}

	public void fecharBrowser(String descricaoPasso) throws IOException {
		try {
			driver.quit();
		} catch (Exception e) {
			Assert.fail(LocalDateTime.now() + " --erro ao tentar " + descricaoPasso);
			screnShoot(descricaoPasso);

		}
	}

	public void selecionarComboPosicao(By elemento, int posicao, String descricaoDoPasso) throws IOException {
		try {
			WebElement webElement = driver.findElement(elemento);
			Select combo = new Select(webElement);
			combo.selectByIndex(posicao);
		} catch (NoSuchElementException e) {
			
			String evidencia = "Erro ao selecionar Posição";
			screnShoot("./Print/" + evidencia + ".png");
			Assert.fail(LocalDateTime.now() + "descrição do passo");
		}
	}

	public void selecionarComboPorTexto(By elemento, String texto, String descricaoDoPasso) throws IOException {
		try {
			WebElement webElement = driver.findElement(elemento);
			Select combo = new Select(webElement);
			combo.selectByVisibleText(texto);
			;
		} catch (NoSuchElementException e) {
			
			String evidencia = "Erro ao selecionar por texto";
			screnShoot("./Print/" + evidencia + ".png");
			Assert.fail(LocalDateTime.now() + " erro no passo \" + descricaoDoPasso");
		}
	}

	public void validarTexto(By elemento, String texto, String descricaoPasso) throws IOException {
		try {
			String mensagem = driver.findElement(elemento).getText();
			assertEquals(texto, mensagem);

		} catch (NoSuchElementException e) {
			String evidencia = "Erro ao Validar Texto";
			screnShoot("./Print/" + evidencia + ".png");
			
			Assert.fail(LocalDateTime.now() + " erro no passo \" + descricaoDoPasso");
		}

	}

	public void executarNavegador(String appUrl, String navegador, String descricaoPasso) throws IOException {

		try {
			if (navegador == "CHROME" || navegador == "FIREFOX") {
				if (navegador == "CHROME") {

					System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
					ChromeOptions options = new ChromeOptions();
					options.addArguments("incognito");
					driver = new ChromeDriver(options);
					driver.get(appUrl);
					driver.manage().window().maximize();
					driver.manage().deleteAllCookies();
				} else if (navegador == "FIREFOX") {
					System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
					driver = new FirefoxDriver();
					driver.get(appUrl);
					driver.manage().window().maximize();

				}

			} else {
				System.out.println("Opçao invalida escolha CHROME ou FIREFOX");
			}

		} catch (Exception e) {
			Assert.fail(LocalDateTime.now() + " --erro ao tentar " + descricaoPasso);
			screnShoot(descricaoPasso);

		}

	}

	public void ExecutarEmulator() throws MalformedURLException, InterruptedException {
        
		
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "teste");
		caps.setCapability("udid", "emulator-5554");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "11.0");
		caps.setCapability("noReset", "false");
		caps.setCapability("app", "C:\\Users\\User\\Documents\\apk\\2022905012.apk");
		pausa(10000, "carregando APP");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		wait = new WebDriverWait(driver, 10);

	}

	public void Wait(By elemento) {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));

	}
	public String PegarTexto( By elemento) {
		
		String texto;
		texto =  driver.findElement(elemento).getText();
		System.out.println(texto);
		return texto;
	}
	
	public void scroll(By elemento) {
		
		WebElement element = driver.findElement(elemento); 
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	@Before
	public static boolean deleteDir(File dir) {
	    if (dir.isDirectory()) {
	        String[] children = dir.list();
	        for (int i=0; i<children.length; i++) {

  
	}

	    }
		return false;
}
}