package head_first_design_pattern.demo.section02_observer_pattern.example;

import head_first_design_pattern.demo.section02_observer_pattern.example.observer_class.DetectedDisasterInfoRepository;
import head_first_design_pattern.demo.section02_observer_pattern.example.observer_class.MasterChef;
import head_first_design_pattern.demo.section02_observer_pattern.example.observer_class.Workers;

public class ObjectTest {
    public static void main(String[] args) {
        DetectedDisasterInfoRepository repository = new DetectedDisasterInfoRepository();
        MasterChef masterChef = new MasterChef(repository);
        Workers workers = new Workers(repository);

        repository.setDetectedInfo("지진이다!");
        repository.setDetectedInfo("화재다!");
        repository.setDetectedInfo("으악! 도둑이다!");

    }
}
