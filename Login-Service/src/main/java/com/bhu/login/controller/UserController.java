package com.bhu.login.controller;

import java.security.Principal;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhu.login.repo.UserRepo;

import lombok.RequiredArgsConstructor;

/**
 * @author bhudutt
 */

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {

	private final UserRepo userRepo;
	
	@GetMapping("/anyone")
    public ResponseEntity<?> getTestAPI1(){
        return ResponseEntity.ok("Response");
    }
	
	@PreAuthorize("hasRole('ROLE_MANAGER')")
    @GetMapping("/manager")
    public ResponseEntity<?> getTestAPI2(Principal principal){

        return ResponseEntity.ok(principal.getName()+" : is accessing manager api. All data from backend"+ userRepo.findAll());
    }
	
	 @PreAuthorize("hasAnyRole('ROLE_ADMIN')")//'ROLE_MANAGER',
	    @GetMapping("/admin")
	    public ResponseEntity<?> getTestAPI3(Principal principal){
	        return ResponseEntity.ok(principal.getName()+" : is accessing admin api. All data from backend"+ userRepo.findAll());
	    }

}
