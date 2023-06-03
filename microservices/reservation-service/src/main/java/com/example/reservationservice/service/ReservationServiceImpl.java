package com.example.reservationservice.service;

import com.adventurehub.api.core.reservation.Reservation;
import com.adventurehub.api.core.reservation.ReservationService;
import com.adventurehub.util.http.ServiceUtil;
import com.example.reservationservice.mapper.ReservationMapper;
import com.example.reservationservice.repository.ReservationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


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
    public Reservation getReservation(Integer reservationId) {
        LOG.debug("/reservation return the found reservation for reservationId={}", reservationId);
        return null;
    }
}
