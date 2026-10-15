package model;

public class StandardRoom extends Room{
    public StandardRoom() {
        super();
    }
    public StandardRoom(String roomId, String roomName, int capacity, int currentOccupancy, double pricePerMonth) {
        super(roomId, roomName, capacity, currentOccupancy, pricePerMonth);
    }
    @Override
    public RoomType getRoomType() {
        return RoomType.STANDARD;
    }

    @Override
    public String toString() {
        return String.format("StandardRoom[id=%s, name=%s, occ=%d/%d, price=%,.0f]",
                roomId, roomName, currentOccupancy, capacity, pricePerMonth);
    }
}
