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

    private Nodo raiz = null;
    private File archivo = null;

    public ArbolB() {
        Nodo raiz = new Nodo(6);
    }

    public ArbolB(String ruta) {
        archivo = new File(ruta);
        Nodo raiz = new Nodo(6);
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void CrearNodo(int T) {
        Nodo n = new Nodo(T);
    }

    public int buscar(Nodo x, int llave) {
        int i = 0;
        //while (i <= ((int) x.get(i).getLlaves().get(i)) && llave > ((int) x.get(i).getLlaves().get(i))) {
        while (i < ((int) x.getLlaves().size()) && llave > ((int) x.getLlaves().get(i))) {
            i = i + 1;
        }
        //if (i <= ((int) x.get(i).getLlaves().get(i)) && llave == ((int) x.get(i).getLlaves().get(i))) {
        if (i < ((int) x.getLlaves().size()) && llave == ((int) x.getLlaves().get(i))) {
            //return (((int) x.get(i).getLlaves().get(i)));
            return (i);
        }
        if (x.isLeaf()) {
            return -1;
        } else {
            return buscar(x.getChildren().get(i), llave);
        }
    }

    void insertar(Nodo T, int k) {
        Nodo r = T;
        Collections.sort(T.getLlaves());
        if (r.getnLlaves() == T.getTt()) {
            Nodo s = new Nodo(6);
            T = s;
            s.setLeaf(false);
            s.setnLlaves(0);
            s.setChildren(r.getChildren());
            // Metadata byteOFFset = null;
            split(s);
            insertnofull(s, k);
        } else {
            insertnofull(T, k);
            Collections.sort(T.getLlaves());
        }
    }

    void insertnofull(Nodo x, int k) {
        int i = x.getnLlaves();
        if (x.isLeaf()) {
            while (i > 0 && k < (int) x.getLlaves().get(i)) {
                x.getLlaves().set(i + 1, x.getLlaves().get(i));
                i = i - 1;
            }
            //x.getLlaves().get(i + 1) = k;
            x.getLlaves().set(i + 1, k);
            x.setnLlaves(x.getnLlaves() + 1);
            while (i > 0 && k < (int) x.getLlaves().get(i)) {
                i = i - 1;
            }
            i = i + 1;
            if (x.getChildren().get(i).getLlaves().size() == 6 - 1 / 2) {
                //Metadata xx=null;
                split(x.getChildren().get(i));
                if (k > (int) x.getLlaves().get(i)) {
                    i = i + 1;
                }
//                insertnofull(x.getChildren().get(i), k);
            }
            insertnofull(x.getChildren().get(i), k);
        }
    }

    /*public void split(Nodo nodo_actual) {
        int orden = nodo_actual.getTt();
        int num_llaves = orden;
        ArrayList<Nodo> Temporal1 = new ArrayList();
        ArrayList<Nodo> Temporal2 = new ArrayList();
        ArrayList<Nodo> Temporal3 = new ArrayList();
        if (nodo_actual.IsLeaf(true)) {
            for (int i = 0; i < orden + 1; i++) {
                if (i == orden + 1 / 2) {
                    Temporal2.add(new Nodo(nodo_actual.getChildren().indexOf(i))); //middle
                    nodo_actual = Temporal2.get(i); //Aqui asigno al nodo padre el valor padre
                } else if (i < orden + 1 / 2) {
                    Temporal1.add(new Nodo(nodo_actual.getChildren().indexOf(i))); //left                
                } else if (i > orden + 1 / 2 && i < orden) {
                    Temporal3.add(new Nodo(nodo_actual.getChildren().indexOf(i))); //right
                }
            }
        }
        
    }*/
    public void split(Nodo x) {
        int orden = x.getTt();
        int T = x.getT();
        Nodo top = x;
        Nodo left = new Nodo(x.getT());
        Nodo right = new Nodo(x.getT());
        int mitad = 1 + x.getLlaves().size() - 1 / 2;
        for (int i = 0; i < x.getLlaves().size(); i++) {
            if (i < mitad) {
                left.getLlaves().add(x.getLlaves().get(i));
            }
            if (i > mitad) {
                right.getLlaves().add(x.getLlaves().get(i));
            }
        }
//        for (int i = 0; i < x.getChildren().size(); i++) {
//            if (i <= mitad) {
//                left.getChildren().add(x.getChildren().get(i));
//            } else {
//                right.getChildren().add(x.getChildren().get(i));
//            }
//        }
        if (top == null) {
            top = new Nodo(T);
            Collections.sort(top.getLlaves());
            top.getChildren().add(left);
            top.getChildren().add(right);
        } else {
            Collections.sort(top.getLlaves());
            top.getChildren().add(left);
            top.getChildren().add(right);
        }
    }

//    public void escribirArbol() {
//        FileOutputStream fw = null;
//        ObjectOutputStream bw = null;
//        try {
//            fw = new FileOutputStream(archivo);
//            bw = new ObjectOutputStream(fw);
//            for (Alumno t : listaAlumnos) {
//                bw.writeObject(t);
//            }
//            bw.flush();
//        } catch (Exception ex) {
//        } finally {
//            try {
//                bw.close();
//                fw.close();
//            } catch (Exception ex) {
//            }
//        }
//    }
//
//    public void leerArbol() {
//        try {
//
//            if (archivo.exists()) {
//                FileInputStream entrada
//                        = new FileInputStream(archivo);
//                ObjectInputStream objeto
//                        = new ObjectInputStream(entrada);
//                try {
//                    while ((temp = () objeto.readObject()) != null) {
//                        listaAlumnos.add(temp);
//                    }
//                } catch (EOFException e) {
//                    //encontro el final del archivo
//                }
//                objeto.close();
//                entrada.close();
//            }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
    /*
    
     */
}
