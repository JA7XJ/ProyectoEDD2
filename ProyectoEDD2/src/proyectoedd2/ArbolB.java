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
    private static final long serialVersionUID = -5874154469005930011L;
    Nodo raiz;
    int orden;

    public ArbolB(int orden) {
        this.orden = orden;
        raiz = null;
    }

    public void recorrer() {
        if (raiz != null) {
            raiz.recorrer();
        }
    }

    public Nodo busqueda(int llave) {
        if (raiz != null) {
            return raiz.busqueda(llave);
        }
        return null;
    }

    public void insertar(int llave) {
        if (raiz == null) {
            raiz = new Nodo(orden, true);
            raiz.llaves[0] = llave;
            raiz.n++;
        } else {
            if (raiz.n == orden - 1) {
                Nodo s = new Nodo(orden, false);
                s.puntadores[0] = raiz;
                s.split(0, raiz);
                int i = 0;
                if (s.llaves[0] < llave) {
                    i++;
                }
                s.puntadores[i].insertarnofull(llave);
                raiz = s;
            } else {
                raiz.insertarnofull(llave);
            }
        }
    }

    public void remover(int llave) {
        if (raiz == null) {
            System.out.println("El arbol esta vacio.");
            return;
        }
        raiz.remover(llave);
        if (raiz.n == 0) {
            if (raiz.hoja) {
                raiz = null;
            } else {
                raiz = raiz.puntadores[0];
            }
        }
    }
}
