package com.acnecare.api.user.mapper;

import com.acnecare.api.role.entity.Role;
import com.acnecare.api.user.dto.request.UserCreationRequest;
import com.acnecare.api.user.dto.request.UserUpdateRequest;
import com.acnecare.api.user.dto.response.UserResponse;
import com.acnecare.api.user.entity.User;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-26T15:24:11+0700",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.45.0.v20260224-0835, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toUser(UserCreationRequest request) {
        if ( request == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.avatarUrl( request.getAvatarUrl() );
        user.dob( request.getDob() );
        user.email( request.getEmail() );
        user.firstName( request.getFirstName() );
        user.lastName( request.getLastName() );
        user.password( request.getPassword() );
        user.phone( request.getPhone() );

        return user.build();
    }

    @Override
    public void updateUser(UserUpdateRequest request, User user) {
        if ( request == null ) {
            return;
        }

        user.setAvatarUrl( request.getAvatarUrl() );
        user.setDob( request.getDob() );
        user.setFirstName( request.getFirstName() );
        user.setLastName( request.getLastName() );
        user.setPassword( request.getPassword() );
        user.setPhone( request.getPhone() );
    }

    @Override
    public UserResponse toUserCreationResponse(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponse.UserResponseBuilder userResponse = UserResponse.builder();

        userResponse.avatarUrl( user.getAvatarUrl() );
        userResponse.createdAt( user.getCreatedAt() );
        userResponse.dob( user.getDob() );
        userResponse.email( user.getEmail() );
        userResponse.firstName( user.getFirstName() );
        userResponse.id( user.getId() );
        userResponse.lastLoginAt( user.getLastLoginAt() );
        userResponse.lastName( user.getLastName() );
        userResponse.phone( user.getPhone() );
        Set<Role> set = user.getRoles();
        if ( set != null ) {
            userResponse.roles( new LinkedHashSet<Role>( set ) );
        }
        userResponse.status( user.getStatus() );
        userResponse.updatedAt( user.getUpdatedAt() );

        return userResponse.build();
    }

    @Override
    public List<UserResponse> toUserCreationResponses(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<UserResponse> list = new ArrayList<UserResponse>( users.size() );
        for ( User user : users ) {
            list.add( toUserCreationResponse( user ) );
        }

        return list;
    }

    @Override
    public List<UserResponse> toUserResponseList(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<UserResponse> list = new ArrayList<UserResponse>( users.size() );
        for ( User user : users ) {
            list.add( toUserCreationResponse( user ) );
        }

        return list;
    }
}
