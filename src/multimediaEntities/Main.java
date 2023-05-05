package multimediaEntities;

import java.util.Scanner;

public class Main {

	public void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Choose a song and declare its duration: ");
		
		Audio elementOne = new Audio(input.nextLine(), input.nextInt());
		
		elementOne.volumeUp();
		elementOne.volumeUp();
		elementOne.volumeUp();
		elementOne.volumeUp();
		
		elementOne.play();
		
		input.close();
	}

}
