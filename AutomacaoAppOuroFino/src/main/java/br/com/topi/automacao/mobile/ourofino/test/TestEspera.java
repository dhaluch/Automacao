package br.com.topi.automacao.mobile.ourofino.test;

import org.junit.Test;

import br.com.topi.automacao.mobile.ourofino.core.BaseTest;
import br.com.topi.automacao.mobile.ourofino.page.ClientesPage;
import br.com.topi.automacao.mobile.ourofino.page.HomePage;

public class TestEspera extends BaseTest {
	ClientesPage clientes = new ClientesPage();
	HomePage home = new HomePage();

	@Test
	public void esperaTelacliente() {

		home.clickClientes();
		clientes.aguardarcarregamentoContasTerminar();
		clientes.clickVoltar();
		// String tes =
		// DriverFactory.getDriver().findElement(By.xpath("//*[@text='Clientes']")).getText();
		// System.out.println(tes);

	}

}
