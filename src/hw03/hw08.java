package hw03;
public class hw08
{
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();
		
		int number = 1234;
		double gasoline = 20.5;
		
		car1.setNumGas(number,gasoline);
	}
}

/*class Car
{
	int num;
	double gas;
	void setNumGas(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("車號是" + num + "汽油量是" + gas);
	}
	void setGas(double g)
	{
		gas = g;
		System.out.println("車號是" + gas);
	}
	void show()
	{
		System.out.println("車號是" + this.num);
		System.out.println("汽油量是" + this.gas);
	}
	void showCar()
	{
		System.out.println("開始顯示車輛資訊");
		this.show();
	}
}