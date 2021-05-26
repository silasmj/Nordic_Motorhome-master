package com.example.nordic_motorhome.Service;

import com.example.nordic_motorhome.Model.Customer;
import com.example.nordic_motorhome.Model.Motorhome;
import com.example.nordic_motorhome.Repository.MotorhomeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotorhomeService {
    @Autowired
    MotorhomeRepo motorhomeRepo;

    public List<Motorhome> showMotorhome() {
        return motorhomeRepo.showMotorhome();
    }
    public Motorhome createMotorhome(Motorhome m){
        return motorhomeRepo.createMotorhome(m);
    }
    public Boolean deleteMotorhome(int motorhome_id){
        return motorhomeRepo.deleteMotorhome(motorhome_id);
    }
    public Motorhome updateMotorhome(int motorhome_id, Motorhome m){
        return motorhomeRepo.updateMotorhome(motorhome_id, m);
    }
    public Motorhome findMotorhomeById(int motorhome_id){
        return motorhomeRepo.findMotorhomeById(motorhome_id);
    }
    public List<Motorhome> showUrbanPlus() {
        return motorhomeRepo.showMotorhome();
    }
    public List<Motorhome> showCompactPlus() {
        return motorhomeRepo.showMotorhome();
    }
    public List<Motorhome> showFamilyPlus() {
        return motorhomeRepo.showMotorhome();
    }
    public List<Motorhome> showPremiumPlus() {
        return motorhomeRepo.showMotorhome();
    }
    public List<Motorhome> showUrbanLuxury() {
        return motorhomeRepo.showMotorhome();
    }
    public List<Motorhome> showCompactLuxury() {
        return motorhomeRepo.showMotorhome();
    }
    public List<Motorhome> showFamilyLuxury() {
        return motorhomeRepo.showMotorhome();
    }
    public List<Motorhome> showPremiumLuxury() {
        return motorhomeRepo.showMotorhome();
    }

}