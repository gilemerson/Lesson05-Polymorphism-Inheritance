//Resident SubClass of Person SuperClass

public class Resident extends Person {

	//Private Instance Variables
	protected String _SIN;
    protected Address _address;
	   
    //Getters & Setters
    public String getSIN(){
    	return this._SIN;
    }
    
    
    //Setter for Address
    public void setAddress(String streetNumber, String streetName, String cityName, String provinceName){
    	this._address = new Address(streetNumber, streetName, cityName, provinceName);
    }
    
    public void changeAddress(String streetNumber, String streetName, String cityName, String provinceName){
    	this._address.Change(streetNumber, streetName, cityName, provinceName);//change address
    }
    
    
    public String getAddress(){
    	try {
			return this._address.toString();
		} catch (Exception e) {
			return "Error: Address Not Initialized";
		}
    	
    }
    
    
	//Constructor
	Resident(String name, int age, int heightInInches, float _massInPounds, String SIN) {
		super(name, age, heightInInches, _massInPounds);
		this._SIN = SIN;
	}

}
