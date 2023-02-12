package head_first_design_pattern.demo.section01_example.nessecity.ex_interface;

public abstract class Worker {
    GetPay getPay;
    TakeARest takeARest;

    public void getPay() {
        getPay.pay();
    }

    public void takeARest(int minutes){
        takeARest.rest(minutes);
    }

    void work() {
        System.out.println("일한다!");
    }

    void setPayPolicy(GetPay getPay){
        this.getPay = getPay;
    }

    void setRestPolicy(TakeARest takeARest){
        this.takeARest = takeARest;
    }
}
