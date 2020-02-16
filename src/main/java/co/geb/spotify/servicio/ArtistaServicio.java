package co.geb.spotify.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.geb.spotify.dto.ArtistaDTO;
import co.geb.spotify.interfaz.IArtista;
import co.geb.spotify.modelo.Artista;
import co.geb.spotify.servicio.interfaz.IArtistaService;

@Service
public class ArtistaServicio implements IArtistaService {

	@Autowired
	private IArtista data;

	@Override
	public List<Artista> listar() {
		return (List<Artista>) data.findAll();
	}

	@Override
	public ArtistaDTO getArtista(int id) {
		Artista response = data.findById(id).get();
		ArtistaDTO artistaDTO = new ArtistaDTO();
		artistaDTO.setFoto(response.getFoto());
		artistaDTO.setIdArtista(response.getIdArtista());
		artistaDTO.setNombreArtista(response.getNombreArtista());
		// TODO falta crear list de albun en objecto DTO y set aca.
		return artistaDTO;
	}

	@Override
	public int save(Artista artista) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Artista getArtistaRelacionado(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
