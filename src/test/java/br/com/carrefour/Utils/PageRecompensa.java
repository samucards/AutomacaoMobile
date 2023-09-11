package br.com.carrefour.Utils;

import java.io.IOException;

import br.com.carrefour.elementos.RecompensaElementos;

public class PageRecompensa extends BaseActions {

	RecompensaElementos r = new RecompensaElementos();
	
	
	public void selecionarIconeRecompensa() throws IOException {
		Wait(r.getIconeRecompensa());
		click(r.getIconeRecompensa(), "Selecionando icone Recompensa");
	}
	
	public void  validarTelaRecompensa() throws IOException, InterruptedException {
		
		
        Wait(r.getTextoRecompensa());
		validarTexto(r.getTextoRecompensa(), "Meu saldo", "Validando texto");
	}
	
	public void  selecionarBotaoQueroUsar() throws IOException {
		
		Wait(r.getBtnQueroUsar());
		click(r.getBtnQueroUsar(), "Selecionando botao quero usar");
		Wait(r.getComboBoxRegiao());
		click(r.getComboBoxRegiao(), "Selecionando combobox de regiao");
		Wait(r.getSaoPaulo());
		click(r.getSaoPaulo(), "Selecionando sao paulo");
	}
	
	public void selecionadoProduto() throws IOException {
		Wait(r.getProduto());
		click(r.getProduto(), "Selecionando produto");
		
	}
	public void selecionarBotaoQueroResgatar() throws IOException {
		Wait(r.getBtnQueroResgatar());
		click(r.getBtnQueroResgatar(), "Selecionando botao quero resgatar");
		Wait(r.getBtnResgatar());
		click(r.getBtnResgatar(), "Selecionando botao resgatar");
		
	}
	public void validarResgate() throws IOException {
		String evidencia = "Validacao Loyout";
		Wait(r.getTextoValidacao());
		validarTexto(r.getTextoValidacao(), "Estamos aguardando a confirmação do parceiro. Você pode acompanhar as  em “Meus Resgates”.", "validando texto");
		screnShoot("./Evidencia/" + evidencia + ".png"); 
	}
	
}
