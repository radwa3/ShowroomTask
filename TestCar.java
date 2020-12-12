import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TestCar {
	public static void main(String[] args){
		
		ArrayList <NewCar> newcars =new ArrayList();
		ArrayList <UsedCar> usedcars=new ArrayList();
		
		String welcome= JOptionPane.showInputDialog("Welcome : "+"\n"+"to add new cars enter (+)"+"\n"+"to sell car enter ($) "+"\n"+"to view cars enter (#)");
		if (welcome.equals("+")){
			
		
		
			String cartype= JOptionPane.showInputDialog("for new cars enter 1 "+"\n"+"for used car enter 2 ");

		if (cartype.equals("1")){
				String  carname = JOptionPane.showInputDialog( "Enter Car Name : ");
				String brand = JOptionPane.showInputDialog( "Enter car brand : ");
				String model = JOptionPane.showInputDialog( "Enter car model : ");
				
				String price = JOptionPane.showInputDialog( "Enter car price : ");
				int carprice =Integer.parseInt(price);
				
				String bodytype = JOptionPane.showInputDialog( "Enter car body type : ");
				String speed = JOptionPane.showInputDialog( "Enter car speed : ");
				NewCar newcar=new NewCar( carname,  brand,  model,  carprice,  bodytype, speed);
				newcars.add(newcar);
				welcome= JOptionPane.showInputDialog("Welcome : "+"\n"+"to add new cars enter (+)"+"\n"+"to sell car enter ($) "+"\n"+"to view cars enter (#)");

			}
			else if(cartype.equals("2")){
				String  carname = JOptionPane.showInputDialog( "Enter Car Name : ");
				String brand = JOptionPane.showInputDialog( "Enter car brand : ");
				String model = JOptionPane.showInputDialog( "Enter car model : ");
				
				String price = JOptionPane.showInputDialog( "Enter car price : ");
				int carprice =Integer.parseInt(price);
				
				String bodytype = JOptionPane.showInputDialog( "Enter car body type : ");
				String  kilometer = JOptionPane.showInputDialog( "Enter Car used kilometer : ");
				String year = JOptionPane.showInputDialog( "Enter car year : ");
				String owner = JOptionPane.showInputDialog( "Enter car owner : ");
				String ownername = JOptionPane.showInputDialog( "Enter car owner name : ");
				
				String ownernumber = JOptionPane.showInputDialog( "Enter car owner number : ");
				int usedownernumber =Integer.parseInt(ownernumber);
				
				UsedCar usedcar=new UsedCar(carname,  brand,  model,  carprice,  bodytype,  kilometer
						, year, owner  , ownername, usedownernumber);
				usedcars.add(usedcar);
				welcome= JOptionPane.showInputDialog("Welcome : "+"\n"+"to add new cars enter (+)"+"\n"+"to sell car enter ($) "+"\n"+"to view cars enter (#)");

			}
		}
			

		
		if (welcome.equals("#")){
			for(int i=0;i<newcars.size();i++){
			newcars.get(i).printSpecification();
			}
			
			for(int i=0;i<usedcars.size();i++){
				usedcars.get(i).printSpecification();
				
			}
		}
			
		
		else if(welcome.equals("$")){
			String price = JOptionPane.showInputDialog("Enter price you want ");
			int price1 =Integer.parseInt(price);
			
			for(int i=0;i<newcars.size();i++){
				newcars.get(i).compareprice(price1);;
				}
			for(int i=0;i<usedcars.size();i++){
				usedcars.get(i).compareprice(price1);;
				
			}
			

		}
	

}}