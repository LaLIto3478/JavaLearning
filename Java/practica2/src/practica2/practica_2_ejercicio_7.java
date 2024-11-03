package practica2;

import javax.swing.JOptionPane;

public class practica_2_ejercicio_7{

    public static void main(String[] args) {
        //DECLARAR VARIABLE
        int DIA = 0;
        
        // PEDIR AL USUARIO EL VALOR DE DIA
        DIA = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL DÍA DE LA SEMANA (1-7): "));
        
        // PROCESAMIENTO
        if (0 < DIA){
            if (DIA < 8){
                switch (DIA) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Su dia es LUNES.");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Su dia es MARTES.");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Su dia es MIERCOLES.");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Su dia es JUEVES.");
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Su dia es VIERNES.");
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Su dia es SABADO.");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Su dia es DOMINGO.");
                        break;
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "FUERA DE RANGO \nDEBES INTRODUCIR UN VALOR ENTRE 1 Y 7");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "FUERA DE RANGO \nDEBES INTRODUCIR UN VALOR ENTRE 1 Y 7");
        }
    }
}
