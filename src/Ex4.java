import java.util.Scanner;
import java.util.ArrayList;

public class Ex4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Double> Notas = new ArrayList<Double>();
        ArrayList<Integer> Alunos = new ArrayList<Integer>();
        int ContadorAluno=0, ContadorNotas=0;
        double NotaFinal=0, MediaDoAluno, TotalAluno=0, TotalTurma=0, MediaTurma=0, Nota;

        for(int continuar=0; continuar!=-1; continuar=continuar) {
            if(ContadorAluno>0) {
                System.out.println("\nDeseja continuar? \n1 - Sim \n-1 - Não");
                continuar = ler.nextInt();
            }
            ContadorAluno++;
            if(continuar!=-1) {
                Alunos.add(continuar);
                for(double peso=0; peso!=(-1); peso=peso) {
                    System.out.println("\nDigite o peso da prova: | Para parar digite -1: ");
                    peso = ler.nextDouble();
                    if(peso!=-1) {
                        System.out.println("\nDigite a Nota do aluno " +ContadorAluno +": ");
                        Nota = ler.nextDouble();
                        NotaFinal = (Nota/peso)*10;
                        Notas.add(NotaFinal);
                        TotalAluno+=NotaFinal;
                        ContadorNotas++;
                    }
                    else {
                        MediaDoAluno = TotalAluno/ContadorNotas;
                        TotalTurma+=MediaDoAluno;
                        System.out.println("Média do aluno " +(ContadorAluno) +": " +MediaDoAluno);
                        MediaDoAluno = 0;
                        TotalAluno = 0;
                        ContadorNotas = 0;
                    }
                }
            }
        }
        MediaTurma = TotalTurma/Alunos.size();
        System.out.println("\nMédia geral da turma: " +MediaTurma);

    }

}