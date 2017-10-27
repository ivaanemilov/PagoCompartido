/* 
 * Copyright 2016 José A. Pacheco Ondoño - joanpon@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author José A. Pacheco Ondoño - joanpon@gmail.com
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objeto Scanner
        Scanner scn = new Scanner(System.in);
        scn.useLocale(Locale.ENGLISH);

        // Variables
        double importeCena;
        int numAmigos;
        double pagoPersona;

        try {
            // Importe Cena
            System.out.print("Importe cena (€) ..: ");
            importeCena = scn.nextDouble();
            scn.nextLine();

            // Número Amigos
            System.out.print("Número comensales .: ");
            numAmigos = scn.nextInt();
            scn.nextLine();
            
            // Pago por Comensal
            pagoPersona = importeCena / numAmigos;

            // Mensaje
            System.out.printf(Locale.ENGLISH,
                    "Pago por comensal .: %.2f€\n", pagoPersona);
        } catch (Exception e) {
            System.out.println("Error de entrada");
            scn.nextLine();
        }
    }
}
