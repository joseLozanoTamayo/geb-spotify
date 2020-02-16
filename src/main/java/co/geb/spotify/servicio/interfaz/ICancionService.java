package co.geb.spotify.servicio.interfaz;

import java.util.List;

import co.geb.spotify.modelo.Cancion;

public interface ICancionService {
	
	public List<Cancion>listar();
	
	public Cancion getCancion(int id);
	
	public int save(Cancion cancion);
	

}
