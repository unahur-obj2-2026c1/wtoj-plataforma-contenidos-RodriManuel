package ar.edu.unahur.obj2.w2j.contenidos;

public abstract class Contenido {
    protected String titulo;
    protected Double costoBase;

//************************************************

    public Contenido(String titulo, Double costoBase) {
        this.titulo = titulo;
        this.costoBase = costoBase;
    }

//************************************************

    public Double getCostoBase() {
        return this.costoBase;
    }

//************************************************

    public abstract Double calcularCostoDeLicencia();
}
