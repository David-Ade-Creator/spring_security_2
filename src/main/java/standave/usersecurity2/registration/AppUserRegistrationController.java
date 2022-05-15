package standave.usersecurity2.registration;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class AppUserRegistrationController {

    private AppUserRegistrationService appUserRegistrationService;

    @PostMapping
    public String register(@RequestBody AppUserRegistrationRequest request){
        return appUserRegistrationService.register(request);
    }

    @GetMapping(path = "confirm")
    public String confirm(@RequestParam("token") String token) {
        return appUserRegistrationService.confirmToken(token);
    }
}
