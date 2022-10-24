import java.util.Random;

public class Main {
    private static int [] imparesEmCadaLinha(int [][] array){
        int [] quantidadePorLinha = new int[2];

        for (int i = 0; i< array.length; i++){
            int quantidade = 0;
            for (int j = 0; j<array[i].length; j++){
                if ((array[i][j]%2)!=0){
                    quantidade++;
                }
            }
            quantidadePorLinha[i] = quantidade;
        }
        return quantidadePorLinha;
    }
    private static float mediaDosPares (int [][] array){
        float soma = 0;
        float quantidade = 0;
        for (int i = 0; i< array.length; i++){
            for (int j = 0; j<array[i].length; j++){
                if ((array[i][j]%2)==0){
                    soma += array[i][j];
                    quantidade++;
                }
            }

        }
        float media = (soma/quantidade);
        return media;
    }
    private static void exibreArray (int [][] array){
        for (int i = 0; i< array.length; i++){
            for (int j = 0; j<array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Random aleatorio = new Random();

        int [][] numeros = new int[2][4];
        for (int i = 0; i< numeros.length; i++){
            for (int j = 0; j<numeros[i].length; j++){
                numeros[i][j] = aleatorio.nextInt(0, 10);
            }
        }
        System.out.println("========");
        exibreArray(numeros);
        System.out.println("========");
        int [] qntImpar = imparesEmCadaLinha(numeros);
        System.out.println("Quantidade de numeros impares na linha 0: "+qntImpar[0]);
        System.out.println("Quantidade de numeros impares na linha 1: "+qntImpar[1]);
        float media = mediaDosPares(numeros);
        System.out.printf("A media dos numeros pares = %.2f", media);
    }
}