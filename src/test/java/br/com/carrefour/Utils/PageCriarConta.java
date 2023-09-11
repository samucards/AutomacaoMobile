package br.com.carrefour.Utils;

import java.io.IOException;

import br.com.carrefour.elementos.CriarContaElementos;
import br.com.carrefour.elementos.MassaElementos;

public class PageCriarConta extends BaseActions {

	MassaElementos m = new MassaElementos();
	CriarContaElementos c = new CriarContaElementos();

	String nome;
	String cpf;
	String nasc;
	String email;
	String telefone;

	public void abrirUrl() throws IOException, InterruptedException {
		executarNavegador("https://www.4devs.com.br/", "CHROME", "Abrindo navegador");

		scroll(m.getBtnGerarPessoas());
		click(m.getBtnGerarPessoas(), "Selecionando botao gerar pessoas");
		scroll(m.getBtngerarPessoa());
		click(m.getBtngerarPessoa(), "Selecionar botao gerar pessoa");
		scroll(m.getNome());
		pausa(5000, "pausa");
		nome = PegarTexto(m.getNome());
		System.out.println(nome);
		cpf = PegarTexto(m.getCpf());
		nasc = PegarTexto(m.getDataNascimento());
		email = PegarTexto(m.getEmail());
		telefone = PegarTexto(m.getTelefone());
		driver.quit();

	}

	public void selecionarBotaoNovaConta() throws IOException {
        Wait(c.getEntre());
		click(c.getEntre(), "Selecionando botao entrar");
		Wait(c.getBtnCriarConta());
		click(c.getBtnCriarConta(), "Selecionarndo botao criar conta");

	}

	public void preencherCampoCpf() throws IOException {
		Wait(c.getCampoCpf());
		preencher(c.getCampoCpf(), cpf, "preenchendo campo cpf");
	}

	public void selecionarBotaovamosLa() throws IOException {

		click(c.getBtnOkVamosla(), "Selecionando botao vamos la");
	}

	public void preencherDadosPessoais() throws IOException {
		Wait(c.getCampoNome());
		preencher(c.getCampoNome(), nome, "preenchnedo nome");
		preencher(c.getCampoSobreNome(), "Teste", "Preenchendo sobrenome");
		preencher(c.getCampoDataNascimento(), nasc, "Preenchendo data nascimento");

	}

	public void selecionarBotaoAvancar() throws IOException {
		click(c.getBtnAvancar(), "Botao avancar");
	}
	
	public void preencherCampoEmail() throws IOException {
		Wait(c.getCampoEmail());
		preencher(c.getCampoEmail(), email, "Preenchendo Email");
		preencher(c.getCampoConfirmeEmail(), email, "Confirmando email");
		preencher(c.getCampotelefone(), "11986253879", "Preenchendo telefone");
	}
	
	public void selecionarBotaoavancar1() throws IOException, InterruptedException {
		Wait(c.getBtnAvancar2());
		//pausa(5000, "Pausa");
		click(c.getBtnAvancar2(), "Selecionando botao avancar");
	}
	
	public void selecionarAvancar2() throws IOException {
		Wait(c.getBtnAvancar2());
		click(c.getBtnAvancar2(), "Selecionarndo botao Avancar");
	}
	
	public void selecionarTermosAceite() throws IOException {
		Wait(c.getCheckboxTermo());
		click(c.getCheckboxTermo(), "Selecionando checkbox termo de aceite");
	}
	public void preenhcerCampoSenha() throws IOException {
		Wait(c.getCampoSenha());
		preencher(c.getCampoSenha(), "@Caribe2016", "Preenchendo campo Senha");
		preencher(c.getCampoConfirmarSenha(), "@Caribe2016", "Preenchendo campo Senha");
	}
	
	public void selecionarBotaoFinalizar() throws IOException {
		click(c.getBtnFinalizar(), "Selecionando bota finalizar");
	}
	
	public void validar() throws IOException {
		String evidencia = "Validação Criar conta";
		Wait(c.getVerificacaoConta());
		screnShoot("./Evidencia/" + evidencia + ".png");
		validarTexto(c.getVerificacaoConta(), "Verificação de conta", "Validar texto ");
		
	}
	public void checkboxemail() throws IOException {
		Wait(c.getCheckboxemail());
		click(c.getCheckboxemail(), "Selecionando checkbox email");
	}
	
}
