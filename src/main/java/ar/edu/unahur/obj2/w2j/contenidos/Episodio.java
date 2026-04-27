package ar.edu.unahur.obj2.w2j.contenidos;

public class Episodio {
    private String titulo;
    private Integer numeroDeEpisodio;
    private Double costoEpisodio;

    public Episodio(String titulo, Integer numeroDeEpisodio, Double costoEpisodio) {
        this.titulo = titulo;
        this.costoEpisodio = costoEpisodio;
        this.numeroDeEpisodio = numeroDeEpisodio;
    }

//************************************************

    public String getTitulo() {
        return this.titulo;
    }

    public Double getCostoEpisodio() {
        return this.costoEpisodio;
    }

    public Integer getNumeroDeCapitulo() {
        return this.numeroDeEpisodio;
    }

//************************************************

}
