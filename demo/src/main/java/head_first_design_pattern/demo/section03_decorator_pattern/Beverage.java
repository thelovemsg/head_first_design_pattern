package head_first_design_pattern.demo.section03_decorator_pattern;

public abstract class Beverage {

    public enum Size {
        TALL, GRANDE, VENTI;
        String size;
    };

    Size size = Size.TALL;

    String description = "제목 없음";

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
