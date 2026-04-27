package ar.edu.unahur.obj2.w2j.contenidos;

import java.util.List;
import java.util.ArrayList;

public class Serie extends Contenido {
    private List<Temporada> temporadas;

    public Serie(String titulo, Double costoBase) {
        super(titulo, costoBase);   
        this.temporadas = new ArrayList<Temporada>();    
    }  

    public void agregarTemporada(Temporada temporada) {
        this.temporadas.add(temporada);
    }

    /*public Double calcularCostoPromedioDeEpisodios() {
        return temporadas.stream()        
                         .mapToDouble(c -> c.getCostoEpisodio())
                         .sum();
    }*/

    @Override
    public Double calcularCostoDeLicencia() {
        return this.costoBase;
    }

}