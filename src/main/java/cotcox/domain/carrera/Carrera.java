package cotcox.domain.carrera;

import cotcox.domain.conductores.Conductor;
import cotcox.domain.conductores.PoolConductores;
import cotcox.domain.tarifa.Tarifa;

public class Carrera {
    private String tarjetaCredito;
    private String origen;
    private String destino;
    private double distancia;
    private int tiempoEsperadoMinutos;
    private int tiempoCarrera;
    private double totalPago;
    private int propina;
    private Conductor conductor;

    public Carrera(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getTarjetaCredito() {
        return this.tarjetaCredito;
    }

    public String getOrigen() {
        return this.origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return this.distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getCosteEsperado() {
        return Tarifa.getCosteTotalEsperado(this);
    }

    public int getTiempoEsperadoMinutos() {
        return this.tiempoEsperadoMinutos;
    }

    public void setTiempoEsperado(int tiempoEsperado) {
        this.tiempoEsperadoMinutos = tiempoEsperado;
    }

    public int getTiempoCarrera() {
        return this.tiempoCarrera;
    }

    public void setTiempoCarrera(int tiempo) {
        this.tiempoCarrera = tiempo;
    }

    public Conductor getConductor() {
        return this.conductor;
    }

    /** SetConductor */

    public void asignarConductor(PoolConductores conductores) {
        for (Conductor conductor : conductores.getPoolConductores()) {
            if (conductor.isOcupado() == false) {
                this.conductor = conductor;
                conductor.setOcupado(true);
                break;
            }
        }
    }

    public void recibirPropina(int propina) {
        this.propina = propina;
    }

    public int getPropina() {
        return this.propina;
    }

    public void realizarPago(double costeEsperado) {
        this.totalPago = costeEsperado;
    }

    public double getCosteTotal() {
        return this.totalPago;
    }

    public void liberarConductor() {
        this.conductor.setOcupado(false);
    }

}
