package proyectoedd2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class ArbolB implements Serializable {

    Nodo raiz;
    int orden;

    public ArbolB(int orden) {
        this.orden = orden;
        raiz = new Nodo(orden);
    }

//    public Nodo busqueda(Nodo x, int llave) {
//        int i = 0;
//        while (i <= x.nllaves - 1 && llave > x.llaves.get(i)) {
//            i++;
//        }
//        if (i <= x.nllaves - 1 && llave == x.llaves.get(i)) {
//            return x;
//        }
//        if (x.hoja) {
//            return null;
//        } else {
//            return busqueda(x.puntadores.get(i), llave);
//        }
//    }
//    public ArrayList busqueda(Nodo x, int llave) {
//        int i = 0;
//        while (i <= x.nllaves - 1 && llave > x.llaves.get(i)) {
//            i++;
//        }
//        if (i <= x.nllaves - 1 && llave == x.llaves.get(i)) {
//            ArrayList xx = new ArrayList();
//            xx.add(llave);
//            xx.add(i);
//            return xx;
//        }
//        if (x.hoja) {
//            return null;
//        } else {
//            return busqueda(x.puntadores.get(i), llave);
//        }
//    }
    public ArrayList busqueda(int index, Nodo x, int llave) {
        int i = 0;
        while (i <= x.nllaves - 1 && llave > x.llaves.get(i)) {
            i++;
            index=index+1;
        }
        if (i <= x.nllaves - 1 && llave == x.llaves.get(i)) {
            ArrayList xx = new ArrayList();
            xx.add(llave);
            xx.add(index);
            return xx;
        }
        if (x.hoja) {
            return null;
        } else {
            return busqueda(index, x.puntadores.get(i), llave);
        }
    }

    public void insertar(int llave) {
        Nodo r = raiz;
        if (r.nllaves == orden - 1) {
            Nodo s = new Nodo(orden);
            s.hoja = false;
            s.puntadores.set(0, r);
            //s.setpadre();
            s = split(s, 1, r);
            s = insertarnofull(s, llave);
            raiz = s;
        } else {
            r = insertarnofull(r, llave);
            raiz = r;
        }
    }

    public Nodo insertarnofull(Nodo x, int llave) {
        int i;
        i = x.nllaves;
        if (x.hoja) {
            while ((i >= 1) && (llave < x.llaves.get(i - 1))) {
                x.llaves.set(i, x.llaves.get(i - 1));
                i--;
            }
            x.llaves.set(i, llave);
            x.nllaves = x.nllaves + 1;
        } else {
            while ((i >= 1) && (llave < x.llaves.get(i - 1))) {
                i--;
            }
            if (x.puntadores.get(i).nllaves == orden - 1) {
                x = split(x, i + 1, x.puntadores.get(i));
                if (llave > x.llaves.get(i - 1)) {
                    i++;
                }
            }
            if (x.puntadores.get(i) == null) {
                x.puntadores.set(i, new Nodo(orden - 1));
            }
            insertarnofull(x.puntadores.get(i), llave);
        }
        return x;
    }

    public Nodo split(Nodo x, int i, Nodo y) {
        Nodo z = new Nodo(orden);
        //z.setpadre();
        z.hoja = y.hoja;
        z.padre = y.padre;
        z.nllaves = (int) Math.floor((orden - 1) / 2);
        for (int j = 0; j <= (orden / 2) - 2; j++) {
            z.llaves.set(j, y.llaves.get(j + orden / 2));
            y.llaves.set(j + orden / 2, null);
        }
        if (!y.hoja) {
            for (int j = 0; j <= (orden / 2) - 1; j++) {
                z.puntadores.set(j, y.puntadores.get(j + (orden / 2)));
                y.puntadores.set(j + orden / 2, null);
            }
        }
        y.nllaves = (int) Math.floor((orden - 1) / 2);
        for (int j = x.nllaves + 1; j > i + 1; j--) {
            x.puntadores.set(j + 1, y.puntadores.get(j));
            y.puntadores.set(j, new Nodo(orden));
        }
        x.puntadores.set(i, z);
        for (int j = x.nllaves; j >= i; j--) {
            x.llaves.set(j + 1, x.llaves.get(j));
            x.llaves.set(j, null);
        }
        x.llaves.set(i - 1, y.llaves.get((int) Math.floor((orden - 1) / 2)));
        y.llaves.set((int) Math.floor((orden - 1) / 2), null);
        x.nllaves = x.nllaves + 1;
        return x;
    }

    public void delete(Nodo x, int k) {
        if (!x.hoja) {
            Nodo y = hijopredecesor(x, k);
            y.setpadre();
            Nodo z = hijosucesor(x, k);
            z.setpadre();
            if (y.nllaves > (int) Math.floor((orden - 1) / 2)) {
                int K = llavepredecesora(x, k);
                moverllave(K, y, x);
                moverllave(k, x, z);
                delete(z, k);
            } else if (z.nllaves > (int) Math.floor((orden - 1) / 2)) {
                int K = llavepredecesora(x, k);
                moverllave(K, z, x);
                moverllave(k, x, y);
                delete(z, k);
            } else {
                moverllave(k, x, y);
                mergenodos(y, z);
            }
        } else {
            Nodo y = hijopredecesor(x, k);
            y.setpadre();
            Nodo z = hijosucesor(x, k);
            z.setpadre();
            Nodo w = x.padre;
            int v;
            if (x.padre.puntadores.indexOf(x) == orden) {
                v = orden - 1;
            } else {
                v = x.padre.llaves.get(x.padre.puntadores.indexOf(x));
            }
            if (x.nllaves > (int) Math.floor((orden - 1) / 2)) {
                removerllave(k, x);
            } else if (y.nllaves > (int) Math.floor((orden - 1) / 2)) {
                int K = llavepredecesora(w, v);
                moverllave(K, y, w);
                K = llavesucesora(w, v);
                moverllave(K, w, x);
                delete(x, k);
            } else if (w.nllaves > (int) Math.floor((orden - 1) / 2)) {
                int K = llavepredecesora(w, v);
                moverllave(K, z, w);
                K = llavesucesora(w, v);
                moverllave(K, w, x);
                delete(x, k);
            } else {
                Nodo s = encontrarhermano(w);
                Nodo W = w.padre;
                if (W.nllaves > (int) Math.floor((orden - 1) / 2)) {
                    mergenodos(W, w);
                    mergenodos(w, s);
                    delete(x, k);
                } else {
                    moverllave(v, w, x);
                    delete(x, k);
                }
            }
        }
    }

    public void moverllave(int k, Nodo n1, Nodo n2) {
        n1.llaves.remove(n1.llaves.indexOf(k));
        n1.llaves.add(null);
        int index = 0;
        for (int i = 0; i < n2.nllaves; i++) {
            if (k > n2.llaves.get(i)) {
                index++;
            }
        }
        n2.llaves.add(index, k);
        n2.llaves.remove(n2.llaves.size() - 1);
    }

    public Nodo hijopredecesor(Nodo x, int k) {
        return x.puntadores.get(x.llaves.indexOf(k));
    }

    public Nodo hijosucesor(Nodo x, int k) {
        return x.puntadores.get(x.llaves.indexOf(k) + 1);
    }

    public int llavepredecesora(Nodo x, int k) {
        return x.puntadores.get(x.llaves.indexOf(k)).llaves.get(x.puntadores.get(x.llaves.indexOf(k)).nllaves - 1);
    }

    public int llavesucesora(Nodo x, int k) {
        return x.puntadores.get(x.llaves.indexOf(k) + 1).llaves.get(0);
    }

    public void removerllave(int k, Nodo x) {
        for (int i = 0; i < x.nllaves; i++) {
            if (x.llaves.get(i) == k) {
                x.llaves.remove(i);
                x.llaves.add(null);
            }
        }
    }

    public Nodo encontrarhermano(Nodo x) {
        if (x.padre.puntadores.indexOf(x) == 0) {
            return x.padre.puntadores.get(1);
        } else if (x.padre.puntadores.indexOf(x) == orden) {
            return x.padre.puntadores.get(orden - 1);
        } else {
            if (x.padre.puntadores.get(x.padre.puntadores.indexOf(x) - 1).nllaves > x.padre.puntadores.get(x.padre.puntadores.indexOf(x) + 1).nllaves) {
                return x.padre.puntadores.get(x.padre.puntadores.indexOf(x) - 1);
            } else {
                return x.padre.puntadores.get(x.padre.puntadores.indexOf(x) + 1);
            }
        }
    }

    public void mergenodos(Nodo y, Nodo z) {
        //No funciona!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        Nodo x = new Nodo(orden);
        //x.padre = y.padre;
        //x.hoja = (y.hoja && z.hoja);
        //x.llaves.clear();
        //x.llaves.addAll(y.llaves);
        //y.llaves.clear();
        //x.llaves.addAll(y.nllaves, z.llaves);
        //z.llaves.clear();
//        while (x.llaves.size() > orden - 1) {
//            x.llaves.remove(orden - 1);
//        }
//        if (!x.hoja) {
//            for (int i = 0; i <= (int) Math.floor((orden - 1) / 2); i++) {
//                x.puntadores.set(i, y.puntadores.get(i));
//                x.puntadores.set(i + (int) Math.floor(orden / 2), x);
//            }
//        }
//        x.nllaves = y.nllaves + z.nllaves;

        
    }
    
    public void merge(Nodo actual, int llave){
                
        if (!actual.hoja) {
            
        }else{
            //si es hoja
            if (actual.nllaves > (orden-1)/2 ) { //si sus llaves son mayores al minimo
                removerllave(llave, actual);
            }
            
        }
        
        
    }

}
