package mk.ukim.finki.eimt.lab.Service.Application;

import mk.ukim.finki.eimt.lab.Model.DTO.ReservationListDTO.DisplayReservationListDTO;

public interface ReservationListApplicationService {

    DisplayReservationListDTO addBookingToReservationList(String username, Long bookingID) throws Exception;

    DisplayReservationListDTO clearReservationList(String username) throws Exception;
}