package cotcox.domain.conductores;

import java.util.ArrayList;
import java.util.List;

public class Conductor {
    private String nombre;
    private String modelo;
    private String matricula;
    private double valoracionMedia;
    private boolean ocupado;
    private List<Byte> valoraciones = new ArrayList<Byte>();

    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getValoracion() {
        return calcularValoracionMedia();
    }

    public int getNumeroValoraciones() {
        return valoraciones.size();
    }

    public void setValoracion(byte valoracion) {
        this.valoraciones.add(valoracion);
    }

    private double calcularValoracionMedia() {
        double media_valoraciones = 0;

        for (byte valoracion : valoraciones) {
            media_valoraciones = media_valoraciones + valoracion;
        }

        media_valoraciones = media_valoraciones / getNumeroValoraciones();
        return media_valoraciones;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean isOcupado() {
        return this.ocupado;
    }
}
