package javaapplication6;


public class Desafio1{
    public static void main(String[] args) {
        
    int maiorSeque = 0;
    int numMaior = 0;
    for (int i = 1; i < 1000000; i++){
        int sequencia = seque(i);
        if (maiorSeque < sequencia) {
            maiorSeque = sequencia;
            numMaior = i;
        }
    }
    
    System.out.println("Número com maior sequência: " + (numMaior));
    System.out.println("Maior sequência: " + (maiorSeque));
    
}
    static int seque(int n){
        int nSeque = n;
        int cont= 0;
        while (nSeque > 1) {
            if(nSeque % 2 == 0) {
                nSeque = nSeque / 2;
            cont++;
            }else {
                nSeque = (nSeque* 3) + 1;
            cont++;
            }
        }
        return cont;
    }
}
/*Pergunta 2: Utilizar nomes curtos e significativos, 
produzir um código limpo e simples.*/