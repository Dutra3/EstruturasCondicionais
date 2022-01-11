package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Primeira nota: ");
        float n1 = keyboard.nextFloat();
        System.out.println("Segunda nota: ");
        float n2 = keyboard.nextFloat();

        float m = (n1 + n2)/2;

        System.out.println("Sua média foi: " + m);

        if(m>=9) {
            System.out.println("Parabens pequeno gafanhoto.");
        } else {
            if(m>=6 && m<9) {
                System.out.println("Você esta aprovado, mas é capaz de melhorar essa nota.");
            } else {
                if(m>=3 && m<6) {
                    System.out.println("Você esta em recuperação, melhor estudar para a prova final.");
                } else {
                    System.out.println("Você está reprovado, próximo semestre você tenta novamente.");
                }
            }
        }

    }
}
