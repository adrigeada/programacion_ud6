package org.example;

import java.util.zip.DataFormatException;

public class PruebaExcepciones {
    static void main(String[] args)  {

        int edad = 15;

        if (edad <= 18){
            throw new EdadValida();
        }



    }
}
