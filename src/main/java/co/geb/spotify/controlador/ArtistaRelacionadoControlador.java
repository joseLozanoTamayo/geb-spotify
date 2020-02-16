package co.geb.spotify.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.geb.spotify.modelo.ArtistaRelacionado;
import co.geb.spotify.servicio.interfaz.IArtistaRelacionadoService;

@RestController
public class ArtistaRelacionadoControlador {

	@Autowired
	private IArtistaRelacionadoService servicio;

	@RequestMapping("/artistasRelacion")
	public List<ArtistaRelacionado> listarPorAlbum(Model model) {
		List<ArtistaRelacionado> artistaRelacionadoList = servicio.listar();
		return artistaRelacionadoList;
	}
}
