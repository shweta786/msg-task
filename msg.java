class Message
{
   int timestamp;
	String text;
	String Uid;
	Message(int t, String txt, String id)
	{
	   this.timestamp=t;
	   this.text=txt;
	   this.Uid= id;
	}
}

class Sender
{

  String u_id; Message msg;
  Sender(String uid)
  {
	this.u_id= uid;
	this.msg=makeMsgObj();
  }

  Message makeMsgObj() throws IOException
  {
	int time=System.in();
	String txt=System.in();
	String id= Systemin();
	return new Message(time,txt,id);
	
  }

  void addMethod(ArrayList MsgList, Message msg)
  {
	MsgList.add(msg);	
  }

  void sortMsg(ArrayList MsgList)
  {
	Collection.sort(MsgList, new Comparator<msg>()
	{ 
	  @override
	  public int compare(msg msg1, msg msg2)
	  {
            return msg1.timestamp.compareTo(msg2.timestamp);
	  }
	}

	);
  }
  
  void grupMsg(ArrayList MsgList, Message msg)
  {
	HashMap<String, List<uid>>hashMap=new HashMap<String,List<uid>>();

        if(!hashMap.containskey(Uid))
	{
	   List<uid>List=new ArrayList<uid>();
	   list.add(msg);
	   hashMap.put(Uid,List);
	}

	else
	 hashMap.get(uid).add(msg);
  }


   public static void main(String args[]) throws IoException
   {
	new Sender(System.in());
        ArrayList<Message>MsgList=new ArrayList<Message>();
         addMethod(MsgList,this.msg);
 	 sortMsg(MsgList);
	 grupMsg(MsgList,msg);
   }


}