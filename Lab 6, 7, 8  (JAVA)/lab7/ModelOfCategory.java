package lab7;
import java.util.Scanner;
public class ModelOfCategory {
	
	public  static void  CarInfo(int option)
	{
		switching(option);
	}
	
	
	public static void switching(int option)
	{
		int carOpt=option;
		
		switch(carOpt)
		{
		case 1:
			System.out.println("Congratulation! you got TATA SAFARI");
			break;
		case 2:
			System.out.println("Congratulation! you got TATA INDIGO");
			break;
		case 3:
			System.out.println("Congratulation! you got TATA INDICA");
			break;
		case 4:
			System.out.println("Congratulation! you got TATA NANO");
			break;
		default:
				System.out.println("Your input is incorrect");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		ModelOfCategory Moc1 = null;
		
		System.out.println("Enter respective digit for your car models \n1.->SUV\n2.->SEDAN\n3.->ECONOMY\n4.->MINI");
		int CarOption= sc.nextInt();
		
		
		ModelOfCategory.switching(CarOption);
	}

}