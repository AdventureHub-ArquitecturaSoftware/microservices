package com.example.reservationservice.mapper;

import com.example.reservationservice.entity.ReservationEntity;
import com.example.reservationservice.reservation.Reservation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ReservationMapper {
    @Mappings({
            @Mapping(target = "serviceAddress", ignore = true),
            @Mapping(target = "reservationId", ignore = true)
    })
    Reservation entityToApi(ReservationEntity entity);

    @Mappings({
            @Mapping(target = "id", ignore = true),
    })
    ReservationEntity apiToEntity(Reservation api);

}
