import java.util.Scanner;


public class Midterm {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
	
		int repetion = 0; 
		int computerMaster; 
		String player1= ""; 
		String computerM; 
		
		
		System.out.println("Do want to a dice game! "); 
		System.out.println("Guess odd or even ");
		
		player1= input.next(); 
		
	

		
		do
{			
			computerMaster = 0 +(int)(Math.random()*6);
			
			switch(computerMaster)
			{
			
			case 1: computerM = "odd ";
				switch(player1){
				case "odd": System.out.println("You guess odd correctly! "); repetion++; 
				break; 
				case"even": System.out.println("You guess even, which is incorrect! "); repetion++; 
				break;
				}
			break;
			
			case 2: computerM = "even ";
				switch(player1){
				case"odd": System.out.println("You guess odd, which is incorrect!"); repetion++; 
				break;
				case"even ": System.out.println("You guess even correctly!"); repetion++;
				break;
					}
			break;
			
			}	
		}
		while ( repetion < 1 );
		
		System.out.println( "Thank you for playing!");
}
			
			
			
	
		
		
		
			
			
			
		
	}
	


