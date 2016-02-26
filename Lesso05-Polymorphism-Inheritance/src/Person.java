//Super Class We Are Going To Use
//Person Class

public class Person {
protected int _age;
protected String _name;
protected float _heightInInches;
protected float _massInPounds;


//Getters/Accessor's  & Setters/Mutators 
/**
 * @return the _age
 */
public int getAge() {
	return this._age;
}

/**
 * @param _age the _age to set
 */
public void setAge(int age) {
	this._age = age;
}

/**
 * @return the _name
 */
public String getName() {
	return this._name;
}

/**
 * @param _name the _name to set
 */
public void setName(String name) {
	this._name = name;
}

/**
 * @return the _heightInInches
 */
public float getHeightInInches() {
	return this._heightInInches;
}

/**
 * @param _heightInInches the _heightInInches to set
 */
public void setHeightInInches(float heightInInches) {
	this._heightInInches = heightInInches;
}

/**
 * @return the _massInPounds
 */
public float getMassInPounds() {
	return this._massInPounds;
}

/**
 * @param _massInPounds the _massInPounds to set
 */
public void setMassInPounds(float massInPounds) {
	this._massInPounds = massInPounds;
}



//-- Constructor -- 
Person(String name, int age, int heightInInches, float _massInPounds){
	this._name = name;
	this._age = age;
	this._heightInInches = heightInInches;
	this._massInPounds = _massInPounds;
	}

//Public Methods
public void eats(){
	System.out.println(this._name + " is eating");
}

public void walks(){
	System.out.println(this._name + " is walking");
}

public void speaks(){
	System.out.println(this._name + " is speakig");//Concatenate this._name + "is speaking"
}


}
