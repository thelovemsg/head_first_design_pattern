package head_first_design_pattern.demo.section01_example.nessecity.ex_interface;

public class TakeARestForMinutes implements TakeARest{
    @Override
    public void rest(int minutes) {
        System.out.println(minutes +"분 휴식");
    }
}
