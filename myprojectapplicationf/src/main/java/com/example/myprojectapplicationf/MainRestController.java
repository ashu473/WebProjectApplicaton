package com.example.myprojectapplicationf;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {
    @PostMapping("/getuserbyemail")
    public ResponseEntity<Userdetail> getUserdetailsByEmail(@RequestParam("email"),String email){
        if(userDetailRepository.findByEmail).isPresent()){
    return new ResponseEntity<>(userDeatailRepository.findByEmail(email)).get(),HttpStatus.OK);
        }
    }else{
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
