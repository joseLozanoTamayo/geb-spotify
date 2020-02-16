package co.geb.spotify.interfaz;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.geb.spotify.modelo.Album;

@Repository
public interface IAlbum extends CrudRepository<Album, Integer> {
	
	public Optional<List<Album>> findByFechaLanzamiento(Date fechaLanzamiento);
	

}
