package lanes;


public abstract class Lanes {

    private Vehicle vehicle;
    private boolean openLane;
    private String assignedLane;

    public Lanes(boolean openLane, String assignedLane) {
        this.openLane = openLane;
        this.assignedLane = assignedLane;
    }

    public void addVehicle(Vehicle vehicle) {
        setOpenLane(false);
        this.vehicle = vehicle;
    }

    public String toString() {
        if (this.vehicle != null) {
            return assignedLane + " " + vehicle.getVehicleType() +
                    " " + vehicle.getWeight() + " KG";
        }
        return null;
    }

    public boolean isOpenLane() {
        return openLane;
    }

    public void setOpenLane(boolean openLane) {
        this.openLane = openLane;
    }

    public void setAssignedLane(String assignedLane) {
        this.assignedLane = assignedLane;
    }

}