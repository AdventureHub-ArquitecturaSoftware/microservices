package com.adventurehub.api.core.reservation;

import com.adventurehub.api.composite.reservation.ReservationAgregate;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;


public class Reservation {
    private Integer travelPackageId;
    private Integer reservationId;
    private int numPeople;
    private BigDecimal totalPrice;
    private String serviceAddress;

    public Reservation(){

    }

    public Reservation(Integer travelPackageId, Integer reservationId,int numPeople, BigDecimal totalPrice, String serviceAddress) {
        this.travelPackageId = travelPackageId;
        this.reservationId = reservationId;
        this.numPeople = numPeople;
        this.totalPrice = totalPrice;
        this.serviceAddress = serviceAddress;
    }

    public Integer getTravelPackageId() {
        return travelPackageId;
    }

    public void setTravelPackageId(Integer travelPackageId) {
        this.travelPackageId = travelPackageId;
    }

    public Integer getReservationId() {
        return reservationId;
    }

    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }

    public int getNumPeople() {
        return numPeople;
    }

    public void setNumPeople(int numPeople) {
        this.numPeople = numPeople;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }

    public void setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
    }
}
