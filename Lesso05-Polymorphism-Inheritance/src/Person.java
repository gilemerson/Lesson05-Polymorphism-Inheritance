//Super Class We Are Going To Use
//Person Class

public class Person {
private int _age;
private String _name;
private float _heightInInches;
private float _massInPounds;


//Constructor - 
Person(String name, int age, int heightInInches, float _massInPounds){
	this._name = name;
	this._age = age;
	this._heightInInches = heightInInches;
	this._massInPounds = _massInPounds;
	}

//Public Methods
public void eats(){
	System.out.println(this._name + "is eating");
}

public void walks(){
	System.out.println(this._name + "is walking");
}

public void speaks(){
	System.out.println(this._name + "is speakig");//Concatenate this._name + "is speaking"
}


}
