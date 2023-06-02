package com.adventurehub.microservices.composite.user.services;

import com.adventurehub.util.http.ServiceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCompositeServiceImpl extends UserCompositeIntegration {

     public UserCompositeServiceImpl(ServiceUtil serviceUtil) {
        super(serviceUtil);
    }

    @Override
    public Integer getUserId(){
        return super.getUserId();
    }

}
