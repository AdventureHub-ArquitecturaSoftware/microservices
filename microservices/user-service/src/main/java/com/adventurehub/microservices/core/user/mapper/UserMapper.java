package com.adventurehub.microservices.core.user.mapper;

import com.adventurehub.api.core.user.User;
import com.adventurehub.microservices.core.user.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mappings({
            @Mapping(target = "serviceAddress", ignore = true),
            @Mapping(target = "userId", ignore = true),
    })
    User entityToApi(UserEntity entity);

    @Mappings({
            @Mapping(target = "id", ignore = true),
    })
    UserEntity apiToEntity(User api);
}
