package practica1;

import javax.swing.JOptionPane;

public class practica_1_ejercicio_14 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int L = 0, N = 0, l = 0, m = 0, w = 0, j = 0, v = 0, s = 0, d = 0, r = 0;
        
        // PEDIR AL USUARIO LAS VARIABLES
        L = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA CANTIDAD DE LITROS QUE SE TIENEN PARA UN DÍA: "));
        N = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA CANTIDAD DE LITROS QUE SE VENDERÁN A DIARIO: "));
        l = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA CANTIDAD DE CLIENTES QUE ACUDEN EL LUNES: "));
        m = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA CANTIDAD DE CLIENTES QUE ACUDEN EL MARTES: "));
        w = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA CANTIDAD DE CLIENTES QUE ACUDEN EL MIÉRCOLES: "));
        j = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA CANTIDAD DE CLIENTES QUE ACUDEN EL JUEVES: "));
        v = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA CANTIDAD DE CLIENTES QUE ACUDEN EL VIERNES: "));
        s = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA CANTIDAD DE CLIENTES QUE ACUDEN EL SÁBADO: "));
        d = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA CANTIDAD DE CLIENTES QUE ACUDEN EL DOMINGO: "));
        
        //PROCESAMIENTO
        if (0<= L){ 
            
            if (L <= 10000){      
                
                if (N<=L){         
                    
                    if (0<=l && l<=100){
                        l = (L + r) - (N * l);    
                        
                        if (0<=m && m<= 100){
                            
                            m = (L + l) - (N * m);
                            
                            if (0<=w && w<=100){
                                w = (L + m) - (N * w);
                                
                                if (0<=j && j<=100){
                                    j = (L + w) - (N * j);
                                    
                                    if (0<=v && v<=100){
                                        v = (L + j) - (N * v);
                                        
                                        if (0<=s && s<=100){
                                            s = (L + v) -(N * s);
        
                                            if (0<=d && d<=100){
                                                d = (L + s) - (N * d);
                                                JOptionPane.showMessageDialog(null, l + " " + m + " " + w + " " + j + " " + v + " " + s + " " + d);
                                            
                                            }else{
                                            JOptionPane.showMessageDialog(null, "El número de clientes del domingo no puede ser menor de 0 ni mayor de 100");}
                                        
                                        }else{
                                        JOptionPane.showMessageDialog(null, "El número de clientes del sábado no puede ser menor de 0 ni mayor de 100");}
                                    
                                    }else{
                                    JOptionPane.showMessageDialog(null, "El número de clientes del viernes no puede ser menor de 0 ni mayor de 100");}
                                
                                }else{
                                JOptionPane.showMessageDialog(null, "El número de clientes del jueves no puede ser menor de 0 ni mayor de 100");}
                            
                            }else{
                            JOptionPane.showMessageDialog(null, "El número de clientes del miércoles no puede ser menor de 0 ni mayor de 100");}
                        
                        }else{
                        JOptionPane.showMessageDialog(null, "El número de clientes del martes no puede ser menor de 0 ni mayor de 100");}
                    
                    }else{
                    JOptionPane.showMessageDialog(null, "El número de clientes del lunes no puede ser  menor de 0 ni mayor de 100");}
                    
                }else{
                JOptionPane.showMessageDialog(null, "El número de litros que se le venderán a cada cliente NO puede ser mayor al almacenamiento diario!!!");}

            }else{
            JOptionPane.showMessageDialog(null, "Los litros NO pueden ser mayor a 10000!!!");}
        
        }else{
        JOptionPane.showMessageDialog(null, "Los litros NO pueden ser menor a cero!!!");}
    }
    
}
