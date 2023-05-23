package Exercicios2;

import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private double salario;
    private String dataAdmissao;
    static int indentificador=1;

    public Funcionario(String nome, double salario, String dataAdmissao) {
        Funcionario.indentificador =+ 1;
        this.nome = nome;
        this.salario = salario;
        this.dataAdmissao = String.valueOf(LocalDate.parse(dataAdmissao));
    }
    public Funcionario() {
        Funcionario.indentificador++;
    }

    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }
    public String getDataAdmissao() {
        return dataAdmissao;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(double salario) {
        if (salario<700) {
            System.out.println("O salario deve ser maior que R$700!");
        }
        this.salario = salario;
    }

    public void setDataAdmissao(String DataAdmissao) {
        if (dataAdmissao(LocalDate.now())){
        }
        this.dataAdmissao = String.valueOf(LocalDate.parse(DataAdmissao));
    }

    private boolean dataAdmissao(LocalDate now) {

        return false;
    }


}
