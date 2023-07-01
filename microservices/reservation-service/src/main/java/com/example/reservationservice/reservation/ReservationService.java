package com.example.reservationservice.reservation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ReservationService {

    @GetMapping
            (
                    value    = "/",
                    produces = "application/json"
            )
    String getHome();


    /**
     * Sample usage: curl $HOST:$PORT/product/1
     *
     * @param reservationId
     * @return the reservation, if found, else null
     */
    @GetMapping(
            value    = "/reservation/{reservationId}",
            produces = "application/json")
    Reservation getReservation(@PathVariable Integer reservationId);

}
