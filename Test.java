package coursework;
import java.util.Scanner;

class Student {
	String name;
	int year;
	String reg;
	String course;
}

class Details extends Student{
	
	public void display() {
		System.out.println("STUDENT NAME: " + name);
		System.out.println("YEAR OF STUDY: " + year);
		System.out.println("REGISTRATION NUMBER: " + reg);
		System.out.println("COURSE/PROGRAM: " + course);
		
	}
}

public class Test {

	public static void main(String[] args) {
		String q1 = " How many primitive data types has JAVA ?\n"
				+ "\n"
				+ "(a). 6\n"
				+ "(b). 7\n"
				+ "(c). 8\n"
				+ "(d). 9\n";
		String q2 = " What is the size of float and double in Java ?\n"
				+ "\n"
				+ "(a). 32 and 64\n"
				+ "(b). 32 and 32\n"
				+ "(c). 64 and 64\n"
				+ "(d). 64 and 32\n";
		String q3 = " Select the valid statement to declare and initialize anarray\n"
				+ "\n"
				+ "(a). int[] A = {}\n"
				+ "(b). int[] A = {1, 2, 3}\n"
				+ "(c). int[] A = (1, 2, 3)\n"
				+ "(d). int [][] A = {1, 2, 3}\n";
		String q4 = " What is OOP in full ?\n"
				+ "\n"
				+ "(a). Object Oriented Programmer \n"
				+ "(b). Object Oriented Printer \n"
				+ "(c). Object Oriented Programming \n"
				+ "(d). Object Oriented Planning \n";
		String q5 = " Find the output of the following code \n"
				+ "public class Solution{\n"
				+ "       public static void main(String[] args){\n"
				+ "                     byte x = 127;\n"
				+ "                     x++;\n"
				+ "                     x++;\n"
				+ "                     System.out.print(x);\n"
				+ "       }\n"
				+ "}\n"
				+ "\n"
				+ "(a).	Compile error \n"
				+ "(b). Throws exception \n"
				+ "(c). I \n"
				+ "(d). 24 I \n";
		
		Question [] questions = {
				new Question(q1, "c"),
				new Question(q2, "a"),
				new Question(q3, "b"),
				new Question(q4, "c"),
				new Question(q5, "a")
		};
		
		takeTest(questions);
	}
	
	public static void takeTest(Question [] questions) {
		Details stud = new Details();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = sc.nextLine();
		System.out.println("Please enter your registration number");
		String reg = sc.nextLine();
		System.out.println("Please enter your year of study");
		int year = sc.nextInt();
		System.out.println("Please enter your program");
		String course = sc.next();
		
		System.out.println("Welcome to the Kabale University Online Test Platform\n");
		
		System.out.println("Would you like to comtinue taking the test ?[Type y for yes and n for no]");
		String opt = sc.next();
		
		stud.name = name;
		stud.year = year;
		stud.reg = reg;
		stud.course = course;
		
		if(opt.equals("n")) {
			stud.display();
			System.out.println("\n........Bye bye........");
		}else if(opt.equals("y")) {
			int score = 0;
			for(int i = 0; i<questions.length; i++) {
				
				Scanner sc1 = new Scanner(System.in);
				
				System.out.println(questions[i].prompt);
				
				String answer = sc1.nextLine();
				
				if(answer.equals(questions[i].answer)) {
					System.out.println("You gat that right\n");
					score ++;
				}else {
					System.out.println("Ooopus, You failed that !!\n");
				}
				
			}
			stud.display();
			
			if(score >= 50) {
				System.out.println("Hei ," + name + ", You gat " + score + " /" + questions.length);
				System.out.println("\nYou are promoted to the next level");
			}else {
				System.out.println("\nYou are advised to retake OOP course unit next semester");
			}
			
			
		}	
	}

}


