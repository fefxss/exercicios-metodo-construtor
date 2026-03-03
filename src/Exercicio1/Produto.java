package Exercicio1;

public class Produto {
    String nome;
    double valor;
    int quantidade;

    //CONSTRUTOR
    public Produto(String n, double v, int q){
        nome = n;
        valor = v;
        quantidade = q;
    }

    public void aumentarValor(double porcentagem){
        valor *= (1+porcentagem / 100);
    }
}
