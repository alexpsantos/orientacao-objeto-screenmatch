import br.com.alex.screenmatch.modelo.Filme;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();

        meuFilme.setNome("Poderoso Chefão");
        meuFilme.setAnoLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibirFilme();

        meuFilme.avaliar(8);
        meuFilme.avaliar(9);
        meuFilme.avaliar(6);


        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacao());
        System.out.println(meuFilme.pegarMedia());

    }
}