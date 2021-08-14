/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.metodosdebusqueda;

/**
 *
 * @author frankdev
 */
public class BusquedaMain {
    public static void main(String args[]){
        int ID[]={0,1,1,2,2,2,3,5,9,9,9};
        MetodosBusqueda Metodo = new MetodosBusqueda();
        
        //-LA BUSQUEDA BINARIA RECIBE UN ARREGLO PREVIAMENTE ORDENADO Y EL ELEMENTO A BUSCAR
        System.out.println(Metodo.busquedaBinaria(ID, 3));
    }
}
