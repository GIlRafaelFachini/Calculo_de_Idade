package programa;

import java.util.Scanner;

import static programa.MetodoCalculo.calcularIdade;

public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Entre com ano de nascimento:");
        Integer anoNascimento = scanner.nextInt();
        System.out.println("Entre com ano atual:");
        Integer anoAtual = scanner.nextInt();
        while (anoNascimento>anoAtual){
            System.out.println("Ano nascimento não pode ser maior que ano atual!");
            System.out.println("Digite novamente ano atual.");
            anoAtual = scanner.nextInt();

        }
        Integer idade = calcularIdade(anoAtual, anoNascimento);
        System.out.println(nome + " a sua  idade é: " + idade);
    }

}
