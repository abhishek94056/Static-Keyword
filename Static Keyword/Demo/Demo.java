package Demo;

public class Demo {

	public static void main(String[] args) {
		
		IDcard.batchCode = 1217;
		IDcard.batchCode = 1235;
		IDcard.batchCode = 1218;
		IDcard.batchCode = 1200;
		IDcard.show();
		IDcard i = new IDcard();
		i.display();
		System.out.println(IDcard.batchCode);
	}
}