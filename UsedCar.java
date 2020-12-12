
public class UsedCar extends Car{
	String kilometer;
	String year ;
	String owner ;
	String ownername;
	int ownernumber ;
	
public UsedCar(String carname, String brand, String model, int price, String bodytype,
		String kilometer,String year,String owner  ,String ownername,int ownernumber) {
		super(carname, brand, model, price, bodytype);
		this.kilometer=kilometer;
		this.year=year;
		this.owner=owner;
		this.ownername=ownername;
		this.ownernumber=ownernumber;
		// TODO Auto-generated constructor stub
	}

public String getKilometer() {
	return kilometer;
}

public void setKilometer(String kilometer) {
	this.kilometer = kilometer;
}

public String getYear() {
	return year;
}

public void setYear(String year) {
	this.year = year;
}

public String getOwner() {
	return owner;
}

public void setOwner(String owner) {
	this.owner = owner;
}

public String getOwnername() {
	return ownername;
}

public void setOwnername(String ownername) {
	this.ownername = ownername;
}

public int getOwnernumber() {
	return ownernumber;
}

public void setOwnernumber(int ownernumber) {
	this.ownernumber = ownernumber;
}

@Override
public void printSpecification() {
	System.out.print("car name : "+this.carname+"\n"+"Car brand : "+this.brand+"\n"+"car model : "+this.model+"\n"+"car price : "+this.price+"\n"+"car body type : "+this.bodytype+"\n"+
	"Kilometer : "+this.kilometer+"\n"+"year : "+this.year+"\n"+"car owner: "+this.owner+"\n"+"car owner name : "+this.ownername+"/n"+"car owner number : "+this.ownernumber+"\n");
	
	// TODO Auto-generated method stub
	
}

@Override
public void compareprice(int price) {
	// TODO Auto-generated method stub
	
	if (this.price==price || this.price<price)
		System.out.print("car name : "+this.carname+"\n"+"Car brand : "+this.brand+"\n"+"car model : "+this.model+"\n"+"car price : "+this.price+"\n"+"car body type : "+this.bodytype+"\n"+
	"Kilometer : "+this.kilometer+"\n"+"year : "+this.year+"\n"+"car owner: "+this.owner+"\n"+"car owner name : "+this.ownername+"/n"+"car owner number : "+this.ownernumber+"\n");
	else 
		System.out.print("not matched");
}


}
