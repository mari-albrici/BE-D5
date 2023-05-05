package multimediaEntities;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Choose a song and declare its duration: ");
//		
//		Audio elementOne = new Audio(input.nextLine(), input.nextInt());
//		
//		elementOne.volumeUp();
//		elementOne.volumeUp();
//		elementOne.volumeUp();
//		
//		elementOne.play();
		
//		System.out.println("Choose a movie and declare its duration: ");
//		
//		Video elementTwo = new Video(input.nextLine(), input.nextInt());
//		
//		elementTwo.volumeUp();
//		elementTwo.volumeUp();
//		elementTwo.volumeUp();
//		
//		elementTwo.brightnessDown();
//		
//		elementTwo.play();
		
		System.out.println("Choose a picture: ");
		
		Image elementThree = new Image(input.nextLine());
		
		elementThree.brightnessUp();
		elementThree.brightnessUp();
		elementThree.brightnessUp();
		
		elementThree.show();
		
		
		input.close();
	}

}
