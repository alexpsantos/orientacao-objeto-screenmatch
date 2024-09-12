package br.com.alex.screenmatch.calculos;

import br.com.alex.screenmatch.modelo.Filme;
import br.com.alex.screenmatch.modelo.Serie;
import br.com.alex.screenmatch.modelo.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void incluir(Titulo t){
        this.tempoTotal += t.getDuracaoEmMinutos();
    }

//    public void incluir(Filme f) {
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void incluir(Serie s) {
//        tempoTotal += s.getDuracaoEmMinutos();
//    }
}
