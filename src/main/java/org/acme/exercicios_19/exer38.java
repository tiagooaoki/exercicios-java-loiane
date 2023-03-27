package org.acme.exercicios_19;

/*
 * 38.Ler um vetor A com 10 elementos. Construir um vetor B de mesmo tipo 
e tamanho, sendo que cada elemento de B deverá ser o seguinte 
somatório: Bi = Somatório de Aj, para todo j variando de i até 10.
 */
public class exer38 {
    public static void main(String[] args) {
        int[] A = new int[10], B = new int[10];

        for(int i=0;i<10;i++){
            A[i]=i+1;
            for(int j=A[i];j>0;j--){
                B[i] =  B[i]+j;
            }
        }
        for(double i:B){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
