package parqueadero;

import javax.swing.*;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        int opcion;
        Parqueadero parqueadero = new Parqueadero();
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 1 para ingresar carro,2 para retirar carro, 3 para ver ingresos al parqueadero,4 para ver puestos disponibles, 5" +
                    "avanzar el reloj, 6 modificar la tarifa del parqueadero, 7  para calcular la tarifa a pagar  u 8 para salir"));
            switch (opcion) {
                case 1:
                    parqueadero.MeterCarro();
                    break;
                case 2:
                    parqueadero.SacarCarro();
                    break;
                case 3:
                    parqueadero.ingresosParqueadero();
                    break;
                case 4:
                    parqueadero.puestosDisponibles();
                    break;
                case 5:
                    parqueadero.avanzarReloj();
                    break;
                case 6:
                    parqueadero.modificarTarifa();
                    break;
                case 7:
                    parqueadero.calcularTarifa();
                    break;
                case 8:
                    JOptionPane.showInputDialog(null, "FIN DEL PROGRAMA");
                    break;
                default:
                    JOptionPane.showInputDialog(null, "no existe esta opcion");
                    break;
            }
        } while (opcion != 8);

    }
}