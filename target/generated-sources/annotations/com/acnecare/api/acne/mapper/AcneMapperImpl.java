package com.acnecare.api.acne.mapper;

import com.acnecare.api.acne.dto.response.AcneResponse;
import com.acnecare.api.acne.entity.Acne;
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
public class AcneMapperImpl implements AcneMapper {

    @Override
    public AcneResponse toAcneResponse(Acne acne) {
        if ( acne == null ) {
            return null;
        }

        AcneResponse.AcneResponseBuilder acneResponse = AcneResponse.builder();

        acneResponse.createdAt( acne.getCreatedAt() );
        acneResponse.description( acne.getDescription() );
        acneResponse.id( acne.getId() );
        acneResponse.name( acne.getName() );

        return acneResponse.build();
    }

    @Override
    public List<AcneResponse> toAcneResponseList(List<Acne> acnes) {
        if ( acnes == null ) {
            return null;
        }

        List<AcneResponse> list = new ArrayList<AcneResponse>( acnes.size() );
        for ( Acne acne : acnes ) {
            list.add( toAcneResponse( acne ) );
        }

        return list;
    }
}
