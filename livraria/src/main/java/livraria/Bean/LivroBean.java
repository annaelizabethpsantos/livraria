package livraria.Bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import livraria.Model.Livro;

@ManagedBean(name = "Livro")
@ViewScoped
public class LivroBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Livro livro = new Livro();
	private String nomeBusca = "";

	public void calculaMedia() {
		double media = livro.getNota1() + livro.getNota2() + livro.getNota3();
		media = media / 3;
		livro.setMedia(media);
	}
	

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	public String getNomeBusca() {
		return nomeBusca;
	}

	public void setNomeBusca(String nomeBusca) {
		this.nomeBusca = nomeBusca;
	}

}
