package proyectoedd2;

import java.io.Serializable;
import java.util.ArrayList;

public class Nodo implements Serializable {

    private static final long serialVersionUID = -8341795847757503659L;
    int[] llaves;
    int orden;
    Nodo[] puntadores;
    int n;
    boolean hoja;

    public Nodo(int orden, boolean hoja) {
        this.orden = orden;
        this.hoja = hoja;
        llaves = new int[orden - 1];
        puntadores = new Nodo[orden];
        n = 0;
    }

    public void recorrer() {
        int i;
        for (i = 0; i < n; i++) {
            if (!hoja) {
                puntadores[i].recorrer();
            }
            System.out.println(" " + llaves[i]);
        }
        if (!hoja) {
            puntadores[i].recorrer();
        }
    }

//    public Nodo busqueda(int llave) {
//        int i = 0;
//        while (i < n && llave > llaves[i]) {
//            i++;
//        }
//        if (llaves[i] == llave) {
//            return this;
//        }
//        if (hoja) {
//            return null;
//        }
//        return puntadores[i].busqueda(llave);
//    }
    public ArrayList busqueda(int llave) {
        int i = 0;
        while (i < n && llave > llaves[i]) {
            i++;
        }
        if (llaves[i] == llave) {
            ArrayList x = new ArrayList();
            x.add(llave);
            x.add(i);
            return x;
        }
        if (hoja) {
            return null;
        }
        return puntadores[i].busqueda(llave);
    }

    public int encontrarllave(int llave) {
        int index = 0;
        while (index < n && llaves[index] < llave) {
            index++;
        }
        return index;
    }

    public void insertarnofull(int llave) {
        int i;
        i = n;
        if (hoja) {
            while ((i >= 1) && (llave < llaves[i - 1])) {
                llaves[i] = llaves[i - 1];
                i--;
            }
            llaves[i] = llave;
            n++;
        } else {
            while ((i >= 1) && (llave < llaves[i - 1])) {
                i--;
            }
            if (puntadores[i].n == orden - 1) {
                split(i, puntadores[i]);
                if (llave > llaves[i + 1]) {
                    i++;
                }
            }
            puntadores[i].insertarnofull(llave);
        }
    }

    public void split(int i, Nodo y) {
        Nodo z = new Nodo(orden, y.hoja);
        z.n = (int) Math.floor((orden - 1) / 2);
        for (int j = 0; j <= (orden / 2) - 2; j++) {
            z.llaves[j] = y.llaves[j + (orden / 2)];
            y.llaves[j + orden / 2] = 0;
        }
        if (!y.hoja) {
            for (int j = 0; j <= (orden / 2) - 1; j++) {
                z.puntadores[j] = y.puntadores[j + (orden / 2)];
                y.puntadores[j + orden / 2] = null;
            }
        }
        y.n = (int) Math.floor((orden - 1) / 2);
        for (int j = n; j >= i + 1; j--) {
            puntadores[j + 1] = puntadores[j];
        }
        puntadores[i + 1] = z;
        for (int j = n - 1; j >= i; j--) {
            llaves[j + 1] = llaves[j];
            llaves[j] = 0;
        }
        llaves[i] = y.llaves[(int) Math.floor((orden - 1) / 2)];
        y.llaves[(int) Math.floor((orden - 1) / 2)] = 0;
        n++;
    }

    public void remover(int llave) {
        int index = encontrarllave(llave);
        if (index < n && llaves[index] == llave) {
            if (hoja) {
                removerdehoja(index);
            } else {
                removerdenohoja(index);
            }
        } else {
            if (hoja) {
                System.out.println("La llave " + llave + "no se encuentra en el arbol");
            } else {
                boolean bandrea = index == n;
                if (puntadores[index].n < (orden / 2)) {
                    llenar(index);
                }

                if (bandrea && index > n) {
                    puntadores[index - 1].remover(llave);
                } else {
                    puntadores[index].remover(llave);
                }
            }
        }
    }

    private void removerdehoja(int index) {
        for (int i = index + 1; i < n; i++) {
            llaves[i - 1] = llaves[i];
        }
        n--;
    }

    private void removerdenohoja(int index) {
        int llave = llaves[index];
        if (puntadores[index].n >= (orden / 2)) {
            int predesor = getpredesor(index);
            llaves[index] = predesor;
            puntadores[index + 1].remover(predesor);
        } else if (puntadores[index + 1].n >= (orden / 2)) {
            int succesor = getsuccesor(index);
            llaves[index] = succesor;
            puntadores[index + 1].remover(succesor);
        } else {
            merge(index);
            puntadores[index].remover(llave);
        }
    }

    private int getpredesor(int index) {
        Nodo actual = puntadores[index];
        while (!actual.hoja) {
            actual = actual.puntadores[actual.n];
        }
        return actual.llaves[actual.n - 1];
    }

    private int getsuccesor(int index) {
        Nodo actual = puntadores[index + 1];
        while (!actual.hoja) {
            actual = actual.puntadores[actual.n - 1];
        }
        return actual.llaves[0];
    }

    private void llenar(int index) {
        if (index != 0 && puntadores[index - 1].n >= (orden / 2)) {
            moveranterior(index);
        } else if (index != n && puntadores[index + 1].n >= (orden / 2)) {
            moversiguente(index);
        } else {
            if (index != n) {
                merge(index);
            } else {
                merge(index - 1);
            }
        }
    }

    private void moveranterior(int index) {
        Nodo hijo = puntadores[index];
        Nodo hermano = puntadores[index - 1];
        for (int i = hijo.n - 1; i >= 0; i--) {
            hijo.llaves[i + 1] = hijo.llaves[i];
        }
        if (!hijo.hoja) {
            hijo.puntadores[0] = hermano.puntadores[hermano.n];
        }
        llaves[index - 1] = hermano.llaves[hermano.n - 1];
        hijo.n++;
        hermano.n--;
        for (int i = hijo.n - 1; i >= 0; i--) {
            hijo.llaves[i + 1] = hijo.llaves[i];
        }
        if (!hijo.hoja) {
            hijo.puntadores[0] = hermano.puntadores[hermano.n];
        }
        llaves[index - 1] = hermano.llaves[hermano.n - 1];
        hijo.n++;
        hermano.n--;
    }

    private void moversiguente(int index) {
        Nodo hijo = puntadores[index];
        Nodo hermano = puntadores[index + 1];
        hijo.llaves[hijo.n + 1] = llaves[index];
        if (!hijo.hoja) {
            hijo.puntadores[hijo.n + 1] = hermano.puntadores[0];
        }
        llaves[index] = hermano.llaves[0];
        for (int i = 1; i < hermano.n; i++) {
            hermano.llaves[i - 1] = hermano.llaves[i];
        }
        if (!hermano.hoja) {
            for (int i = 0; i < hermano.n; i++) {
                hermano.puntadores[i - 1] = hermano.puntadores[i];
            }
        }
        hijo.n++;
        hermano.n--;
    }

    private void merge(int index) {
        Nodo y = puntadores[index];
        Nodo z = puntadores[index + 1];
        y.llaves[(int) Math.floor((orden - 1) / 2)] = llaves[index];
        for (int i = 0; i < z.n; i++) {
            y.llaves[i + (orden / 2)] = z.llaves[i];
        }
        if (!y.hoja) {
            for (int i = 0; i <= z.n; i++) {
                y.puntadores[i + (orden / 2)] = z.puntadores[i];
            }
        }
        for (int i = index + 1; i < n; i++) {
            llaves[i - 1] = llaves[i];
            llaves[i] = 0;
        }
        for (int i = index + 2; i <= n; i++) {
            puntadores[i - 1] = puntadores[i];
            puntadores[i] = null;
        }
        y.n += z.n + 1;
        n--;
    }
}
