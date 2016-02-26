
public class Program {

	public static void main(String[] args) {
		Resident resident = new Resident("Gil", 22, 72, 175, "555 555 555");
		resident.eats();
		resident.setAddress("55", "Gil Dr.", "Stayner", "On");
		System.out.println("\n");
		System.out.println(resident.getAddress());
	
		resident.changeAddress("44", "Emerson Dr.", "Stayner", "On");
		System.out.println("\n");
		System.out.println(resident.getAddress());

	}

}
