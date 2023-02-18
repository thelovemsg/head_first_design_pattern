package head_first_design_pattern.demo.section02_observer_pattern.example.observer_interface;

import java.time.LocalDateTime;

public interface MessageSending {
    public void sendMessage(String hhp, String msg, LocalDateTime time);
}
