package br.com.topi.automacao.mobile.ourofino.core;

import static br.com.topi.automacao.mobile.ourofino.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class BasePage {

	// ClICK
	public void click(By by) {
		getDriver().findElement(by).click();
	}

	// SET
	public void setTexto(By by, String Texto) {
		getDriver().findElement(by).sendKeys(Texto);
	}

	// GET
	public String obterTexto(By by) {
		return getDriver().findElement(by).getText();
	}
	// Verificação de existencia de elementos
	//

}
