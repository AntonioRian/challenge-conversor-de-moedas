package modelos;

import java.util.Scanner;

public class SelecionaMoeda {
    public String estrututaEndereco(int menuOpcao, double valor){
        String moeda1 = "";
        String moeda2 = "";
        String endereco;
        Scanner leitura = new Scanner(System.in);

        switch (menuOpcao) {
            case 1:
                moeda1 = "USD";
                moeda2 = "BRL";
                System.out.println("Digite o valor a ser convertido: ");
                valor = leitura.nextDouble();
                break;

            case 2:
                moeda1 = "USD";
                moeda2 = "EUR";
                System.out.println("Digite o valor a ser convertido: ");
                valor = leitura.nextDouble();
                break;

            case 3:
                moeda1 = "EUR";
                moeda2 = "BRL";
                System.out.println("Digite o valor a ser convertido: ");
                valor = leitura.nextDouble();
                break;

            case 4:
                moeda1 = "BRL";
                moeda2 = "CNY";
                System.out.println("Digite o valor a ser convertido: ");
                valor = leitura.nextDouble();
                break;

            case 5:
                moeda1 = "BRL";
                moeda2 = "USD";
                System.out.println("Digite o valor a ser convertido: ");
                valor = leitura.nextDouble();
                break;

            case 6:
                moeda1 = "ARS";
                moeda2 = "BRL";
                System.out.println("Digite o valor a ser convertido: ");
                valor = leitura.nextDouble();
                break;

            case 7:
                moeda1 = "VND";
                moeda2 = "BRL";
                System.out.println("Digite o valor a ser convertido: ");
                valor = leitura.nextDouble();
                break;

        }

        endereco = "https://v6.exchangerate-api.com/v6/a4879d9c3047926bfb0085a0pair/" + moeda1 + "/" + moeda2 + "/" + valor;

        return endereco;
    }
}
