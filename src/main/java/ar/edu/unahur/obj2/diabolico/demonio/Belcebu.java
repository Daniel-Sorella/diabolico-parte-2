package ar.edu.unahur.obj2.diabolico.demonio;

public class Belcebu {

    public void puedeCazarla(int nivelDeBondad) {
        if (nivelDeBondad > 10) {
            throw new RuntimeException("Es muy buena, no la puedo cazar");
        }
    }

    public int incrementoDeMaldad(int nivelDeBondad) {
        return nivelDeBondad/2;
    }

}
