package hotelreservation.src.api;

import java.util.Collection;
import java.util.List;

import hotelreservation.src.model.customer.Customer;
import hotelreservation.src.model.room.IRoom;
import hotelreservation.src.service.customer.CustomerService;
import hotelreservation.src.service.reservation.ReservationService;

public class AdminResource {
    private static final AdminResource single = new AdminResource();
    private final CustomerService customerService = CustomerService.getSingle();
    private final ReservationService reservationService = ReservationService.getSingle();

    private AdminResource() {}

    public static AdminResource getSingle() {
        return single;
    }

    public Customer getCustomer(String email) {
        return customerService.getCustomer(email);
    }

    public void addRoom(List<IRoom> rooms) {
        rooms.forEach(reservationService::addRoom);
    }

    public Collection<IRoom> getAllRooms() {
        return reservationService.getAllRooms();
    }

    public Collection<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    public void displayAllReservations() {
        reservationService.printAllReservation();
    }
}
