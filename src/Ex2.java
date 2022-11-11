public class Ex2 {

    public static void main(){

        boolean troca=true;
        while (troca) {
            troca = false;
            for (int i = 0; i < tamanho - 1; i++) {
                if (ordenacao[i] > ordenacao[i + 1]) {
                    auxiliar = ordenacao[i];
                    ordenacao[i] = ordenacao[i + 1];
                    ordenacao[i + 1] = auxiliar;
                    troca = true;
                }
            }
        }

    }

}
