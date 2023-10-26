private static void runTest() {
    Aluno aluno = new Aluno(1, "João", "A", 0.0, 0);
    
    SituacaoServiceTemplate notaService = new NotaSituacaoService();
    SituacaoServiceTemplate frequenciaService = new FrequenciaSituacaoService();
    
    String situacaoNota = notaService.processarSituacao(aluno);
    String situacaoFrequencia = frequenciaService.processarSituacao(aluno);
    
    System.out.println("Situação do aluno (por nota): " + situacaoNota);
    System.out.println("Situação do aluno (por frequência): " + situacaoFrequencia);

    
}
