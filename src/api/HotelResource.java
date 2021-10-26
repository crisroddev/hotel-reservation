package src.api;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;

import src.model.customer.Customer;
import src.model.reservation.Reservation;
import src.model.room.IRoom;
import src.service.customer.CustomerService;
import src.service.reservation.ReservationService;

/**
 * @author Cristian Rodriguez
 *
 */

public class HotelResource {
    private static final HotelResource single = new HotelResource();

    private final CustomerService customerService = CustomerService.getSingle();
    private final ReservationService reservationService = ReservationService.getSingle();

    private HotelResource() {}

    public static HotelResource getSingle() {
        return single;
    }

    public Customer getCustomer(String email) {
        return customerService.getCustomer(email);
    }

    public void createACustomer(String email, String firstName, String lastName) {
        customerService.addCustomer(firstName, lastName, email);
    }

    public IRoom getRoom(String roomNumber) {
        return reservationService.getRoom(roomNumber);
    }

    public Reservation bookARoom(String customerEmail, IRoom room, Date checkInDate, Date checkOutDate) {
        return reservationService.reserveARoom(getCustomer(customerEmail), room, checkInDate, checkOutDate);
    }

    public Collection<Reservation> getCustomersReservations(String customerEmail) {
        final Customer customer = getCustomer(customerEmail);

        if (customer == null) {
            return Collections.emptyList();
        }

        return reservationService.getCustomersReservation(getCustomer(customerEmail));
    }

    public Collection<IRoom> findARoom(final Date checkIn, final Date checkOut) {
        return reservationService.findRooms(checkIn, checkOut);
    }

    public Collection<IRoom> findAlternativeRooms(final Date checkIn, final Date checkOut) {
        return reservationService.findAlternativeRooms(checkIn, checkOut);
    }

    public Date addDefaultPlusDays(final Date date) {
        return reservationService.addDefaultPlusDays(date);
    }
}