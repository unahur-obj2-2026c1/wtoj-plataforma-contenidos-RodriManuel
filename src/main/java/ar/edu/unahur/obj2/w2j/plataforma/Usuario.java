package ar.edu.unahur.obj2.w2j.plataforma;

import ar.edu.unahur.obj2.w2j.contenidos.Contenido;
import ar.edu.unahur.obj2.w2j.planes.IPlan;
import ar.edu.unahur.obj2.w2j.planes.PlanBasico;

public class Usuario {
    private IPlan planSuscrito = new PlanBasico(10);
    private List<Contenido> contenidosConsumidos = new ArrayList<>();


    public Usuario() {
        this.contenidosConsumidos = new ArrayList<>();
    }

//************************************************

    public List<Contenido> getContenidosConsumidos() {
        return new ArrayList<>(contenidosConsumidos);
    }

    public void consumirContenido(Contenido contenido) {
        this.contenidosConsumidos.add(contenido);
    }

    public IPlan getPlanSuscrito() {
        return this.planSuscrito;
    }

    public void cambiarPlanSuscrito(IPlan nuevoPlan) {
        this.planSuscrito = nuevoPlan;
    }

//************************************************

    public Double calcularFacturaMensual() {
        return this.planSuscrito.calcularCostoMensual(this);
    }

    public void reiniciarListaDeContenidosConsumidos() {
        this.contenidosConsumidos.clear();
    }
}