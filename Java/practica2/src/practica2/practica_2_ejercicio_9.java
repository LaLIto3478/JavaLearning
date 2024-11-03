package practica2;

import javax.swing.JOptionPane;

public class practica_2_ejercicio_9{

    public static void main(String[] args) {
        //DECLARAR VARIABLES
        int numero = 0;
        
        // PEDIR AL USUARIO LA VARIABLE A EVALUAR
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número que desea evaluar: "));
        
        // PROCESAMIENTO
        if (1 <= numero){
            if (numero <= 10){
                if (numero % 2 == 0){
                    JOptionPane.showMessageDialog(null, "PAR");
                }
                else{
                    JOptionPane.showMessageDialog(null, "IMPAR");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "SU NÚMERO DEBE SER MENOR O IGUAL QUE DIEZ!!!");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "SU NÚMERO DEBE SER MAYOR O IGUAL QUE UNO!!!");
        }
    }
}
