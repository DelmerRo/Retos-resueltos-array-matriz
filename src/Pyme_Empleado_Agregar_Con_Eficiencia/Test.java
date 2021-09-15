package Pyme_Empleado_Agregar_Con_Eficiencia;

public class Test {

	public static void main(String[] args) {
		Pyme pyme = new Pyme("Soldadito");
		System.out.println("////////Dando de alta al empleado//////////");
		System.out.println(pyme.altaEmpleado("0000", "Rodriguez", 1500));
		System.out.println(pyme.altaEmpleado("1111", "Martinez", 1800));
		System.out.println(pyme.altaEmpleado("2222", "Jimenez", 1100));
		System.out.println(pyme.altaEmpleado("3333", "Gutierrez", 2000));
		System.out.println(pyme.altaEmpleado("4444", "Ramirez", 2100));
		System.out.println(pyme.altaEmpleado("5555", "Justinez", 3000));
		System.out.println(pyme.altaEmpleado("6666", "Maltez", 5000));

		System.out.println("\n" + "////////Nomina completa de empleados//////////");
		pyme.mostrarEmpleado();
		System.out.println("\n" + "////////Dando de Baja al empleado//////////");
		System.out.println(pyme.bajaDeEmpleado("0000"));
		System.out.println(pyme.bajaDeEmpleado("4444"));
		System.out.println("\n" + "////////Reporte como va quedando//////////");
		pyme.mostrarEmpleado();
		System.out.println("\n" + "////////Dando de Baja al empleado, eficiente//////////");
		// System.out.println(pyme.bajaDeEmpleadoEficienteD("4444"));
		// System.out.println(pyme.bajaDeEmpleadoEficienteD("2222"));
		System.out.println("\n" + "////////Reporte como va quedando//////////");
		pyme.mostrarEmpleado();

		System.out.println();
		System.out.println("Cantidad De vacantes: " + pyme.cantVacantes());
		System.out.println("Sueldo Total de todos: " + pyme.sueldoTotal());
		pyme.desplazarTodoLosNullALaDerecha();
		pyme.mostrarEmpleado();

	}

}
