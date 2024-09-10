//#Hacer un arreglo bidimencional que me muestre las ventas del todo el año, 
//mensuales, del departamento de ropa, deportes, jugueteria
//#Crea metodos para insertar las metas por departamento, aparte para buscar un elemento 
//particular y un metodo para eliminar las ventas de un departamento en particular

//import java.util.Scanner;
public class Tienda {
    // Constantes
    final static int Meses = 12;
    final static int Depart = 3;

    // Arreglo con los nombres de los meses
    static String[] NomMes = {
        "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };

    // Crear una matriz para almacenar las ventas
    static double[][] Ventas = new double[Depart][Meses];

    // Crear un objeto Scanner para ingresar datos
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        IngreVentas();
        InsertMetas();
        MostTablaVentas();
        
        // Buscar un elemento
        System.out.println("\nBuscar una venta:");
        System.out.print("Ingrese el valor de venta a buscar: ");
        double Valor = scanner.nextDouble();
        BuscarElemento(Valor);
        
        // Eliminar ventas
        System.out.println("\nEliminar ventas de un departamento:");
        System.out.print("Ingrese el número del departamento (1-3): ");
        int dept = scanner.nextInt();
        ElimVentasDepart(dept - 1);
        MostTablaVentas();
    }

    // Método para ingresar las ventas
    public static void IngreVentas() {
        for (int dept = 0; dept < Depart; dept++) {
            System.out.println("Ingrese las ventas para el Departamento " + (dept + 1) + ":");
            for (int mes = 0; mes < Meses; mes++) {
                System.out.print(NomMes[mes] + ": ");
                Ventas[dept][mes] = scanner.nextDouble();
            }
            System.out.println();
        }
    }

    // Método para mostrar las ventas en formato de tabla
    public static void MostTablaVentas() {
        System.out.println("%-12s"+ "Mes");
        for (int dept = 0; dept < Depart; dept++) {
            System.out.println("Dept %d   "+ (dept + 1));
        }
        System.out.println();

        for (int mes = 0; mes < Meses; mes++) {
            System.out.println("%-12s"+ NomMes[mes]);
            for (int dept = 0; dept < Depart; dept++) {
                System.out.println("%-10.2f"+ Ventas[dept][mes]);
            }
            System.out.println();
        }
    }

    // Método para insertar las metas por departamento
    public static void InsertMetas() {
        System.out.println("\nIngrese las metas para cada departamento:");
        for (int dept = 0; dept < Depart; dept++) {
            System.out.print("Meta para el Departamento " + (dept + 1) + ": ");
            double meta = scanner.nextDouble();
            for (int mes = 0; mes < Meses; mes++) {
                Ventas[dept][mes] = meta;  // Insertar la meta para todos los meses
            }
        }
    }

    // Método para buscar un valor específico en la matriz de ventas
    public static void BuscarElemento(double Valor) {
        boolean encontrado = false;
        for (int dept = 0; dept < Depart; dept++) {
            for (int mes = 0; mes < Meses; mes++) {
                if (Ventas[dept][mes] == Valor) {
                    System.out.println("El valor " + Valor + " fue encontrado en el Departamento " + 
                                        (dept + 1) + " en el mes de " + NomMes[mes]);
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println("El valor " + Valor + " no fue encontrado en las ventas.");
        }
    }

    // Método para eliminar las ventas de un departamento
    public static void ElimVentasDepart(int dept) {
        if (dept >= 0 && dept < Depart) {
            for (int mes = 0; mes < Meses; mes++) {
                Ventas[dept][mes] = 0.0;  // Establece todas las ventas en cero
            }
            System.out.println("Ventas del Departamento " + (dept + 1) + " eliminadas.");
        } else {
            System.out.println("Número de departamento inválido.");
        }
        System.exit(0);
    }
}
