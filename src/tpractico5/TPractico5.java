/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpractico5;




public class TPractico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int nro[]= {25,12,83,19};
      Arreglos.sumarLista(nro);
      Arreglos.buscarMayor(nro);
       int contar = Arreglos.cuentaCaracter("Melisa", 'p');
       System.out.println("La Cantidad de caracteres es: "+contar);
       Arreglos.cuentaVocales( "meelIIIssssaAAA");
    
    }
    
}
