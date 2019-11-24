/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolBinario;

/**
 *
 * @author remix
 */
public class Arboless {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arbol al = new Arbol(23);
        al.agregar(new Nodo(23), al.getRaiz());
        al.agregar(new Nodo(14), al.getRaiz());
        al.agregar(new Nodo(9), al.getRaiz());
        al.agregar(new Nodo(2), al.getRaiz());
        al.agregar(new Nodo(10), al.getRaiz());
        al.agregar(new Nodo(16), al.getRaiz());
        al.agregar(new Nodo(15), al.getRaiz());
        al.agregar(new Nodo(20), al.getRaiz());
        al.agregar(new Nodo(30), al.getRaiz());
        al.agregar(new Nodo(50), al.getRaiz());
        al.agregar(new Nodo(51), al.getRaiz());
        
        al.RecorrerPreOrden(al.getRaiz());
        
    }
    
}
