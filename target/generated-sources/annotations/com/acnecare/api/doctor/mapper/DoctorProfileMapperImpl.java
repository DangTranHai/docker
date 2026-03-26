package com.acnecare.api.doctor.mapper;

import com.acnecare.api.doctor.dto.request.DoctorProfileUpdateRequest;
import com.acnecare.api.doctor.dto.response.DoctorProfileResponse;
import com.acnecare.api.doctor.entity.DoctorProfile;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-26T15:24:11+0700",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.45.0.v20260224-0835, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class DoctorProfileMapperImpl implements DoctorProfileMapper {

    @Override
    public DoctorProfileResponse toDoctorProfileResponse(DoctorProfile doctorProfile) {
        if ( doctorProfile == null ) {
            return null;
        }

        DoctorProfileResponse.DoctorProfileResponseBuilder doctorProfileResponse = DoctorProfileResponse.builder();

        doctorProfileResponse.address( doctorProfile.getAddress() );
        doctorProfileResponse.bio( doctorProfile.getBio() );
        doctorProfileResponse.clinicName( doctorProfile.getClinicName() );
        doctorProfileResponse.dob( doctorProfile.getDob() );
        doctorProfileResponse.licenseUrl( doctorProfile.getLicenseUrl() );
        doctorProfileResponse.ratingAvg( doctorProfile.getRatingAvg() );
        doctorProfileResponse.ratingCount( doctorProfile.getRatingCount() );
        doctorProfileResponse.rejectionReason( doctorProfile.getRejectionReason() );
        doctorProfileResponse.specialty( doctorProfile.getSpecialty() );
        doctorProfileResponse.verificationStatus( doctorProfile.getVerificationStatus() );
        doctorProfileResponse.yearsExperience( doctorProfile.getYearsExperience() );

        return doctorProfileResponse.build();
    }

    @Override
    public void updateDoctorProfile(DoctorProfileUpdateRequest request, DoctorProfile doctorProfile) {
        if ( request == null ) {
            return;
        }

        doctorProfile.setAddress( request.getAddress() );
        doctorProfile.setBio( request.getBio() );
        doctorProfile.setClinicName( request.getClinicName() );
        doctorProfile.setDob( request.getDob() );
        doctorProfile.setLicenseUrl( request.getLicenseUrl() );
        doctorProfile.setSpecialty( request.getSpecialty() );
        doctorProfile.setYearsExperience( request.getYearsExperience() );
    }
}
