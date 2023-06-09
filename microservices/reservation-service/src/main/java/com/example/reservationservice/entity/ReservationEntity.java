package com.example.reservationservice.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "reservation")
@Entity
public class ReservationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer travelPackageId;
    private Integer number_of_people;
    private Date reservation_date;
    private String status;
    private BigDecimal totalPrice;

    public ReservationEntity() {
    }

    public ReservationEntity(Long id, Integer travelPackageId, Integer number_of_people, Date reservation_date, String status, BigDecimal totalPrice) {
        this.id = id;
        this.travelPackageId = travelPackageId;
        this.number_of_people = number_of_people;
        this.reservation_date = reservation_date;
        this.status = status;
        this.totalPrice = totalPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
