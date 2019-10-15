package ar.edu.unahur.obj2.diabolico.demonio;

public class Astaroth {

    public boolean elegirPresa(int nivelDeBondad, int nivelDeValor) {
        return nivelDeBondad > nivelDeValor;
    }

    public int nivelDeValorAQuitar(int nivelDeBondad, int nivelDeValor) {
        return  nivelDeValor / 2;
    }

}
