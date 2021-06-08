
public class Alumno {

	private String name;
	private int age;
	private String route;
	private double mark;
	
	public Alumno(String name, int age, String route, double mark) {
		this.name = name;
		this.age = age;
		this.route = route;
		this.mark = mark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Alumno [name=" + name + ", age=" + age + ", route=" + route + ", mark=" + mark + "]";
	}
	
}
