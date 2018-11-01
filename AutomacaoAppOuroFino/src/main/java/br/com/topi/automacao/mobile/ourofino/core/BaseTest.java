package br.com.topi.automacao.mobile.ourofino.core;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;

public class BaseTest {
	public void esperar() {
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.get("http://somedomain/url_that_delays_loading");

	}

	@AfterClass
	public static void finalizaClasse() {
		DriverFactory.killDriver();
	}

}
