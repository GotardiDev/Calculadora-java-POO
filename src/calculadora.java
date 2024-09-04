
import java.util.Scanner;

public class calculadora {
    double soma;
    double subtracao;
    double divisao;
    double multiplicacao;
    Scanner teclado = new Scanner(System.in);

    void somar() {
        System.out.println("Soma de dois numeros: ");
        double numero1  = teclado.nextDouble();
        double numero2  = teclado.nextDouble();
        soma = numero1  + numero2 ;
        System.out.println("resultado da soma é: " + soma);
    }

    void subtracao() {
        System.out.println("Subtração de dois numeros: ");
        double numero1 = teclado.nextDouble();
        double numero2 = teclado.nextDouble();
        subtracao = numero1 - numero2;
        System.out.println("resultado da subtração é: " + subtracao);
    }

    void divisao() {
        System.out.println("divisão de dois numeros: ");
        double numero1 = teclado.nextDouble();
        double numero2 = teclado.nextDouble();
        divisao = numero1 / numero2;
        System.out.println("resultado da divisão é: " + divisao);
    }

    void multiplicacao() {
        System.out.println("Multiplicação de dois numeros: ");
        double numero1 = teclado.nextDouble();
        double numero2 = teclado.nextDouble();
        multiplicacao = numero1 * numero2;
        System.out.println("resultado da Multiplicação é: " + multiplicacao);
    }

}