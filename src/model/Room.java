package model;
import java.util.Objects;
public abstract class Room {
    protected String roomId;
    protected String roomName;
    protected int capacity;
    protected int currentOccupancy;
    protected double pricePerMonth;
    public enum RoomType {
        STANDARD,
        AIR_CONDITIONED
    }

    public Room() { }
    public Room(String roomId, String roomName, int capacity, int currentOccupancy, double pricePerMonth) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.capacity = capacity;
        this.currentOccupancy = currentOccupancy;
        this.pricePerMonth = pricePerMonth;
    }
    public abstract RoomType getRoomType();
    public boolean isAirConditioned() {
        return getRoomType() == RoomType.AIR_CONDITIONED;
    }
    public boolean hasAvailableSlot() {
        return currentOccupancy < capacity;
    }
    public boolean isOverCapacity() {
        return currentOccupancy > capacity;
    }
    public boolean isCompletelyEmpty() {
        return currentOccupancy == 0;
    }
    public String getRoomId() {
        return roomId;
    }
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }
    public String getRoomName() {
        return roomName;
    }
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getCurrentOccupancy() {
        return currentOccupancy;
    }
    public void setCurrentOccupancy(int currentOccupancy) {
        this.currentOccupancy = currentOccupancy;
    }
    public double getPricePerMonth() {
        return pricePerMonth;
    }
    public void setPricePerMonth(double pricePerMonth) {
        this.pricePerMonth = pricePerMonth;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (null == o || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Objects.equals(roomId, room.roomId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomId);
    }

    @Override
    public String toString() {
        return String.format("Room[id=%s, name=%s, type=%s, occ=%d/%d, price=%,.0f]",
                roomId, roomName, getRoomType(), currentOccupancy, pricePerMonth);
    }
}
