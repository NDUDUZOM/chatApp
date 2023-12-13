package example.com.DumaApp.services;

import example.com.DumaApp.model.User;
import example.com.DumaApp.repository.UserRep;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements ServiceClass{

    @Autowired
    private  UserRep userRep;
    @Override
    public User register(User user) {


        if (user != null){
            userRep.save(user);
            System.out.println(user);
            return user;

        }else{
           return null;
        }

    }

    @Override
    public String login(String contact) {

        if(userRep.findByContact(contact).isPresent())
        {
            return "successful";
        }
        return "unsuccessful";
    }
}
