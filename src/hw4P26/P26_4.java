package hw4P26;

public class P26_4 {
	public static void main(String[] args) {
		Car[] car;
		car = new Car[2];
		
		car[0] = new Car();
		car[1] = new RacingCar();
		
		for(int i=0;i<car.length;i++)
		{
			Class cl = car[i].getClass();
			System.out.println("第"+(i+1)+"個物件的類別是"+cl);
		}
	}
}
class Car
{
	 int num;
	 double gas;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
}
class Racing extends Car
{
	public RacingCar()
	{
		System.out.println("生產了賽車");
	}
}