package br.com.topi.automacao.mobile.ourofino.page;

import static br.com.topi.automacao.mobile.ourofino.core.DriverFactory.getDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.topi.automacao.mobile.ourofino.core.BasePage;
import br.com.topi.automacao.mobile.ourofino.core.DriverFactory;

public class ClientesPage extends BasePage {
	// Gera Screenshot de Tela
	@Rule
	public TestName testName = new TestName();

	public void gerarScreenchot(String nome) {
		File imagem = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(imagem,
					new File("target/Screenshots/Clientes/" + "Clientes" + testName.getMethodName() + nome + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// ---------------

	public void clickVoltar() {
		click(By.id("br.com.topinformation.ourofinosalesforce:id/button_back_account_list"));
	}

	public void aguardarcarregamentoContasTerminar() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		// wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@text='Carregando
		// contas...']")));
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.id("br.com.topinformation.ourofinosalesforce:id/drawer_layout")));
		// wait.until(ExpectedConditions.elementToBeClickable(By.id("br.com.topinformation.ourofinosalesforce:id/drawer_layout")));
	}

	public void pesquisar(String Texto) {
		setTexto(By.id("br.com.topinformation.ourofinosalesforce:id/editTextFilterAccountList"), Texto);
	}
}
