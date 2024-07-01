
import java.util.Scanner;

interface busOperation{
	void availableSeat();
	void bookingSeat();
	void cancelBooking();
	
}

class format{
	public void bformat(busOperation bus){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your choice : ");
			System.out.println("1.Seat booking ");
			System.out.println("2.cancel booking ");
			System.out.println("3. Exit ");
			int choice = scanner.nextInt();
			
			switch(choice){
				case 1:
					bus.availableSeat();
					bus.bookingSeat();
					
				break;
				
				case 2:
					bus.availableSeat();
					bus.cancelBooking();
				break;
				
				case 3:
					System.out.println("Existing...");
					System.exit(0);
				break;
				
				default :
					System.out.println("Invalid Input");
			
			}
			
		}
}
class busAc implements busOperation{
	
	public int Aseat = 30;
	
	
	public void availableSeat(){
		
		System.out.println("Available Seats : "+Aseat);	
	}
	
	public void bookingSeat(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many seats you want ? ");
		int Nseats = scanner.nextInt();
		
		if(Nseats<Aseat){
			System.out.println("your seats are Successfully booking...");
			Aseat = Aseat-Nseats;
		}
		else{
			System.out.println("Not Available...");
		}
	}
	
	public void cancelBooking(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many seats you are cancel ? ");
		int Cseats = scanner.nextInt();
		Aseat = Aseat+Cseats;
	}
	
}

class busNonAc implements busOperation{

	public int Aseat = 50;
	public void availableSeat(){
		
		System.out.println("Available Seats : "+Aseat);	
	}
	
	public void bookingSeat(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many seats you want ? ");
		int Nseats = scanner.nextInt();
		
		if(Nseats<Aseat){
			System.out.println("your seats are Successfully booking...");
			Aseat = Aseat-Nseats;
		}
		else{
			System.out.println("Not Available...");
		}
	}
	
	public void cancelBooking(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many seats you are cancel ? ");
		int Cseats = scanner.nextInt();
		Aseat = Aseat+Cseats;
	}
}

class bus{
	
	
	public static void main(String[] args){
		busOperation busAc = new busAc();
		busOperation busNonAc = new busNonAc();
		format fm = new format();
		Scanner scanner = new Scanner(System.in);
		String Tchoice = scanner.nextLine();
		
		
		
		do{
			
			System.out.println("What type of bus you want : ");
			System.out.println("1. Ac ");
			System.out.println("2.Non Ac ");
			System.out.println("3.Exit ");
			System.out.println("Enter your choice : ");
			int Tychoice = scanner.nextInt();
			
			switch(Tychoice){
				case 1:
					fm.bformat(busAc);
					break;
					
				case 2:
					fm.bformat(busNonAc);
				break;
				
				case 3:
					System.exit(0);
					break;
					
				default:
					System.out.println("Invalid Address...");
				
			}
			
			scanner.nextLine();
			System.out.println("Do you want another transection : (y/n)");
			Tchoice = scanner.nextLine();
		}while(Tchoice.equalsIgnoreCase("y"));
		
	}
}




