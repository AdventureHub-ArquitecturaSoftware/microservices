package com.example.reservationservice.mapper;

import com.adventurehub.api.core.reservation.Reservation;
import com.example.reservationservice.entity.ReservationEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "com.example")
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
