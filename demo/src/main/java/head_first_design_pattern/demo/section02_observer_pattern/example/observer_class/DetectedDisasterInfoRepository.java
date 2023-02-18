package head_first_design_pattern.demo.section02_observer_pattern.example.observer_class;

import head_first_design_pattern.demo.section02_observer_pattern.example.observer_interface.Owner;
import head_first_design_pattern.demo.section02_observer_pattern.example.observer_interface.Subject;

import java.util.ArrayList;
import java.util.List;

public class DetectedDisasterInfoRepository implements Subject {
    private List<Owner> owners;
    private String msg;
    public DetectedDisasterInfoRepository() {
        this.owners = new ArrayList<>();
    }

    @Override
    public void registerOwner(Owner o) {
        this.owners.add(o);
    }

    @Override
    public void removeOwner(Owner o) {
        this.owners.remove(o);
    }

    @Override
    public void notifyOwners() {
        for (Owner owner : owners) {
            owner.detect();
        }
        System.out.println("\n");
    }

    public void setDetectedInfo(String msg) {
        this.msg = msg;
        changeInfo();
    }

    public void changeInfo() {
        notifyOwners();
    }

    public List<Owner> getOwners() {
        return owners;
    }

    public void setOwners(List<Owner> owners) {
        this.owners = owners;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
