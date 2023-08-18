package com.diyo.realestatelist.controller;

import com.diyo.realestatelist.entity.Land;
import com.diyo.realestatelist.service.LandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("land")
public class LandController {
    @Autowired
    private LandService landService;

    @PostMapping("/all")
    public ResponseEntity<String> saveAllLand(@RequestBody List<Land> land){
        String result = landService.saveAllLandProperty(land);
        return ResponseEntity.status(200).body(result);
    }
    @PostMapping
    public ResponseEntity<String> saveLand( @RequestBody Land land){
        String result = landService.saveLandProperty(land);
        return ResponseEntity.status(200).body(result);
    }
    @GetMapping
    public ResponseEntity<List<Land>> getLandPropertyList(){
        List<Land> landPropertyList = landService.getAllLandProperty();
        return ResponseEntity.status(200).body(landPropertyList);
    }
    @GetMapping("/{landId}")
    public ResponseEntity<Land> getLandPropertyById(@PathVariable("landId") Long landId){
        Land landById = landService.getLandPropertyById(landId);
        return ResponseEntity.status(200).body(landById);
    }
    @PutMapping("/{landId}")
    public ResponseEntity<String> updateLandPropertyById(@PathVariable("landId") Long landId, @RequestBody Land land){
        String result = landService.updateLandPropertyById(landId, land);
        return ResponseEntity.status(200).body(result);
    }
    @DeleteMapping("/{landId}")
    public ResponseEntity<String> deleteLandPropertyById(@PathVariable("landId") Long landId){
        String result = landService.deleteLandPropertyById(landId);
        return ResponseEntity.status(200).body(result);
    }
}
