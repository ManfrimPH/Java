import java.util.ArrayList;

public class ExcArray {

  public static void main(String[] args) {
   ArrayList<String> nomes = new ArrayList<>();
   nomes.add("Caio");
   nomes.add("Lucas");
   nomes.add("Maria");
   nomes.add("Nona");
   nomes.add("Douglas");

   System.out.println("Lista inicial:" + nomes);

   nomes.remove(2);

   nomes.set(nomes.size()-1, "João");

   System.out.println("Lista final:" + nomes);

  }
} 