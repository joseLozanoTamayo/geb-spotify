package co.geb.spotify.interfaz;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.geb.spotify.modelo.Cancion;

@Repository
public interface ICancion extends CrudRepository<Cancion, Integer> {

}
