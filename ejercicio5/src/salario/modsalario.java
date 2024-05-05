package salario;

import javax.swing.*;

public class modsalario {
    float nuevopsalario;
    public modsalario () {
        nuevopsalario= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el nuevo salario "));
    }
}
