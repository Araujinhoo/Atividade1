package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;

public class Teste {
	
	Elementos e = new Elementos();
	Metodos m = new Metodos();

@Dado("que eu esteja no site {string}")
public void que_eu_esteja_no_site(String url) {
	 m.abrirNavegador(url);
}

@Quando("pesqusiar por iphone {int}")
public void pesqusiar_por_iphone(Integer int1) {
	m.preencher(e.getPesquisar(), "iphone 12");
}

@Quando("clicar em pesquisar")
public void clicar_em_pesquisar() {
	m.clicar(e.getBot());
}

@Então("sou recirecionado para a pag de produtos")
public void sou_recirecionado_para_a_pag_de_produtos() throws InterruptedException {
    m.tempo(500);
	m.fechar(null);
}

}
