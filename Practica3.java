/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg3;

import java.util.Scanner;

/**
 *
 * @author Sala
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       }
    private void sucesionFibonacci(int numeroElementosAImprimir)
{
    int primerElemento=0;
    int segundoElemento=1;

    if(numeroElementosAImprimir == 1)
    {
        System.out.println(primerElemento);
    }
    else if(numeroElementosAImprimir==2)
    {
        System.out.println(primerElemento);
        System.out.println(segundoElemento);
    }

    if(numeroElementosAImprimir > 2)
    {
        System.out.println(primerElemento);
        System.out.println(segundoElemento);

        for(int i=3; i<=numeroElementosAImprimir; i++)
        {
            int nuevoElemento=primerElemento+segundoElemento;
            System.out.println(nuevoElemento);
            primerElemento=segundoElemento;
            segundoElemento=nuevoElemento;
        }
            
        }
    }

}

   
