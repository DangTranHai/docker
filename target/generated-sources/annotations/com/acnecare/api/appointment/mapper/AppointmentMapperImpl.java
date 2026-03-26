package com.acnecare.api.appointment.mapper;

import com.acnecare.api.appointment.dto.request.AppointmentCreationRequest;
import com.acnecare.api.appointment.dto.request.AppointmentUpdateRequest;
import com.acnecare.api.appointment.dto.response.AppointmentResponse;
import com.acnecare.api.appointment.entity.Appointment;
import com.acnecare.api.user.entity.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-26T15:24:11+0700",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.45.0.v20260224-0835, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class AppointmentMapperImpl implements AppointmentMapper {

    @Override
    public Appointment toAppointment(AppointmentCreationRequest request) {
        if ( request == null ) {
            return null;
        }

        Appointment.AppointmentBuilder appointment = Appointment.builder();

        appointment.appointmentTime( request.getAppointmentTime() );
        appointment.mode( request.getMode() );
        appointment.note( request.getNote() );
        appointment.paymentMethod( request.getPaymentMethod() );
        appointment.serviceId( request.getServiceId() );

        return appointment.build();
    }

    @Override
    public AppointmentResponse toAppointmentResponse(Appointment appointment) {
        if ( appointment == null ) {
            return null;
        }

        AppointmentResponse.AppointmentResponseBuilder appointmentResponse = AppointmentResponse.builder();

        appointmentResponse.patientId( appointmentPatientId( appointment ) );
        appointmentResponse.patientAvatar( appointmentPatientAvatarUrl( appointment ) );
        appointmentResponse.doctorId( appointmentDoctorId( appointment ) );
        appointmentResponse.doctorAvatar( appointmentDoctorAvatarUrl( appointment ) );
        appointmentResponse.appointmentTime( appointment.getAppointmentTime() );
        appointmentResponse.createdAt( appointment.getCreatedAt() );
        appointmentResponse.id( appointment.getId() );
        appointmentResponse.meetingUrl( appointment.getMeetingUrl() );
        appointmentResponse.mode( appointment.getMode() );
        appointmentResponse.note( appointment.getNote() );
        appointmentResponse.paymentMethod( appointment.getPaymentMethod() );
        appointmentResponse.paymentStatus( appointment.getPaymentStatus() );
        appointmentResponse.rating( appointment.getRating() );
        appointmentResponse.review( appointment.getReview() );
        appointmentResponse.serviceId( appointment.getServiceId() );
        appointmentResponse.serviceName( appointment.getServiceName() );
        appointmentResponse.status( appointment.getStatus() );

        appointmentResponse.patientName( (appointment.getPatient().getFirstName() != null ? appointment.getPatient().getFirstName() : "") + " " + (appointment.getPatient().getLastName() != null ? appointment.getPatient().getLastName() : "") );
        appointmentResponse.doctorName( (appointment.getDoctor().getFirstName() != null ? appointment.getDoctor().getFirstName() : "") + " " + (appointment.getDoctor().getLastName() != null ? appointment.getDoctor().getLastName() : "") );

        return appointmentResponse.build();
    }

    @Override
    public List<AppointmentResponse> toAppointmentResponseList(List<Appointment> appointments) {
        if ( appointments == null ) {
            return null;
        }

        List<AppointmentResponse> list = new ArrayList<AppointmentResponse>( appointments.size() );
        for ( Appointment appointment : appointments ) {
            list.add( toAppointmentResponse( appointment ) );
        }

        return list;
    }

    @Override
    public void updateAppointment(Appointment appointment, AppointmentUpdateRequest request) {
        if ( request == null ) {
            return;
        }

        appointment.setMeetingUrl( request.getMeetingUrl() );
        appointment.setPaymentStatus( request.getPaymentStatus() );
        appointment.setStatus( request.getStatus() );
    }

    private String appointmentPatientId(Appointment appointment) {
        User patient = appointment.getPatient();
        if ( patient == null ) {
            return null;
        }
        return patient.getId();
    }

    private String appointmentPatientAvatarUrl(Appointment appointment) {
        User patient = appointment.getPatient();
        if ( patient == null ) {
            return null;
        }
        return patient.getAvatarUrl();
    }

    private String appointmentDoctorId(Appointment appointment) {
        User doctor = appointment.getDoctor();
        if ( doctor == null ) {
            return null;
        }
        return doctor.getId();
    }

    private String appointmentDoctorAvatarUrl(Appointment appointment) {
        User doctor = appointment.getDoctor();
        if ( doctor == null ) {
            return null;
        }
        return doctor.getAvatarUrl();
    }
}
