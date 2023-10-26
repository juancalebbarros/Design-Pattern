public class AlunoBuilder {
    private int id;
    private String nome;
    private String turma;
    private double nota;
    private int frequencia;

    Aluno aluno = new AlunoBuilder()
    .id(1)
    .nome("João")
    .turma("A")
    .nota(6.0)
    .frequencia(80)
    .build();


    public AlunoBuilder id(int id) {
        this.id = id;
        return this;
    }

    public AlunoBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public AlunoBuilder turma(String turma) {
        this.turma = turma;
        return this;
    }

    public AlunoBuilder nota(double nota) {
        this.nota = nota;
        return this;
    }

    public AlunoBuilder frequencia(int frequencia) {
        this.frequencia = frequencia;
        return this;
    }

    public Aluno build() {
        return new Aluno(id, nome, turma, nota, frequencia);
    }
    
}

