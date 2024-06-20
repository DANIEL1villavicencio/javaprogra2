package parqueadero;

import javax.swing.*;

import java.util.ArrayList;
import java.util.List;;

public class Puesto {
    private List<Carro> carrosingresados;
    private List<Carro> carrosparqueados;
    boolean puesto[] = new boolean[5];
    int i = 0;
    private double tarifa = 1.0;


    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }


    public Puesto() {
        carrosingresados = new ArrayList<>();
        carrosparqueados = new ArrayList<>();
    }


    public void MeterCarro() {
        int puestoc;
        int HoraDeEntrada;
        int HoraDeSalida;
        String placa;
        if (i < 5) {
            puesto[i] = true;
            placa = (JOptionPane.showInputDialog("Ingrese la placa del carro"));
            Carro carro = verificarCarro(placa);
            if (carro == null) {
                HoraDeEntrada = (Integer.parseInt(JOptionPane.showInputDialog("Ingrese la hora de entrada")));
                HoraDeSalida = HoraDeEntrada;
                puestoc = i;
                carrosingresados.add(new Carro(placa, puestoc, HoraDeEntrada, HoraDeSalida));
                carrosparqueados.add(new Carro(placa, puestoc, HoraDeEntrada, HoraDeSalida));
                i++;
            } else {
                JOptionPane.showMessageDialog(null, "la placa ya existe");
            }
        } else {
            JOptionPane.showMessageDialog(null, "no hay mas puestos disponibles");
        }
    }

    public void SacarCarro() {
        String placa1 = JOptionPane.showInputDialog("ingrese la placa del carro a sacar");
        for (Carro carro : carrosparqueados) {
            if (carro.getPlaca().equals(placa1)) {
                puesto[carro.getPuesto()] = false;
                carrosparqueados.remove(carro);
                JOptionPane.showMessageDialog(null, "carro retirado con exito");
            break;
            }
        }
    }

    public void puestosDisponibles() {
        JOptionPane.showMessageDialog(null, "los puestos disponibles son:");
        for (int i = 0; i < 5; i++) {
            if (puesto[i] == false) {
                JOptionPane.showMessageDialog(null, i+1);
            }
        }
    }

    public void ingresosParqueadero() {
        JOptionPane.showMessageDialog(null, "los carros ingresados son:");
        for (Carro carro : carrosingresados) {
            JOptionPane.showMessageDialog(null, "placa: " + carro.getPlaca());

        }
    }

    public void calcularTarifa() {
        double pagar = 0;
        String placa = JOptionPane.showInputDialog("ingrese la placa del carro a sacar");
        Carro carro = verificarCarro(placa);
        if (carro != null) {
            for (Carro carro1 : carrosingresados) {
                if (carro1.getPlaca().equals(carro.getPlaca())) {
                    if (carro1.getHorasalida() < 21 || carro1.getHorasalida() > 6) {
                        pagar = tarifa * (carro.getHorasalida() - carro.getHoraDeEntrada());
                        JOptionPane.showMessageDialog(null, "El carro debe pagar " + pagar + " $");
                    } else {
                        JOptionPane.showMessageDialog(null, "El parqueadero ya cerro");
                    }
                }
            }
        }
    }

    public void modificarTarifa() {
        setTarifa(Double.parseDouble(JOptionPane.showInputDialog("ingrese una nueva tarifa, tarifa actual: " + getTarifa())));
    }

    public void avanzarReloj() {
        for (Carro carro : carrosparqueados) {
            carro.setHorasalida(carro.getHorasalida() + 1);
        }

    }

    private Carro verificarCarro(String placa) {
        for (Carro carro : carrosparqueados) {
            if (carro.getPlaca().equals(placa)) {
                return carro;
            }
        }
        return null;
    }

}
