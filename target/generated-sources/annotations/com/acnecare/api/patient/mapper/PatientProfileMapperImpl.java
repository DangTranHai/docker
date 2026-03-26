package com.acnecare.api.patient.mapper;

import com.acnecare.api.patient.dto.request.PatientProfileUpdateRequest;
import com.acnecare.api.patient.dto.response.PatientProfileResponse;
import com.acnecare.api.patient.entity.PatientProfile;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-26T15:24:10+0700",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.45.0.v20260224-0835, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class PatientProfileMapperImpl implements PatientProfileMapper {

    @Override
    public void updatePatientProfile(PatientProfileUpdateRequest request, PatientProfile patientProfile) {
        if ( request == null ) {
            return;
        }

        patientProfile.setAddress( request.getAddress() );
        patientProfile.setAllergies( request.getAllergies() );
        patientProfile.setGender( request.isGender() );
        patientProfile.setHeight( request.getHeight() );
        patientProfile.setSkinType( request.getSkinType() );
        patientProfile.setWeight( request.getWeight() );
    }

    @Override
    public PatientProfileResponse toPatientProfileResponse(PatientProfile patientProfile) {
        if ( patientProfile == null ) {
            return null;
        }

        PatientProfileResponse.PatientProfileResponseBuilder patientProfileResponse = PatientProfileResponse.builder();

        patientProfileResponse.address( patientProfile.getAddress() );
        patientProfileResponse.allergies( patientProfile.getAllergies() );
        patientProfileResponse.createdAt( patientProfile.getCreatedAt() );
        patientProfileResponse.gender( patientProfile.isGender() );
        patientProfileResponse.height( patientProfile.getHeight() );
        patientProfileResponse.skinType( patientProfile.getSkinType() );
        patientProfileResponse.updatedAt( patientProfile.getUpdatedAt() );
        patientProfileResponse.weight( patientProfile.getWeight() );

        return patientProfileResponse.build();
    }
}
