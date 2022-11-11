import java.util.Scanner;

public class Ex3 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int vet1[] = new int[19];
        int vet2[] = new int[19];
        int subtracao[] = new int[19];
        int multiplicacao[] = new int[19];

        for(int i=0;i<=19;i++){

            System.out.println("Insira o valor da posição "+i+" no vetor 1: ");
            vet1[i] = sc.nextInt();

            System.out.println("Insira o valor da posição "+i+" no vetor 2: ");
            vet2[i] = sc.nextInt();

            while(19<=i){
                subtracao[i]=vet1[i]-vet2[i];
            }
            while(19<=i){
                subtracao[i]=vet1[i]*vet2[i];
            }

        }
        for(int i=0;i<=19;i++){
            System.out.println("Multiplicação da posição "+i+": "+multiplicacao[i]);
        }
        for(int i=0;i<=19;i++){
            System.out.println("Subtração da posição "+i+": "+subtracao[i]);
        }

    }

}
