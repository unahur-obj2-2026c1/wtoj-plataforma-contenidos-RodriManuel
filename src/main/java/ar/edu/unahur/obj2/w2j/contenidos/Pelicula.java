package ar.edu.unahur.obj2.w2j.contenidos;

public class Pelicula extends Contenido {

    public Pelicula(String titulo, Double costoBase){
        super(titulo, costoBase);
    }

//************************************************

//************************************************

    @Override
    public Double calcularCostoDeLicencia(){
        return this.costoBase;
    }    
}