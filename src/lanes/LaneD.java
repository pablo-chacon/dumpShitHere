package lanes;

public class LaneD extends Lanes {
    public LaneD(boolean isDockEmpty, String position) {
        super(isDockEmpty, position);
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        super.addVehicle(vehicle);
        System.out.println("Proceed to lane D to start dumping.");
    }

    @Override
    public String toString() {
        setAssignedLane("D");
        return super.toString();
    }
}