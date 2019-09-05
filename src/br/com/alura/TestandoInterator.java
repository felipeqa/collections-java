package br.com.alura;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestandoInterator {
    public static void main(String[] args) {
        List<String> letras = new LinkedList<>();
        letras.add("A");
        letras.add("B");
        letras.add("C");
        letras.add("E");

        Iterator<String> interadorDeLetras = letras.iterator();

        while (interadorDeLetras.hasNext()) {
            System.out.println(interadorDeLetras.next());
        }

    }
}
