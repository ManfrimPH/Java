import java.util.ArrayList;
import java.util.Scanner;

public class ExcBusca {
  public static void main(String[] args) {
    ArrayList<String> nomes = new ArrayList<>();
    nomes.add("1");
    nomes.add("2");
    nomes.add("3");
    nomes.add("4");
    nomes.add("5");

    Scanner scanner = new Scanner (System.in);
    System.out.println("Digite um número de 1 a 7");
    String busca = scanner.nextLine();

    int indice = nomes.indexOf(busca);

    if(indice != -1){
      System.out.println("O número " + busca + " foi encontrado na posição " + indice);
    }else{
      System.out.println("O número não foi encontrado");
    }
  }
}