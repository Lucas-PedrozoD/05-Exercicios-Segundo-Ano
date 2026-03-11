package Exercicio03;
import java.util.Scanner;

public class Main {
    static  Scanner sc = new Scanner(System.in);
    static BilheteUnico bilheteUnico;
    public static void main(String[] args) {
        String usuario;
        String tipoTarifa;
        int resposta;
        System.out.print("Nome -->");
        usuario = sc.nextLine();
        System.out.print("Tipo de Tarifa (Professor ou Estudante ou Normal)-->");
        tipoTarifa = sc.next();

        BilheteUnico bilheteUnico = new BilheteUnico(usuario, tipoTarifa);

        do {
            System.out.println("Oque voce quer fazer a seguir");
            System.out.println(" 1. Carregar Bilhete");
            System.out.println(" 2. Consultar saldo");
            System.out.println(" 3. Passar na catraca");
            System.out.println(" 4. Finalizar");
            resposta=sc.nextInt();
            switch (resposta){
                case(1) -> carregar();

                case(2) -> consultar();

                case(3) -> catraca();

                case(4) -> System.out.println("Obrigado por usar o nosso App");
                default -> System.out.println(" Opção inválida");



            }
        }while (resposta != 4);






    }

    private static void consultar() {
        System.out.println("Saldo --> $" + bilheteUnico.saldo);
    }

    private static void catraca() {
        bilheteUnico.passarNaCatraca();
        if (!bilheteUnico.passarNaCatraca() ){
            System.out.println(" Saldo Insuficiente");
        }
        consultar();

    }

    private static void carregar() {
        double valor;
        System.out.print("Valor a Carregar -->");
        valor = sc.nextDouble();
        bilheteUnico.carregar(valor);

    }




}
