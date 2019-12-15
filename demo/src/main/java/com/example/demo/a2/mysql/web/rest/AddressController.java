package com.example.demo.a2.mysql.web.rest;

import com.example.demo.a2.mysql.service.AddressService;
import com.example.demo.a2.mysql.web.model.AddressModel;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Profile("!h2")
@RestController
public class AddressController {

    private final AddressService service;

    public AddressController(AddressService service) {
        this.service = service;
    }


    @GetMapping("address/{id}")
    public ResponseEntity<AddressModel> getAddress(@PathVariable Long id) {
        return ResponseEntity.ok(this.service.getAddress(id));
    }

    @PostMapping("address")
    public ResponseEntity<AddressModel> createAddress(@RequestBody AddressModel body) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(this.service.saveAddress(body));
    }

    @PutMapping("address/{id}")
    public ResponseEntity<AddressModel> updateAddress(@PathVariable Long id, @RequestBody AddressModel body) {
        return ResponseEntity.ok(this.service.updateAddress(id, body));
    }

    @DeleteMapping("address/{id}")
    public ResponseEntity deleteAddress(@PathVariable Long id) {
        return ResponseEntity.ok(this.service.deleteAddress(id));
    }
}
