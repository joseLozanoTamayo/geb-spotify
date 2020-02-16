package co.geb.spotify.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.geb.spotify.dto.ArtistaDTO;
import co.geb.spotify.modelo.Artista;
import co.geb.spotify.servicio.interfaz.IArtistaService;

@RestController
public class ArtistaControlador {
	
	@Autowired
	private IArtistaService servicio;

	@RequestMapping("/artistas")
	public List<Artista> listar(Model model) {
		List<Artista> iArtista = servicio.listar();
		return iArtista;
	}

	@RequestMapping("/artista")
	public ArtistaDTO getArtista(@RequestParam final int id) {
		return servicio.getArtista(id);
	}
	
}
