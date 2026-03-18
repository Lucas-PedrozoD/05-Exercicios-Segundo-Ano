package Exercicio01;

public class MonitorEnergia {

    double [] consumoDiario ;
    int indice = 0;

    public MonitorEnergia(int tamanho){
        this.consumoDiario=new double[tamanho];
    }

    public void registrar (double valor){
        if (indice< consumoDiario.length){
            consumoDiario[indice]=valor;
            indice++;
        }
    }

    public double calcularMedia(){
        double media = 0;
        for (double valor : consumoDiario){
            media += valor;
        }
        return media / indice  ;
    }

    public double calcularMedia(int inicio , int fim ){
        double media=0;
        for (int i = (inicio - 1); i< fim  ; i++){
            media += consumoDiario[i];
        }
        return media / (fim - inicio + 1);
    }

}
