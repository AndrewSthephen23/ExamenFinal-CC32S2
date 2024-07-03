# Sprint 1

Empezemos construyendo nuestras clases primero creando las pruebas unitarias de cada una 

# Implementacion de clases

## Clase Temperatura

### Prueba:

Primero creamos la siguiente prueba

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperaturaTest {
    @Test
    public void testEsCaliente() {
        Temperatura temp = new Temperatura(35.0);
        assertTrue(temp.esCaliente());
    }

    @Test
    public void testEsFrio() {
        Temperatura temp = new Temperatura(5.0);
        assertTrue(temp.esFrio());
    }

    @Test
    public void testNoEsCalienteNiFrio() {
        Temperatura temp = new Temperatura(20.0);
        assertFalse(temp.esCaliente());
        assertFalse(temp.esFrio());
    }
}

```

Ejecutamos las pruebas:

![Untitled](Imagenes/Untitled.png)

Como podemos ver las pruebas no pasaron

Implementaremos la clase Temperatura para hacer pasar las pruebas:

```java
public class Temperatura {
    private double valor;

    public Temperatura(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public boolean esCaliente() {
        return valor > 30.0; 
    }

    public boolean esFrio() {
        return valor < 10.0; 
    }
}
```

Ahora ejecutamos nuestras pruebas otra ves para ver si pasaron:

![Untitled](Imagenes/Untitled%201.png)

## Clase Lluvia

### Prueba:

Ahora creamos la siguiente prueba para la clase Lluvia:

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LluviaTest {
    @Test
    public void testEsIntensa() {
        Lluvia lluvia = new Lluvia(60.0);
        assertTrue(lluvia.esIntensa());
    }

    @Test
    public void testNoEsIntensa() {
        Lluvia lluvia = new Lluvia(20.0);
        assertFalse(lluvia.esIntensa());
    }
}

```

Ejecutamos la prueba

![Untitled](Imagenes/Untitled%202.png)

Como podemos observar las pruebas no pasan

Implementaremos la clase Lluvia para hacer pasar las pruebas:

```java
public class Lluvia {
    private double cantidad;

    public Lluvia(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public boolean esIntensa() {
        return cantidad > 50.0; 
    }
}

```

Ahora ejecutamos las pruebas otra ves para ver si pasaron:

![Untitled](Imagenes/Untitled%203.png)

## Clase Viento

### Prueba:

Crearemos las siguientes pruebas

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VientoTest {
    @Test
    public void testEsFuerte() {
        Viento viento = new Viento(80.0);
        assertTrue(viento.esFuerte());
    }

    @Test
    public void testNoEsFuerte() {
        Viento viento = new Viento(30.0);
        assertFalse(viento.esFuerte());
    }
}

```

Ejecutamos la prueba

![Untitled](Imagenes/Untitled%204.png)

Como podemos ver las pruebas no pasaron

Implementaremos la clase Viento para hacer pasar las pruebas:

```java
public class Viento {
    private double velocidad;

    public Viento(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public boolean esFuerte() {
        return velocidad > 70.0;
    }
}

```

Ahora ejecutamos las pruebas otra ves para ver si pasaron:

![Untitled](Imagenes/Untitled%205.png)

## Clase Humedad

### Prueba:

Primero creamos la siguiente prueba

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HumedadTest {
    @Test
    public void testEsAlta() {
        Humedad humedad = new Humedad(85.0);
        assertTrue(humedad.esAlta());
    }

    @Test
    public void testNoEsAlta() {
        Humedad humedad = new Humedad(60.0);
        assertFalse(humedad.esAlta());
    }
}

```

Ejecutamos la prueba

![Untitled](Imagenes/Untitled%206.png)

Como podemos ver las pruebas no pasaron

Implementaremos la clase Humedad para hacer pasar las pruebas:

```java
public class Humedad {
    private double porcentaje;

    public Humedad(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public boolean esAlta() {
        return porcentaje > 80.0;
    }
}

```

Ahora ejecutamos las pruebas para ver si logramos hacerlas pasar

![Untitled](Imagenes/Untitled%207.png)

## Clase PresionAtmosferica

### Prueba:

Primero creamos la siguiente prueba

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PresionAtmosfericaTest {
    @Test
    public void testEsBaja() {
        PresionAtmosferica presion = new PresionAtmosferica(950.0);
        assertTrue(presion.esBaja());
    }

    @Test
    public void testNoEsBaja() {
        PresionAtmosferica presion = new PresionAtmosferica(1020.0);
        assertFalse(presion.esBaja());
    }
}

```

Ejecutamos la prueba

![Untitled](Imagenes/Untitled%208.png)

Como podemos observar las pruebas no pasaron

Implementaremos la clase PresionAtmosferica para hacer pasar las pruebas:

```java
public class PresionAtmosferica {
    private double presion;

    public PresionAtmosferica(double presion) {
        this.presion = presion;
    }

    public double getPresion() {
        return presion;
    }

    public boolean esBaja() {
        return presion < 1000.0; // Ejemplo de criterio
    }
}
```

Ahora ejecutamos las pruebas para ver si logramos hacerlas pasar

![Untitled](Imagenes/Untitled%209.png)

## Clase AlertaClimatica:

Ahora vamos a implementar la clase donde se ejecutara la aplicacion.

### Prueba:

Primero creamos la siguiente prueba

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class AlertaClimaticaTest {
    @Test
    public void testGenerarAlertas() {
        Temperatura temp = new Temperatura(35.0);
        Lluvia lluvia = new Lluvia(25.0);
        Viento viento = new Viento(55.0);

        AlertaClimatica alertaClimatica = new AlertaClimatica(temp, lluvia, viento);
        List<String> alertas = alertaClimatica.generarAlertas();

        assertTrue(alertas.contains("Alerta: Temperatura Alta!"));
        assertTrue(alertas.contains("Alerta: Lluvia Intensa!"));
        assertTrue(alertas.contains("Alerta: Viento Fuerte!"));
    }
}

```

Ejecutamos la prueba

![Untitled](Imagenes/Untitled%2010.png)

Como podemos observar las pruebas no pasaron

Implementaremos la clase AlertaClimatica para hacer pasar las pruebas:

```java
public class AlertaClimatica {
    private Temperatura temperatura;
    private Lluvia lluvia;
    private Viento viento;

    public AlertaClimatica(Temperatura temperatura, Lluvia lluvia, Viento viento) {
        this.temperatura = temperatura;
        this.lluvia = lluvia;
        this.viento = viento;
    }

    public List<String> generarAlertas() {
        List<String> alertas = new ArrayList<>();

        if (temperatura.esCaliente()) {
            alertas.add("Alerta: Temperatura Alta!");
        }

        if (lluvia.esIntensa()) {
            alertas.add("Alerta: Lluvia Intensa!");
        }

        if (viento.esFuerte()) {
            alertas.add("Alerta: Viento Fuerte!");
        }

        return alertas;
    }

    public static void main(String[] args) {
        Temperatura temp = new Temperatura(35.0);
        Lluvia lluvia = new Lluvia(25.0);
        Viento viento = new Viento(55.0);

        AlertaClimatica alertaClimatica = new AlertaClimatica(temp, lluvia, viento);
        List<String> alertas = alertaClimatica.generarAlertas();

        for (String alerta : alertas) {
            System.out.println(alerta);
        }
    }
}
```

Ahora ejecutamos las pruebas para ver si logramos hacerlas pasar

![Untitled](Imagenes/Untitled%2011.png)

Ahora Ejecutemos la clase AlertaClimatica para ver la salida:

![Untitled](Imagenes/Untitled%2012.png)

Como podemos ver nos da las alertas. 

# Validacion de pruebas con stubs y fakes

Usaremos Mockito para crear los stubs que simulan las condiciones climáticas. Los stubs se usarán en las pruebas unitarias para proporcionar respuestas predefinidas.

Primero ponemos las dependencias de Mockito en el build.gradle:

```java
plugins {
    id 'java'
}

group = 'org.example'
version = '1.0-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    testImplementation platform('org.junit:junit-bom:5.10.0')
    testImplementation 'org.junit.jupiter:junit-jupiter'
    testImplementation 'org.mockito:mockito-core:4.3.1'
    testImplementation 'org.mockito:mockito-junit-jupiter:4.3.1'
}

test {
    useJUnitPlatform()
}
```

## Pruebas Unitarias con Stubs

### AlertaClimatica

```java
public class AlertaClimaticaTest2 {
    @Test
    public void testGenerarAlertasConStubs() {
        // Crear stubs usando Mockito
        Temperatura temperaturaStub = Mockito.mock(Temperatura.class);
        Lluvia lluviaStub = Mockito.mock(Lluvia.class);
        Viento vientoStub = Mockito.mock(Viento.class);

        // Configurar respuestas predefinidas
        when(temperaturaStub.esCaliente()).thenReturn(true);
        when(lluviaStub.esIntensa()).thenReturn(false);
        when(vientoStub.esFuerte()).thenReturn(true);

        AlertaClimatica alertaClimatica = new AlertaClimatica(temperaturaStub, lluviaStub, vientoStub);
        List<String> alertas = alertaClimatica.generarAlertas();

        assertTrue(alertas.contains("Alerta: Temperatura Alta!"));
        assertTrue(alertas.contains("Alerta: Viento Fuerte!"));
        assertTrue(!alertas.contains("Alerta: Lluvia Intensa!"));
    }
}
```

Ejecutamos la prueba:

![Untitled](Imagenes/Untitled%2013.png)

Podemos observar que las pruebas pasaron con los stubs que creamos

## Implementamos Fakes para pruebas mas complejas

Vamos a crear una clase `CondicionesClimaticasFake` que generará condiciones climáticas en función de los valores predefinidos.

### CondicionesClimaticasFake

```java
public class CondicionesClimaticasFake {
    public static Temperatura getTemperatura(double valor) {
        return new Temperatura(valor);
    }

    public static Lluvia getLluvia(double cantidad) {
        return new Lluvia(cantidad);
    }

    public static Viento getViento(double velocidad) {
        return new Viento(velocidad);
    }
}
```

### Pruebas Unitarias con Fakes

### AlertaClimatica

```java
public class AlertaClimaticaTest3 {
    @Test
    public void testGenerarAlertasConFakes() {
        // Usar fakes para simular condiciones climáticas
        Temperatura tempFake = CondicionesClimaticasFake.getTemperatura(35.0);
        Lluvia lluviaFake = CondicionesClimaticasFake.getLluvia(60.0);
        Viento vientoFake = CondicionesClimaticasFake.getViento(80.0);

        AlertaClimatica alertaClimatica = new AlertaClimatica(tempFake, lluviaFake, vientoFake);
        List<String> alertas = alertaClimatica.generarAlertas();

        assertTrue(alertas.contains("Alerta: Temperatura Alta!"));
        assertTrue(alertas.contains("Alerta: Lluvia Intensa!"));
        assertTrue(alertas.contains("Alerta: Viento Fuerte!"));
    }
}
```

Ejecutamos la Prueba:

![Untitled](Imagenes/Untitled%2014.png)

Se puede apreciar que hicimos pasar la prueba usando Fakes.

# Metricas de Calidad

Usaremos la herramienta Jacoco para medir la cobertura de pruebas

Primero configuraremos el build.gradle para las dependencias de Jacoco

```java
plugins {
    id 'java'
    id 'jacoco'
}

group = 'org.example'
version = '1.0-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    testImplementation platform('org.junit:junit-bom:5.10.0')
    testImplementation 'org.junit.jupiter:junit-jupiter'
    testImplementation 'org.mockito:mockito-core:4.3.1'
    testImplementation 'org.mockito:mockito-junit-jupiter:4.3.1'
    testImplementation 'org.jetbrains:annotations:24.0.0'
}

test {
    useJUnitPlatform()
}

// jacoco
jacoco {
    toolVersion = "0.8.12" // Versión de JaCoCo (compatible con java 21)
}

jacocoTestReport {
    dependsOn test // Ejecuta las pruebas antes de generar el informe

    reports {
        xml.required.set(true)
        html.required.set(true)
    }
}

check.dependsOn jacocoTestCoverageVerification
```

Ahora usaremos el siguiente comando: 

```java
./gradlew jacocoTestReport
```

![Untitled](Imagenes/Untitled%2015.png)

Analisemos los siguientes resultados:

- 79 de 220 instrucciones en total no fueron ejecutadas (64% de cobertura).
- 6 de 22 ramas condicionales no fueron ejecutadas (72% de cobertura).
- Se reportan 13 complejidades ciclomáticas perdidas.
- 20 líneas de código no fueron ejecutadas.
- 9 métodos no fueron ejecutados.
- 1 clase no fue ejecutada.

# Refactorizamos

Vamos a hacer la siguiente refactorizacion para la clase `AlertaClimatica` debido a su baja cobertura.

Analisemos que nos dice Jacoco

![Untitled](Imagenes/Untitled%2016.png)