import java.util.LinkedList;

public class ExcList {
  public static void main(String[] args) {
    LinkedList<Integer> numeros = new LinkedList<>();

    numeros.add(10);
    numeros.add(20);
    numeros.add(30);
    numeros.add(40);
    numeros.add(50);

    System.out.println(numeros);;

    numeros.addFirst(5);
    numeros.addLast(60);

    numeros.removeFirst();
    numeros.removeLast();

    System.out.println(numeros);

  }
}