package co.geb.spotify.modelo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "gbe_artista_relacionado")
public class ArtistaRelacionado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ARTISTA_RELACIONADO")
    private Integer idArtistaRelacionado;
    @JoinColumn(name = "ID_ALBUM", referencedColumnName = "ID_ALBUM")
    @ManyToOne
    private Album idAlbum;
    @JoinColumn(name = "ID_ARTISTA", referencedColumnName = "ID_ARTISTA")
    @ManyToOne
    private Artista idArtista;

    public ArtistaRelacionado() {
    }

    public ArtistaRelacionado(Integer idArtistaRelacionado) {
        this.idArtistaRelacionado = idArtistaRelacionado;
    }

    public Integer getIdArtistaRelacionado() {
        return idArtistaRelacionado;
    }

    public void setIdArtistaRelacionado(Integer idArtistaRelacionado) {
        this.idArtistaRelacionado = idArtistaRelacionado;
    }

    public Album getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(Album idAlbum) {
        this.idAlbum = idAlbum;
    }

    public Artista getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(Artista idArtista) {
        this.idArtista = idArtista;
    }

}
