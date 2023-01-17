package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	Metodos m = new Metodos();
	Elementos e = new Elementos();
	
	@Given("que o usuario acesse a url {string}")
	public void que_o_usuario_acesse_a_url(String url) {
	    m.abrirNavegador(url);
	}

	@Given("selecionar o botao abrir conta")
	public void selecionar_o_botao_abrir_conta() {
	    m.clicar(e.getBtnAbrirConta());
	}

	@When("preencher o formulario de abertura de conta")
	public void preencher_o_formulario_de_abertura_de_conta() {
	    m.preencher(e.getCampoNome(), "Nathan Iago da Luz");
	    m.preencher(e.getCampoTelefone(), "8427805563");
	    m.preencher(e.getCampoEmail(), "nathan_daluz@osite.com.br");
	    m.preencher(e.getCampoCpf(), "34235854550");
	    m.preencher(e.getCampoNascimeto(), "11011988");
	    
	}

	@When("selecionar o checkbox de autorização")
	public void selecionar_o_checkbox_de_autorização() {
	    m.clicar(e.getCampoAutorização());
	}

	@When("selecionar o botao continuar")
	public void selecionar_o_botao_continuar() {
	    m.clicar(e.getCampoContinuar());
	}

	@Then("sera exibido o testo prontinho! recebemos os seus dados")
	public void sera_exibido_o_testo_prontinho_recebemos_os_seus_dados() {
	   
	}
	@Given("preencher o campo com o nome {string}")
	public void preencher_o_campo_com_o_nome(String nome) {
	    m.preencher(e.getCampoNome(), nome);
	}

	@Given("preencher o campo com o telefone {string}")
	public void preencher_o_campo_com_o_telefone(String telefone) {
	    m.preencher(e.getCampoTelefone(), telefone);
	}

	@Given("preencher o campo com o email {string}")
	public void preencher_o_campo_com_o_email(String email) {
	    m.preencher(e.getCampoEmail(), email);
	}

	@Given("preencher o campo com o cpf {string}")
	public void preencher_o_campo_com_o_cpf(String cpf) {
	    m.preencher(e.getCampoCpf(), cpf);
	}

	@Given("preencher o campo com a data de nascimento {string}")
	public void preencher_o_campo_com_a_data_de_nascimento(String dataNascimento) {
	    m.preencher(e.getCampoNascimeto(), dataNascimento);
	}
}
