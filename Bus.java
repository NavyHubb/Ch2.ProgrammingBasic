package simulation;

public class Bus extends Transit{
    int busNum;

    static int count = 100; //인스턴스 갯수
    int serialNo; //각 인스턴스 고유 번호
    {
        ++count; //인스턴스가 생성될 떄마다 count증가
        serialNo = count; //객체 고유 번호지정
    }

    public Bus(int num) {
        this.busNum = serialNo;
        status = "운행중";
        passengerNow = 0;
        this.fee = 1000;
        this.maxPassenger = 30;

        System.out.println("버스 번호: "+getBusNum());
    }

    @Override
    public void setStatus(String status) {
        super.setStatus(status);

        if (status == "차고지행") {
            passengerNow = 0;
            cost = 0;
        }
    }

    @Override
    public void take(int num) {
        super.take(num);

        if (status == "운행중") {
            if (passengerNow + passenger <= maxPassenger ) {
                this.passengerNow += passenger;
                passengerAvailable = maxPassenger - passenger;
                this.cost += fee * passenger;
            } else {
                System.out.println("최대 승객 수 초과");
            }
        } else {
            System.out.println("운행 중이 아닙니다");
        }
    }

    public int getBusNum() {
        return busNum;
    }

    //현재 승객수
    public int getPassenger() {
        return passengerNow;
    }

    public void showOnboard() {
        System.out.println(
                "탑승 승객 수: "+passengerNow+
                        "\n잔여 승객 수: "+passengerAvailable+
                        "\n요금 확인: "+cost
        );
    }


}
