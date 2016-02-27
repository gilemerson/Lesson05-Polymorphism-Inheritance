//Course Class
public class Course {
//Private Instance Variables
	private String _code;
	private String _name;
	private String _description;
	private double _cost;
	
	//Getter and Setters
	//read only method 
	public String getName(){
		return this._name;
	}

	//Constructor for Course
	public Course(String code, String name, String description, double cost) {
		super();
		this._code = code;
		this._name = name;
		this._description = description;
		this._cost = cost;
	}
	
}
