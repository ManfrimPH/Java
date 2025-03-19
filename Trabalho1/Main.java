import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Buscar produto por código");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o código do produto: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    
                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();
                    
                    produtos.add(new Produto(codigo, nome, preco));
                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o código do produto: ");
                    int codigoBusca = scanner.nextInt();
                    
                    boolean encontrado = false;
                    for (Produto produto : produtos) {
                        if (produto.getCodigo() == codigoBusca) {
                            System.out.println("\nProduto encontrado:");
                            System.out.println(produto);
                            encontrado = true;
                            break;
                        }
                    }
                    
                    if (!encontrado) {
                        System.out.println("Produto não encontrado!");
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }
} 