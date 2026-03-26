package com.acnecare.api.admin.mapper;

import com.acnecare.api.admin.dto.response.AdminProfileResponse;
import com.acnecare.api.admin.dto.response.UserListResponse;
import com.acnecare.api.admin.entity.AdminProfile;
import com.acnecare.api.user.entity.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-26T15:24:11+0700",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.45.0.v20260224-0835, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class AdminMapperImpl implements AdminMapper {

    @Override
    public AdminProfileResponse toAdminProfileResponse(AdminProfile adminProfile) {
        if ( adminProfile == null ) {
            return null;
        }

        AdminProfileResponse.AdminProfileResponseBuilder adminProfileResponse = AdminProfileResponse.builder();

        adminProfileResponse.department( adminProfile.getDepartment() );

        return adminProfileResponse.build();
    }

    @Override
    public UserListResponse toUserListResponse(User user) {
        if ( user == null ) {
            return null;
        }

        UserListResponse.UserListResponseBuilder userListResponse = UserListResponse.builder();

        userListResponse.username( user.getEmail() );
        userListResponse.createdAt( user.getCreatedAt() );
        userListResponse.email( user.getEmail() );
        userListResponse.id( user.getId() );
        userListResponse.status( user.getStatus() );

        userListResponse.role( getPrimaryRole(user) );

        return userListResponse.build();
    }
}
