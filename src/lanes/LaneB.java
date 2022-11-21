package lanes;

public class LaneB extends Lanes {
    public LaneB(boolean isDockEmpty, String position) {
        super(isDockEmpty, position);
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        super.addVehicle(vehicle);
        System.out.println("Proceed to lane B to start dumping.");
    }

    @Override
    public String toString() {
        setAssignedLane("B");
        return super.toString();
    }
}