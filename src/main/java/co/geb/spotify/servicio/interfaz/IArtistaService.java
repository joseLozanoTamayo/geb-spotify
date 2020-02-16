package co.geb.spotify.servicio.interfaz;

import java.util.List;

import co.geb.spotify.dto.ArtistaDTO;
import co.geb.spotify.modelo.Artista;

public interface IArtistaService {

	public List<Artista>listar();
	
	public Artista getArtistaRelacionado(int id);
	
	public int save(Artista artista);

	ArtistaDTO getArtista(int id);
	
}
