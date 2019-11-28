package proyectoedd2;

import java.util.ArrayList;

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
    //lea2.useDelimiter(",");
//            while (lea.hasNext()) {
//                texto += lea.nextLine();
//                StringTokenizer tokens = new StringTokenizer(texto, "|");
//                while (tokens.hasMoreTokens()) {
//                    //System.out.println(tokens.nextToken());
//                    String texto2 = tokens.nextToken();
//                    StringTokenizer tokens2 = new StringTokenizer(texto2, ",");
//                    //int c = 0, c2 = 0;
//                    while (tokens2.hasMoreTokens()) {
////                        System.out.println(tokens2.nextToken());
////                        System.out.println(c);
////                        c=c+1;
//                        nombrec = tokens2.nextToken();
//                        tipo = Integer.parseInt(tokens2.nextToken());
//                        longitud = Integer.parseInt(tokens2.nextToken());
//                        if ("true".equals(tokens2.nextToken())) {
//                            llave = true;
//                        } else {
//                            llave = false;
//                        }
//                        campos.add(new Campo(nombrec, tipo, longitud, llave));
//                    }
//                }
//            }
}
