package trabajo;

import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int opcion;
        int num1,num2;
        do {
        opcion= Integer.parseInt(JOptionPane.showInputDialog("ingrese 1 para suma, 2 para resta, 3 para multiplicar y 4 para dividir o 5 para salir"));

        switch (opcion){
            case 1:
                clase suma = new clase();
                suma.Suma();
            break;
            case 2:
                clase resta = new clase();
                resta.Resta();
            break;
            case 3:
                clase multiplicacion = new clase();
                multiplicacion.Multi();
            break;
            case 4:
                clase division = new clase();
                division.Division();
            break;
            case 5:
                JOptionPane.showMessageDialog(null,"fin del programa");
            break;
            default:
                JOptionPane.showMessageDialog(null,"opcion no valida");
            break;
            }
        }while (opcion!=5);
    }
}
