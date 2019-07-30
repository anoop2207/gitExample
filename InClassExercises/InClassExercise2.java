package basic.java.program;

import java.util.Scanner;

public class InClassExercise2 {

	public static void main(String[] args) {
		Boolean flag = true;
		while(flag) {
			System.out.println("Enter a character from A-E");
			Scanner sc = new Scanner(System.in);
			String text = sc.nextLine().trim();
			if(text.length()!=1) {
				System.out.println("Invalid input");
			}else {
				char ch = text.toUpperCase().toCharArray()[0];
				InClassExercise2 inc2 = new InClassExercise2();
				System.out.println(inc2.fruitSelector(ch));
			}
			System.out.println("Exit? Press y to exit");
			String option = sc.nextLine();
			if(option.toUpperCase().equals("Y")) {
				flag= false;
			}
		}
		
		
	}
	public String fruitSelector(char ch) {
		switch(ch) {
		case 'A' :
			return "Apple";
		case 'B':
			return "Banana";
		case 'C':
			return "Cherries";
		case 'D':
			return "Dragon Fruit";
		case 'E':
			return "ElderBerry";
		default:
			return "No fruit selected";
		}
	}

}
