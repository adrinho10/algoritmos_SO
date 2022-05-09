import java.util.Scanner;
import java.util.Random;

public class atividade1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //instância um objeto da classe Random usando o construtor padrão
        Random gerador = new Random();

        int n_processos;

        System.out.println("Digite o numero de processos: ");
        n_processos = sc.nextInt();

        int[] id = new int[n_processos];
        int[] tempo_execucao = new int[n_processos];
        int[] tempo_restante = new int[n_processos];

        System.out.println("Processos com dados aleatorios? [1=sim,0=nao]: ");
        Integer aleatorio = sc.nextInt();

        //popular processos
        for (int i=0; i<n_processos; i++) {
            if (aleatorio == 1) {
                tempo_execucao[i] = gerador.nextInt(10)+1;
                tempo_restante[i] = tempo_execucao[i];

            }
            else {
                System.out.println("tempo de execucao do processo["+i+"]: ");
                tempo_execucao[i] = sc.nextInt();
                tempo_restante[i] = tempo_execucao[i];
            }
        }

        for (int i=0; i<n_processos; i++) {
            System.out.println("tempo de execucao do processo["+i+"]: "+tempo_execucao[i]);
        }

        int processo_em_execucao = 0;
        //executar processos
        for (int i=1; i<1000; i++) {
            if (tempo_restante[processo_em_execucao] != 0) {
                if (processo_em_execucao != (n_processos)) {
                    System.out.println(i+" - Executado processo[" + processo_em_execucao + "] com tempo restante de " + (tempo_restante[processo_em_execucao]-1));
                    tempo_restante[processo_em_execucao]--;
                } else {
                    break;
                }
            }
            else {
                if (processo_em_execucao != (n_processos - 1)) {
                    processo_em_execucao++;
                    System.out.println(i + " - Executado processo[" + processo_em_execucao + "] com tempo restante de " + (tempo_restante[processo_em_execucao]-1));
                    tempo_restante[processo_em_execucao]--;
                }
                else
                    break;
            }
        }


    }
}
