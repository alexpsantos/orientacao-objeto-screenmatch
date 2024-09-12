import br.com.alex.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alex.screenmatch.modelo.Filme;
import br.com.alex.screenmatch.modelo.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();

        meuFilme.setNome("Poderoso Chefão");
        meuFilme.setAnoLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do Filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibirFichaTecnica();

        meuFilme.avaliar(8);
        meuFilme.avaliar(9);
        meuFilme.avaliar(6);


        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacao());
        System.out.println(meuFilme.pegarMedia());

        Serie minhaSerie = new Serie();
        minhaSerie.setNome("Minha Serie");
        minhaSerie.setAnoLancamento(1990);
        minhaSerie.exibirFichaTecnica();

        minhaSerie.setTemporadas(10);
        minhaSerie.setEpisodiosPorTemporada(12);
        minhaSerie.setMinutosPorEpisodio(50);
        System.out.println("duração da serie: " + minhaSerie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();

        outroFilme.setNome("Avatar");
        outroFilme.setAnoLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.incluir(meuFilme);
        calculadora.incluir(outroFilme);
        calculadora.incluir(minhaSerie);
        System.out.println(calculadora.getTempoTotal());

    }
}