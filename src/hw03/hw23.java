package hw03;
public class hw23
{
	public static void main(String[] args)
	{
		System.out.println("宣告car1");
		Car car1;
		car1 = new Car();
		car1.setCar(1234,20.5);
		System.out.println("宣告car2");
		Car car2;
		System.out.println("將car2指定給car1");
		car2 = car1;
		System.out.println("car1");
		car1.show();
		System.out.println("car2");
		car2.show();
		System.out.println("改變car1的相關資料");
		car1.setCar(2345,30.5);
		System.out.println("car1");
		car1.show();
		System.out.println("car2");
		car2.show();
	}
}

/*class Car
{
	public static int sum = 0;
	private int num;
	private double gas;
	public Car()
	{
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("生產了車子");
	}
	public  void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車號為" + num +"汽油量為" + gas + "的車子");
	}
	public static void showSum()
	{
		System.out.println("車子共" + sum +"台");
	}
	public void show()
	{
		System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
	}
	
	
}