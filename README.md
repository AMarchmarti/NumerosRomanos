### Se trata de escribir una programa que transforme números romanos en decimales:
~~~
I uno 
II dos 
III tres 
IV cuatro 
V cinco 
VI seis 
VII siete 
VIII ocho 
IX  nueve 
XXXII  treinta y dos 
XLV  cuarenta y cinco
~~~
***Has de utilizar expresiones regulares y tipos enumerados.***

Hay que tener en cuenta que la numeración romana, al no ser un sistema posicional, no requiere del cero.

### Normas:

-Los números se leen de izquierda a derecha empezando por los símbolos con mayor valor, o conjunto de símbolos de mayor valor.
-Un símbolo seguido de otro de igual o inferior valor, suma (p.e. X·X·I = 10+10+1 = 21), mientras que si está seguido de otro de mayor valor, ambos símbolos forman un conjunto en el cual debe restarse el valor del primero al valor del siguiente (p.e. X·IX = 10+[10-1] = 19).
-La unidad (I) y los números con base 10 (X, C y M) pueden repetirse hasta 3 veces consecutivas como sumandos.
-Los números con base 5 (V, L y D), no pueden repetirse seguidos, ya que la suma de esos dos símbolos tiene representación con alguno de los símbolos anteriores.
-La unidad y los símbolos de base 10 también pueden aparecer restando antes de un símbolo de mayor valor, pero con las siguientes normas:
solo pueden aparecer restando sobre los símbolos con base 5 y 10 de valor inmediatamente superiores, pero no de otros con valores más altos(p.e. ‘IV’ y ‘IX’, pero no ‘IL’ ni ‘IC’).
en el caso de estar restando, no pueden repetirse.
-Los símbolos con base 5 no pueden utilizarse para restar 

### Casos Test
Utilizad los que aparecen en el artículo de la Wikipedia, que explican cómo funcionan las normas.

### Condiciones:
~~~
M, C, X, I pueden aparecer de cero a tres veces (sumando).
D, L, V pueden aparecer de cero a una vez sumando, ya que no pueden restar.
Restando, sólo pueden aparecer las combinaciones:
IV e IX
XL y XC
CD y CM
D, L, V no pueden aparecer restando.
~~~

### Expresiones Regulares utilizadas:
***Validación*** = ```"^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})"```
*Verificar que un número es romano o no.*

***grupoSumatorio*** = ```"(?<!C)[DM]|(?<!X)[LC](?!D)|(?<!I)[VX](?![LC])|I(?![VX])"```
*Grupos normales*

***grupoSustractivo*** = ```"(C[DM])|(X[LC])|(I[VX])"```
*Grupos especiales*
