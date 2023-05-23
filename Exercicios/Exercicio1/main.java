package Exercicio1;
import Exercicio1.Azul;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Azul color = new Azul(0,new Scanner(System.in));

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Cor atual: "+ color.NOME + " \nTonalidade atual: "+ color.getTonalidade());
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Tonalidade que você deseja escolhar? \n 1 - Azul.3 \n 2 - Azul.2 \n 3 - Azul.1 ");
        int entrada = color.getLer();

        if(entrada == 1) {
            color.setTonalidade(3);
            System.out.println("Cor - " + color.NOME +" "+ color.getTonalidade());

        } else if (entrada == 2) {
            color.setTonalidade(2);
            System.out.println("Cor - " + color.NOME +" "+ color.getTonalidade());

        }else if (entrada == 3) {
            color.setTonalidade(1);
            System.out.println("Cor - " + color.NOME +" "+ color.getTonalidade());
        }
    }
}
