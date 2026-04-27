package ar.edu.unahur.obj2.w2j.planes;

import java.util.List;

import ar.edu.unahur.obj2.w2j.plataforma.Usuario;
import ar.edu.unahur.obj2.w2j.contenidos.Contenido;


public class PlanBasico implements IPlan {
    private Integer limiteDeContenidos;

    public PlanBasico(Integer limiteDeContenidos) {
        this.limiteDeContenidos = limiteDeContenidos;
    }

//************************************************

    public Integer getLimiteDeContenidos() {
        return limiteDeContenidos;
    }

//************************************************

    @Override
    public Double calcularCostoMensual(Usuario usuario) {
        Double costoMensual = 5.0;
        Double costoFinal = 0.0;
        List<Contenido> contenidosConsumidos = usuario.getContenidosConsumidos();
        List<Contenido> contenidosExcedidos = contenidosConsumidos.subList(limiteDeContenidos, contenidosConsumidos.size());
        Double costoBaseDeContenidosExcedidos = contenidosExcedidos.stream().mapToDouble(c -> c.getCostoBase()).sum();

        if (limiteDeContenidos >= 10) {
            costoFinal = costoMensual;
        } else {
            costoFinal = costoMensual + costoBaseDeContenidosExcedidos;
        }

        return costoFinal;
    }
}
