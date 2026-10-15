package model;

public class ServiceRoom extends Room {
    private double extraServiceFee;

    public ServiceRoom() {
        super();
    }
    public ServiceRoom(String roomId, String roomName, int capacity, int currentOccupancy, double pricePerMonth, double extraServiceFee) {
        super(roomId, roomName, capacity, currentOccupancy, pricePerMonth);
        this.extraServiceFee = extraServiceFee;
    }
    @Override
    public RoomType getRoomType() {
        return RoomType.AIR_CONDITIONED;
    }

    public double getExtraServiceFee() {
        return extraServiceFee;
    }
    public void setExtraServiceFee(double extraServiceFee) {
        this.extraServiceFee = extraServiceFee;
    }
    @Override
    public String toString() {
        return String.format("ServiceRoom[id=%s, name=%s, occ=%d/%d, price=%,.0f, serviceFee=%,.0f]",
                roomId, roomName, currentOccupancy, capacity, pricePerMonth, extraServiceFee);
    }
}
