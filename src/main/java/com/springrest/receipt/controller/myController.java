package com.springrest.receipt.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.receipt.entities.donarDetails;
import com.springrest.receipt.repositories.donarRepo;

@RestController
@RequestMapping(value="/api/donar")
public class myController{
	
	@Autowired
	private donarRepo drepo;
	
	@GetMapping("/get")
    public List<donarDetails> getdonar() {
        return drepo.findAll();
    }
	
	@PostMapping("/registerUser")
	public donarDetails register(@Valid @RequestBody donarDetails donar) {
		return drepo.save(donar);
	}
	
	@GetMapping("/get/{donarId}")
    public ResponseEntity<Optional<donarDetails>> getdonarById(@PathVariable(value = "donarId") Long donarId) {
        Optional<donarDetails> ngo = drepo.findById(donarId);
        return ResponseEntity.ok().body(ngo);
    }
	
}