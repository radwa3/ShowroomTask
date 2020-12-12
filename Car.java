
public abstract class Car {
String carname ;
String brand ;
String model ;
int price ;
String bodytype;

public Car(String carname, String brand, String model, int price, String bodytype) {
	super();
	this.carname = carname;
	this.brand = brand;
	this.model = model;
	this.price = price;
	this.bodytype = bodytype;
}
public String getCarname() {
	return carname;
}
public void setCarname(String carname) {
	this.carname = carname;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getBodytype() {
	return bodytype;
}
public void setBodytype(String bodytype) {
	this.bodytype = bodytype;
}


public abstract void printSpecification();
public abstract void compareprice(int price);
}
