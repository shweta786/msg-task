import java.util.ArrayList;
import java.util.Scanner;

public class helping {

	private static Scanner sc;

	public static void main(String args[])
	{
		ArrayList<Message> MsgList=new ArrayList<Message>();
		String i;
		int x=4;               //for number of users
		
		while(x--!=0)
		{
			System.out.println("Enter the id of sender");
			sc = new Scanner(System.in);
			i=sc.next();
			Sender sn= new Sender(i,MsgList);
			sn.sortMsg();
			sn.groupMsg();
		}
		 for(Message str: MsgList){                     //for printing array-list
			    System.out.println(str);
			     }
	}

	
}
