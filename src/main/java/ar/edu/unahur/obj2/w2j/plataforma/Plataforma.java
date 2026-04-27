package ar.edu.unahur.obj2.w2j.plataforma;

import java.util.ArrayList;
import java.util.List;

public class Plataforma {
    private List<Usuario> usuariosRegistrados;

    public Plataforma() {
        this.usuariosRegistrados = new ArrayList<>();
    }

//************************************************    

    public List<Usuario> getUsuariosRegistrados() {
        return new ArrayList<>(usuariosRegistrados);
    }

    public void registrarUsuario(Usuario nuevoUsuario) {
        this.usuariosRegistrados.add(nuevoUsuario);
    }

//************************************************

    public Double calcularFacturacionTotal() {
        return this.usuariosRegistrados.stream().mapToDouble(u -> u.calcularFacturaMensual()).sum();
    }

    public void reiniciarContenidosConsumidosPorUsuarios() {
        this.usuariosRegistrados.stream().forEach(u -> u.reiniciarListaDeContenidosConsumidos());
    }
}