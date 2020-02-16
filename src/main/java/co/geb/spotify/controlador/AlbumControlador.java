package co.geb.spotify.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.geb.spotify.modelo.Album;
import co.geb.spotify.servicio.interfaz.IAlbumService;

@RestController
public class AlbumControlador {

	@Autowired
	private IAlbumService servicio;

	@RequestMapping("/albumnes")
	public List<Album> listar(Model model) {
		List<Album> albumList = servicio.listar();
		return albumList;
	}
	
	@RequestMapping("/albumRequest")
	public Optional<Album> getAlbum(@RequestParam final int id){
		return servicio.getAlbum(id);
		
	}
	
}
