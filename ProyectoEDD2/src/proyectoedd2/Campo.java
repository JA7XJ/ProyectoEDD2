/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedd2;

/**
 *
 * @author josep
 */
public class Campo {

    private String NombreCampo;
    private int tipo;
    private int longitud;
    private boolean llave;

    public Campo() {
    }

    public Campo(String NombreCampo, int tipo, int longitud, boolean llave) {
        this.NombreCampo = NombreCampo;
        this.tipo = tipo;
        this.longitud = longitud;
        this.llave = llave;
    }

    public String getNombreCampo() {
        return NombreCampo;
    }

    public void setNombreCampo(String NombreCampo) {
        this.NombreCampo = NombreCampo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public boolean isLlave() {
        return llave;
    }

    public void setLlave(boolean llave) {
        this.llave = llave;
    }

    @Override
    public String toString() {
        return "Campo{" + "NombreCampo=" + NombreCampo + ", tipo=" + tipo + ", longitud=" + longitud + ", llave=" + llave + '}';
    }

}
