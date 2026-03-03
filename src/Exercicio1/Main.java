package Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        double valor;
        int quantidade;
        double porcentagem;

        System.out.println("Nome do produto: ");
        nome = entrada.nextLine();

        System.out.println("Valor do produto: ");
        valor = entrada.nextDouble();

        System.out.println("Quantidade em estoque: ");
        quantidade = entrada.nextInt();

        Produto produto = new Produto(nome, valor, quantidade);

        System.out.println("Qual a porcentagem de aumento? ");
        porcentagem = entrada.nextDouble();

        produto.aumentarValor(porcentagem);

        System.out.println(produto.valor);
    }
}
