import java.io.Console;
import java.util.Random;

public class main {

	public static void main(String[] args) {
		
		int snakeEyes = 2;
		int nbLances = rollDice(snakeEyes);
		System.out.println("Nombre de lancés : " + nbLances);
		
	}
	
	public static int rollDice(int numberToRoll){
		
		String errorMessage = "Number to roll for is out of range";
		int min = 1;
		int max = 6; 
		int dice_1 = 0;
		int dice_2 = 0;
		Random rand_1 = new Random();
		Random rand_2 = new Random();
		int cpt = 0;
		
		while(dice_1 + dice_2 != numberToRoll){
			dice_1 = rand_1.nextInt(max - min + 1 ) + min;
			dice_2 = rand_2.nextInt(max - min + 1 ) + min; 
			cpt++;
		}
		if((numberToRoll < 2) || (numberToRoll > 12)){
			IllegalArgumentException e = new IllegalArgumentException(errorMessage);
			throw e;
		}
		
		return cpt;
		
	}

}
