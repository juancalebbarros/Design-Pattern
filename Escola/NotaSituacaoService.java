public class NotaSituacaoService extends SituacaoServiceTemplate {
    @Override
    protected boolean verificarCondicao(Aluno aluno) {
        return aluno.getNota() >= 4.0;
    }

    @Override
    protected String getSituacaoAprovado() {
        return "Aprovado";
    }

    @Override
    protected String getSituacaoReprovado() {
        return "Reprovado por nota";
    }
}

public class FrequenciaSituacaoService extends SituacaoServiceTemplate {
    @Override
    protected boolean verificarCondicao(Aluno aluno) {
        return aluno.getFrequencia() >= 75;
    }

    @Override
    protected String getSituacaoAprovado() {
        return "Aprovado";
    }

    @Override
    protected String getSituacaoReprovado() {
        return "Reprovado por falta";
    }
}

