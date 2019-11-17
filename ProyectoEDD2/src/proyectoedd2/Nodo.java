/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedd2;

import java.util.ArrayList;

/**
 *
 * @author josep
 */
public class Nodo {

    private ArrayList llaves = new ArrayList();
    private ArrayList<Nodo> children = new ArrayList();
    private int nLlaves;
    private int T;
    private int t;
    private boolean Leaf;

    public Nodo(int orden) {
        this.T = orden;//orden del arbol
        this.Leaf = true;
        this.nLlaves = 0;
        this.t = (orden - 1) / 2;
    }

    public int getnLlaves() {
        return nLlaves;
    }

    public void setnLlaves(int nLlaves) {
        this.nLlaves = nLlaves;
    }

    public ArrayList getLlaves() {
        return llaves;
    }

    public void setLlaves(ArrayList llaves) {
        this.llaves = llaves;
    }

    public ArrayList<Nodo> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Nodo> children) {
        this.children = children;
    }

    public int getT() {
        return T;
    }

    public void setT(int T) {
        this.T = T;
    }

    public int getTt() {
        return t;
    }

    public void setTt(int t) {
        this.t = t;
    }

    public boolean isLeaf() {
        return Leaf;
    }

    public void setLeaf(boolean Leaf) {
        this.Leaf = Leaf;
    }

    public boolean IsLeaf(boolean Leaf) {
        if (this.Leaf == true) {//si es verdadero es Leaf
            System.out.println("si es leaf");
            return Leaf;
        } else {//Si es falso no es Leaf
            System.out.println("no es leaf");
            return Leaf;
        }
    }
}
