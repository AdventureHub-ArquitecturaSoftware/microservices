package com.adventurehub.microservices.core.payment.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "payment")
public class PaymentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer userId;

    private Integer reservationId;

    private String paymentMethod;

    private Double amount;

    private Date paymentDate;

    public Integer getId(){return id;}

    public void setId(Integer id){this.id = id;}

    public Integer getUserId() {return userId;}

    public void setUserId(Integer userId) {this.userId = userId;}

    public Integer getReservationId() {return reservationId;}

    public void setReservationId(Integer reservationId) {this.reservationId = reservationId;}

    public String getPaymentMethod(){return paymentMethod;}

    public void setPaymentMethod(String paymentMethod) {this.paymentMethod=paymentMethod;}

    public Double getAmount(){return amount;}

    public void setAmount(Double amount) {this.amount = amount;}

    public Date getPaymentDate(){return paymentDate;}

    public void setPaymentDate(Date paymentDate) {this.paymentDate=paymentDate;}

}