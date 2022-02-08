package cotcox.domain.tarifa;

import cotcox.domain.carrera.Carrera;

public class Tarifa {
    final static double COSTE_MILLA = 1.35;
    final static double COSTE_MINUTO = 0.35;
    final static double COSTE_MINIMO = 5;
    final static byte PORCENTAJE_COMISION = 20;

    public Tarifa() {}

    public static double getCosteDistancia(double distancia) {
        double costeDistancia = distancia * COSTE_MILLA;
        return costeDistancia;
        /** Se pone una variable "costeDistancia" para ver el estado en el debugger
         * */
    }

    public static double getCosteTiempo(int tiempo) {
        double costeTiempo = tiempo * COSTE_MINUTO;
        return costeTiempo;
    }

    public static double getCosteTotalEsperado(Carrera carrera) {
        double costeTotal = getCosteDistancia(carrera.getDistancia()) + getCosteTiempo(carrera.getTiempoEsperadoMinutos());

        if (costeTotal < COSTE_MINIMO) {
            return COSTE_MINIMO;
        }
        else {
            return costeTotal;
        }
    }
}
