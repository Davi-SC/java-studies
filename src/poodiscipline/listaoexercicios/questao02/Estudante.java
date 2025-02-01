package poodiscipline.listaoexercicios.questao02;

public class Estudante extends Pessoa{

    public Estudante(String matricula,String nome, String cpf, Integer idade) {
        setMatricula(matricula);
        setNome(nome);
        setCpf(cpf);
        setIdade(idade);
    }

    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "[" +
                " matricula: '" + getMatricula() + '\'' +
                ", nome: '" + getNome() + '\'' +
                ", idade: '" + getIdade() + '\'' +
                ", cpf: '" + getCpf() + '\'' +
                ']';
    }
}
