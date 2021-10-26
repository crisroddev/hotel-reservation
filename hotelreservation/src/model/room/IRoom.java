package hotelreservation.src.model.room;

import hotelreservation.src.model.room.enums.RoomType;

/**
 * @author Cristian Rodriguez
 *
 */
public interface IRoom {
    public String getRoomNumber();
    public Double getRoomPrice();
    public RoomType getRoomType();
    public boolean isFree();
    
}
