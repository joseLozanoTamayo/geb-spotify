package co.geb.spotify.modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "gbe_album")
public class Album {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@NotNull
	@Column(name = "ID_ALBUM")
	private Integer idAlbum;
	@Column(name = "FECHA_LANZAMIENTO")
	@Temporal(TemporalType.DATE)
	private Date fechaLanzamiento;
	@Size(max = 100)
	@Column(name = "NOMBRE_ALBUM")
	private String nombreAlbum;
	@Size(max = 100)
	@Column(name = "FOTO_ALBUM")
	private String fotoAlbum;
	@OneToMany(mappedBy = "idAlbum")
	private List<ArtistaRelacionado> artistaRelacionadoList;
	@OneToMany(mappedBy = "idAlbum")
	private List<Cancion> cancionList;

	public Album() {
	}

	public Album(Integer idAlbum) {
		this.idAlbum = idAlbum;
	}

	public Integer getIdAlbum() {
		return idAlbum;
	}

	public void setIdAlbum(Integer idAlbum) {
		this.idAlbum = idAlbum;
	}

	public Date getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	public void setFechaLanzamiento(Date fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}

	public String getNombreAlbum() {
		return nombreAlbum;
	}

	public void setNombreAlbum(String nombreAlbum) {
		this.nombreAlbum = nombreAlbum;
	}

	public String getFotoAlbum() {
		return fotoAlbum;
	}

	public void setFotoAlbum(String fotoAlbum) {
		this.fotoAlbum = fotoAlbum;
	}

	public List<ArtistaRelacionado> getArtistaRelacionadoList() {
		return artistaRelacionadoList;
	}

	public void setArtistaRelacionadoList(List<ArtistaRelacionado> artistaRelacionadoList) {
		this.artistaRelacionadoList = artistaRelacionadoList;
	}

	public List<Cancion> getCancionList() {
		return cancionList;
	}

	public void setCancionList(List<Cancion> cancionList) {
		this.cancionList = cancionList;
	}

	
	
}
