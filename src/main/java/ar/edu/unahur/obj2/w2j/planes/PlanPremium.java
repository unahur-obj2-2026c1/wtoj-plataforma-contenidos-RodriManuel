package ar.edu.unahur.obj2.w2j.planes;

import ar.edu.unahur.obj2.w2j.Plataforma.Usuario;

public class PlanPremium implements IPlan {
    private Double costoMensual;

    public PlanPremium(Double costoMensual) {
        this.costoMensual = costoMensual;
    }

//************************************************

    public Double getCostoMensual() {
        return this.costoMensual;
    }
    
//************************************************

    @Override
    public Double calcularCostoMensual(Usuario usuario) {
        return this.costoMensual;
    }
}