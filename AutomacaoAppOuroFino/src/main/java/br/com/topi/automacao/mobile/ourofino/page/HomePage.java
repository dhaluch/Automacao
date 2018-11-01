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

public class HomePage extends BasePage {
	// Gera Screenshot de Tela
	@Rule
	public TestName testName = new TestName();

	public void gerarScreenchot(String nome) {
		File imagem = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(imagem,
					new File("target/Screenshots/Home/" + "Home" + testName.getMethodName() + nome + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// ---------------

	public void clickCadastroDeCientes() {
		click(By.id("br.com.topinformation.ourofinosalesforce:id/textView31"));
	}

	public void clickClientes() {
		click(By.id("br.com.topinformation.ourofinosalesforce:id/textView33"));
	}

	public void clickAgenda() {
		click(By.id("br.com.topinformation.ourofinosalesforce:id/textView34"));
	}

	public void clickHistorico() {
		click(By.id("br.com.topinformation.ourofinosalesforce:id/textView35"));

	}

	public void clickProdutos() {
		click(By.id("br.com.topinformation.ourofinosalesforce:id/textView36"));
	}

	public void clickSync() {
		click(By.id("br.com.topinformation.ourofinosalesforce:id/btSyncMain"));
	}

	public void clickReports() {
		click(By.id("br.com.topinformation.ourofinosalesforce:id/btReports"));
	}

}
