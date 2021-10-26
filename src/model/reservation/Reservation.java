package src.model.reservation;
import src.model.customer.Customer;
import src.model.room.IRoom;

import java.util.*;



/**
 * @author Cristian Rodriguez
 *
 */

public class Reservation {
    private final Customer customer;
    private final IRoom room;
    private final Date checkInDate;
    private final Date checkOutDate;

    public Reservation(final Customer customer, final IRoom room, final Date checkInDate, final Date checkOutDate){
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public IRoom getRoom(){
        return this.room;
    }

    public Date checkInDate(){
        return this.checkInDate;
    }

    public Date checkOutDate(){
        return this.checkOutDate;
    }

    @Override
    public String toString(){
        return "Customer :" + this.customer.toString()
                + "\nRoom: " + this.room.toString()
                + "\nCheck in Date: " + this.checkInDate.toString()
                + "\nCheck out Date: " + this.checkOutDate;
    }
}
