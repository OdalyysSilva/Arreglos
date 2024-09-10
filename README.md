# Arreglos python
** __init__ : Constructor que inicializa dos diccionarios:

** departamentos: Contiene ventas mensuales (inicialmente 0) para los tres departamentos durante 12 meses.

** metas: Contiene metas mensuales (inicialmente 0) para los tres departamentos durante 12 meses.

** insertar_ventas: Permite ingresar ventas para un departamento en un mes específico. Verifica que el departamento sea válido y que el mes esté en el rango 1-12. Si la validación es correcta, actualiza las ventas para el mes dado; si no, imprime un mensaje de error.

** insertar_metas: Permite ingresar metas de ventas para un departamento. Verifica que el departamento sea válido y que las metas correspondan a los 12 meses. Si la validación es correcta, actualiza las metas; si no, imprime un mensaje de error.

**buscar_venta: Busca y devuelve las ventas de un departamento para un mes específico. Verifica que el departamento sea válido y que el mes esté en el rango 1-12.
Si la validación es correcta, devuelve el valor de ventas; si no, imprime un mensaje de error y devuelve None.

** eliminar_ventas_departamento: Elimina (pone a 0) todas las ventas de un departamento específico.
Verifica que el departamento sea válido.
Si la validación es correcta, restablece las ventas del departamento a 0; si no, imprime un mensaje de error.

** mostrar_ventas_matriz: Imprime una tabla con las ventas de todos los departamentos por mes.
Muestra una tabla donde cada fila corresponde a un mes y cada columna a las ventas de los departamentos.

** mostrar_metas_matriz: Imprime una tabla con las metas de ventas de todos los departamentos por mes.
Similar a mostrar_ventas_matriz, pero muestra las metas en lugar de las ventas.

** menu()
Crea una instancia de la clase Tienda y entra en un bucle infinito que presenta un menú al usuario.
Opciones del menú:
1: Solicita al usuario el departamento, el mes y las ventas, y usa insertar_ventas para registrar estos datos.
2: Solicita al usuario el departamento y las metas para cada mes, y usa insertar_metas para registrar estas metas.
3: Solicita al usuario el departamento y el mes, y usa buscar_venta para mostrar las ventas correspondientes.
4: Solicita al usuario el departamento y usa eliminar_ventas_departamento para eliminar todas las ventas del departamento.
5: Llama a mostrar_ventas_matriz para mostrar todas las ventas en una tabla.
6: Llama a mostrar_metas_matriz para mostrar todas las metas en una tabla.
7: Sale del bucle y termina el programa.
Valida la opción seleccionada y ejecuta la acción correspondiente, imprimiendo mensajes de error en caso de opción no válida o datos incorrectos.

# Arreglos java
Constantes:
** Meses: Número total de meses (12).
** Depart: Número total de departamentos (3).
** Arreglo NomMes: Contiene los nombres de los 12 meses del año.

Matriz Ventas:
** double[][]: Matriz para almacenar las ventas para cada departamento por cada mes.

** Scanner: Para ingresar datos desde la entrada estándar (teclado).

Método main
** IngreVentas(): Llama al método para ingresar las ventas de cada departamento.
** InsertMetas(): Llama al método para insertar las metas para cada departamento.
** MostTablaVentas(): Llama al método para mostrar las ventas en formato de tabla.
** Buscar un Elemento: Solicita al usuario un valor y busca ese valor en la matriz de ventas usando BuscarElemento(double Valor).
**Eliminar Ventas: Solicita al usuario el número del departamento (1-3) y elimina las ventas de ese departamento usando ElimVentasDepart(int dept).

Métodos
** IngreVentas():Solicita al usuario las ventas para cada departamento y mes.
Utiliza la matriz Ventas para almacenar estos valores.
** MostTablaVentas(): Muestra las ventas en formato tabular.
Imprime una tabla con los nombres de los meses y las ventas correspondientes a cada departamento.
** InsertMetas(): Solicita al usuario las metas para cada departamento.
Establece la misma meta para todos los meses del departamento en la matriz Ventas (esto reemplaza las ventas con las metas).
** BuscarElemento(double Valor): Busca un valor específico en la matriz de ventas.
Imprime la ubicación del valor encontrado (departamento y mes) o un mensaje si el valor no se encuentra.
** ElimVentasDepart(int dept): Elimina (pone a 0) todas las ventas de un departamento específico.
Imprime un mensaje confirmando la eliminación o un mensaje de error si el número del departamento es inválido.
