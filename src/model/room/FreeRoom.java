package src.model.room;

import src.model.room.enums.RoomType;

public class FreeRoom extends Room {

    public FreeRoom(String roomNumber, RoomType enumeration) {
        super(roomNumber, (double) 0, enumeration);
    }

    public String toString() {
        return "Room number: " + this.roomNumber + " " + this.enumeration + " bed room Price: $0 (Free)";
    }

}