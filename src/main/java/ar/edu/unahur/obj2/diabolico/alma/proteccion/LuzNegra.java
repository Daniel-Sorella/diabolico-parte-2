package ar.edu.unahur.obj2.diabolico.alma.proteccion;

public class LuzNegra implements Proteccion {

    @Override
    public boolean estaProtegido(int maldad, int almasCazadas) {
        return maldad > 10 && almasCazadas > 1;
    }

}
