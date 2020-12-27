package admit;
import java.util.*;

public class Admit 
{
	
	public static double Applicant(int student)                                                                    //function depending on which applicant it is
	   {
	      System.out.println("Information for applicant #"+student);
	      double examScore = ExamScore();                                                                          //catches returned value in ExamScore
	      double gpaScore = GpaScore();                                                                            //catches returned value in GpaScore
	      
	      double overallScore = examScore + gpaScore;                                                              //calculates applicants overall score
	      return overallScore;                                                                                     //returns overall score
	   }   
	   
	   public static double ExamScore()
	   {
	      Scanner input = new Scanner(System.in); 
	      
	      System.out.println("    Do you have \n    (1) SAT scores \n    or \n    (2) ACT scores?");
	      int exam = input.nextInt();                                                                              //user inputs which exam scores are going to be inputed
	      
	      if (exam == 1)
	      {  
	         return SatScores();                                                                                   //if inputed 1, user inputs SAT scores and the function returns the value from function SatScores
	      }
	      else if (exam == 2)
	      {
	         return ActScores();                                                                                   //if inputed 2, user inputs ACT scores and the function returns the value from function ActScores
	      }
	      else
	      {
	         System.out.println("Invalid exam type, enter again");                                                 //in case the user inputs an invalid exam type, the function is called again and the user is able to select exam type again
	         ExamScore();
	      } 
	      return ExamScore();                                                                                      //function will never reach this, it was typed to get rid of an error
	   }
	   
	   public static double SatScores()
	   {
	      Scanner input = new Scanner(System.in);
	   
	      System.out.println("   Please input your scores for");
	      System.out.print("      SAT Math: ");
	      int satMath = input.nextInt();                                                                           //corresponding scores are inputed by the user
	      System.out.print("      SAT Critical Reading: ");
	      int satRead = input.nextInt();
	      System.out.print("      SAT Writing: ");
	      int satWriting = input.nextInt();
	      
	      double score = ((2*satMath)+satRead+satWriting)/32.0;                                                    //calculates SatScore
	      System.out.printf("%n   Your exam score is: %.1f%n%n", score);                                           //prints Sat score rounded to 1 decimal place
	      
	      return score;                                                                                            //returns sore
	   }
	   
	   public static double ActScores()
	   {
	      Scanner input = new Scanner(System.in);
	   
	      System.out.println("   Please input your scores for");
	      System.out.print("      ACT English: ");
	      int actEnglish = input.nextInt();                                                                        //corresponding scores are inputed by the user
	      System.out.print("      ACT Math: ");
	      int actMath = input.nextInt();
	      System.out.print("      ACT Reading: ");
	      int actRead = input.nextInt();
	      System.out.print("      ACT Science: ");
	      int actScience = input.nextInt();
	      
	      double score = (actEnglish+(2*actMath)+actRead+actScience)/1.8;                                         //calculates ActScore
	      System.out.printf("%n   Your exam score is: %.1f%n%n", score);                                          //prints Act score rounded to 1 decimal place
	      
	      return score;                                                                                           //returns score
	   }
	   
	   public static double GpaScore()
	   {
	      Scanner input = new Scanner(System.in);
	      
	      System.out.println("   Please input your");
	      System.out.print("      GPA: ");
	      double gpa = input.nextDouble();                                                                        //corresponding values inputed by the user
	      System.out.print("      Transcript multiplier: ");
	      double transcriptMultiplier = input.nextDouble();
	      
	      double score = ((gpa/4.0)*transcriptMultiplier)*100;                                                    //calculates GPA Score
	      System.out.printf("%n   Your GPA score is: %.1f%n%n", score);                                           //prints GPA score rounded to 1 decimal place
	      
	      return score;                                                                                           //returns score
	   }
	   
	   public static void main(String[] args)
	   {
	      System.out.print("This program compares two applicants to\ndetermine which one seems like the stronger\n"+
	      	 "applicant. For each candidate I will need\neither SAT or ACT scores plus a weighted GPA.\n\n");
	      double applicant1 = Applicant(1);                                                                       //applies returned overall score to the variable
	      double applicant2 = Applicant(2);
	      
	      System.out.printf("First applicant's overall score = %.1f",applicant1);                                 //prints applicants overall score rounded to 1 decimal place
	      System.out.printf("%nSecond applicant's overall score = %.1f",applicant2);
	      
	      if (applicant1 > applicant2)
	      {
	         System.out.println("\nThe first applicant seems to be better.");                                     //prints this if the first applicants overall score is greater than the second applicants
	      }
	      else if (applicant1 < applicant2)
	      {
	         System.out.println("\nThe second applicant seems to be better.");                                    //prints this if the first applicants overall score is less than the second applicants
	      }
	      else
	      {
	         System.out.println("\nThe two applicants seem to be equal.");                                        //prints this if the first applicants overall score is neither less nor greater than the second applicants, concluding it would be equal
	      }
	   }
	}
