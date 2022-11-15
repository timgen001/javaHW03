package hw03;
public class hw12
{
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();
		car1.setNumGas(1234,20.5);
		car1.show();
		
		System.out.println("只變更車號");
		car1.setCar(2345);
		car1.show();
		
		System.out.println("只變更汽油量");
		car1.setCar(30.5);
		car1.show();
		
		
	}
}

/*class Car
{
	private int num;
	private double gas;
	public void setCar(int n)
	{
		num = n;
		System.out.println("車號是" + num);
	}
	public void setCar(double g)
	{
		gas = g;
		System.out.println("車號是" + gas);
	}
	public void setNumGas(int n,double g)
	{
		if(g>0&&g<100)
		{
			num = n;
			gas = g;
			System.out.println("車號是" + num + "汽油量是" + gas);
		}
		else
		{
			System.out.println("錯誤汽油量");
			System.out.println("無法變更汽油量");
		}
	}
	double getGas()
	{
		System.out.println("調查汽油量");
		return gas;
	}
	int getNum()
	{
		System.out.println("調查車號");
		return num;
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