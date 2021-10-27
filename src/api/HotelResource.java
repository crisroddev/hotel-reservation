package src.api;
import java.util.Collection;
import java.util.Date;

import src.model.customer.Customer;
import src.model.reservation.Reservation;
import src.model.room.IRoom;
import src.service.customer.CustomerService;
import src.service.reservation.ReservationService;

public class HotelResource {

    public static Customer getCustomer(String email) {
        return CustomerService.getCustomer(email);
    }

    public static void createCustomer(String email, String firstName, String lastName) {
        CustomerService.addCustomer(email, firstName, lastName);
    }

    public static IRoom getRoom(String roomNumber) {
        return ReservationService.getRoom(roomNumber);
    }

    public static Reservation bookRoom(String customerEmail, IRoom room, Date checkInDate, Date checkOutDate) {
        Customer customer = CustomerService.getCustomer(customerEmail);
        return ReservationService.reserveRoom(customer, room, checkInDate, checkOutDate);
    }

    public static Collection<Reservation> getCustomerReservations(String customerEmail) {
        Customer customer = CustomerService.getCustomer(customerEmail);
        return ReservationService.getCustomerReservations(customer);
    }

    public static Collection<IRoom> findRooms(Date checkInDate, Date checkOutDate) {
        return ReservationService.findRooms(checkInDate, checkOutDate);
    }

}