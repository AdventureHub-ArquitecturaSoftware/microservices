package com.adventurehub.microservices.composite.user.services;

import com.adventurehub.util.http.ServiceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Component
public class UserCompositeIntegration {

    private final ServiceUtil serviceUtil;

    @Autowired
    public UserCompositeIntegration(ServiceUtil serviceUtil) {
        this.serviceUtil = serviceUtil;
    }

    public Integer getUserId(){
        try {
            URL url = new URL(serviceUtil.getServiceAddress());
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader((connection.getInputStream())));
                StringBuilder response = new StringBuilder();
                String line;

                while((line=reader.readLine())!=null) {
                    response.append(line);
                }

                reader.close();

                Integer userId = Integer.parseInt(response.toString());

                return userId;

            }else {
                throw new RuntimeException("Error al obtener el userId. Código de respuesta: " + responseCode);
            }

        } catch (IOException e) {
            throw new RuntimeException("Error al obtener el userId desde la API de User Composite: " + e.getMessage(), e);
        }
    }
}

