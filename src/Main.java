import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		Alumno alumno1 = new Alumno("Sergio", 24, "Java", 8.5);
		Alumno alumno2 = new Alumno("Alberto", 28, "PHP", 5.5);
		Alumno alumno3 = new Alumno("Anna", 29, "Python", 7.5);
		Alumno alumno4 = new Alumno("Mireia", 15, "Java", 7);
		Alumno alumno5 = new Alumno("Manuel", 16, "Angular", 9);
		Alumno alumno6 = new Alumno("Victor", 16, "React", 6);
		Alumno alumno7 = new Alumno("Andrea", 13, "Python", 8.5);
		Alumno alumno8 = new Alumno("Asier", 15, "PHP", 3);
		Alumno alumno9 = new Alumno("Alicia", 15, "Java", 7.5);
		Alumno alumno10 = new Alumno("Noah", 13, "React", 5);
		
		List<Alumno> alumnos = new ArrayList<>(Arrays.asList(alumno1, alumno2, alumno3, alumno4, alumno5, alumno6, alumno7, alumno8, alumno9, alumno10));
		
		//Paso 1: Mostrar nombre y edad:
		System.out.println("PASO1: ");
		alumnos.forEach(alumno->{
			System.out.println("Nombre: " + alumno.getName() + ", edad: " + alumno.getAge());
		});

		//Paso 2: Filtrar los que comiencen con 'A', asignarlo a otra lista e imprimirlo
		
			//En un paso:
		System.out.println("\nPASO 2: Directamente sin pasarlo a List: ");
		alumnos.stream().filter(alumno->alumno.getName().startsWith("A"))
				.collect(Collectors.toList()).forEach(System.out::println);
		
			//Convirtiéndolo a otra List:
		System.out.println("\nPASO 2: Pasándolo a List: ");
		List<Alumno> alumnosEmpiezanPorA = alumnos.stream().filter(alumno->alumno.getName().startsWith("A"))
				.collect(Collectors.toList());
		alumnosEmpiezanPorA.forEach(System.out::println);
		
		
		//Paso 3: Filtrar los que tengan más de un 5:
		System.out.println("\nPASO 3: ");
		alumnos.stream()
			.filter(alumno->alumno.getMark()>=5)
			.collect(Collectors.toList())
			.forEach(System.out::println);
		
		//Paso 4: Filtrar los que tengan más de un 5 y que no hagan PHP
		System.out.println("\nPASO 4: ");
		alumnos.stream().filter(alumno->alumno.getMark()>=5)
			.filter(alumno->!alumno.getRoute().equalsIgnoreCase("PHP"))
			.forEach(System.out::println);
		
		//Paso 5: Filtrar los que hagan JAVA y sean mayores de edad: 
		System.out.println("\nPASO 5: ");
		alumnos.stream().filter(alumno->alumno.getRoute().equalsIgnoreCase("Java"))
			.filter(alumno->alumno.getAge()>=18).forEach(System.out::println);
	}
}
