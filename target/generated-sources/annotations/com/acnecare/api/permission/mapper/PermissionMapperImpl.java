package com.acnecare.api.permission.mapper;

import com.acnecare.api.permission.dto.request.PermissionCreationRequest;
import com.acnecare.api.permission.dto.response.PermissionResponse;
import com.acnecare.api.permission.entity.Permission;
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
public class PermissionMapperImpl implements PermissionMapper {

    @Override
    public Permission toPermission(PermissionCreationRequest request) {
        if ( request == null ) {
            return null;
        }

        Permission.PermissionBuilder permission = Permission.builder();

        permission.description( request.getDescription() );
        permission.name( request.getName() );

        return permission.build();
    }

    @Override
    public PermissionResponse toPermissionResponse(Permission permission) {
        if ( permission == null ) {
            return null;
        }

        PermissionResponse.PermissionResponseBuilder permissionResponse = PermissionResponse.builder();

        permissionResponse.description( permission.getDescription() );
        permissionResponse.name( permission.getName() );

        return permissionResponse.build();
    }

    @Override
    public List<PermissionResponse> toPermissionResponseList(List<Permission> permissions) {
        if ( permissions == null ) {
            return null;
        }

        List<PermissionResponse> list = new ArrayList<PermissionResponse>( permissions.size() );
        for ( Permission permission : permissions ) {
            list.add( toPermissionResponse( permission ) );
        }

        return list;
    }
}
