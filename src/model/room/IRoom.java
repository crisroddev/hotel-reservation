package src.model.room;

import src.model.room.enums.RoomType;

public interface IRoom {

    public String getRoomNumber();
    public Double getRoomPrice();
    public RoomType getRoomType();
    public Boolean isFree();
}

