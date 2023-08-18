package com.diyo.realestatelist.service;

import com.diyo.realestatelist.entity.Land;
import com.diyo.realestatelist.repository.LandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LandService {
    @Autowired
    private LandRepository landRepository;
    public String saveAllLandProperty(List<Land> landpropertylist) {
        landRepository.saveAll(landpropertylist);
        return "Land Property list saved successfully!";

    }

    public String saveLandProperty(Land landProperty) {
        landRepository.save(landProperty);
        return "Land Property saved successfully!";
    }

    public List<Land> getAllLandProperty() {
        return landRepository.findAll();
    }

    public Land getLandPropertyById(Long landPropertyById){
        Optional<Land> landProperty = landRepository.findById(landPropertyById);
        if(landProperty.isPresent()){
            return landProperty.get();
        }
        else{
            return null;
        }


    }

    public String updateLandPropertyById(Long landId, Land land) {
        Optional<Land> landProperty = landRepository.findById(land.getLandId());
        if(landProperty.isPresent()){
            landRepository.save(land);
            return "Land Property updated successfully!";
        }
        else{
            return "Land Property id: "+landId+ " does not exist!";
        }
    }

    public String deleteLandPropertyById(Long landId) {
        Optional<Land> landProperty = landRepository.findById(landId);
        if(landProperty.isPresent()){
            landRepository.deleteById(landId);
            return "Land Property deleted successfully!";
        }
        else{
            return "Land Property id: "+landId+ " does not exist!";
        }
    }
}
