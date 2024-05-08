package trabajo;

import javax.swing.*;

public class clase {
    int num1;
    int num2;
    public clase (){
        num1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));
    }
    //metodo, siempre retorna un dato
    public void Suma() {
       int Suma= num2+num1;
        JOptionPane.showMessageDialog(null, "la suma de los dos numeros es"+Suma);
    }
    public void Resta() {
        int Resta= num2-num1;
        JOptionPane.showMessageDialog(null, "la suma de los dos numeros es"+Resta);
    }
    public void Multi() {
        int Multi= num2*num1;
        JOptionPane.showMessageDialog(null, "la multiplicacion de los dos numeros es"+Multi);
    }
    public void Division() {
        double Divi= (double) num1 /num2;
        JOptionPane.showMessageDialog(null, "la division de los dos numeros es"+Divi);
    }
}
