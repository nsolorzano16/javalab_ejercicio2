/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientws.service;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

/**
 *
 * @author nelsonsolorzano
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner _scanner = new Scanner(System.in);
        ConversorSoap _conversor = new Conversor().getConversorSoap();
        ArrayList<Medida> _medidas = new ArrayList<Medida>();
        double _centigrados;
        int opt = 100;
        System.out.println("******* Conversor de Unidades ****");
        while (opt != 0) {
            System.out.println("Ingrese grados centigrados C - ejemplo 25.0");
            _centigrados = _scanner.nextDouble();
            System.out.println("haciendo peticion espere...");
            double _result = _conversor.caF(_centigrados);
            String uniqueID = UUID.randomUUID().toString();
            System.out.println("El resultado es: - " + _result);
            Medida _medida = new Medida(uniqueID, _centigrados, _result);
            _medidas.add(_medida);

            System.out.println("Desea hacer otra conversión ...");
            System.out.println("Escriba 1 para aceptar");
            System.out.println("Escriba 0 para salir ");
            opt = _scanner.nextInt();

        }
        System.out.println("Lista de conversiones");
        _medidas.forEach(m -> {
            System.out.println(m.toString());
        });

    }

}
