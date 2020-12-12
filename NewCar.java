
public class NewCar extends Car{
	String speed;
	
public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

public NewCar(String carname, String brand, String model, int price, String bodytype,String speed) {
		super(carname, brand, model, price, bodytype);
		this.speed=speed;
		
		// TODO Auto-generated constructor stub
	}

@Override
public void printSpecification() {
	System.out.print("Car name : "+this.carname+"\n"+"car barnd : "+this.brand+"\n"+"car Model : "+this.model+"\n"+"Car price : "+this.price+"\n"+"car body type : " +this.bodytype+"\n"+"car speed : "+this.speed+"\n");
	// TODO Auto-generated method stub
	
}

@Override
public void compareprice(int price) {
	// TODO Auto-generated method stub
	if (this.price==price || this.price<price)
		
System.out.print("Car name : "+this.carname+"\n"+"car barnd : "+this.brand+"\n"+"car Model : "+this.model+"\n"+"Car price : "+this.price+"\n"+"car body type : " +this.bodytype+"\n"+"car speed : "+this.speed+"\n");
	else 
		
System.out.print("not matched");

}



}
