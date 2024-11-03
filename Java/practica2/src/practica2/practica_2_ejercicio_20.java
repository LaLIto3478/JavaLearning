package practica2;

import javax.swing.JOptionPane;


public class practica_2_ejercicio_20 {
    
    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int N = 0, P = 0;
        int pos1 = 0, pos2 = 0;         //POS 1 ES IGUAL A P POSICIONES ANTES DE N Y POS2 A P POSICIONES DESPUES DE N
        float aux = 0;
        
        // PEDIR AL USUARIO LAS VARIABLES
        N = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NÚMERO ACTUAL DE LA SERIE: "));
        P = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NÚMERO DE POSICIONES 'P': "));
        aux = (float) P/3;
        if (aux % 1 == 0){
            pos1 = N;
            pos2 = N;
        }
        else{
            aux = P % 3;
            pos1 = (int) (N - aux + 2) % 3 + 1;
            pos2 = (int) (N + aux - 1) % 3 + 1;
        }
        JOptionPane.showMessageDialog(null, pos1 + " " + pos2);
    }
}
