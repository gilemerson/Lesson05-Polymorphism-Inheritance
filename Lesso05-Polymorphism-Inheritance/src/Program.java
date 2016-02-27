
public class Program {

	public static void main(String[] args) {
		Student student = new Student("Gil", 22, 72, 175, "555 555 555", "200186807");
		
		student.eats();
		student.setAddress("55", "Gil Dr.", "Stayner", "On");
		System.out.println("\n");
		System.out.println(student.getAddress());
	
		student.changeAddress("44", "Emerson Dr.", "Stayner", "On");
		System.out.println("\n");
		System.out.println(student.getAddress());

		student.addCourse("COMP101", "Programming Fundamentals", "Programming Course", 600);
		student.addCourse("COMP102", "Programming Design", "Programming Course", 650);
		//student.dropCourse("Programming Design"); //Delete a Course
		//student.dropCourse("Programming Fundamentals"); //Delete a Course
		System.out.println(student.toString());
	}

}
