import java.util.Random;
/**
 * Le programme simule le nombre de lances de des
 * necessaires pour atteindre une somme equivalente a un snake eyes (deux as)
 */
public class dice {
    
	public static void main(String[] args) {
		
		int snakeEyes = 2;
		int nbLances = rollDice(snakeEyes);
		System.out.println("Nombre de lances necessaires pour effectuer un snake eyes : " + nbLances);
		
	}
	/**
	 * La sous-routine simule un lance de deux des et enregistre 
	 * le nombre de lances effectues pour atteindre la somme rentree en parametre
	 *@param numberToRoll prends un entier en entree entre 2 et 12 
	 *@return retourne le nombre de lances de des necessaires afin d'atteindre la valeur specifiee en parametre
	 *@throws IllegalArgumentException si le parametre d'entree n'est pas compris entre 2 et 12
	 */
	public static int rollDice(int numberToRoll){
		
		String errorMessage = "Number to roll for is out of range";
		if((numberToRoll < 2) || (numberToRoll > 12)){
			IllegalArgumentException e = new IllegalArgumentException(errorMessage);
			throw e;
		}
		
		
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
			
		return cpt;
		
	}

}