package listas.lista02;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> pessoas = new TreeMap<>();

        int n = 3;

        String nome;
        int idade;
        for (int i = 0; i < n; i++) {
            nome = sc.nextLine();
            idade = sc.nextInt();

            //clean buffer
            sc.nextLine();

            pessoas.put(nome, idade);
        }

        pessoas.forEach((key, value) -> {
            System.out.printf("%s ", key);
        });

        Map<Integer, String> pessoasAux = new TreeMap<>();

        for (Map.Entry<String, Integer> item : pessoas.entrySet()) {
            pessoasAux.put(item.getValue(), item.getKey());
        }

        System.out.print("\n");
        pessoasAux.forEach((key, value) -> {
            System.out.printf("%s ", value);
        });


        sc.close();
    }
}
