package com.store.Store.controller;

import com.store.Store.model.Address;
import com.store.Store.repository.MySqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;


@RestController
public class StoreController {

    @Autowired
    MySqlRepository mySqlRepository;

    @GetMapping("/get-all-addresses")
    public List<Address> getAllAddresses(){

        return mySqlRepository.findAll();
    }

    @GetMapping("/get-address/{identity}")
    public Address getSingleAddress(@PathVariable("identity") Integer id){
        return mySqlRepository.findById(id).get();
    }

    @DeleteMapping("/remove/{id}")
    public boolean deleteRow(@PathVariable("id") Integer id){
        if(!mySqlRepository.findById(id).equals(Optional.empty())){
            mySqlRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @PutMapping("/update/{id}")
    public Address updateAddress(@PathVariable("id") Integer id,
                                 @RequestBody Map<String, String> body){

        Address current = mySqlRepository.findById(id).get();
        current.setStreet(body.get("street"));
        current.setNumber(Integer.parseInt(body.get("number")));
        current.setPostcode(body.get("postcode"));
        mySqlRepository.save(current);
        return current;
    }

    @PostMapping("/add")
    public Address create(@RequestBody Map<String, String> body){

        String street = body.get("street");
        String postcode = body.get("postcode");
        Integer number = Integer.parseInt(body.get("number"));
        Address newAddress = new Address(number, street, postcode);

        return mySqlRepository.save(newAddress);
    }
}
