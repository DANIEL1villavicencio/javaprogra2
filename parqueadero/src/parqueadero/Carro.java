package parqueadero;

import javax.swing.*;

public class Carro {

    private String placa;
    private int horaDeEntrada;
    private int puesto;
    private int horasalida;

    public Carro(String placa,int puesto ,int hora,  int horasalida) {
        this.placa = placa;
        this.horaDeEntrada = hora;
        this.puesto = puesto;
        this.horasalida = horasalida;
    }

    public int getHorasalida() {
        return horasalida;
    }

    public void setHorasalida(int horasalida) {
        this.horasalida = horasalida;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getHoraDeEntrada() {
        return horaDeEntrada;
    }

    public void setHoraDeEntrada(int horaDeEntrada) {
        this.horaDeEntrada = horaDeEntrada;
    }


}
