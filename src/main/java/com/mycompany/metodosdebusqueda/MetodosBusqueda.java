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
public class MetodosBusqueda {
    //-METODO POR EL ALGORITMO DE BUSQUEDA BINARIA
    public String busquedaBinaria(int CUI[],int elemento){
        int centro, primero, ultimo, valor_centro;
        primero=0;
        ultimo=CUI.length-1;
        while(primero<=ultimo){
            centro=(primero+ultimo)/2;
            valor_centro=CUI[centro];
            System.out.println("Comparando "+elemento+" Con "+valor_centro);
            if(elemento==valor_centro){
                //return centro;
                return "El elemento "+elemento+" ha sido encontrado en el indice "+centro+"\n";
            }else if(elemento<valor_centro){
                ultimo=centro-1;
            }else{
                primero=centro+1;
            }
        }
        return "el elemento "+elemento+" no existe en el arreglo";
    }
}
