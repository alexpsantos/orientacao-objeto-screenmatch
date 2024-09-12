package br.com.alex.screenmatch.calculos;

public class FiltroRecomendacao {



    public void filtrar(Classificavel classificavel){

        if (classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os melhores do momento");
        } else if (classificavel.getClassificacao() >= 2){
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Coloque em sua lista pra ver depois ");
        }
    }

}
