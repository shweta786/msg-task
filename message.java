
public class Message {
   int timestamp;
   String text;
   String Uid;
 
public Message(int time, String txt, String uid2) {
	// TODO Auto-generated constructor stub
	this.timestamp=time;
	   this.text=txt;
	   this.Uid=uid2;
}
@Override
public String toString() {
    return Uid + ", " + text + ", " + timestamp;
}
}
