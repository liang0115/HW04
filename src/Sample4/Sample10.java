package Sample4;

public class Sample10 {
    public static void main(String[] args){
        Transportation[] tp = new Transportation[2];

        tp[0] = new Car(1234, 20.5);
        tp[0].setSpeed(60);

        tp[1] = new Plane(232);
        tp[1].setSpeed(500);

        for(int i = 0; i < tp.length; i++){
            tp[i].show();
        }
    }
}

abstract class Transportation{
    protected int speed;
    public void setSpeed(int s){
        speed = s;
        System.out.println("將速度設為" + speed + "了");
    }
    abstract void show();
}

class Car extends Transportation{
    private int num;
    private double gas;

    public Car(int n, double g){
        num = n;
        gas = g;
        System.out.println("生產了車號為" + num + "汽油量為" + gas + "的車子");
    }
    public void show(){
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
        System.out.println("速度是" + speed);
    }
}

class Plane extends Transportation{
    private int flight;
    public Plane(int f){
        flight = f;
        System.out.println("生產了" + flight + "班次的飛機");
    }
    public void show(){
        System.out.println("飛機的班次是" + flight);
        System.out.println("速度是" + speed);
    }
}
