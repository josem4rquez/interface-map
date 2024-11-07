/*
Faça um programa que simule um lançamento de dados.
Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi inserido. 
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class LançamentoDeDados {
    public static void main(String[] args) {

        int quantidadeDeLançamentos = 100;

        Random lançamentos = new Random();

        List<Integer> valoresDados = new ArrayList<>();

        for (int i = 0; i <= quantidadeDeLançamentos; i++) {
            int number = lançamentos.nextInt(6) + 1;
            valoresDados.add(number);
        }

        Map<Integer, Integer> lancamento = new HashMap<>();
        for (Integer resultados : valoresDados) {
            if (lancamento.containsKey(resultados))
            lancamento.put(resultados, (lancamento.get(resultados) + 1));
            else lancamento.put(resultados, 1);
        }

        System.out.println("Jogando: ");
        for (int i = 0; i < 3; i++ ) {
            try {
                Thread.sleep(3000);
                System.out.println(".");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Resultados dos Lançamentos iguais: ");
        for (Map.Entry<Integer, Integer> numeros : lancamento.entrySet())
        System.out.println(numeros.getKey() + " - " + numeros.getValue());
    }
}
