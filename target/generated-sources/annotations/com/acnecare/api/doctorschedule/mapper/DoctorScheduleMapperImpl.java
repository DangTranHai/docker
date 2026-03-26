package com.acnecare.api.doctorschedule.mapper;

import com.acnecare.api.consultation_service.entity.ConsultationService;
import com.acnecare.api.doctor.entity.DoctorProfile;
import com.acnecare.api.doctorschedule.dto.request.DoctorScheduleCreationRequest;
import com.acnecare.api.doctorschedule.dto.request.DoctorScheduleUpdateRequest;
import com.acnecare.api.doctorschedule.dto.response.DoctorScheduleResponse;
import com.acnecare.api.doctorschedule.entity.DoctorSchedule;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-26T15:24:11+0700",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.45.0.v20260224-0835, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class DoctorScheduleMapperImpl implements DoctorScheduleMapper {

    @Override
    public DoctorScheduleResponse toDoctorScheduleResponse(DoctorSchedule doctorSchedule) {
        if ( doctorSchedule == null ) {
            return null;
        }

        DoctorScheduleResponse.DoctorScheduleResponseBuilder doctorScheduleResponse = DoctorScheduleResponse.builder();

        doctorScheduleResponse.doctorId( doctorScheduleDoctorId( doctorSchedule ) );
        doctorScheduleResponse.consultationServiceId( doctorScheduleConsultationServiceId( doctorSchedule ) );
        doctorScheduleResponse.consultationServiceName( doctorScheduleConsultationServiceServiceName( doctorSchedule ) );
        doctorScheduleResponse.createdAt( doctorSchedule.getCreatedAt() );
        doctorScheduleResponse.endTime( doctorSchedule.getEndTime() );
        doctorScheduleResponse.id( doctorSchedule.getId() );
        doctorScheduleResponse.note( doctorSchedule.getNote() );
        doctorScheduleResponse.startTime( doctorSchedule.getStartTime() );
        doctorScheduleResponse.status( doctorSchedule.getStatus() );
        doctorScheduleResponse.updatedAt( doctorSchedule.getUpdatedAt() );

        return doctorScheduleResponse.build();
    }

    @Override
    public DoctorSchedule toDoctorSchedule(DoctorScheduleCreationRequest request) {
        if ( request == null ) {
            return null;
        }

        DoctorSchedule.DoctorScheduleBuilder doctorSchedule = DoctorSchedule.builder();

        doctorSchedule.endTime( request.getEndTime() );
        doctorSchedule.note( request.getNote() );
        doctorSchedule.startTime( request.getStartTime() );
        doctorSchedule.status( request.getStatus() );

        return doctorSchedule.build();
    }

    @Override
    public void updateDoctorSchedule(DoctorScheduleUpdateRequest request, DoctorSchedule doctorSchedule) {
        if ( request == null ) {
            return;
        }

        doctorSchedule.setEndTime( request.getEndTime() );
        doctorSchedule.setNote( request.getNote() );
        doctorSchedule.setStartTime( request.getStartTime() );
        doctorSchedule.setStatus( request.getStatus() );
    }

    private String doctorScheduleDoctorId(DoctorSchedule doctorSchedule) {
        DoctorProfile doctor = doctorSchedule.getDoctor();
        if ( doctor == null ) {
            return null;
        }
        return doctor.getId();
    }

    private String doctorScheduleConsultationServiceId(DoctorSchedule doctorSchedule) {
        ConsultationService consultationService = doctorSchedule.getConsultationService();
        if ( consultationService == null ) {
            return null;
        }
        return consultationService.getId();
    }

    private String doctorScheduleConsultationServiceServiceName(DoctorSchedule doctorSchedule) {
        ConsultationService consultationService = doctorSchedule.getConsultationService();
        if ( consultationService == null ) {
            return null;
        }
        return consultationService.getServiceName();
    }
}
