package bins;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the autor database table.
 * 
 */
@Entity
@Table(name = "autor")
@NamedQuery(name = "Autor.findAll", query = "SELECT a FROM Autor a")
public class Autor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cod_autor")
	private int codAutor;

	@Column(name = "nom_autor")
	private String nomAutor;

	public Autor() {
	}

	public int getCodAutor() {
		return this.codAutor;
	}

	public void setCodAutor(int codAutor) {
		this.codAutor = codAutor;
	}

	public String getNomAutor() {
		return this.nomAutor;
	}

	public void setNomAutor(String nomAutor) {
		this.nomAutor = nomAutor;
	}

}