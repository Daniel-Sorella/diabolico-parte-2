package ar.edu.unahur.obj2.diabolico.alma.proteccion;

public class AnilloDePoder implements Proteccion {

    @Override
    public boolean estaProtegido(int maldad, int almasCazadas) {
        return almasCazadas == 0;
    }

}
