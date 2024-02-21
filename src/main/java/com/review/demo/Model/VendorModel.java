package com.review.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class VendorModel {
    @Id
    private int VendorId;
    private String VendorName;
    private String VendorType;
    private String VendorSpeciality;
    private int VendorExperience;
    public VendorModel(int vendorId, String vendorName, String vendorType, String vendorSpeciality,
            int vendorExperience) {
        VendorId = vendorId;
        VendorName = vendorName;
        VendorType = vendorType;
        VendorSpeciality = vendorSpeciality;
        VendorExperience = vendorExperience;
    }
    public int getVendorId() {
        return VendorId;
    }
    public void setVendorId(int vendorId) {
        VendorId = vendorId;
    }
    public String getVendorName() {
        return VendorName;
    }
    public void setVendorName(String vendorName) {
        VendorName = vendorName;
    }
    public String getVendorType() {
        return VendorType;
    }
    public void setVendorType(String vendorType) {
        VendorType = vendorType;
    }
    public String getVendorSpeciality() {
        return VendorSpeciality;
    }
    public void setVendorSpeciality(String vendorSpeciality) {
        VendorSpeciality = vendorSpeciality;
    }
    public int getVendorExperience() {
        return VendorExperience;
    }
    public void setVendorExperience(int vendorExperience) {
        VendorExperience = vendorExperience;
    }

    
}
