package com.diyo.realestatelist.service;

import com.diyo.realestatelist.entity.Property;
import com.diyo.realestatelist.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class PropertyService {
    @Autowired
    private PropertyRepository propertyRepository;


    public List<Property> getAllPropertyList() {
        return propertyRepository.findAll();
    }

    public Property getPropertyById(Long propertyId) {
        Optional<Property> propertyById = propertyRepository.findById(propertyId);
        if(propertyById.isPresent()){
            return propertyById.get();
        }
        else{
            return null;
        }
    }

    public String saveAllProperty(List<Property> propertyList) {
        propertyRepository.saveAll(propertyList);
        return "Property List saved successfully";
    }

    public String saveProperty(Property property) {
        propertyRepository.save(property);
        return "Property saved successfully";
    }

    public String deletePropertyById(Long propertyId) {
       Optional<Property> propertyById = propertyRepository.findById(propertyId);
       if(propertyById.isPresent()){
           propertyRepository.deleteById(propertyId);
           return "Property deleted successfully!";
       }
       else{
           return "Property id: "+propertyId+" does not exist";
       }
    }

    public String updatePropertyById(Property property, Long propertyId) {
        Optional<Property> property1 = propertyRepository.findById(property.getPropertyId());
        if(property1.isPresent()){
            propertyRepository.save(property);
            return "Property saved successfully";
        }
        else{
            return "Property "+property.getPropertyId()+ "does not exist!";
        }
    }

   /* public String partialUpdateById(Property property, Long propertyId) {
        Optional<Property> property1 = propertyRepository.findById(property.getPropertyId());

    }

    */
}
