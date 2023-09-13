package br.com.alura.screenmatch.calculation;

public class Recommendation {

    public void filter(Sortable sortable){
        if(sortable.getRate() >= 4){
            System.out.println("Está entre os preferidos do momento");
        } else if (sortable.getRate() >= 2) {
            System.out.println("Muito bem avaliado no momento");
        }else {
            System.out.println("Coloque na sua lista para assistir mais tarde");
        }
    }
}
