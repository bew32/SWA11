
public class Client {
	public static void main (String[] args) {
		Vehicle v = new Boat();
		Person p = new Person(v);
		p.drive();
	}
}