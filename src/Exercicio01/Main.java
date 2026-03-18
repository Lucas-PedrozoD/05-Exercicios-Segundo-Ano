package Exercicio01;

public class Main {
    public static void main(String[] args) {

        MonitorEnergia monitorEnergia = new MonitorEnergia(5);

        monitorEnergia.registrar(1);
        monitorEnergia.registrar(2);
        monitorEnergia.registrar(3);

        System.out.println(monitorEnergia.calcularMedia());
        System.out.println(monitorEnergia.calcularMedia(1,2));
    }
}
