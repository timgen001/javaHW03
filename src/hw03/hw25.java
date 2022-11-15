package hw03;
public class hw25
{
	public static void main(String[] args)
	{
		
		Car[] car1;
		car1 = new Car[3];
		for(int i=0;i<car1.length;i++)
		{
			car1[i] = new Car();
		}
		car1[0].setCar(1234, 20.5);
		car1[1].setCar(2345, 30.5);
		car1[2].setCar(3456, 40.5);
		for(int i=0;i<car1.length;i++)
		{
			car1[i].show();
		}
	}
}

class Car
{
	public static int sum = 0;
	private int num;
	private double gas;
	private String name;
	public Car()
	{
		num = 0;
		gas = 0.0;
		sum++;
		name = "沒有名稱";
		System.out.println("生產了車子");
	}
	public  void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車號為" + num +"汽油量為" + gas + "的車子");
	}
	public void setName(String nm)
	{
		name = nm;
		System.out.println("將車名設為" + name);
	}
	public static void showSum()
	{
		System.out.println("車子共" + sum +"台");
	}
	public void show()
	{
		System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
		System.out.println("車名是" + name);
	}
	
	
}