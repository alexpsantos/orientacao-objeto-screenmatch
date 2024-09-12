package br.com.alex.screenmatch.modelo;

public class Filme {
    private  String nome;
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;


    public void setNome (String nome){
        this.nome = nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacao() {
        return totalDeAvaliacao;
    }


    public void exibirFilme(){
        System.out.println("Nome: " + nome);
        System.out.println("Ano: " + anoLancamento);
    }

    public void avaliar(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    public double pegarMedia(){
        return somaDasAvaliacoes / totalDeAvaliacao;
    }


}
