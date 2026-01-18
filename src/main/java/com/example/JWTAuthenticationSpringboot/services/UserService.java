package com.example.JWTAuthenticationSpringboot.services;

import com.example.JWTAuthenticationSpringboot.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User>store=new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(),"Meenakshi Negi",
                "mnegi2002@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Gunjan",
                "gunjan1234@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Radhika",
                "radhikaa@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Prerna Singh",
                "prerna23@gmail.com"));
    }

    public List<User>getUsers(){
        return this.store;
    }
}
