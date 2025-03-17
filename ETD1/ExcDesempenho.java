import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExcDesempenho {
  public static void main(String[] args) {
    int quantidade = 100000;

   List<Integer> arrayList = new ArrayList<>();
   long inicioArrayList = System.nanoTime();
   for (int i = 0; i< quantidade; i++){
    arrayList.add(0,i);
   }
   long fimArrayList = System.nanoTime();

   List<Integer> linkedList = new LinkedList<>();
   long inicioLinkedList = System.nanoTime();
   for (int i = 0; i <quantidade; i++){
    linkedList.add(0,i);
   }
   long fimLinkedList = System.nanoTime();

   System.out.println("Tempo do Array: "+(fimArrayList - inicioArrayList)/ 126 + "ms");
   System.out.println("Tempo da Lista: "+(fimLinkedList - inicioLinkedList)/ 126 + "ms");
  }
}