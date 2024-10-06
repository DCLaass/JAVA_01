package Exercicio07;

public class Aluno {
    private String nome;
    private int idade;
    private String matricula;

    public Aluno(){
        this.nome = "";
        this.idade = idade;
        this.matricula = "";
    }
    public void setNome(String valor){
        this.nome = valor;
    }
    public String getNome(){
        return nome;
    }
    public void setIdade(int valor){
        this.idade = valor;
    }
    public int getIdade(){
        return idade;
    }
    public void setMatricula(String valor){
        this.matricula = valor;
    }
    public String getMatricula(){
        return matricula;
    }
}
