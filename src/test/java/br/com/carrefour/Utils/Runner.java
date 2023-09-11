package br.com.carrefour.Utils;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resources/Feature", glue = "br.com.carrefour.Steps", tags = "@realizarloginValido", plugin = { "pretty",
				"html:target/CarrefourSuperAPP.html" }, monochrome = true, dryRun = false)




public class Runner {
      @Before
      public static void main(String[] args) {
  		File f = new File("./Evidencia");
  		if ((f.exists()) && (f.isDirectory()))
  			f.delete();
  	}
	        
	    }
	

