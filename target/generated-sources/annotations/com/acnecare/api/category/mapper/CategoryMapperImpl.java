package com.acnecare.api.category.mapper;

import com.acnecare.api.category.dto.request.CategoryCreationRequest;
import com.acnecare.api.category.dto.request.CategoryUpdateRequest;
import com.acnecare.api.category.dto.response.CategoryResponse;
import com.acnecare.api.category.entity.Category;
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
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public Category toCategory(CategoryCreationRequest request) {
        if ( request == null ) {
            return null;
        }

        Category.CategoryBuilder category = Category.builder();

        category.name( request.getName() );

        return category.build();
    }

    @Override
    public CategoryResponse toCategoryResponse(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryResponse.CategoryResponseBuilder categoryResponse = CategoryResponse.builder();

        categoryResponse.id( category.getId() );
        categoryResponse.name( category.getName() );

        return categoryResponse.build();
    }

    @Override
    public void updateCategory(CategoryUpdateRequest request, Category category) {
        if ( request == null ) {
            return;
        }

        category.setName( request.getName() );
    }

    @Override
    public List<CategoryResponse> toCategoryResponseList(List<Category> categories) {
        if ( categories == null ) {
            return null;
        }

        List<CategoryResponse> list = new ArrayList<CategoryResponse>( categories.size() );
        for ( Category category : categories ) {
            list.add( toCategoryResponse( category ) );
        }

        return list;
    }
}
