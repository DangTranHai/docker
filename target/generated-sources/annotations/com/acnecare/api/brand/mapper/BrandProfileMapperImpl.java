package com.acnecare.api.brand.mapper;

import com.acnecare.api.brand.dto.request.BrandProfileUpdateRequest;
import com.acnecare.api.brand.dto.response.BrandProfileResponse;
import com.acnecare.api.brand.entity.BrandProfile;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-26T15:24:11+0700",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.45.0.v20260224-0835, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class BrandProfileMapperImpl implements BrandProfileMapper {

    @Override
    public BrandProfile toBrandProfile(BrandProfileUpdateRequest request) {
        if ( request == null ) {
            return null;
        }

        BrandProfile.BrandProfileBuilder brandProfile = BrandProfile.builder();

        brandProfile.brandName( request.getBrandName() );
        brandProfile.description( request.getDescription() );
        brandProfile.logoUrl( request.getLogoUrl() );
        brandProfile.website( request.getWebsite() );

        return brandProfile.build();
    }

    @Override
    public BrandProfileResponse toBrandProfileResponse(BrandProfile brandProfile) {
        if ( brandProfile == null ) {
            return null;
        }

        BrandProfileResponse.BrandProfileResponseBuilder brandProfileResponse = BrandProfileResponse.builder();

        brandProfileResponse.brandName( brandProfile.getBrandName() );
        brandProfileResponse.createdAt( brandProfile.getCreatedAt() );
        brandProfileResponse.description( brandProfile.getDescription() );
        brandProfileResponse.logoUrl( brandProfile.getLogoUrl() );
        brandProfileResponse.rejectionReason( brandProfile.getRejectionReason() );
        brandProfileResponse.updatedAt( brandProfile.getUpdatedAt() );
        brandProfileResponse.verificationStatus( brandProfile.getVerificationStatus() );
        brandProfileResponse.website( brandProfile.getWebsite() );

        return brandProfileResponse.build();
    }

    @Override
    public void updateBrand(BrandProfileUpdateRequest request, BrandProfile brandProfile) {
        if ( request == null ) {
            return;
        }

        brandProfile.setBrandName( request.getBrandName() );
        brandProfile.setDescription( request.getDescription() );
        brandProfile.setLogoUrl( request.getLogoUrl() );
        brandProfile.setWebsite( request.getWebsite() );
    }
}
