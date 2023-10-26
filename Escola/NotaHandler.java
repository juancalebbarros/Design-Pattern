public class NotaHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public String processSituacao(Aluno aluno) {
        if (aluno.getNota() < 4.0) {
            return "Reprovado por nota";
        } else if (nextHandler != null) {
            return nextHandler.processSituacao(aluno);
        }
        return "Aprovado";
    }
}

public class FrequenciaHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public String processSituacao(Aluno aluno) {
        if (aluno.getFrequencia() < 75) {
            return "Reprovado por falta";
        } else if (nextHandler != null) {
            return nextHandler.processSituacao(aluno);
        }
        return "Aprovado";
    }
}

