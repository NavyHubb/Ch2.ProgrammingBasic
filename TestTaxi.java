package simulation;

public class TestTaxi {
    public static void main(String[] args) {
        //택시 2대 생성
        Taxi taxi1 = new Taxi(1);
        System.out.println();
        Taxi taxi2 = new Taxi(1);
        System.out.println();

        //승객 +2
        taxi1.takeTaxi(2, "서울역", 2);
        System.out.println();

        //주유량 -80
        taxi1.changeOil(-80);

        //요금 결제
        taxi1.takeoffTaxi();
        System.out.println();

        //승객 +5
        taxi1.takeTaxi(5, "용산역", 12);
        System.out.println();

        //승객 +3
        taxi1.takeTaxi(3, "구로디지털단지역", 12);
        System.out.println();

        //주유량 -20
        taxi1.changeOil(-20);

        //요금결제
        taxi1.takeoffTaxi();
    }
}
