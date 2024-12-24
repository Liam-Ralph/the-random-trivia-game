import java.util.*;
import java.io.*;
class TheRandomTriviaGame{
	public static void main(String[] args){
		//VARIABLES
		Scanner consoleScanner=new Scanner(System.in);
		String ansiRed="\u001B[31m";
		String ansiGreen="\u001B[32m";
		String ansiCyan="\u001B[36m";
		String ansiWhite="\u001B[37m";
		int score=0;
		String name="";
		//Questions and Answers
		List<String> questions=new ArrayList<String>();
		List<String> answers=new ArrayList<String>();
		questions.add("""
				When was the first-ever Wimbledon Championship?
				A 1877
				B 1895
				C 1720
				D 2034""");
		answers.add("A");
		questions.add("""
				Who invented Java?
				A Jack MacDonald
				B Taylor Jordans
				C James Gosling
				D Ronald McDonald""");
		answers.add("C");
		questions.add("""
				What nationality was Marco Polo?
				A Spanish
				B Venetian
				C Portuguese
				D Martian""");
		answers.add("B");
		questions.add("""
				What continent is Ghana in?
				A Europe
				B South America
				C Africa
				D Oceania""");
		answers.add("C");
		questions.add("""
				Who was the first person to reach the south pole?
				A Robert E. Peary
				B The polar bears
				C John Parker
				D Roald Amundsen""");
		answers.add("D");
		questions.add("""
				Who was the first American to go into space?
				A Alan Shepard
				B Carl Baker
				C Maxwell Dimitry
				D Buzz Lightyear""");
		answers.add("A");
		questions.add("""
				Which mammal doesn’t have vocal cords?
				A Bats
				B Cats
				C Giraffes
				D Platypuses""");
		answers.add("C");
		questions.add("""
				What year did the Titanic movie come out?
				A 1999
				B 1997
				C 1910
				D 2003""");
		answers.add("B");
		questions.add("""
				What is the largest city in Germany?
				A Hamburg
				B Berlin
				C Munich
				D Frankfurt""");
		answers.add("B");
		questions.add("""
				What is 10%12 (10 modulo 12)?
				A 2
				B 30 562
				C 5
				D 10""");
		answers.add("D");
		questions.add("""
				What’s the first letter on a typewriter?
				A Q
				B A
				C Z
				D E""");
		answers.add("A");
		questions.add("""
				What year did Iron Man come out?
				A 2010
				B 2000
				C 2014
				D 2008""");
		answers.add("D");
		questions.add("""
				What year was Walt Disney born?
				A 1885
				B 1207
				C 1901
				D 1950""");
		answers.add("C");
		questions.add("""
				Which actor voiced both Darth Vader and The Lion King's Mufasa?
				A Karl Hudson
				B Mark Jameson
				C John Carter
				D James Earl Jones""");
		answers.add("D");
		questions.add("""
				Who was the first person to reach the north pole?
				A Robert E. Peary
				B The polar bears
				C John Parker
				D Roald Amundsen""");
		answers.add("A");
		questions.add("""
				What is the rarest M&M color?
				A Red
				B Green
				C Brown
				D Purple""");
		answers.add("C");
		questions.add("""
				Which country was the Caesar salad invented in?
				A Italy
				B Mexico
				C Ancient Rome
				D Greece""");
		answers.add("B");
		questions.add("""
				Which NFL team holds the record for the most Super Bowl appearances?
				A New England Patriots
				B Green Bay Packers
				C Pittsburgh Steelers
				D Tampa Bay Buccaneers""");
		answers.add("A");
		questions.add("""
				What is the smallest country by population?
				A Tuvalu
				B China
				C Vatican City
				D Armenia""");
		answers.add("C");
		questions.add("""
				What animal is constitutionally protected in Florida?
				A Polar Bears
				B Pigs
				C Cows
				D Bald Eagles""");
		answers.add("B");
		questions.add("""
				Saudi Arabia imports camels from what country?
				A Yemen
				B China
				C Egypt
				D Australia""");
		answers.add("D");
		questions.add("""
				How many zodiac signs are there?
				A 13
				B 25
				C 12
				D 15""");
		answers.add("C");
		questions.add("""
				What color eyes do most humans have?
				A Brown
				B Blue
				C Green
				D Neon Orange""");
		answers.add("A");
		questions.add("""
				What country won the very first FIFA World Cup in 1930?
				A Uruguay
				B USA
				C England
				D Brazil""");
		answers.add("A");
		questions.add("""
				Which bone are babies born without?
				A Skull
				B Spine
				C Femur
				D Kneecap""");
		answers.add("D");
		questions.add("""
				How many hearts does an octopus have?
				A 3 000
				B 1
				C 3
				D 0""");
		answers.add("C");
		questions.add("""
				How many eyes does a bee have?
				A 3
				B 5
				C 2
				D 8""");
		answers.add("B");
		questions.add("""
				What is the name of Jordan’s capital city?
				A Kabul
				B Istanbul
				C Islamabad
				D Amman""");
		answers.add("D");
		questions.add("""
				What is the capital of Italy?
				A Venice
				B Rome
				C Florence
				D Verona""");
		answers.add("B");
		questions.add("""
				What was the answer to the first question?
				A
				B
				C
				D""");
		answers.add("A");
		//INTRO
		clearScreen();
		System.out.println(ansiCyan+"""
				Welcome to The Random Trivia Game!
				Answer random trivia and attempt
				to get on the leaderboard. There
				are 30 questions, and the game
				stops once you get a question wrong.
				Press ENTER to begin."""+ansiWhite);
		consoleScanner.nextLine();
		clearScreen();
		//SETTING NAME
		System.out.println(ansiCyan+"Please enter your name (max 10 characters)."+ansiWhite);
		boolean done=false;
		while(done==false){
			String inputName=consoleScanner.nextLine();
			if(inputName.length()<3){
				System.out.println("Too short");
				continue;
			}
			for(int i=0; i<10 && i<inputName.length(); i++){
				char piece=inputName.charAt(i);
				piece=Character.toUpperCase(piece);
				name=name+piece;
			}
			done=true;
		}
		System.out.println(ansiCyan+"Your name: "+name);
		System.out.println("""
				Inappropriate names will be removed.
				Press ENTER to continue."""+ansiWhite);
		consoleScanner.nextLine();
		clearScreen();
		//TRIVIA GAME
		for(int i=0; i<30; i++){
			System.out.println(questions.get(i));
			String answer=consoleScanner.nextLine();
			if(answer.equals("")){
				answer="z";
			}
			char piece=answer.charAt(0);
			piece=Character.toUpperCase(piece);
			String newAnswer=String.valueOf(piece);
			if(newAnswer.equals(answers.get(i))){
				System.out.println(ansiGreen+"Correct");
				System.out.println(ansiCyan+"Press ENTER to continue.");
				consoleScanner.nextLine();
				clearScreen();
				score+=1;
			}else{
				System.out.println(ansiRed+"WRONG! You lose! :(");
				System.out.println(ansiCyan+"Press ENTER to continue.");
				consoleScanner.nextLine();
				clearScreen();
				break;
			}
		}
		consoleScanner.close();
		System.out.println("Game Over");
		System.out.println("Your Score: "+score);
		try{
			Scanner fileScanner=new Scanner(new File("leaderboard.txt"));
			String firstName=fileScanner.nextLine();
			int firstScore=fileScanner.nextInt();
			fileScanner.nextLine();
			String secondName=fileScanner.nextLine();
			int secondScore=fileScanner.nextInt();
			fileScanner.nextLine();
			String thirdName=fileScanner.nextLine();
			int thirdScore=fileScanner.nextInt();
			if(score>=firstScore){
				thirdScore=secondScore;
				thirdName=secondName;
				secondScore=firstScore;
				secondName=firstName;
				firstScore=score;
				firstName=name;
				System.out.println(ansiGreen+"You got first place!!!"+ansiWhite);
			}else if(score>=secondScore){
				thirdScore=secondScore;
				thirdName=secondName;
				secondScore=score;
				secondName=name;
				System.out.println(ansiGreen+"You got second place!!"+ansiWhite);
			}else if(score>=thirdScore){
				thirdScore=score;
				thirdName=name;
				System.out.println(ansiGreen+"You got third place!"+ansiWhite);
			}else{
				System.out.println(ansiRed+"You aren't on the leaderboard."+ansiWhite);
			}
			String leaderboard=(firstName+"\n"+firstScore+"\n"+
								secondName+"\n"+secondScore+"\n"+
								thirdName+"\n"+thirdScore);
			System.out.println(leaderboard);
			PrintStream fileWriter=new PrintStream("leaderboard.txt");
			fileWriter.println(leaderboard);
			fileScanner.close();
			fileWriter.close();
		}catch (FileNotFoundException e){
			System.out.println(ansiCyan+"Sorry, there was an error getting the leaderboard."+ansiWhite);
		}
	}
	public static void clearScreen(){
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}
