package salario;

import javax.swing.*;

public class datos {
int cedula;
String nombre,apellido,genero;
float salario;
int dian,mesn,anion,diai,mesi,anioi;
    public datos () {
   cedula= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del producto: "));
   nombre= JOptionPane.showInputDialog("Ingrese el nombre del usuario: ");
   apellido= JOptionPane.showInputDialog("Ingrese el apellido del usuario: ");
   genero= JOptionPane.showInputDialog("Ingrese el genero del usuario: ");
   salario= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el salario del usuario: "));
   dian= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia de nacimiento del usuario: "));
   mesn= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de nacimiento del usuario: "));
   anion= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el anio de nacimiento del usuario: "));
   diai= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia de ingreso del usuario: "));
   mesi= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de ingreso del usuario: "));
   anioi= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el anio de ingreso del usuario: "));
    }
}
