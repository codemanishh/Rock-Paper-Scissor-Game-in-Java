import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;


public class game {
	public static void main(String [] args)
	{
		Scanner obj=new Scanner(System.in);
		int Min=1;
		int Max=3;
		int a=ThreadLocalRandom.current().nextInt(Min, Max + 1);  
        String p;
        String q = null;
        
        if(a==1)        p="ROCK";
        else if(a==2)	p="PAPER";
        else	        p="SCISSOR";
        
		
        
        System.out.println("Enter your entrry:\n 1.ROCK\n 2.PAPER \n 3.SCISSOR\n");
        int b=obj.nextInt();
        System.out.println("COMPUTER INPUT IS : "+p);
        if(b==1)        q="ROCK";
        if(b==2)		q="PAPER";
        if(b==3)	    q="SCISSOR";
        
        if(p.equals("ROCK"))
        { 	if(q.equals("ROCK"))
        		System.out.println("DRW");
        	if(q.equals("PAPER"))
        		System.out.println("YOU WON");
        	if(q.equals("SCISSOR"))
        		System.out.println("YOU LOOSE");
        	}
        else if(p.equals("PAPER"))
        { 	if(q.equals("ROCK"))
        		System.out.println("YOU LOOSE");
        	if(q.equals("PAPER"))
        		System.out.println("DRW");
        	if(q.equals("SCISSOR"))
        		System.out.println("YOU WON");
        	}
        else if(p.equals("SCISSOR"))
        { 	if(q.equals("ROCK"))
        		System.out.println("YOU WON");
        	if(q.equals("PAPER"))
        		System.out.println("YOU LOOSE");
        	if(q.equals("SCISSOR"))
        		System.out.println("DRAW");
        	}
            
	}
	
}
