import java.util.ArrayList;

public class ChatRoom implements ISubject{
	
	ArrayList observadors; /* Lista de observadores */

	ChatRoom(){
		 observadors = new ArrayList();
	}
	    
	@Override
	public void AddObserver(User O){
		
		observadors.add(O);
	}
	@Override
	public void DeleteObserver(User O){
		
		observadors.remove(O);	
	}
	@Override
	public void Notify(String user, String msg){

		for(Object O:observadors){
			((User) O).Update(user,msg);
		}
	}	
	public void ReceiveMessage(String user, String msg){
		
		Notify(user,msg);
	}
}