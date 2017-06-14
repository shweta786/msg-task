import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Sender {
	  String u_id;
	  Message msg;
	  static ArrayList<Message> MsgList;
	private Scanner sc;
	  
     public Sender(String uid, ArrayList<Message> Ms)                //constructor for sender class
     {
    	 MsgList=Ms;
    	 this.u_id=uid;
    	 this.msg=makeMsgObject();
    	 addMethod();
     }
     
     public Message makeMsgObject()					//function for making object of Message class
     {
    	 int time;
    	 String txt;
    	 String uid;
    	 
    	 sc = new Scanner(System.in);			//Input stream for taking user input
    	 
    	 System.out.println("enter timestamp for msg");
    	 time=sc.nextInt();
    	 System.out.println("enter msg-text for msg");
    	 txt=sc.next();
    	 uid=this.u_id;
    	 
    	 return new Message(time,txt,uid);
     }
     
     public void addMethod()   //to add msg objct in msgLIST
     {
    	 MsgList.add(this.msg);
     }
     
     public void sortMsg()            //sorting msglist by timestamp
     {
    	 Collections.sort( MsgList, new Comparator<Message>()              
    	{
    	  @Override													//overriding compare method
    	   public int compare(Message msg1, Message msg2)
    	   {
    		  return Integer.compare(msg1.timestamp,msg2.timestamp);   //using compare function to compare 2 timestamp
    	   }
    	});
 
     }
     
     public void groupMsg()                //grouping msg according to uid
     {
    	 HashMap<String,ArrayList<Message>> hm=new HashMap<String,ArrayList<Message>>();  //using hashmap for grouping by key-value pair
    	 if(!hm.containsKey(msg.Uid))           //checking whether any value exists for a particular key
    	 {
    		 ArrayList<Message> al=new ArrayList<Message>();
    		 al.add(msg);
    		 
    		 hm.put(msg.Uid, al);         //adding in hashmap
    	 }
    	 else
    		hm.get(msg.Uid).add(msg);        
    	 
     }
     
     
     
}
