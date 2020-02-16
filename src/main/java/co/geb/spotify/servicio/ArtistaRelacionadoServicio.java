package co.geb.spotify.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.geb.spotify.interfaz.IArtistaRelacionado;
import co.geb.spotify.modelo.ArtistaRelacionado;
import co.geb.spotify.servicio.interfaz.IArtistaRelacionadoService;

@Service
public class ArtistaRelacionadoServicio implements IArtistaRelacionadoService {

	@Autowired
	private IArtistaRelacionado data;
	
	@Override
	public List<ArtistaRelacionado> listar() {
		// TODO Auto-generated method stub
		return (List<ArtistaRelacionado>) data.findAll();
	}

	@Override
	public ArtistaRelacionado getArtistaRelacionado(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(ArtistaRelacionado album) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArtistaRelacionado getArtista(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
