public interface Handler {
    void setNext(Handler handler);
    String processSituacao(Aluno aluno);
}
