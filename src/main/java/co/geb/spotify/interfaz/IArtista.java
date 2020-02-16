package co.geb.spotify.interfaz;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.geb.spotify.modelo.Artista;

@Repository
public interface IArtista extends CrudRepository<Artista, Integer>{
	
	public Optional<Artista> findById(Integer id);
	
}
