import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int escolha=0;
      calculadora calc = new calculadora();



String menu= """
        Calculadora:
        1-Somar
        2-Subtrair
        3-Multiplicar
        4-Dividir
        5-fechar sistema
        """;
        Scanner leitura = new Scanner(System.in);

        while (escolha != 5){
            System.out.println(menu);
        escolha=leitura.nextInt();

            if (escolha == 1){
                calc.somar();
            } else if (escolha == 2){
                calc.subtracao();
            } else if (escolha == 3){
                calc.multiplicacao();
            } else if (escolha == 4){
                calc.divisao();
            }else if (escolha == 5) {
                System.out.println("saiu do sistema");
            } else {
                System.out.println("opção invalida");
            }




    }
}
}