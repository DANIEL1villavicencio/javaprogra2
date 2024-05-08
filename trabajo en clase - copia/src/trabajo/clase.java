package trabajo;

import javax.swing.*;

public class clase {
    public clase (){

    }
    //metodo, siempre retorna un dato
    public void suma(int num1,int num2) {
       int Suma= num2+num1;
        JOptionPane.showMessageDialog(null, "la suma de los dos numeros es"+Suma);
    }
    public void resta(int num1,int num2) {
        int Resta= num2-num1;
        JOptionPane.showMessageDialog(null, "la suma de los dos numeros es"+Resta);
    }
    public void multi(int num1,int num2) {
        int Multi= num2*num1;
        JOptionPane.showMessageDialog(null, "la multiplicacion de los dos numeros es"+Multi);
    }
    public void division(int num1,int num2) {
        double Divi= (double) num1 /num2;
        JOptionPane.showMessageDialog(null, "la division de los dos numeros es"+Divi);
    }
}
