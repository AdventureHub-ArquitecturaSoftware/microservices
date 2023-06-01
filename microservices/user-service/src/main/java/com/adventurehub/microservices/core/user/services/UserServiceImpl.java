package com.adventurehub.microservices.core.user.services;

import com.adventurehub.api.core.user.User;
import com.adventurehub.api.core.user.UserService;
import com.adventurehub.microservices.core.user.mapper.UserMapper;
import com.adventurehub.microservices.core.user.entity.UserEntity;
import com.adventurehub.microservices.core.user.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.adventurehub.api.core.user.User;
import com.adventurehub.api.core.user.UserService;
import com.adventurehub.util.http.ServiceUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class UserServiceImpl implements UserService {
    private static final Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class);

    private final ServiceUtil serviceUtil;

    private final UserRepository repository;

    private final UserMapper mapper;

    @Autowired
    public UserServiceImpl(ServiceUtil serviceUtil, UserRepository repository, UserMapper mapper) {
        this.serviceUtil = serviceUtil;
        this.repository = repository;
        this.mapper = mapper;
    }


    @Override
    public User createDestination(User body) {
        return null;
    }

    @Override
    public List<User> getActivities(Integer itineraryId) {
        return null;
    }
}
