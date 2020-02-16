package co.geb.spotify.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.geb.spotify.interfaz.IAlbum;
import co.geb.spotify.modelo.Album;
import co.geb.spotify.servicio.interfaz.IAlbumService;

@Service
public class AlbumServicio implements IAlbumService {

	@Autowired
	private IAlbum data;
	
	@Override
	public List<Album> listar() {
		return (List<Album>) data.findAll();
	}

	@Override
	public Album getArtistaRelacionado(int id) {
		return null;
	}

	@Override
	public int save(Album album) {
		return 0;
	}

	@Override
	public Optional<Album> getAlbum(int id) {
		return  data.findById(id);
	}

}
