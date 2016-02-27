//Teacher Class
public class Teacher extends Resident implements SchoolID {
	private String _schoolID;
	//Constructor	
	Teacher(String name, int age, int heightInInches, float _massInPounds, String SIN) {
		super(name, age, heightInInches, _massInPounds, SIN);
		
	}
	@Override
	public void addSchool(String schoolName) {
		this._schoolID = schoolName;	
		
	}


}
