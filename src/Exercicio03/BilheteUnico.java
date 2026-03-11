package Exercicio03;
import java.util.Random;

public class BilheteUnico {




        int numero;
        String usuario;
        double saldo;
        final static double tarifaBase = 5.40;
        String tipoTarifa;


        public BilheteUnico (String usuario, String tipoTarifa){
            Random rd = new Random();
            this.numero = rd.nextInt(1000,9999);
            this.usuario=usuario;
            this.tipoTarifa=tipoTarifa;
        }

        public boolean passarNaCatraca(){
            double valor = tarifaBase;
            if (tipoTarifa.equalsIgnoreCase("Professor") ||
                    tipoTarifa.equalsIgnoreCase("Aluno")){
                valor = tarifaBase /2;
            }
            if (saldo < valor){
                System.out.println("Voce não tem saldo o suficiente");
                return false;
            }
            saldo -= valor;
            return true;


        }

        public void carregar(double valor){
            this.saldo += valor;
        }


}
