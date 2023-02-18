package head_first_design_pattern.demo.section02_observer_pattern.example.observer_class;

import head_first_design_pattern.demo.section02_observer_pattern.example.observer_interface.MessageSending;
import head_first_design_pattern.demo.section02_observer_pattern.example.observer_interface.Owner;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class Workers implements Owner, MessageSending {
    private DetectedDisasterInfoRepository repository;
    private String info;
    private List<String> hhps = List.of("12341234","5454544");

    //연락 받을 사람을 생성 시 바로 Observer로 등록해버림!
    public Workers(DetectedDisasterInfoRepository repository) {
        this.repository = repository;
        repository.registerOwner(this);
    }

    @Override
    public void detect() {
        for (String hhp : hhps) {
            sendMessage(hhp, repository.getMsg(), LocalDateTime.now());
        }
    }

    @Override
    public void sendMessage(String hhp, String msg, LocalDateTime time) {
        System.out.println(String.format("당직 근무자에게 전송 => 전화번호 : %s / 내용 : %s / 시간 : %s", hhp, Optional.ofNullable(msg).orElse("nothing"), time.toString()));
    }

}
