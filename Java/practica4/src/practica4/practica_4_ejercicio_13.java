package practica4;

import javax.swing.JOptionPane;

public class practica_4_ejercicio_13 {

    public static void main(String[] args) {
        // DECLARACIÓN DE GOLOSINAS Y PRECIOS
        String[][] nombresGolosinas = {
            {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
            {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
            {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
            {"Lacasitos", "Crunch", "Milkybar", "KitKat"}
        };
        
        double[][] precio = {
            {1.1, 0.8, 1.5, 0.9},
            {1.8, 1, 1.2, 1},
            {1.8, 1.3, 1.2, 0.8},
            {1.5, 1.1, 1.1, 1.1}
        };
        
        // También tendrán una cantidad inicial, que en principio será de 5.
        int[][] cantidad = {
            {5, 5, 5, 5},
            {5, 5, 5, 5},
            {5, 5, 5, 5},
            {5, 5, 5, 5}
        };
        
        boolean bandera, principal, rellenar, confirmarpago;
        int opcion = 0, ventastotales = 0;
        double dinerototal = 0;
        String random = "";
        // ENTRADA AL PROGRAMA
        do{
            bandera = true;
            principal = true;
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                      --- BIENVENIDO A LA MÁQUINA EXPENDEDORA :) ---
                                                                                    En este menú podrás realizar las
                                                                                                siguientes acciones:
                                                                      
                                                                      1. PEDIR GOLOSINA
                                                                      
                                                                      2. MOSTRAR GOLOSINAS
                                                                      
                                                                      3. RELLENAR GOLOSINAS (SOLO TÉCNICOS)
                                                                      
                                                                      4. APAGAR MÁQUINA
                                                                      
                                                                             Ingrese el número de la acción que quiera
                                                                                                     que se ejecute.
                                                                      
                                                                      """));
                if(opcion < 1 || opcion > 4){
                    JOptionPane.showMessageDialog(null, "ERROR: Registro NO válido");
                    bandera = false;
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "ERROR: Registro NO válido");
                bandera = false;
            }
            
            switch (opcion){                        
                case 1:                                     // OPCION DE COMPRAR GOLOSINAS
                    do{
                        bandera = true;
                        try{
                            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                              --- PEDIR GOLOSINA DE LA MÁQUINA EXPENDEDORA ---

                                                                                Ingrese el ID de la golosina que desea comprar.

                                                                                Nota: Si no sabe las ID's de los productos, puede revisarlas
                                                                                      en el apartado de "MOSTRAR GOLOSINAS".
                                                                                  
                                                                                  Ingrese '-1' si desea volver al menú principal.
                                                                              """));
                            if(!(opcion == -1 ||opcion >= 0 && opcion <= 3 || opcion >= 10 && opcion <= 13 || opcion >= 20 && opcion <= 23 || opcion >= 30 && opcion <= 33)){
                                JOptionPane.showMessageDialog(null, "ERROR: Registro NO válido");
                                bandera = false;
                            }
                        }catch(NumberFormatException ex){
                            JOptionPane.showMessageDialog(null, "ERROR: Registro NO válido.");
                            bandera = false;
                        }
                    }while(bandera == false);
                    if(opcion == -1){
                        principal = true;
                        break;
                    }    
                    // SACAR LAS POSICIONES DE LA GOLOSINA
                    int i = opcion / 10;
                    int j = opcion % 10;

                    // MOSTRAR AL USUARIO LO QUE DEBERÁ PAGAR
                    do{
                        bandera = true;
                        try{
                            opcion = Integer.parseInt(JOptionPane.showInputDialog("--- CONFIRMAR PAGO ---"
                                    + "\nUsted deberá pagar: "+precio[i][j]+"$ por la compra de: "+nombresGolosinas[i][j]
                            +"\nIngrese '1' para confirmar el pago, ingrese '0' en caso contrario."));

                            if(opcion < 0 || opcion > 1){
                                JOptionPane.showMessageDialog(null, "ERROR: Registro NO válido");
                                bandera = false;
                            }
                        }catch(NumberFormatException ex){
                            JOptionPane.showMessageDialog(null, "ERROR: Registro NO válido");
                        }
                    }while(bandera == false);
                    
                    //CONFIRMAR PAGO
                    if(opcion == 1){
                        if(cantidad[i][j] > 0){
                            dinerototal += precio[i][j];
                            ventastotales++;
                            cantidad[i][j]--;
                        }else{
                            JOptionPane.showMessageDialog(null, "ERROR: No hay suficientes existencias de: "+nombresGolosinas[i][j]);
                            principal = true;
                        }
                    }else{
                        principal = true;
                    }

                    break;
                case 2:                                     // OPCION DE VER LAS GOLOSINAS DISPONIBLES
                    random = JOptionPane.showInputDialog("""
                                                                          --- GOLOSINAS DISPONIBLES EN LA MÁQUINA EXPENDEDORA ---
                                                                                                En este cuadro podrá hallar la ID de cada
                                                                                                    golosina al igual que su precio.
                                                                                00. KitKat: 1.1$
                                                                                01. Chicles de fresa: 0.8$
                                                                                02. Lacasitos: 1.5$
                                                                                03. Palotes: 0.9$
                                                                          
                                                                                10. Kinder Bueno: 1.8$
                                                                                11. Bolsa variada Haribo: 1$
                                                                                12. Chetoos: 1.2$
                                                                                13. Twix: 1$
                                                                          
                                                                                20. Kinder Bueno: 1.8$
                                                                                21. M&M'S: 1.3$
                                                                                22. Papa Delta: 1.2$
                                                                                23. Chicles de menta: 0.8$
                                                                          
                                                                                30. Lacasitos: 1.5$
                                                                                31. Crunch: 1.1$
                                                                                32. Milkybar: 1.1$
                                                                                33. KitKat: 1.1$
                                                                            
                                                                                        Ingrese cualquier tecla para volver al menú principal
                                                                          
                                                                          """);
                    principal = true;
                    break;
                case 3:                     // OPCION DE RELLENAR LA MÁQUINA
                    do{
                        rellenar = false;
                        random = JOptionPane.showInputDialog("""
                                                             --- RELLENAR GOLOSINAS DE LA MÁQUINA ---
                                                                    Contraseña requerida para acceder
                                                                                    a esta función.
                                                             """);
                        if("Maquina2023".equals(random)){
                            do{ 
                                bandera = true;
                                try{
                                    opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                          --- RELLENAR GOLOSINAS DE LA MÁQUINA ---

                                                                                          ID, NOMBRE DE LA GOLOSINA Y EXISTENCIAS""" +
                                                                                          "\n00. KitKat: 1.1$               "+ cantidad[0][0]+ 
                                                                                          "\n01. Chicles de fresa: 0.8$     "+cantidad[0][1]+
                                                                                          "\n02. Lacasitos: 1.5$            "+cantidad[0][2]+
                                                                                          "\n03. Palotes: 0.9$              "+cantidad[0][3]+
                                                                                          "\n\n10. Kinder Bueno: 1.8$       "+cantidad[1][0]+
                                                                                          "\n11. Bolsa variada Haribo: 1$   "+cantidad[1][1]+
                                                                                          "\n12. Chetoos: 1.2$              "+cantidad[1][2]+
                                                                                          "\n13. Twix: 1$                   "+cantidad[1][3]+
                                                                                          "\n\n20. Kinder Bueno: 1.8$       "+cantidad[2][0]+
                                                                                          "\n21. M&M'S: 1.3$                "+cantidad[2][1]+
                                                                                          "\n22. Papa Delta: 1.2$           "+cantidad[2][2]+
                                                                                          "\n23. Chicles de menta: 0.8$     "+cantidad[2][3]+
                                                                                          "\n\n30. Lacasitos: 1.5$          "+cantidad[3][0]+
                                                                                          "\n31. Crunch: 1.1$               "+cantidad[3][1]+
                                                                                          "\n32. Milkybar: 1.1$             "+cantidad[3][2]+
                                                                                          "\n33. KitKat: 1.1$               "+ cantidad[3][3]+
                                                                                          "\n\nIngrese la ID de la golosina a rellenar o"
                                                                                                  + "\nintroduzca -1 para volver al menú principal."));
                                    if(!(opcion == -1 || opcion >= 0 && opcion <= 3 || opcion >= 10 && opcion <= 13 || opcion >= 20 && opcion <= 23 || opcion >= 30 && opcion <= 33)){
                                        JOptionPane.showMessageDialog(null, "ERROR: Registro NO válido");
                                        bandera = false;
                                    }
                                    
                                }catch(NumberFormatException ex){
                                    JOptionPane.showMessageDialog(null, "ERROR: Registro NO válido");
                                    bandera = false;
                                }
    
                            }while(bandera == false);
                            
                            // SACAR POSICIONES PARA AÑADIR A LA GOLOSINA
                            if(opcion == -1){
                                principal = true;
                                break;
                            }
                            i = opcion / 10;
                            j = opcion % 10;

                            do{
                                bandera = true;
                                try{
                                    opcion = Integer.parseInt(JOptionPane.showInputDialog("--- RELLENAR GOLOSINAS DE LA MÁQUINA ---\n\n¿Cuántas golosinas desea agregar?"));
                                    if (opcion < 1){
                                        JOptionPane.showMessageDialog(null, "ERROR: Debe añadir al menos una golosina.");
                                        bandera = false;
                                    }
                                }catch(NumberFormatException ex){
                                    JOptionPane.showMessageDialog(null, "ERROR: Ingreso NO válido");
                                    bandera = false;
                                }
                            }while(bandera == false);

                            cantidad[i][j] += opcion;           // SE LE SUMA LA CANTIDAD DADA POR EL USUARIO A LAS EXISTENCIAS                            
                            
                        }else{
                            do{
                                bandera = true;
                                try{
                                    opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                                --- CONTRASEÑA INCORRECTA ---

                                                                                          Elija lo que quiera hacer a continuación.
                                                                                          0. Volver al menú principal.
                                                                                          1. Volver a intentar
                                                                                          """));
                                    if(opcion < 0 || opcion > 1){
                                        JOptionPane.showMessageDialog(null, "ERROR: Registro NO válido");
                                        bandera = false;
                                    }
                                }catch(NumberFormatException ex){
                                    JOptionPane.showMessageDialog(null, "ERROR: Registro NO válido");
                                    bandera = false;
                                }
                            }while(bandera == false);
                            switch (opcion){
                                case 0:
                                    principal = true;
                                    break;
                                case 1:
                                    rellenar = true;
                                    break;
                            }
                        }
                    }while(rellenar);
                    break;
                    
                case 4:
                    JOptionPane.showMessageDialog(null, """
                                                         --- APAGANDO MÁQUINA EXPENDEDORA ---
                                                         
                                                            Ventas totales:"""+" "+ventastotales+"\n   Dinero recaudado: "+dinerototal+"\n\n                      ¡Hasta luego! :)");             
                    principal = false;
                    break;
        }
        }while(bandera == false || principal == true);        
    }
}
