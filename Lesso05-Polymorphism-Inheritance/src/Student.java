import java.util.ArrayList;

//Student Class

//Student class is composition of courses class 
public class Student extends Resident {
	//Private Instance Variables
	private String _studentID;
	//Course Array List 
	private ArrayList<Course> _courses = new ArrayList<Course>();
	
	
	//Constructor
	Student(String name, int age, int heightInInches, float _massInPounds, String SIN, String studentID) {
		super(name, age, heightInInches, _massInPounds, SIN);
		this._studentID = studentID;		
	}

	//Add Courses Method
	public void addCourse(String courseCode, String courseName, String courseDescription, double courseCost){
		this._courses.add(new Course(courseCode, courseName, courseDescription, courseCost));
	}
	
	//Enhanced for loop
	public void dropCourse(String courseName){ 
		int index = -1;
		
		//remove course
		for (Course course : this._courses) {
			if(course.getName() == courseName){
				index = this._courses.indexOf(course);
				
			}
		}	
		
		if(index>=0){
		this._courses.remove(index);	
		}
	}
		
	
	@Override
	public String toString() {
		String output = "";
		output+= "StudentName: " + this._name + " StudentID: " + this._studentID + "\n";
		//Check to see if a course is entered
		if(this._courses.size()>0){
			output += "Courses \n";
		    output += "----------------------------------\n";
		
		for (Course course : this._courses) {
			output += course.getName() +  "\n";
		}
		output += "----------------------------------\n";				
	}
		return output;
  }		
}
