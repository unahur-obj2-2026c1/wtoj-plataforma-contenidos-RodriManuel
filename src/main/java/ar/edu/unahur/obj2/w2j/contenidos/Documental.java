package ar.edu.unahur.obj2.w2j.contenidos;

public class Documental extends Contenido {
    private static Double canonIDRA = 0.5;

    public Documental(String titulo, Double costoBase){
        super(titulo, costoBase);    
    }

//************************************************

//************************************************

    @Override
    public Double calcularCostoDeLicencia(){
        return this.costoBase + canonIDRA;
    }
}
