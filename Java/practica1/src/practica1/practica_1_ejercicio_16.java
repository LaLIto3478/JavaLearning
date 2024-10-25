package practica1;

import javax.swing.JOptionPane;

public class practica_1_ejercicio_16 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int W = 0, H = 0, X = 0, Y = 0, R = 0, S = 0, X1 = 0, Y1 = 0;
        
        // PEDIR AL USUARIO LAS VARIABLES
        W = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es el número de casillas de ancho del tablero?: "));
        H = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es el número de casillas de alto del tablero?: "));
        X = Integer.parseInt(JOptionPane.showInputDialog("¿Cúal es la coordenada inicial de la pieza en el eje X?: "));
        Y = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es la coordenada inicial de la pieza en el eje Y?: "));
        R = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas casillas se moverá en forma horizontal la pieza?: "));
        S = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas casillas se moverá la pieza en forma vertical?: "));
        
        // PROCESAMIENTO
        if (1 <= W){
            if (H <= 10){
                if (X <= W){
                    if (Y <= H){
                        if (-20 <= R && S <= 20){
                            X1 = (W + X + R) % W;
                            Y1 = (H + Y + S) % H;
                            
                            // MOSTRAR EN PANTALLA LOS RESULTADOS
                            JOptionPane.showMessageDialog(null, Math.abs(X1) + " " + Math.abs(Y1));
                        
                        }else{
                        JOptionPane.showMessageDialog(null, "FUERA DE RANGO");}
                    
                    }else{
                    JOptionPane.showMessageDialog(null, "FUERA DE RANGO");}
                
                }else{
                JOptionPane.showMessageDialog(null, "FUERA DE RANGO DEL TABLERO");}
            
            }else{
            JOptionPane.showMessageDialog(null, "El tablero NO puede tener más de diez casillas en vertical.");}
        
        }else{
        JOptionPane.showMessageDialog(null, "El tablero NO puede tener menos de una casilla en forma horizontal.");}
                
    }
    
}