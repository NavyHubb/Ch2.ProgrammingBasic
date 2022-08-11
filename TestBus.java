package simulation;

public class TestBus {
    public static void main(String[] args) {
        //버스 2대 생성
        Bus bus1 = new Bus(1);
        Bus bus2 = new Bus(1);
        System.out.println();

        //승객 +2
        bus1.take(2);
        bus1.showOnboard();
        System.out.println();

        //주유량 -50
        bus1.changeOil(-50);
        bus1.showOil();
        System.out.println();

        //상태 변경(차고지행), 주유량 +10
        bus1.setStatus("차고지행");
        bus1.changeOil(10);
        System.out.println("상태: "+bus1.getStatus() +"\n현재 주유량: "+ bus1.getOil());

        //상태 변경(운행중)
        bus1.setStatus("운행중");
        System.out.println();

        //승객 +45
        bus1.take(45);
        System.out.println();

        //승객 +5
        bus1.take(5);
        bus1.showOnboard();
        System.out.println();

        //주유량 -55
        bus1.changeOil(-55);
        System.out.println("주유량: "+bus1.getOil());
        System.out.println("상태: "+bus1.getStatus());
        bus1.alertOil();

    }
}
