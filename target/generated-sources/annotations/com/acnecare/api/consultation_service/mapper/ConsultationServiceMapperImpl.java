package com.acnecare.api.consultation_service.mapper;

import com.acnecare.api.consultation_service.dto.request.ConsultationServiceCreationRequest;
import com.acnecare.api.consultation_service.dto.request.ConsultationServiceUpdateRequest;
import com.acnecare.api.consultation_service.dto.response.ConsultationServiceResponse;
import com.acnecare.api.consultation_service.entity.ConsultationService;
import com.acnecare.api.doctor.entity.DoctorProfile;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-26T15:24:11+0700",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.45.0.v20260224-0835, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class ConsultationServiceMapperImpl implements ConsultationServiceMapper {

    @Override
    public ConsultationServiceResponse toConsultationServiceResponse(ConsultationService consultationService) {
        if ( consultationService == null ) {
            return null;
        }

        ConsultationServiceResponse.ConsultationServiceResponseBuilder consultationServiceResponse = ConsultationServiceResponse.builder();

        consultationServiceResponse.doctorId( consultationServiceDoctorId( consultationService ) );
        consultationServiceResponse.createdAt( consultationService.getCreatedAt() );
        consultationServiceResponse.currency( consultationService.getCurrency() );
        consultationServiceResponse.description( consultationService.getDescription() );
        consultationServiceResponse.durationMinutes( consultationService.getDurationMinutes() );
        consultationServiceResponse.id( consultationService.getId() );
        consultationServiceResponse.isActive( consultationService.getIsActive() );
        consultationServiceResponse.mode( consultationService.getMode() );
        consultationServiceResponse.price( consultationService.getPrice() );
        consultationServiceResponse.serviceName( consultationService.getServiceName() );
        consultationServiceResponse.updatedAt( consultationService.getUpdatedAt() );

        return consultationServiceResponse.build();
    }

    @Override
    public ConsultationService toConsultationService(ConsultationServiceCreationRequest request) {
        if ( request == null ) {
            return null;
        }

        ConsultationService.ConsultationServiceBuilder consultationService = ConsultationService.builder();

        consultationService.currency( request.getCurrency() );
        consultationService.description( request.getDescription() );
        consultationService.durationMinutes( request.getDurationMinutes() );
        consultationService.isActive( request.getIsActive() );
        consultationService.mode( request.getMode() );
        consultationService.price( request.getPrice() );
        consultationService.serviceName( request.getServiceName() );

        return consultationService.build();
    }

    @Override
    public void updateConsultationService(ConsultationServiceUpdateRequest request, ConsultationService consultationService) {
        if ( request == null ) {
            return;
        }

        consultationService.setCurrency( request.getCurrency() );
        consultationService.setDescription( request.getDescription() );
        consultationService.setDurationMinutes( request.getDurationMinutes() );
        consultationService.setIsActive( request.getIsActive() );
        consultationService.setMode( request.getMode() );
        consultationService.setPrice( request.getPrice() );
        consultationService.setServiceName( request.getServiceName() );
    }

    private String consultationServiceDoctorId(ConsultationService consultationService) {
        DoctorProfile doctor = consultationService.getDoctor();
        if ( doctor == null ) {
            return null;
        }
        return doctor.getId();
    }
}
