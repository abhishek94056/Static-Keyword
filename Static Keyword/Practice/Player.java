package Practice;

public class Player {
	public String name;
	public static String Tname;
	public static int Tid;
	//name="abhi";
	public String team()
	{
//		System.out.println(name);
//		System.out.println(Tname);
		return name;

	}

	
	public static String member()
	{
		//System.out.println(name);
//		System.out.println(Tname);
//		System.out.println(Tid);
		Player.Tname="abhi";
		return Tname;
	}
	public Player(String Tname)
	{
		this.Tname = Tname;
		System.out.println(Tname);
	}
	
	


}
