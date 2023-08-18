package com.diyo.realestatelist.controller;

import com.diyo.realestatelist.entity.Property;
import com.diyo.realestatelist.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("property")
@CrossOrigin({"http://localhost:4200"})
public class PropertyController {
    @Autowired
    private PropertyService propertyService;

    @GetMapping
    public ResponseEntity<List<Property>> getPropertyList(){
        List<Property> propertyList = propertyService.getAllPropertyList();
        return ResponseEntity.status(200).body(propertyList);
    }

    @GetMapping("/{propertyId}")
    public ResponseEntity<Property> getPropertyById(@PathVariable("propertyId") Long propertyId){
        Property property = propertyService.getPropertyById(propertyId);
        return ResponseEntity.status(200).body(property);
    }

    @PostMapping("/all")
    public ResponseEntity<String> saveAllProperty(@RequestBody List<Property> property){
        String result = propertyService.saveAllProperty(property);
        return ResponseEntity.status(200).body(result);
    }

    @PostMapping
    public ResponseEntity<String> saveProperty(@RequestBody Property property){
        String result = propertyService.saveProperty(property);
        return ResponseEntity.status(200).body(result);
    }

    @PutMapping("/{propertyId}")
    public ResponseEntity<String> updatePropertyById(@RequestBody Property property, @PathVariable("propertyId") Long propertyId){
        String result = propertyService.updatePropertyById(property,propertyId);
        return ResponseEntity.status(200).body(result);
    }

    /*@PatchMapping("/{propertyId}")
    public ResponseEntity<String> partialUpdateById(@RequestBody Property property, @PathVariable("propertyId") Long propertyId){
        String result = propertyService.partialUpdateById(property, propertyId);
        return ResponseEntity.status(200).body(result);
    }*/

    @DeleteMapping("/{propertyId}")
    public ResponseEntity<String> deletePropertyById(@PathVariable("propertyId") Long propertyId){
        String result = propertyService.deletePropertyById(propertyId);
        return ResponseEntity.status(200).body(result);
    }
}
