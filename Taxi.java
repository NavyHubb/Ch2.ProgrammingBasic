package simulation;

public class Taxi extends Transit{
    int taxiNum;
    int additionalFee;
    String dest;
    int dist;
    int basicDist = 1;

    static int count = 100; //인스턴스 갯수
    int serialNo; //각 인스턴스 고유 번호
    {
        ++count; //인스턴스가 생성될 떄마다 count증가
        serialNo = count; //객체 고유 번호지정
    }

    public Taxi(int num) {
        this.taxiNum = serialNo;
        status = "일반";
        speed = 0;
        passengerNow = 0;
        this.fee = 3000;
        additionalFee = 1000;
        this.maxPassenger = 4;

        System.out.println("택시 번호: "+gettaxiNum());
        System.out.println("주유량: "+oil);
        System.out.println("상태: "+status);
    }

    public int gettaxiNum() {
        return taxiNum;
    }

    public void takeTaxi(int passenger, String str, int num) {
        if (status == "일반") {
            if (passenger <= maxPassenger) {
                passengerNow = passenger;
                dest = str;
                dist = num;
                setStatus("운행중");
                passengerAvailable = maxPassenger - passengerNow;

                if (dist <= basicDist) {
                    cost = fee;
                } else {
                    cost = fee + (additionalFee * (dist - basicDist));
                }


                System.out.println("탑승 승객 수: "+passengerNow);
                System.out.println("잔여 승객 수: "+passengerAvailable);
                System.out.println("기본 요금 확인: "+fee);
                System.out.println("목적지: "+dest);
                System.out.println("목적지까지 거리: "+dist);
                System.out.println("지불할 요금: "+cost);
            } else {
                System.out.println("최대 승객 수 초과");
            }
        } else {
            System.out.println("탑승 불가");
        }
    }

    public void takeoffTaxi(){
        if (status == "일반"){
            System.out.println("운행중이 아닙니다");
        } else if (status == "운행중") {
            intake += cost;
            System.out.println("주유량: "+getOil());

            if (oil >= 10) {
                status = "일반";
            } else {
                status = "운행불가";
            }
            System.out.println("상태: "+status);

            System.out.println("누적 요금: "+intake);
        }
    }
}
