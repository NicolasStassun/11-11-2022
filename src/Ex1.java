import java.util.Scanner;

public class Ex1 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        double[] notas = new double[9];
        double maiornota=0.0, media=0.0;
        int QuantosAlunosMedia=0, PosicaoMaiorNota=0;

        for(int i=0;i<=notas.length;i++){

            System.out.println("Informe as Notas: ");
            notas[i] = sc.nextDouble();
            media+=notas[i];

            if(notas[i]>maiornota){
                maiornota=notas[i];
                PosicaoMaiorNota=i;
            }
            if(notas[i]>7.0){
                QuantosAlunosMedia++;
            }
        }
        media/=10;
        System.out.println("A média é de: "+media);
        System.out.println("Quantidade de alunos acima da média: "+QuantosAlunosMedia);
        System.out.println("Maior nota registrada: "+maiornota);
        System.out.println("A posição da maior nota: "+PosicaoMaiorNota);





    }


}
