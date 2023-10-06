package com.upoint.dto.product;

import java.io.Serializable;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


@Component
@Scope("prototype")
public class ProductDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Null
	private Long productId;
	
	@Pattern(regexp = "[\\w]{16}" )
	private String productCode;
	
	@NotNull
	@NotEmpty
	@Size(max = 25)
	private String productName;
	
	@Size(max = 250)
	private String productDescription;
	
	@NotNull
	private Integer categoryId;
	
	@NotNull
	@Size(min = 1)
	private List<Integer> propertyIds;
	
	@NotNull
	private Long companyId;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public List<Integer> getPropertyIds() {
		return propertyIds;
	}

	public void setPropertyIds(List<Integer> propertyIds) {
		this.propertyIds = propertyIds;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
		       