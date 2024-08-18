/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samer
 */
public class Adjacente {
    
    private Vertice vertice;
    private int custo;

    public Adjacente(Vertice vertice, int custo) {
        this.vertice = vertice;
        this.custo = custo;
    }

    public Vertice getVertice() {
        return vertice;
    }

    public void setVertice(Vertice vertice) {
        this.vertice = vertice;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }    
    
}
