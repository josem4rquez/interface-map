/*Dada a população estimada de alguns estados do NE brasileiro, faça:

Estado = PE - População = 9.616.621

Estado = AL - População = 3.351.543

Estado = CE - População = 9.187.103

Estado = RN - População = 3.534.265

Crie um dicionário e relacione os estados e suas populações; -

Substitua a população do estado do RN por 3.534.165; -

Confira se o estado PB está no dicionário, caso não adicione: PB -
4.039.277; -

Exiba a população PE; - 

Exiba todos os estados e suas populações na ordem que foi
informado; -

Exiba os estados e suas populações em ordem alfabética; -

Exiba o estado com o menor população e sua quantidade; -

Exiba o estado com a maior população e sua quantidade; -

Exiba a soma da população desses estados; -

Exiba a média da população deste dicionário de estados; -

Remova os estados com a população menor que 4.000.000; -

Apague o dicionário de estados;

Confira se o dicionário está vazio. */

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Estados {
    public static void main(String[] args) {
        System.out.println("Dicionário dos Estados: ");
        Map<String, Integer> estados = new HashMap<>(){{
            put(" PE", 9616621);
            put(" AL", 3351543 );
            put(" CE", 9187103 );
            put(" RN", 3534265 );
        }};
        System.out.println(estados);

        System.out.println("Substitua a População do Estado do RN: ");
        estados.put(" RN", 3534165);
        System.out.println(estados);
        
        System.out.println("Confira se o estado PB está no Dicionário: " + estados.containsKey("PB"));

        System.out.println("Adicione o estado PB: ");
        estados.put(" PB", 4039277);
        System.out.println(estados);

        System.out.println("Exiba a população PE: ");
        System.out.println(estados.get(" PE"));

        System.out.println("Exiba Todas as Informações na Ordem de Inserção: ");
        Map<String, Integer> estados1 = new LinkedHashMap<>(){{
            put(" PE", 9616621);
            put(" AL", 3351543);
            put(" CE", 9187103);
            put(" RN", 3534265);
            put(" PB", 4039277);
        }};
        System.out.println(estados1);

        System.out.println("Exiba Todos os Estados e Populações em ordem Alfabética: ");
        Map<String, Integer> estados2 = new TreeMap<>(estados);
        System.out.println(estados2);

        Collection<Integer> populacao = estados.values();
        String estadoMaiorPopulacao = "";
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry : estados.entrySet()) { 
        if (entry.getValue().equals(Collections.max(populacao))) estadoMaiorPopulacao = entry.getKey();
        if (entry.getValue().equals(Collections.min(populacao))) estadoMenorPopulacao = entry.getKey();
        }
                  
        System.out.printf("Exiba o estado com a menor população:\n" +
        estadoMenorPopulacao + " =" + " " + Collections.min(populacao) + "\n" );

        System.out.printf("Exiba o estado com a maior população:\n" +
        estadoMaiorPopulacao + " =" + " " + Collections.max(populacao) + "\n");

        System.out.println("Exiba a soma da população desses dois estados: ");

        int somaDosEstados = 0;

        Iterator<Integer> iterator = estados.values().iterator();
        while (iterator.hasNext()) {
            somaDosEstados += iterator.next();
        }
        System.out.println(somaDosEstados);

        System.out.println("Exiba a média da população desses Estados: " + somaDosEstados/estados.size());

        System.out.println("Remova os Estados com a População menor que 4.000.000: ");
        
        Iterator<Integer> iterator1 = estados.values().iterator();

        while (iterator1.hasNext()) {
            if (iterator1.next() <= 4000000) iterator1.remove();
        }

        System.out.println("Limpe o Dicionário de Estados: ");

        estados.clear();

        System.out.println("Confira se o Dicionário está vazio: " + estados.isEmpty());
    }    
}


