package Exercicios2;



public class main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Raissa", 1200, "2023-05-07");
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();


        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Salário: " + funcionario1.getSalario());
        System.out.println("Data de adimissao: " + funcionario1.getDataAdmissao());
        System.out.println("---------------------------------------");

        funcionario2.setNome("Julia");
        funcionario2.setSalario(1500);
        funcionario2.setDataAdmissao("2018-07-12");
        System.out.println("Nome: " + funcionario2.getNome());
        System.out.println("Salário: " + funcionario2.getSalario());
        System.out.println("Data de adimissao: " + funcionario2.getDataAdmissao());
        System.out.println("---------------------------------------");

        funcionario3.setNome("Renata");
        funcionario3.setSalario(699.99);
        funcionario3.setDataAdmissao("2010-10-04");
        System.out.println("Nome: " + funcionario3.getNome());
        System.out.println("Salário: " + funcionario3.getSalario());
        System.out.println("Data de adimissao: " + funcionario3.getDataAdmissao());
        System.out.println("---------------------------------------");

        System.out.println("Indentificador: " + Funcionario.indentificador);

    }
}
