# Backtraking-Maze
Programa que demuestra el uso de un algoritmo Backtraking al resolver un laberinto escrito con ceros y unos (matriz binaria) leído desde un archivo de extensión **.txt**.

* Test-Files: archivos .txt que contienen los laberintos junto con el tamaño de la matriz y la posición inicial
* src: archivos fuente del programa separados por Vista y Modelo
* src->Icons: íconos de la clase FramePrincipal

## Formato de arhivos .txt de entrada 📋

Este es el formato típico de una matriz de laberinto válida para el programa:

```
11 9        => Representan el tamaño de la matriz (11 filas x 9 columnas)
010000000
011111110
001011010
011010010
011110100
011101010
011111010
001010110
001110110
011111100
110000100
0 1         => Representan la posición de inicio en el laberinto (fila<0>, columna<1>)
```

Otro ejemplo:

```
6 6         => Tamaño de 6x6
010000
011111
001011
011010
011110
000001
3 1         => Posición inicial (3,1)
```

La matriz binaria (laberinto) puede ser del tamaño que se desee, siempre y cuando tenga un formato similar al de los ejemplos, los espacios son importantes; no ingresar la matriz con este formato causara un error en la aplicación.


## Programas similares 📖
Un excelente ejemplo de como funciona este programa puedes encontrarlo en [este sitio](https://www.cs.bu.edu/teaching/alg/maze/) aquí, ademas, puedes seleccionar la velocidad a la que resolverá el laberinto y te permite elejir el orden de busqueda que se ejecutará en el algoritmo.
