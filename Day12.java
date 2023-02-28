import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}
class Student extends Person{   // the Person class is already given, we need its features to be inherited by the student class.
	private int[] testScores;   // testScores will be used by the calculate method in the student class.

    public Student(String firstName, String lastName, int id, int testScores[]) //constructor for Student class
    {
        super(firstName,lastName,id); // Person is the super class which gets these 3 features, they can be inherited by our subclass 
        this.testScores=testScores;   // testScores was not in the super class, needs initialization with "this" keyword in subclass
    }
    char calculate()                 // this method is called in the locked stub code provided by hackerrank 
    {
        int sum=0;                    
        int avg;
        char grade;
        for(int i=0;i<testScores.length;i++) // loops all test scores
        {
            sum=sum+testScores[i];           // adds all test scores
        }
        
        avg = sum/testScores.length;         
        
        if(avg<=100 && avg>=90)             // everything below is logic for the provided grading scale.
        {
            grade = 'O';
        }
        else if(avg<90 && avg>=80)
        {
              grade = 'E';
        }
        else if(avg<80 && avg>=70)
        {
              grade = 'A';
        }
        else if(avg<70 && avg>=55)
        {
              grade = 'P';
        }
        else if(avg<55 && avg>=40)
        {
            grade = 'D';
        }
        else
        {
            grade = 'T';
        }
        return grade;                      
    }
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}
