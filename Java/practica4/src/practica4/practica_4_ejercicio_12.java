package practica4;

import javax.swing.JOptionPane;

public class practica_4_ejercicio_12 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int N = 0, sumatoria = 0, aux1 = 0, aux2 = 0, aux3 = 0, aux4 = 0;
        boolean bandera, semimagico = true;
        
        // PEDIR EL VALOR DE N
        do{
            bandera = true;
            try{
                N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de N"));
                if(N < 1){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }else if(100 < N){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido");
                bandera = false;
            }
        }while(bandera == false);
        
        // CREAR EL ARREGLO
        int arreglo[][] = new int[N][N];
        
        // LLENAR EL ARREGLO
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                do{
                    bandera = true;
                    try{
                        arreglo[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero"));
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido");
                        bandera = false;
                    }
                }while(bandera == false);
                if(i == 0){
                    sumatoria += arreglo[i][j];
                }
            }
        }
        
        // VERIFICAR QUE SEA UN CUADRADO SEMIMÁGICO
        do{
            aux3 = 0;
            aux4 = 0;
            semimagico = true;
            for(int i = 0 ; i < N ; i++){   // FILAS Y COLUMNAS
                aux1 = 0;
                aux2 = 0;
                for(int j = 0 ; j < N ; j++){
                    aux1 += arreglo[i][j];
                    aux2 += arreglo[j][i];
                    if(i == j){
                        aux3 += arreglo[i][j];
                    }
                    if(i + j == N - 1){
                        aux4 += arreglo[i][j];
                    }
                }
                if(sumatoria != aux1 || sumatoria != aux2){
                    semimagico = false;
                }
                if(i == N - 1){
                    if(sumatoria != aux3 || sumatoria != aux4){
                        semimagico = false;
                    }
                }
            }
            if(semimagico){
                JOptionPane.showMessageDialog(null, "1");
            }else{
                JOptionPane.showMessageDialog(null, "0");
            }
            break;            
        }while(semimagico = false);
    }
}
