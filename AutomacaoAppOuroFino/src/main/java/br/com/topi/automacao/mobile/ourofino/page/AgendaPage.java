package br.com.topi.automacao.mobile.ourofino.page;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import br.com.topi.automacao.mobile.ourofino.core.BasePage;
import br.com.topi.automacao.mobile.ourofino.core.DriverFactory;

public class AgendaPage extends BasePage {
	//Gera Screenshot de Tela
	@Rule
	public TestName testName = new TestName();
	public void gerarScreenchot(String nome){
		File imagem = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(imagem,
					new File("target/Screenshots/Agenda/" + "Agenda" + testName.getMethodName() + nome + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//---------------
	
	public void clickVoltar(){
		click(By.id("br.com.topinformation.ourofinosalesforce:id/button_back_visit_detail_schedule"));
		
	}

}
