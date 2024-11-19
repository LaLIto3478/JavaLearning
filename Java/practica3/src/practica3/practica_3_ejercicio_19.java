package practica3;

import javax.swing.JOptionPane;

public class practica_3_ejercicio_19 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        String uno = " ", dos = " ", tres = " ", cuatro = " ", cinco = " ", seis = " ", siete = " ", ocho = " ", nueve = " ";
        int aux = 0;
        // PROCESAMIENTO
        for (int i = 1 ; i <= 10 ; i++){
            aux = 1 * i;                        // tabla del 1
            uno += Integer.toString(aux) + " ";

            aux = 2 * i;                        // tabla del 2
            dos += Integer.toString(aux) + " ";

            aux = 3 * i;                        // tabla del 3
            tres += Integer.toString(aux) + " ";

            aux = 4 * i;                        // tabla del 4
            cuatro += Integer.toString(aux) + " ";

            aux = 5 * i;                        // tabla del 5
            cinco += Integer.toString(aux) + " ";

            aux = 6 * i;                        // tabla del 6
            seis += Integer.toString(aux) + " ";

            aux = 7 * i;                        // tabla del 7
            siete += Integer.toString(aux) + " ";

            aux = 8 * i;                        // tabla del 8
            ocho += Integer.toString(aux) + " ";

            aux = 9 * i;                        // tabla del 9
            nueve += Integer.toString(aux) + " ";            
        }
        // IMPRIMIR EN PANTALLA
        JOptionPane.showMessageDialog(null, "TABLA DEL UNO: " + uno + "\nTABLA DEL DOS: " + dos + "\nTABLA DEL TRES: "+ tres + "\nTABLA DEL CUATRO: " +cuatro + "\nTABLA DEL CINCO: "+cinco + "\nTABLA DEL SEIS: "+seis + "\nTABLA DEL SIETE: "+siete +"\nTABLA DEL OCHO: "+ ocho +"\nTABLA DEL NUEVE: "+ nueve);
    }
}
