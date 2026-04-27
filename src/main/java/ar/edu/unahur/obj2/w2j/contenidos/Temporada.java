package ar.edu.unahur.obj2.w2j.contenidos;

import java.util.List;
import java.util.ArrayList;

public class Temporada {
    private Integer numeroDeTemporada;
    private List<Episodio> episodios;

    public Temporada(Integer numeroDeTemporada) {
        this.numeroDeTemporada = numeroDeTemporada;
        this.episodios = new ArrayList<Episodio>();
    }

//************************************************

    public Integer getNumeroDeTemporada() {
        return this.numeroDeTemporada;
    }

    public void agregarEpisodio(Episodio episodio) {
        this.episodios.add(episodio);
    }

//************************************************

    public Double calcularCostoPromedioDeEpisodios() {
        Double costoTotalEpisodios = 0.0;
        Integer cantidadEpisodios = episodios.size();
        
        for (Episodio episodio : episodios) {
            costoTotalEpisodios += episodio.getCostoEpisodio();
        }

        Double costoPromedioEpisodios = costoTotalEpisodios / cantidadEpisodios;

        return costoPromedioEpisodios;
    }

}