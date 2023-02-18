package head_first_design_pattern.demo.section02_observer_pattern.example.observer_class;

import head_first_design_pattern.demo.section02_observer_pattern.example.observer_interface.MessageSending;
import head_first_design_pattern.demo.section02_observer_pattern.example.observer_interface.Owner;

import java.time.LocalDateTime;
import java.util.Optional;

public class MasterChef implements Owner, MessageSending {

    private DetectedDisasterInfoRepository repository;
    private String info;
    private String hhp = "010123123123";

    //연락 받을 사람을 생성 시 바로 Observer로 등록해버림!
    public MasterChef(DetectedDisasterInfoRepository repository) {
        this.repository = repository;
        repository.registerOwner(this);
    }

    @Override
    public void detect() {
        sendMessage(hhp, repository.getMsg(), LocalDateTime.now());
    }

    @Override
    public void sendMessage(String hhp, String msg, LocalDateTime time) {
        System.out.println(String.format("대장님께 전송 => 전화번호 : %s / 내용 : %s / 시간 : %s", hhp, Optional.ofNullable(msg).orElse("nothing"), time.toString()));
    }
}
