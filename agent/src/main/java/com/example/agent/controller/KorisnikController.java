package com.example.agent.controller;

import com.example.agent.repository.KorisnikRepository;
import com.example.agent.service.LoginAndSyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/korisnik")
public class KorisnikController {
	@Autowired
	LoginAndSyncService loginAndSyncService;

    @RequestMapping(method = RequestMethod.GET, value = "/{kime}")
    public ResponseEntity dajKorisnika(@PathVariable String kime){
        return ResponseEntity.ok(loginAndSyncService.getJa(kime));
    }
}
