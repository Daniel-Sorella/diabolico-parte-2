# Diabólico - Parte 2

Está es la segunda parte del exitoso diabólico

## Entrega

La solución y entrega de esta segunda parte se va a realizar en el repositorio original de diabolico asignado por los profesores https://github.com/obj2-unahur-2019s2/tp1-{usuario-alumno}.

Se deben subir los cambios en un branch llamado `entrega` y se debe crear el pull request correspondiente en Github.

El código debe compilar y debe tener test unitarios que verifiquen la funcionalidad desarrollada.


### Creación del branch

El siguiente comando nos crea el nuevo branch y luego nos deja ya parados el mismo

```console
  git checkout -b entrega
```

### Subida de los cambios

La primera vez que subimos los cambios, se crea el branch en el repositorio remoto, para eso hay q ejecutar el siguiente comando:

```console
  git push -u origin entrega
```

Luego si es necesario subir nuevos commits, ejecutamos:

```console
  git push
```

### Crear Pull Request

Siempre que comiteamos sobre un branch, github nos ofrece crear un pull request.
También podemos crearlo usando el botón `New pull request`.

## Agregar Parte 2 como dependencia de la primera

Para resolver la segunda parte es necesario utilizar una seria de clases que vienen incluídas en este proyecto. Para poder hacer esto debemos agregar como dependencia del `diabólico original` al `diabólico parte 2`. Como usamos maven esto se puede hacer de forma fácil y elegante.

Debemos agregar lo siguiente a nuestro `pom.xml` un nivel nivel debajo de `<project>`:

```xml
<project> 
  ....
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
  ....
<project>
```

y dentro de `<dependencies>` debemos agregar:

```xml
	<dependency>
	    <groupId>com.github.obj2-unahur</groupId>
	    <artifactId>diabolico-parte-2</artifactId>
	    <version>1.0.0</version>
	</dependency>
```

Luego de esto se hace refresh del proyecto para que descargué la dependencia.
Al incoporar la depencia, nos va a permitir utilizar todas las clases que se encuentran en ella **(pero no modificarlas)

## Almas protegidas

Las almas están un poco cansadas de ser cazadas y/o atormentadas y empiezan a desarrollar una serie de mecanismos de defensa que impiden que las mismas sean cazadas o atormetadas por los demonios.

Las almas tiene distintos mecanismos para protegerse:

* Luz Blanca
* Luz Negra
* Anillo de poder

Estos mecanismos pueden proteger a un alma de un determinado `demonio` dependendiendo del `nivelDeMadad` y la `cantidadDeAlmasCazadas` del mismo.

Los mecanimos ya están implementados y se comparten con la parte 2 de demonio:

[]

Como se aprecia en el anterior diagrama, los mecaninismos implementan la siguiente interfaz:

```java
public interface Proteccion {

    boolean estaProtegido(int maldad, int almasCazadas);

}
```

Se solicita realizar los cambios en el código para que los `demonios` no puedan cazar no atormentar un alma si está esta protegida para ese demonio en particular.

## Otros demonios

Existen unos nuevos demonios que queremos pasen a formar parte del equipo de nuestro diablo y puedan cazar en los mismo lugares y de la misma forma que nuestro demonios ya conocidos.

Estos demonios son los siguientes y vienen ya implementados en la parte 2:

* Belcebu
* Leviatan
* Astaroth

[]

Son demonios muy antiguos pero están dispuestos a trabajar con el diablo y el resto de los demonios con el fin de cazar la mayor cantidad de almas posibles, para ello se comprometen a respetar las reglas establecidas por el diablo y utiliar los mismos criterior comúnes que tiene los otros demonios a la hora de elegir un alma para cazar, así como también aplicar los mismos tormentos.
Al igual que los demonios de hiego, fuego y sombras, estos demonios tienen sus particularidades a la hora de elegir una presa, así com tambien de atormentarlas, como se aprecia en el codigo compartido a continuación:

```java
public class Astaroth {

    public boolean elegirPresa(int nivelDeBondad, int nivelDeValor) {
        return nivelDeBondad > nivelDeValor;
    }

    public int nivelDeValorAQuitar(int nivelDeBondad, int nivelDeValor) {
        return  nivelDeValor / 2;
    }

}
```

```java
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
```

```java
public class Leviatan {

    public boolean seleccionar(int nivelDeValor) {
        return nivelDeValor%2==0;
    }

}
```



**NOTA: El codigo importado desde la parte 2 no puede ser modificado
