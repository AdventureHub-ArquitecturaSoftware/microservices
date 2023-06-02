package com.adventurehub.api.core.payment;

import com.adventurehub.api.composite.travelPackage.ServiceAddresses;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    private Integer userId;
    private Integer reservationId;
    private Integer paymentId;
    private Double amount;
    private Date paymentDate;
    private String paymentMethod;
    private String serviceAddress;


    public Integer getUserId(){return userId;}
    public void setUserId(Integer userId){this.userId=userId;}

    public Integer getReservationId(){return reservationId;}
    public void setReservationId(Integer reservationId){this.reservationId=reservationId;}

    public Double getAmount(){return amount;}
    public void setAmount(Double amount){this.amount=amount;}


    public Date getPaymentDate(){return paymentDate;}
    public void setPaymentDate(Date paymentDate){this.paymentDate=paymentDate;}

    public Integer getPaymentId(){return paymentId;}
    public void setPaymentId(Integer paymentId){this.paymentId=paymentId;}

    public String getPaymentMethod(){return paymentMethod;}
    public void setPaymentMethod(String paymentMethod){this.paymentMethod=paymentMethod;}

    public String getServiceAddress(){return serviceAddress;}
    public void setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
    }

}
