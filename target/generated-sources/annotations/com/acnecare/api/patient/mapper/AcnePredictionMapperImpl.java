package com.acnecare.api.patient.mapper;

import com.acnecare.api.patient.dto.request.AcnePredictionCreationRequest;
import com.acnecare.api.patient.dto.request.AcnePredictionUpdateRequest;
import com.acnecare.api.patient.dto.response.AcnePredictionResponse;
import com.acnecare.api.patient.entity.AcnePrediction;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-26T15:24:10+0700",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.45.0.v20260224-0835, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class AcnePredictionMapperImpl implements AcnePredictionMapper {

    @Override
    public AcnePrediction toAcnePrediction(AcnePredictionCreationRequest request) {
        if ( request == null ) {
            return null;
        }

        AcnePrediction.AcnePredictionBuilder acnePrediction = AcnePrediction.builder();

        acnePrediction.name( request.getName() );
        acnePrediction.note( request.getNote() );
        acnePrediction.originalImageUrl( request.getOriginalImageUrl() );

        return acnePrediction.build();
    }

    @Override
    public void updateAcnePrediction(AcnePrediction acnePrediction, AcnePredictionUpdateRequest request) {
        if ( request == null ) {
            return;
        }

        acnePrediction.setName( request.getName() );
        acnePrediction.setNote( request.getNote() );
        acnePrediction.setOriginalImageUrl( request.getOriginalImageUrl() );
    }

    @Override
    public AcnePredictionResponse toAcnePredictionResponse(AcnePrediction acnePrediction) {
        if ( acnePrediction == null ) {
            return null;
        }

        AcnePredictionResponse.AcnePredictionResponseBuilder acnePredictionResponse = AcnePredictionResponse.builder();

        acnePredictionResponse.createdAt( acnePrediction.getCreatedAt() );
        acnePredictionResponse.id( acnePrediction.getId() );
        acnePredictionResponse.name( acnePrediction.getName() );
        acnePredictionResponse.note( acnePrediction.getNote() );
        acnePredictionResponse.originalImageUrl( acnePrediction.getOriginalImageUrl() );
        acnePredictionResponse.updatedAt( acnePrediction.getUpdatedAt() );

        return acnePredictionResponse.build();
    }

    @Override
    public List<AcnePredictionResponse> toAcnePredictionResponses(List<AcnePrediction> acnePredictions) {
        if ( acnePredictions == null ) {
            return null;
        }

        List<AcnePredictionResponse> list = new ArrayList<AcnePredictionResponse>( acnePredictions.size() );
        for ( AcnePrediction acnePrediction : acnePredictions ) {
            list.add( toAcnePredictionResponse( acnePrediction ) );
        }

        return list;
    }
}
