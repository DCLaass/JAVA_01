package Exercicio07;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Thiago Alberto");
        a1.setIdade(15);
        a1.setMatricula("ADS2");
        System.out.println("O Aluno chama: "+a1.getNome());
        System.out.println("O Aluno tem: "+ a1.getIdade() +" anos. ");
        a1.setIdade(22);
        a1.setNome("Thiago Alberto Junior Perreira");
        System.out.println("O Aluno chama: "+a1.getNome());
        System.out.println("O Aluno tem: "+ a1.getIdade() +" anos. ");
    }
}
