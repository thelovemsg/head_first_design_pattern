package head_first_design_pattern.demo.section02_observer_pattern.observer_interface;


public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
