public class principal {
	public static void main(String[] args) {
		
		/* Creaci�n del chat */
		ChatRoom CR = new ChatRoom();
		
		/* Creaci�n de los usuarios */
		User Juan = new User("Juan", CR);
		User Maria = new User("Maria", CR);
		User Antonio = new User("Antonio", CR);
		
		CR.AddObserver(Juan);
		CR.AddObserver(Maria);
		CR.AddObserver(Antonio);
	}
}