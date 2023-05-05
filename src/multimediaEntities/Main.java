package multimediaEntities;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);

		
		System.out.println("Choose a song and declare its duration:");
		Audio elementOne = new Audio(input.nextLine(), input.nextInt());
		input.nextLine();
		
		System.out.println("Choose a movie and declare its duration:");
		Video elementTwo = new Video(input.nextLine(), input.nextInt());
		input.nextLine();
		
		System.out.println("Choose a painting:");
		Image elementThree = new Image(input.nextLine());
		
		System.out.println("Choose a movie and declare its duration:");
		Video elementFour = new Video(input.nextLine(), input.nextInt());
		input.nextLine();
		
		System.out.println("Choose a painting:");
		Image elementFive = new Image(input.nextLine());
		
		Object [] availableMedias = {elementOne, elementTwo, elementThree, elementFour, elementFive };
		
		System.out.println("Great! Now you have 5 available media to choose from. Type a number between 1 and 5 to view details or type 0 to exit the program.");
		
		int chosenElement = -1;
		
		String answers;
		
		while(chosenElement != 0) {
			
			chosenElement = input.nextInt();
			input.nextLine();
					
			switch(chosenElement) {
				
				case 1 : {
					System.out.println("Would you like to change the volume? Type y for yes and n for no.");
					
					if(input.nextLine() == "y") {
						
						System.out.println("Type + for volume up, type - for volume down.");
						
						
						if(input.nextLine() == "+" ) {
							for (int i = 0; i < 5; i++ ) {
								((Audio) availableMedias[0]).volumeUp();
							}
							((Audio) availableMedias[0]).play();
							break;
							
						} else if(input.nextLine() == "-" ) {
							for (int i = 0; i < 5; i++) {
								((Audio) availableMedias[0]).volumeDown();
							}
							((Audio) availableMedias[0]).play();
							break;
							
						}
						
					} else if(input.nextLine() == "n") {
						
						((Audio) availableMedias[0]).play();
						
						System.out.println("Type a number between 1 and 5 to choose another media or type 0 to exit the program.");
						
						chosenElement = input.nextInt();
					};
				}
				break;
				
				case 2: 
					System.out.println("Would you like to change the volume? Type y for yes and n for no.");
					answers = input.nextLine();
					if(answers == "y") {
						System.out.println("Type + for volume up, type - for volume down.");
						if(answers == "+" ) {
							((Video) availableMedias[1]).volumeUp();
						} else if(answers == "-" ) {
							((Video) availableMedias[1]).volumeDown();
						}
					} else if(answers == "n"){
						System.out.println("Would you like to change the brightness? Type y for yes and n for no.");
						if(answers == "y") {
							System.out.println("Type + for volume up, type - for volume down.");
							if(answers == "+" ) {
								((Video) availableMedias[1]).brightnessUp();
							} else if(answers == "-" ) {
								((Video) availableMedias[1]).brightnessDown();
							}
						} else if (answers == "n") {
							((Video) availableMedias[1]).play();
							System.out.println("Type a number between 1 and 5 to choose another media or type 0 to exit the program.");
							chosenElement = input.nextInt();
						}
					}
					
					break;
				
				case 3: 
					System.out.println("Would you like to change the brightness? Type y for yes and n for no.");
					answers = input.nextLine();
					if(answers == "y") {
						System.out.println("Type + for volume up, type - for volume down.");
						if(answers == "+" ) {
							((Image) availableMedias[2]).brightnessUp();
						} else if(answers == "-" ) {
							((Image) availableMedias[2]).brightnessDown();
						}
					} else {
						((Image) availableMedias[2]).show();
						System.out.println("Type a number between 1 and 5 to choose another media or type 0 to exit the program.");
						chosenElement = input.nextInt();
					};
					
					break;
				
				case 4: 
					System.out.println("Would you like to change the volume? Type y for yes and n for no.");
					answers = input.nextLine();
					if(answers == "y") {
						System.out.println("Type + for volume up, type - for volume down.");
						if(answers == "+" ) {
							((Video) availableMedias[3]).volumeUp();
						} else if(answers == "-" ) {
							((Video) availableMedias[3]).volumeDown();
						}
					} else if(answers == "n"){
						System.out.println("Would you like to change the brightness? Type y for yes and n for no.");
						if(answers == "y") {
							System.out.println("Type + for volume up, type - for volume down.");
							if(answers == "+" ) {
								((Video) availableMedias[3]).brightnessUp();
							} else if(answers == "-" ) {
								((Video) availableMedias[3]).brightnessDown();
							}
						} else if (answers == "n") {
							((Video) availableMedias[3]).play();
							System.out.println("Type a number between 1 and 5 to choose another media or type 0 to exit the program.");
							chosenElement = input.nextInt();
						}
					}
					
					break;
				
				case 5: 
					System.out.println("Would you like to change the brightness? Type y for yes and n for no.");
					answers = input.nextLine();
					if(answers == "y") {
						System.out.println("Type + for volume up, type - for volume down.");
						if(answers == "+" ) {
							((Image) availableMedias[4]).brightnessUp();
						} else if(answers == "-" ) {
							((Image) availableMedias[4]).brightnessDown();
						}
					} else {
						((Image) availableMedias[4]).show();
						System.out.println("Type a number between 1 and 5 to choose another media or type 0 to exit the program.");
						chosenElement = input.nextInt();
					};
					
					break;
				
				case 0: 
					System.out.println("Thank you for using my Media Player! Have a nice rest of your day :)");
					break;
					
				default:
					System.out.println("Number not available. Please choose a number between 1 and 5 or type 0 to exit the program.");
				}
		}
		
		input.close();
		
		
	}

}
