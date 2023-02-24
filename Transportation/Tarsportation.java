package Transportation;

class Bus {
int maxPassenger;                   //최대 승객수
    int currentPassenger;           //현제승객
    int fare;                       //요금
    int carNumber;               //차량번호
    int fuelAmount;                 //주유량
    int currentSpeed;               // 속도
    String state;                   //상태

    public Bus(int maxPassenger, int fare,int fuelAmount) {
        this.maxPassenger = maxPassenger;
        this.currentPassenger = 0;
        this.fuelAmount = fuelAmount;
        this.fare = fare;
        this.currentSpeed = 0;
        this.state = "운행"; //최초 운행상태
    }

    //버스 운행시
    public void start() {
        if (fuelAmount < 10) {
            System.out.println("주유가 필요합니다.");
            return;
        }
        state = "운행시작";
        System.out.println(state);
    }

    //상태 변경
    public void changeStatus() {
        if (fuelAmount < 10) {
            System.out.println("주유가 필요합니다.");
            state = "차고지행";
        } else {
            state = "운행";
        }
        System.out.println(state);
    }

    //승객 탑승
    public void boardPassenger(int numPassengers) {
        if (state.equals("운행") && currentPassenger + numPassengers <= maxPassenger) {
            currentPassenger += numPassengers;

        } else {
            System.out.println("최대 승객 수 초과했습니다.");
            return;
        }

        System.out.println("탑승 승객 수 = " + numPassengers);
        System.out.println("잔여 승객 수 = " + (maxPassenger-currentPassenger));
        System.out.println("현제 승객 수 = " + currentPassenger);
        System.out.println("요금 확인 = " + numPassengers*fare);

    }

    // 속도 변경
    public void changeSpeed(int changeSpeed) {
        if (fuelAmount >= 10) {
            currentSpeed += changeSpeed;
        } else {
            System.out.println("주유량을 확인해주세요.");
        }
    }
    //주요량

    public int getFuelAmount() {
        int fuel = fuelAmount;
        System.out.println("연료량: " + fuel);
        return fuel;
    }
    //기름 더해주기
    public int plusfuel(int fuel) {
        fuelAmount += fuel;
        return getFuelAmount();
    }
    //기름 빼주기
    public int mfuel(int fuel){
        fuelAmount -= fuel;
            return getFuelAmount();
    }

    //차량 번호 랜덤값 받기
    public void carNumber(){
        carNumber = (int) ((Math.random() *9000)+1000 );
        System.out.println(carNumber+"번 버스 생성");
    }



}



