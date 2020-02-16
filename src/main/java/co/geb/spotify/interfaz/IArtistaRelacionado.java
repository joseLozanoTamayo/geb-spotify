package co.geb.spotify.interfaz;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.geb.spotify.modelo.ArtistaRelacionado;

@Repository
public interface IArtistaRelacionado extends CrudRepository<ArtistaRelacionado, Integer> {

}
