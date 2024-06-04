package principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import modelos.ConsomeApi;
import modelos.RecebeResultado;
import modelos.SelecionaMoeda;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int menuOpcao = 0;
        double valor = 0;
        Scanner leitura = new Scanner(System.in);
        String endereco = "";
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String menu = """
       
                ----------Escolha uma opção----------
                
                1- Dolar para Real;
                2- Dolar para Euro;
                3- Euro para Real;
                4- Real para Yuan chinês;
                5- Real para Dolar;
                6- Peso argentino para Real;
                7- Dong vietnamita para Real
                8- Encerrar programa
                
                -------------------------------------
                """;



            while (menuOpcao != 8) {

                System.out.println(menu);
                menuOpcao = leitura.nextInt();

                if (menuOpcao > 0 && menuOpcao < 8) {

                    SelecionaMoeda selecionaMoeda = new SelecionaMoeda();
                    endereco = selecionaMoeda.estrututaEndereco(menuOpcao, valor);
                    ConsomeApi recebeapi = new ConsomeApi();
                    String json = recebeapi.obterDados(endereco);
                    RecebeResultado escolheMoeda = gson.fromJson(json, RecebeResultado.class);
                    System.out.println(escolheMoeda);
                } else if (menuOpcao == 8) {
                    System.out.println("Programa encerrado");
                } else {
                    System.out.println("Escolha uma opção valida");
                }
            }










    }
}
