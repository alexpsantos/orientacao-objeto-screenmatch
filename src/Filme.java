public class Filme {
    String nome;
    int anoLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacao;
    int duracaoEmMinutos;


    void exibirFilme(){
        System.out.println("Nome: " + nome);
        System.out.println("Ano: " + anoLancamento);
    }

    void avaliar(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    double pegarMedia(){
        return somaDasAvaliacoes / totalDeAvaliacao;
    }





}
