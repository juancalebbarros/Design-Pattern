public abstract class SituacaoServiceTemplate {
    public String processarSituacao(Aluno aluno) {
        if (verificarCondicao(aluno)) {
            return getSituacaoAprovado();
        } else {
            return getSituacaoReprovado();
        }
    }

    protected abstract boolean verificarCondicao(Aluno aluno);
    protected abstract String getSituacaoAprovado();
    protected abstract String getSituacaoReprovado();
}

