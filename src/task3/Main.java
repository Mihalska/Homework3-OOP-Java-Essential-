package task3;

public class Main {
    public static void main(String[] args) {

    Plane plain = new Plane() ;
    Ship ship = new Ship() ;
    Car car = new Car() ;
        System.out.println("Інформація про літак:"+ "\nціна "+ plain.price + "; швидкість "+plain.speed + "; рік випуску " + plain.age +"; висота "+  plain.height +"; кількість пасажирів " +plain.numberPassengers + "." );
        System.out.println("Інформація про корабель:" + "\nціна "+ ship.price + "; швидкість "+ship.speed + "; рік випуску " + ship.age + "; кількість пасажирів " + ship.numberPassengers + "; порт " + ship.port  + "." );
        System.out.println("Інформація про машину:"+ "\nціна "+ car.price + "; швидкість "+ car.speed + "; рік випуску " + car.age  + "." );
}
}
