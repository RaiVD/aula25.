package Exercicio1;

import java.util.Scanner;

public class Azul {
    static int cor;
    private int tonalidade;
    private Scanner ler;
    public static String NOME = "Azul";


    public Azul(int tonalidade, Scanner ler) {
        this.tonalidade = tonalidade;
        this.ler = ler;
    }

    public int getTonalidade() {
        return tonalidade;
    }

    public int getCor() {
        return cor;
    }

    public int getLer() {
        int entrada = ler.nextInt();
        return entrada;
    }

    public void setTonalidade(int tonalidade) {
        this.tonalidade = tonalidade;
    }

    public void setCor(int cor) {
        this.cor = cor;
    }
}

//  a. Quais são as variáveis de classe?
//    Resposta A: "int cor, String NOME, int tonalidade e int valor"
//
//  b. Quais são os construtores?
//    Resposta B:"public Azul(int tonalidade) { ... }"
//
//  c. Quais métodos fazem parte da interface dessa classe?
//    Resposta C: "public int getTonalidade() {return tonalidade;}; public void setTonalidade(int tonalidade)
// {...}; public void tornarMaisEscuro() {...}; void calcularTonalidade() { ... }; private void TornarTonalidadeMaisEscura(int valor) {...}"
//
//  d. Sem mudar o código que está escrito. Implemente o método setTonalidade e a variável que ele necessita:
//    Resposta D: private int tonalidade
//
//  e. Sem mudar o código que está escrito. Implemente o construtor.
//    Resposta E:  public Azul(int tonalidade) {
//                  this.tonalidade = tonalidade;
//                  }
//
//  f. O código abaixo roda? Justifique.
//      var color = new Blue();
//     Resposta E: Não roda, pois não tem ligação com a classe Azul.
//  Exemplo de como rodaria: Azul color = new Azul(3);
