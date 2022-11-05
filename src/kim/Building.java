package kim;

public class Building {
    boolean doorOpen;
    boolean windowOpen;
    private String name;
    boolean fridgePresent;
    boolean laptopPresent;

    Building(String name) {
        this.name = name;
        randomize();
    }

    public void randomize() {
        windowOpen = Math.random() < 0.8;
        doorOpen = Math.random() < 0.3;
        fridgePresent = Math.random() < 0.5;
        laptopPresent = Math.random() < 0.4;
    }

    public boolean canBeRobbed() {
        return (doorOpen || windowOpen) && (fridgePresent || laptopPresent);
    }

    public int impact() {
        int impact;
        if (doorOpen && fridgePresent && laptopPresent) {
            impact = 100;
        } else if (doorOpen && fridgePresent) {
            impact = 60;
        } else if (doorOpen && laptopPresent) {
            impact = 40;
        } else if (windowOpen && laptopPresent) {
            impact = 40;
        } else {
            impact = 0;
        }
        return impact;
    }

    @Override
    public String toString() {
        return name + ": Door open = " + doorOpen + " Window open = " + windowOpen + " Fridge = "
                + fridgePresent + " Laptop = " + laptopPresent + " IMPACT = " + impact() + "%";
    }
}
