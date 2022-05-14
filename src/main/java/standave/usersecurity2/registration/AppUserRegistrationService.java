package standave.usersecurity2.registration;

import org.springframework.stereotype.Service;

@Service
public class AppUserRegistrationService {
    public String register(AppUserRegistrationRequest request){
        return "works";
    }
}
