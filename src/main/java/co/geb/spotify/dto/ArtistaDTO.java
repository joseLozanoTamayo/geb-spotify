package co.geb.spotify.dto;

import java.io.Serializable;

public class ArtistaDTO implements Serializable {
	
	private Integer idArtista;
	private String nombreArtista;
	private String foto;
	
	public Integer getIdArtista() {
		return idArtista;
	}
	public String getNombreArtista() {
		return nombreArtista;
	}
	public String getFoto() {
		return foto;
	}
	public void setIdArtista(Integer idArtista) {
		this.idArtista = idArtista;
	}
	public void setNombreArtista(String nombreArtista) {
		this.nombreArtista = nombreArtista;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}

	
	
}
