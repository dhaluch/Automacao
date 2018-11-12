package br.com.topi.automacao.mobile.ourofino.test;

import org.junit.Test;

import com.relevantcodes.extentreports.ExtentReports;

import br.com.topi.automacao.mobile.ourofino.core.BaseTest;
import br.com.topi.automacao.mobile.ourofino.page.AgendaPage;
import br.com.topi.automacao.mobile.ourofino.page.CadastroDeClientesPage;
import br.com.topi.automacao.mobile.ourofino.page.HistoricoPage;
import br.com.topi.automacao.mobile.ourofino.page.HomePage;
import br.com.topi.automacao.mobile.ourofino.page.ProdutosPage;

public class HomeTest extends BaseTest {
	
	private HomePage home = new HomePage();
	private CadastroDeClientesPage cadastrocliente = new CadastroDeClientesPage();
	//private ClientesPage clientes = new ClientesPage();
	private HistoricoPage historico = new HistoricoPage();
	private AgendaPage agenda = new AgendaPage();
	private ProdutosPage produtos = new ProdutosPage();
	
	
	@Test
	public void testArq() {
		home.gerarScreenchot("Pagina Inicial");
		home.clickCadastroDeCientes();
		esperar();
		cadastrocliente.gerarScreenchot("Tela Cadastro de Cliente");
		cadastrocliente.clickVoltar();
		//home.clickClientes();
		//esperar();
		//clientes.clickVoltar();
		home.clickAgenda();
		esperar();
		agenda.gerarScreenchot("Tela Agenda");
		agenda.clickVoltar();
		home.clickHistorico();
		esperar();
		historico.gerarScreenchot("Tela Historico");
		historico.clickVoltar();
		home.clickProdutos();
		esperar();
		produtos.gerarScreenchot("Tela Produtos");
		produtos.clickVoltar();
	}

}
