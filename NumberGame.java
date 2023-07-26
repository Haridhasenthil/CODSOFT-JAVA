import java.util.*;
public class Task {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=1;
        int b=100;
       // System.out.println("The random number between 1 to 100:");
        double c=Math.random()*(b-a+1)-a;
        int d=(int)c;
       //System.out.println((c));       
        int n=5;
        //for(int j=1;j<=3;j++)
        //{
        	//System.out.println("Round "+j);
        for(int i=0;i<n;i++)
        {
        	System.out.println("Guess the number:");
        	int f=sc.nextInt();
        	int k=0;
        	if(d==f)
        	{
        		System.out.println("**** congrats,You win the game ****");
        		k+=10;
        		System.out.println("your score is "+k);
        		break;       		
        	}
        	else if(d<f)
        	{
        		int near1=d+5,near2=d-5;
        		if(f<near1 && f>near2)
        		{
        		   System.out.println("**** you are near to the number ****");
        		}
        		else
        			System.out.println("you are to high ");
        	}		
        	else
        	{
        		int near3=d+5,near4=d-5;
        		if(f<near3 && f>near4)
        		    System.out.println(" **** you are near to the number ****");
        		else
        			System.out.println("you are to low");
        	}
            if(i==4)
            {
        	   System.out.println("You lost the game,try again later");
            }
        }
        //}
        System.out.println("Actually the number is:"+d);        
	}        
}
