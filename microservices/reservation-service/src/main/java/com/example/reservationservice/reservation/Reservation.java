package com.example.reservationservice.reservation;


import java.math.BigDecimal;
import java.util.Date;

public class Reservation {
    private Integer reservationId;
    private Integer travelPackageId;
    private Integer number_of_people;
    private Date reservation_date;
    private String status;
    private BigDecimal totalPrice;
    private String serviceAddress;

    public Reservation(Integer reservationId, Integer travelPackageId, Integer number_of_people, Date reservation_date, String status, BigDecimal totalPrice, String serviceAddress) {
        this.reservationId = reservationId;
        this.travelPackageId = travelPackageId;
        this.number_of_people = number_of_people;
        this.reservation_date = reservation_date;
        this.status = status;
        this.totalPrice = totalPrice;
        this.serviceAddress = serviceAddress;
    }

    public Reservation(){

    }

    public Integer getReservationId() {
        return reservationId;
    }

    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }

    public Integer getTravelPackageId() {
        return travelPackageId;
    }

    public void setTravelPackageId(Integer travelPackageId) {
        this.travelPackageId = travelPackageId;
    }

    public Integer getNumber_of_people() {
        return number_of_people;
    }

    public void setNumber_of_people(Integer number_of_people) {
        this.number_of_people = number_of_people;
    }

    public Date getReservation_date() {
        return reservation_date;
    }

    public void setReservation_date(Date reservation_date) {
        this.reservation_date = reservation_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
