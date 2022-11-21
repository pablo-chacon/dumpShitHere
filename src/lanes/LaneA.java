package lanes;

public class LaneA extends Lanes {
    public LaneA(boolean isDockEmpty, String position) {
        super(isDockEmpty, position);
    }


    @Override
    public void addVehicle(Vehicle vehicle) {
        System.out.println("Proceed to lane A to start dumping.");
        super.addVehicle(vehicle);

    }

    @Override
    public String toString() {
        setAssignedLane("A");
        return super.toString();
    }
}
