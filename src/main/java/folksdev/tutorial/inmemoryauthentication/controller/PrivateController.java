package folksdev.tutorial.inmemoryauthentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/private")
public class PrivateController {

    @GetMapping
    public String helloLankon() {
        return "Hello Lankon from private class";
    }

    //@PreAuthorize("hasRole('USER')")
    //SecurityConfig
    @GetMapping(path = "/user")
    public String helloLankonUser() {
        return "Hello Lankon from private class for user";
    }

    //@PreAuthorize("hasRole('ADMIN')")
    //SecurityConfig
    @GetMapping(path = "/admin")
    public String helloLankonAdmin() {
        return "Hello Lankon from private class for admin";
    }
}
