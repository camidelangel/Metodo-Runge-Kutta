# Método Runge-Kutta de Cuarto Orden (RK4)

## Descripción

Este proyecto implementa el Método Runge-Kutta de cuarto orden (RK4) mediante una estructura modular en Java 
para resolver ecuaciones diferenciales ordinarias de primer orden.

El problema que resuelve es:

\[
y'=x+y
\]

Con las condiciones iniciales:

- x inicial = 0
- y inicial = 1
- x final = 0.3
- Tamaño de paso (h) = 0.1

## Estructura del programa

El programa está organizado en tres clases:

- **Main.java:** establece los valores iniciales y ejecuta el algoritmo.
- **MetodoRungeKutta.java:** implementa el método RK4 y calcula las cuatro pendientes k1, k2, k3 y k4.
- **EvaluarF.java:** evalúa la función diferencial f(x,y) = x + y.

## Requisitos

- Java JDK instalado.
- IDE compatible con Java o terminal.
- Git instalado para clonar el repositorio.

## Clonar el repositorio

```bash
git clone https://github.com/camidelangel/Metodo-Runge-Kutta.git
```

Entrar en la carpeta del proyecto:

```bash
cd MetodoEuler
```

## Compilación

Desde la carpeta raíz del proyecto, ejecutar:

```bash
javac MetodoRungeKutta/*.java
```

## Ejecución

```bash
java MetodoRungeKutta.Main
```

## Funcionamiento del algoritmo

El método calcula cuatro pendientes en cada iteración:

- k1: pendiente en el punto inicial.
- k2: pendiente en el punto medio utilizando k1.
- k3: pendiente en el punto medio utilizando k2.
- k4: pendiente en el punto final utilizando k3.

Posteriormente, calcula el siguiente valor de y mediante el promedio ponderado:

\[
y_{n+1}=y_n+\frac{k_1+2k_2+2k_3+k_4}{6}
\]

## Resultado esperado

Con h = 0.1, el resultado aproximado en x = 0.3 es:

```text
y(0.3) = 1.399716994
```

## Autor
Camila amor del angel cervantes

Métodos Numéricos

Víctor Hugo Vásquez Herrera

## Actividad

Unidad 6: Resolución Numérica de EDOs.
