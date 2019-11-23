package proyectoedd2;

import java.util.ArrayList;

public class ArbolB {

    public void CrearNodo(int T) {
        Nodo n = new Nodo(T);
    }

    public int buscar(ArrayList<Nodo> x, int llave) {
        int i = 1;
        while (i <= ((int) x.get(i).getLlaves().get(i)) && llave > ((int) x.get(i).getLlaves().get(i))) {
            i = i + 1;
        }
        if (i <= ((int) x.get(i).getLlaves().get(i)) && llave == ((int) x.get(i).getLlaves().get(i))) {
            return (((int) x.get(i).getLlaves().get(i)));
        }
        if (x.get(i).isLeaf()) {
            return 0;
        } else {
            return buscar(x.get(i).getChildren(), llave);
        }
    }

    void insertar(Nodo T, int k) {
        Nodo r = T;
        if (r.getnLlaves() == T.getTt()) {
            Nodo s = null;
            T = s;
            s.setLeaf(false);
            s.setnLlaves(0);
            s.setChildren(r.getLlaves());
            Metadata byteOFFset = null;
            split(s, byteOFFset);
            insertnofull(s, k);
        }else{
            insertnofull(T,k);
        }
    }

    void insertnofull(Nodo x, int k) {
        int i = x.getnLlaves();
        if (x.isLeaf()) {
            while (i >= 1 && k < (int)x.getLlaves().get(i)) {
                x.getLlaves().set(i+1,x.getLlaves().get(i));
                i = i - 1;
            }
            //x.getLlaves().get(i + 1) = k;
            x.getLlaves().set(i+1, k);
            x.setnLlaves(x.getnLlaves()+1);
            while (i >= 1 && k < (int)x.getLlaves().get(i)) {
                i = i - 1;
            }
            i = i + 1;
            if (x.getChildren().size()==2*6-1) {
                Metadata xx=null;
                split(x, xx);
                if (k > (int)x.getLlaves().get(i)) {
                    i = i + 1;
                }
                insertnofull(x.getChildren().get(i), k);
            }

        }
    }

    public void split(Nodo nodo_actual, Metadata value) {
        int orden = nodo_actual.getT() - 1;
        int num_llaves = orden;
        ArrayList<Nodo> Temporal1 = new ArrayList();
        ArrayList<Nodo> Temporal2 = new ArrayList();
        ArrayList<Nodo> Temporal3 = new ArrayList();
        if (nodo_actual.IsLeaf(true)) {
            for (int i = 0; i < orden + 1; i++) {
                if (i == orden + 1 / 2) {
                    Temporal2.add(new Nodo(nodo_actual.getChildren().indexOf(i))); //middle
                } else if (i < orden + 1 / 2) {
                    Temporal1.add(new Nodo(nodo_actual.getChildren().indexOf(i))); //left
                    nodo_actual = Temporal1.get(i);
                } else if (i > orden + 1 / 2 && i < orden) {
                    Temporal3.add(new Nodo(nodo_actual.getChildren().indexOf(i))); //right
                }
            }
        }
    }

}
