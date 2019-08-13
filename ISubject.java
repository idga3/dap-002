public interface ISubject {
	
	public void AddObserver(User O);
	public void DeleteObserver(User O);
	public void Notify(String user, String msg);
}