
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samer
 */
public class BuscaLargura {

    private Vertice objetivo;
    private boolean encontrado;

    public BuscaLargura(Vertice objetivo) {
        this.objetivo = objetivo;
        this.encontrado = false;
    }

    public boolean isEncontrado() {
        return encontrado;
    }

    public void setEncontrado(boolean encontrado) {
        this.encontrado = encontrado;
    }

    public Vertice getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(Vertice objetivo) {
        this.objetivo = objetivo;
    }

    public void buscaRecursiva(Vertice atual) {
        System.out.println("---------------------");
        System.out.println("Atual: " + atual.getRotulo());
        atual.setVisitado(true);

        if (atual.getRotulo().equals(objetivo.getRotulo())) {
            this.encontrado = true;                       
            return;
            
        } else {
            VetorOrdenado vetor_ordenado = new VetorOrdenado(atual.getAdjacentes().size());
            for (int i = 0; i < atual.getAdjacentes().size(); i++) {
                if (!atual.getAdjacentes().get(i).getVertice().isVisitado()) {
                    atual.getAdjacentes().get(i).getVertice().setVisitado(true);
                    vetor_ordenado.insereOrdenado(atual.getAdjacentes().get(i));
                }
            }

            vetor_ordenado.imprimir();

            if (vetor_ordenado.getValores().get(0) != null) {
                this.buscaRecursiva(vetor_ordenado.getValores().get(0).getVertice());
            }
        }
    }   
    
}
