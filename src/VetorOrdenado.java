/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samer
 */

import java.util.ArrayList;


public class VetorOrdenado {

    private int capacidade;
    private int ult_pos;
    private ArrayList<Adjacente> valores;
   

    public VetorOrdenado(int capacidade) {
        this.capacidade = capacidade;
        this.ult_pos = -1;
        this.valores = new ArrayList<>();
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getUlt_pos() {
        return ult_pos;
    }

    public void setUlt_pos(int ult_pos) {
        this.ult_pos = ult_pos;
    }

    public ArrayList<Adjacente> getValores() {
        return valores;
    }

    public void setValores(ArrayList<Adjacente> valores) {
        this.valores = valores;
    }

    public void insereOrdenado(Adjacente adj) {
        if (this.ult_pos == this.capacidade - 1) {
            System.out.println("Capacidade maxima atingida");
            return;
        }

        int pos = 0;

        for (int i = 0; i < this.ult_pos + 1; i++) {
            pos = i;
            //if (this.valores.get(i).getDist_obj() > v.getDist_obj()) {
            //    break;
           // }
            
            //if (this.valores.get(i).getVertice().getDist_obj() > adj.getVertice().getDist_obj() + adj.getCusto()) {
             //   break;
           // }
           
           if (this.valores.get(i).getVertice().getDist_obj() < adj.getCusto()) {
                break;
            }
            
           
        if ( i == this.ult_pos) {
            pos++;
           }
        }

        int x = this.ult_pos;

        while ( x >= pos) {
            this.valores.add(x + 1, this.valores.get(x));
            x--;
        }

        this.valores.add(pos, adj);
        this.ult_pos++;
    }

      public void imprimir() {
        System.out.println();
        if (this.ult_pos == -1) {
            System.out.println("ERRO: o vetor esta vazio!");
        } else {
            for (int i = 0; i < this.ult_pos + 1; i++) {
                System.out.println(i + " - " + this.valores.get(i).getVertice().getRotulo() + " - " + this.valores.get(i).getCusto());
            }
        }
    }   
    
    
}
