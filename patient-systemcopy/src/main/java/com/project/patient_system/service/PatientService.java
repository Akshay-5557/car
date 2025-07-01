package com.project.patient_system.service;



import com.project.patient_system.entity.Patient;
import com.project.patient_system.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public Patient savePatient(Patient patient) {
        patient.setCreatedDate(LocalDateTime.now());
        patient.setModifiedDate(LocalDateTime.now());
        return patientRepository.save(patient);
    }
}
