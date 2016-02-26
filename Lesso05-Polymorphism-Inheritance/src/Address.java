//Address Class//
public class Address {
	//Private Instance Variables
	private String _streetNumber;
	private String _streetName;
	private String _cityName;
	private String _provinceName;
	private Boolean _hasChanged= false;
		
	//Constructor
	Address(String streetNumber, String streetName, String cityName, String provinceName){
		this._set(streetNumber, streetName, cityName, provinceName);//private methods to change address
	}
	
	
	@Override
	public String toString(){
		String output = "";
		if(this._hasChanged){
			output += "New Address: \n";
		}
		else{
		  output += "Address: \n";
		}
		System.out.println();		
		output += "-------------------------------- \n";	
		output += this._streetNumber + " " + this._streetName + "  \n";
		output += this._cityName +", " + this._provinceName + "\n";
		return output;		
	}
	 
	//void doesn't return anything
	//now I want to change my address incase I move
	public void Change(String streetNumber, String streetName, String cityName, String provinceName){
		this._set(streetNumber, streetName, cityName, provinceName);//private methods to change address
    	this._hasChanged = true;
	}
		
	
	//private methods to change address throughout
	private void _set(String streetNumber, String streetName, String cityName, String provinceName){
		this._streetNumber = streetNumber;
		this._streetName = streetName;
		this._cityName= cityName;
		this._provinceName = provinceName;  
		}
	
}

