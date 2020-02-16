package co.geb.spotify.servicio.interfaz;

import java.util.List;
import java.util.Optional;

import co.geb.spotify.modelo.Album;

public interface IAlbumService {

	public List<Album>listar();
	
	public Album getArtistaRelacionado(int id);
	
	public int save(Album album);
	
	Optional<Album> getAlbum(int id);
	
}
