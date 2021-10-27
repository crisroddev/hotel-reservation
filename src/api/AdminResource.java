package src.api;

import java.util.Collection;

import src.model.customer.Customer;
import src.model.reservation.Reservation;
import src.model.room.IRoom;
import src.service.customer.CustomerService;
import src.service.reservation.ReservationService;

public class AdminResource {

    public static Customer getCustomer(String email) {
        return CustomerService.getCustomer(email);
    }

    public static void addRoom(IRoom room) {
        ReservationService.addRoom(room);
    }

    public static Collection<IRoom> getAllRooms() {
        return ReservationService.getAllRooms();
    }

    public static Collection<Customer> getAllCustomers() {
        return CustomerService.getAllCustomers();
    }

    public static Collection<Reservation> getAllReservations() { return ReservationService.getAllReservations(); }

}