import java.util.ArrayList;
import java.util.Scanner;

public class Fazendinha {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro("Rex"));
        animais.add(new Cachorro("Bolt"));
        animais.add(new Gato("Garfield"));

        int opcao;

        do {
            System.out.println("\n===== FAZENDINHA ====");

            //Mostra lista dinamicamente
            for (int i=0; i< animais.size(); i++){
                System.out.println((i+1) + "-Ouvir" + animais.get(i).nome);
            }
            System.out.println("0- Sair");
            System.out.println("Escolha uma opção: ");

            opcao = scanner.nextInt();
            if (opcao > 00 && opcao <= animais.size()){
                animais.get(opcao -1).fazerSom();
            }else if (opcao == 0){
                System.out.println("Saindo da fazendinha...");
            }else {
                System.out.println("Opçaõ inválida!!");
            }
        }while (opcao !=0);
        scanner.close();

    }
}