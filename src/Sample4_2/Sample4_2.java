package Sample4_2;

public class Sample4_2
{
    public static void main(String[] args)
    {
        RacingCar rccar1 = new RacingCar(1234, 20.5, 5);

        rccar1.setCar(1234, 20.5);
        
        rccar1.setCourse(5);
    }

}


class Car
{
    private int num;
    private double gas;

    public Car(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("生產了車號為" + num + "，汽油量為" + gas);
    }

    public void setCar(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("將車號設為" + num + "，汽油量設為" + gas);
    }

    public void show()
    {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}

class RacingCar extends Car
{
    private int course;

    public RacingCar(int n, double g, int c)
    {
    	super(n,g);
        course = c;
        System.out.println("生產了編號為" + course +"的賽車");
    }

    public void setCourse(int c)
    {
        course = c;
        System.out.println("將賽車編號設為" + course);
    }
}
