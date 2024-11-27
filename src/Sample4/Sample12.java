package Sample4;

public class Sample12 {
    public static void main(String[] args){
        iTransportation[] itp = new iTransportation[2];

        itp[0] = new Car(1234, 20.5);
        itp[1] = new Plane(232);

        for(int i = 0; i < itp.length; i++){
            itp[i].show();
        }
    }
}

interface iTransportation{
    int weight = 1000;
    void show();
}

class Car implements iTransportation{
    private int num;
    private double gas;

    public Car(int n, double g){
        num = n;
        gas = g;
        System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
    }
    public void show(){
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}

class Plane implements iTransportation{
    private int flight;
    public Plane(int f){
        flight = f;
        System.out.println("生產了" + flight + "班次的飛機");
    }
    public void show(){
        System.out.println("飛機的班次是" + flight);
    }
}