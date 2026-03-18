package Exercicio03;

import java.util.Scanner;

public class Main {
    static BilheteUnico[] bilheteUnico = new BilheteUnico[3];
    static Scanner sc = new Scanner(System.in);
    static int index = 0;

    public static void main(String[] args) {
        int opcao;


        do {
            System.out.println("1. Cadastrar bilhete");
            System.out.println("2. Carregar bilhete");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Passar na catraca");
            System.out.println("5. Finalizar");
            opcao = sc.nextInt();

            switch (opcao){
                case 1 -> cadastrar();
                case 2 -> carregar();
                case 3 -> consultar();
                case 4 -> passar();
            }

        }while ();




    }

    private static void passar() {
    }

    private static void consultar() {

    }

    private static void carregar() {

    }

    private static void cadastrar() {
        String nome;
        long cpf;
        String tipoTarifa;

        if (index < bilheteUnico.length){
            System.out.println("Nome do Usuário: ");
            nome = sc.next();
            System.out.println("CPF: ");
            cpf = sc.nextLong();
            System.out.println("Tipo de tarifa (estudante | professor | comum): ");
            tipoTarifa = sc.next();
            bilheteUnico[index]=new BilheteUnico(new Usuario(nome,cpf,tipoTarifa));
            index ++;

        }
    }
}
