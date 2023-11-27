package HW4;

public class P41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car(1234, 20.5);
		car1.vshow();
		car1.mshow();
	}

}

interface iVehicle
{
	void show();
}

interface mVehicle
{
	void show();
}

class Car implements iVehicle, mVehicle
{
	private int num;
	private double gas;
	
	public Car(int n, double g) 
	{
		num = n;
		gas = g;
		System.out.println("將車號設為" +num+ ",汽油量設為" +gas+ "的車子");
	}
	
	public void vshow() 
	{
		System.out.println("車號是" +num);
		System.out.println("汽油量是" +gas);
	}
	
	public void mshow() 
	{
		System.out.println("車子的材料是鐵");
	}
}