package lanes;



public class LaneE extends Lanes {
    public LaneE(boolean openLane, String position) {
        super(openLane, position);
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        super.addVehicle(vehicle);
        System.out.println("Proceed to lane E to start dumping.");
    }

    @Override
    public String toString() {
        setAssignedLane("E");
        return super.toString();
    }
}
