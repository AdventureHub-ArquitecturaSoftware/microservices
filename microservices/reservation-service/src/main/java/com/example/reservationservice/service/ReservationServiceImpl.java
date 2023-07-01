package com.example.reservationservice.service;

import com.example.reservationservice.http.ServiceUtil;
import com.example.reservationservice.mapper.ReservationMapper;
import com.example.reservationservice.repository.ReservationRepository;
import com.example.reservationservice.reservation.Reservation;
import com.example.reservationservice.reservation.ReservationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationServiceImpl implements ReservationService {
    private static final Logger LOG = LoggerFactory.getLogger(ReservationServiceImpl.class);

    private final ServiceUtil serviceUtil;

    private final ReservationRepository repository;

    private final ReservationMapper mapper;

    public ReservationServiceImpl(ServiceUtil serviceUtil, ReservationRepository repository, ReservationMapper mapper) {
        this.serviceUtil = serviceUtil;
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public String getHome() {
        LOG.debug("/reservation return the found home for reservation");
        return serviceUtil.getServiceAddress() + ": reservation-service";
    }

    @Override
    public Reservation getReservation(Integer reservationId) {
        LOG.debug("/reservation return the found reservation for reservationId={}", reservationId);
        return null;
    }
}
