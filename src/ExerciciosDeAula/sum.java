package ExerciciosDeAula;

import java.util.Scanner;
public class sum {
    public static void Soma (double... a) {
        Scanner input = new Scanner(System.in);
        double soma = 0.0;
        if(a.length == 0) {
            System.out.println("Insira o primeiro n�mero: ");
            double numero1 = input.nextDouble();
            System.out.println("Insira o segundo n�mero: ");
            double numero2 = input.nextDouble();
            soma =  numero1 + numero2;
            System.out.println("O resultado da soma �: " + soma);
        } else if (a.length == 1) {
            soma = a[0];
            System.out.println("Insira o segundo n�mero: ");
            double numero2 = input.nextDouble();
            soma += numero2;
            System.out.println("O resultado da soma �: " + soma);
        } else if (a.length == 2){
            soma = a[0] + a[1];
            System.out.println("O resultado da soma �: " + soma);       
        } else {
            System.out.println("A quantidade � inv�lida");
        }
    }
    public static void main(String[] args){
        Soma(1.0);        
    }
}