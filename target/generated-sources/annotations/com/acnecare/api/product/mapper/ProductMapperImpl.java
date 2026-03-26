package com.acnecare.api.product.mapper;

import com.acnecare.api.category.mapper.CategoryMapper;
import com.acnecare.api.product.dto.request.ProductCreationRequest;
import com.acnecare.api.product.dto.request.ProductUpdateRequest;
import com.acnecare.api.product.dto.response.ProductResponse;
import com.acnecare.api.product.entity.Product;
import com.acnecare.api.user.entity.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-26T15:24:11+0700",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.45.0.v20260224-0835, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public Product toProduct(ProductCreationRequest request) {
        if ( request == null ) {
            return null;
        }

        Product.ProductBuilder product = Product.builder();

        product.affiliateUrl( request.getAffiliateUrl() );
        product.brand( request.getBrand() );
        product.description( request.getDescription() );
        product.imagesUrl( request.getImagesUrl() );
        product.ingredients( request.getIngredients() );
        product.name( request.getName() );
        product.thumbnailUrl( request.getThumbnailUrl() );

        return product.build();
    }

    @Override
    public ProductResponse toProductResponse(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductResponse.ProductResponseBuilder productResponse = ProductResponse.builder();

        productResponse.createdBy( productCreatedById( product ) );
        productResponse.affiliateUrl( product.getAffiliateUrl() );
        productResponse.approvalStatus( product.getApprovalStatus() );
        productResponse.brand( product.getBrand() );
        productResponse.category( categoryMapper.toCategoryResponse( product.getCategory() ) );
        productResponse.createdAt( product.getCreatedAt() );
        productResponse.description( product.getDescription() );
        productResponse.id( product.getId() );
        productResponse.imagesUrl( product.getImagesUrl() );
        productResponse.ingredients( product.getIngredients() );
        productResponse.name( product.getName() );
        productResponse.thumbnailUrl( product.getThumbnailUrl() );

        return productResponse.build();
    }

    @Override
    public List<ProductResponse> toProductResponseList(List<Product> products) {
        if ( products == null ) {
            return null;
        }

        List<ProductResponse> list = new ArrayList<ProductResponse>( products.size() );
        for ( Product product : products ) {
            list.add( toProductResponse( product ) );
        }

        return list;
    }

    @Override
    public void updateProduct(ProductUpdateRequest request, Product product) {
        if ( request == null ) {
            return;
        }

        product.setAffiliateUrl( request.getAffiliateUrl() );
        product.setBrand( request.getBrand() );
        product.setDescription( request.getDescription() );
        product.setImagesUrl( request.getImagesUrl() );
        product.setIngredients( request.getIngredients() );
        product.setName( request.getName() );
        product.setThumbnailUrl( request.getThumbnailUrl() );
    }

    private String productCreatedById(Product product) {
        User createdBy = product.getCreatedBy();
        if ( createdBy == null ) {
            return null;
        }
        return createdBy.getId();
    }
}
