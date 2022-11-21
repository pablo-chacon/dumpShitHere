package lanes;

public class LaneC extends Lanes {
    public LaneC(boolean isDockEmpty, String position) {
        super(isDockEmpty, position);
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        super.addVehicle(vehicle);
        System.out.println("Proceed to lane C to start dumping.");
    }

    @Override
    public String toString() {
        setAssignedLane("C");
        return super.toString();
    }
}