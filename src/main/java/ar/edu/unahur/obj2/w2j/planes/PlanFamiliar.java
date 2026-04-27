package ar.edu.unahur.obj2.w2j.planes;

import java.util.List;

import ar.edu.unahur.obj2.w2j.plataforma.Usuario;
import ar.edu.unahur.obj2.w2j.contenidos.Contenido;


public class PlanFamiliar implements IPlan {
    private Double costoMensual;
    private Integer limiteDeContenidos;

    public PlanFamiliar(Double costoMensual, Integer limiteDeContenidos) {
        this.costoMensual = costoMensual;
        this.limiteDeContenidos = limiteDeContenidos;
    }

//************************************************

    public Double getCostoMensual() {
        return costoMensual;
    }

    public Integer getLimiteDeContenidos() {
        return limiteDeContenidos;
    }

//************************************************

    @Override
    public Double calcularCostoMensual(Usuario usuario) {
        Double costoFinal = 0.0;
        List<Contenido> contenidosConsumidos = usuario.getContenidosConsumidos();
        List<Contenido> contenidosExcedidos = contenidosConsumidos.subList(limiteDeContenidos, contenidosConsumidos.size());
        Double costoBaseDeContenidosExcedidos = contenidosExcedidos.stream().mapToDouble(c -> c.getCostoBase()).sum();

        if (limiteDeContenidos >= 10) {
            costoFinal = this.costoMensual;
        } else {
            costoFinal = this.costoMensual + costoBaseDeContenidosExcedidos;
        }

        return costoFinal - (costoFinal/100 * 15);
    }
}