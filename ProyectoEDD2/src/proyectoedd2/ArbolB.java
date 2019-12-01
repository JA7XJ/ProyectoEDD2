package proyectoedd2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class ArbolB {

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
    
    public ArrayList busqueda(Nodo x, int llave) {
        int i = 0;
        while (i <= x.nllaves - 1 && llave > x.llaves.get(i)) {
            i++;
        }
        if (i <= x.nllaves - 1 && llave == x.llaves.get(i)) {
            ArrayList xx=new ArrayList();
            xx.add(llave);
            xx.add(i);
            return xx;
        }
        if (x.hoja) {
            return null;
        } else {
            return busqueda(x.puntadores.get(i), llave);
        }
    }

    public void insertar(int llave) {
        Nodo r = raiz;
        if (r.nllaves == orden - 1) {
            Nodo s = new Nodo(orden);
            s.hoja = false;
            s.puntadores.set(0, r);
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
        z.hoja = y.hoja;
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
}
