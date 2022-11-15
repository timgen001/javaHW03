package hw03;
public class hw09
{
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();
		car1.setNumGas(1234,20.5);
		int number = car1.getNum();
		double gasoline = car1.getGas();
		System.out.println("調查樣品車時得知");
		System.out.println("車號是" + number + ",汽油量是" + gasoline);
		
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