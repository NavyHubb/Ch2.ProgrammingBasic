package simulation;

public class Transit {
    int oil = 100;
    int fee;
    int cost = 0;
    int speed;
    int passenger;
    int maxPassenger;
    int passengerNow;
    int passengerAvailable = maxPassenger - passengerNow;
    String status;
    int intake;

    public Transit() {
        int speed = 0;
    }

    //운행 시작
    public void start() {
        status = "운행중";
        passengerNow = 0;
        passengerAvailable = maxPassenger - passengerNow;
    }

    //주유량 변경
    public void changeOil(int oil) {
        this.oil += oil;
    }

    //주유량 확인
    public void alertOil() {
        if (oil < 10) {
            System.out.println("주유가 필요합니다");
        }
    }
    //주유량 호출
    public int getOil() {
        return oil;
    }


    //속도 변경
    public void setSpeed(int speed) {
        if (oil >= 10) {
            this.speed += speed;
        } else {
            System.out.println("주유가 필요합니다");
        }

    }

    //상태 변경
    public void setStatus(String status) {
        this.status = status;
    }
    //상태 호출
    public String getStatus() {
        return status;
    }

    //승객 탑승
    public void take(int num) {
        this.passenger = num;
    }

    public void showOil() {
        System.out.println("현재 주유량: "+getOil());
    }

}