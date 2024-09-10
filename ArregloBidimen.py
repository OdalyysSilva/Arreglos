class Tienda:
    def __init__(self):
        self.departamentos = {
            "ropa": [0] * 12,
            "deportes": [0] * 12,
            "jugueteria": [0] * 12
        }
        self.metas = {
            "ropa": [0] * 12,
            "deportes": [0] * 12,
            "jugueteria": [0] * 12
        }

    def insertar_ventas(self, departamento, mes, ventas):
        if departamento in self.departamentos and 1 <= mes <= 12:
            self.departamentos[departamento][mes-1] = ventas
        else:
            print("Departamento o mes inválido.")

    def insertar_metas(self, departamento, metas):
        if departamento in self.metas and len(metas) == 12:
            self.metas[departamento] = metas
        else:
            print("Departamento no válido o las metas no corresponden a los 12 meses.")

    def buscar_venta(self, departamento, mes):
        if departamento in self.departamentos and 1 <= mes <= 12:
            return self.departamentos[departamento][mes-1]
        else:
            print("Departamento o mes inválido.")
            return None

    def eliminar_ventas_departamento(self, departamento):
        if departamento in self.departamentos:
            self.departamentos[departamento] = [0] * 12
        else:
            print("Departamento no válido.")

    def mostrar_ventas_matriz(self):
        print("\nVentas por Departamento:")
        print("Mes    Ropa    Deportes    Juguetería")
        for mes in range(12):
            print(f"{mes + 1:2d}    {self.departamentos['ropa'][mes]:6.2f}    {self.departamentos['deportes'][mes]:8.2f}    {self.departamentos['jugueteria'][mes]:10.2f}")

    def mostrar_metas_matriz(self):
        print("\nMetas por Departamento:")
        print("Mes    Ropa    Deportes    Juguetería")
        for mes in range(12):
            print(f"{mes + 1:2d}    {self.metas['ropa'][mes]:6.2f}    {self.metas['deportes'][mes]:8.2f}    {self.metas['jugueteria'][mes]:10.2f}")

def menu():
    tienda = Tienda()
    while True:
        print("\n---- Menú ----")
        print("1. Insertar ventas de un departamento")
        print("2. Insertar metas por departamento")
        print("3. Buscar ventas por departamento y mes")
        print("4. Eliminar ventas de un departamento")
        print("5. Mostrar todas las ventas en matriz")
        print("6. Mostrar todas las metas en matriz")
        print("7. Salir")
        
        opcion = input("Selecciona una opción: ")

        if opcion == "1":
            departamento = input("Ingresa el departamento (ropa, deportes, jugueteria): ").lower()
            mes = int(input("Ingresa el mes (1-12): "))
            ventas = float(input(f"Ingresa las ventas para {departamento} en el mes {mes}: "))
            tienda.insertar_ventas(departamento, mes, ventas)
        elif opcion == "2":
            departamento = input("Ingresa el departamento (ropa, deportes, jugueteria): ").lower()
            metas = []
            for i in range(12):
                meta = float(input(f"Inserta la meta de ventas para el mes {i+1}: "))
                metas.append(meta)
            tienda.insertar_metas(departamento, metas)
        elif opcion == "3":
            departamento = input("Ingresa el departamento (ropa, deportes, jugueteria): ").lower()
            mes = int(input("Ingresa el mes (1-12): "))
            ventas = tienda.buscar_venta(departamento, mes)
            if ventas is not None:
                print(f"Las ventas de {departamento} en el mes {mes} son: {ventas}")
        elif opcion == "4":
            departamento = input("Ingresa el departamento (ropa, deportes, jugueteria) a eliminar: ").lower()
            tienda.eliminar_ventas_departamento(departamento)
            print(f"Las ventas del departamento {departamento} han sido eliminadas.")
        elif opcion == "5":
            tienda.mostrar_ventas_matriz()
        elif opcion == "6":
            tienda.mostrar_metas_matriz()
        elif opcion == "7":
            print("Saliendo del programa...")
            break
        else:
            print("Opción no válida. Por favor, selecciona una opción del menú.")
menu() # Ejecutar el menú
