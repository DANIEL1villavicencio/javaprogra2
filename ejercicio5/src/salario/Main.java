package salario;
import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int opcion;
        datos nuevo =new datos();
        do {
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 1 para modificar el salario, 2 para calcular edad y 3 para calcualr prestaciones o 4 para salir"));
            switch(opcion){
                case 1:
                    modsalario salar= new modsalario();
                    nuevo.salario=salar.nuevopsalario;
                break;
                case 2:
                    edad edad= new edad(nuevo.diai,nuevo.mesi,nuevo.anioi);
                    JOptionPane.showInputDialog(null,"el tiempo del usuario en la empresa es de"+ nuevo.nombre +" "+nuevo.apellido+" es de "+ edad.anototal + " anios "+ edad.mestotal+" meses y "+ edad.diatotal +"dias");
                break;
                case 3:
                    prestaciones prestaciones= new prestaciones(nuevo.salario, nuevo.anioi);
                    JOptionPane.showInputDialog(null,"las prestaciones del usuario"+ nuevo.nombre +" "+nuevo.apellido+" es de :"+ prestaciones.prest + "$");
                break;
                default:
                    JOptionPane.showInputDialog(null,"no existe esta opcion");
                break;
            }
        }while (opcion!=4);
        }
    }
