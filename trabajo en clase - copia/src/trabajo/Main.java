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
        clase calcu = new clase();
        switch (opcion){
            case 1:
                num1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));
                calcu.suma(num1,num2);
            break;
            case 2:
                num1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));
                calcu.resta(num1,num2);
            break;
            case 3:
                num1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));
                calcu.multi(num1,num2);
            break;
            case 4:

                num1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));
                calcu.division(num1,num2);
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
