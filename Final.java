import java.util.*;
public class Main {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("*****WELCOME*****");
		System.out.println("Please Enter 1 for Dice Emulater ");
		System.out.println("Please enter 2 for Snake Water Gun");
		System.out.println();
    int Num1=12, Num2=8, Temp, GCD=0;
    
     float P = 1, R = 1, T = 1;

		int choice = sc.nextInt();
		 Random rand = new Random();
	
	
		switch(choice)
		{
		case 1:
		  System.out.println("Enter the number of dice: ");
		  
		  	

            int n = sc.nextInt();


       
       

           do 

        {

            System.out.println("The values on dice are: ");

            for(int i=0; i<n; i++)

                System.out.println(rand.nextInt(6)+1);

 

            System.out.println("Continue: true/false");

        } while (sc.nextBoolean() == true);

        sc.close();
			break;
			
		case 2:

		
		int com=rand.nextInt(100);
		System.out.println("Enter the number of matches,You want to Play");
		int match=sc.nextInt();
		int won=0;
		int loose=0;
		int draw=0;
		for(int i=0;i<match;i++) {
		System.out.println("Please enter s for snake,g for gun or w for water");
		char v = sc.next().charAt(0);
		System.out.println("You have entered: "+v);
		if(v=='s'|| v=='g' || v=='w'){
			
		//System.out.println("The computer has selected:"+com);
		{ 
			
		if(com<33) //Selected Snake
		      { com=115;
		      		char s=(char)com;
		      			System.out.println("Computer has choose: "+s);
		      		if(s==v)
		      			{
		      			System.out.println("The match has drawn");
		      			draw++;
		      			}
		      		else if(v==103)
		      			{
		      			System.out.println("You won the match:)");
		      			won++;
		      			}
		      		else if(v==119)
		      			{
		      			System.out.println("You loose the match:(");
		      			loose++;
		      			}
		      }
		
		else if(com>33 &com<66) //Selected Gun g=103, s=115, w=119
				{   com=103;
					char g=(char)com;
					System.out.println("Computer has choose: "+g);
					if(g==v)
		      			{
						System.out.println("The match has drawn");
		      			draw++;}
					else if(v==115)
		      			{
						System.out.println("You loose the match:(");
		      			loose++;}
		      		else if(v==119)
		      			{
		      			System.out.println("You won the match:)");
		      			won++;}
				}
		else if (com>66)  //Selected Water
				{   com=119;
					char w=(char)com;
					System.out.println("Computer has choose: "+w);
					if(w==v)
		      			{
						System.out.println("The match has drawn");
		      			draw++;}
					else if(v==103)
		      			{
						System.out.println("You loose the match:(");
		      			loose++;}
		      		else if(v==115)
		      			{
		      			System.out.println("You won the match:)");
		      			won++;}
				}
	
		
	}
		
}
		else
			System.out.println("Please Enter the valid input");
}	
		System.out.println("********************************");
		System.out.println("STATATICS :)");
		System.out.println("You Won :"+won);
		System.out.println("You loose :"+loose);
		System.out.println("Drawn :"+draw);
		System.out.println("********************************");
			break;
		
		default:
			System.out.println("Invalid Input");
			break;
		}
		
		}
	}
