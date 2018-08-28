package study2;
class Room
{
	private int i;
	public void display()
	{
		System.out.println(i);
	}
	public Room()
	{
		i=5;
	}
}
public class ex1 {

	public static void main(String[] args) {
	Room r1=new Room();
	r1.display();

	}

}
