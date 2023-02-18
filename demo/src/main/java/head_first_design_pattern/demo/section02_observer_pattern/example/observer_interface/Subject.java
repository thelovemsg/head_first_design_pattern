package head_first_design_pattern.demo.section02_observer_pattern.example.observer_interface;

public interface Subject {
    void registerOwner(Owner o);
    void removeOwner(Owner o);
    void notifyOwners();
}
