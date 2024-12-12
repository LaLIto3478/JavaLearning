package practica4;

import javax.swing.JOptionPane;

public class practica_4_ejercicio_5 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int I = 0, D = 0, posiciones = 0;
        int caja[] = {1, 2, 3, 4, 5};
        boolean bandera;
        String salida = "";
        
        // PEDIR AL USUARIO LAS VARIABLES
        do{
            bandera = true;
            try{
                I = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DE 'I'"));
                if (I < 0){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }
                if (1000000000 < I){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }
                
                D = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DE 'D'"));
                if (D < 0){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }
                if (1000000000 < D){
                    JOptionPane.showMessageDialog(null, "ERROR: Fuera de rango");
                    bandera = false;
                }                
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido");
                bandera = false;
            }
        }while(bandera == false);
     
        //CALCULAR NÚMERO DE POSICIONES QUE SE MOVERÁ A LA DERECHA
        posiciones = D - I;
        // CALCULAR EN QUÉ POSICIÓN QUEDARÁ
        if(posiciones > 0){
            posiciones = posiciones % 5;
            posiciones = 5 - posiciones;
            posiciones = posiciones % 5 ;
        }
        else{ 
            posiciones = 5 - posiciones;
            posiciones = posiciones % 5;
        }
        posiciones = Math.abs(posiciones);
        posiciones--;       
        
        // HACER EL STRING
        for(int i = 0 ; i < caja.length ; i++){            
            posiciones++;
            salida += caja[posiciones] + " ";
            if (posiciones == 4){
                posiciones = -1;
            }
        }
        //IMPRIMIR EN PANTALLA
        JOptionPane.showMessageDialog(null, salida);
    }
}
