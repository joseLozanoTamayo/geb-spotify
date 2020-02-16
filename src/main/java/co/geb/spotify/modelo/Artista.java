package co.geb.spotify.modelo;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "gbe_artista")
public class Artista {

	@Id
	@Basic(optional = false)
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ARTISTA")
	private Integer idArtista;
	@Size(max = 50)
	@Column(name = "NOMBRE_ARTISTA")
	private String nombreArtista;
	@Size(max = 100)
	@Column(name = "FOTO")
	private String foto;
	@OneToMany(mappedBy = "idArtista")
	private List<ArtistaRelacionado> artistaRelacionadoList;

	public Integer getIdArtista() {
		return idArtista;
	}

	public void setIdArtista(Integer idArtista) {
		this.idArtista = idArtista;
	}

	public String getNombreArtista() {
		return nombreArtista;
	}

	public void setNombreArtista(String nombreArtista) {
		this.nombreArtista = nombreArtista;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public List<ArtistaRelacionado> getArtistaRelacionadoList() {
		return artistaRelacionadoList;
	}

	public void setArtistaRelacionadoList(List<ArtistaRelacionado> artistaRelacionadoList) {
		this.artistaRelacionadoList = artistaRelacionadoList;
	}

}
