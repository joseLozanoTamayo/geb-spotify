package co.geb.spotify.servicio.interfaz;

import java.util.List;

import co.geb.spotify.modelo.ArtistaRelacionado;

public interface IArtistaRelacionadoService {
	
	public List<ArtistaRelacionado> listar();
	
	public ArtistaRelacionado getArtista(int id);
	
	public int save(ArtistaRelacionado artista);

	ArtistaRelacionado getArtistaRelacionado(int id);
	

}
