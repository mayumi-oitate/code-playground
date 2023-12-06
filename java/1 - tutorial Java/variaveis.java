// Variaveis em JAVA
/*
String- armazena texto, como "Olá". Os valores da string estão entre aspas duplas
int- armazena inteiros (números inteiros), sem decimais, como 123 ou -123
float- armazena números de ponto flutuante, com decimais, como 19,99 ou -19,99
char- armazena caracteres únicos, como 'a' ou 'B'. Os valores de caracteres estão entre aspas simples
boolean- armazena valores com dois estados: verdadeiro ou falso
 */

 public class variaveis {
    public static void main(String[] args) {
        //variavel do tipo string
        String nome = "Arolnode";
        System.out.println(nome);

        //variavel do tipo number int
        int idade = 45;
        System.out.println(idade);

        //variavel do tipo number float
        Float dinheiro = 1.99f; //é necessario colocar f no final do numero quando é do tipo float
        System.out.println(dinheiro);

        //variavel do tipo char
        char sala = 'B';
        System.out.println(sala);

        //variavel do tipo boolean
        boolean myBool = true; // é possivel escrever o tipo true ou false
        System.out.println(myBool);

    }
 }
