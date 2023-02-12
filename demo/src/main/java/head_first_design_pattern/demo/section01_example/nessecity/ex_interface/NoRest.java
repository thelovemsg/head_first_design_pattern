package head_first_design_pattern.demo.section01_example.nessecity.ex_interface;

public class NoRest implements TakeARest{
    @Override
    public void rest(int minutes) {
        if(minutes != 0){
            throw new IllegalArgumentException("기계는 휴식시간이 없습니다.");
        }
        System.out.println("휴식 없음");
    }
}
