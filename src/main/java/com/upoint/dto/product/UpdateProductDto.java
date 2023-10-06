package com.upoint.dto.product;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Component
@Scope("prototype")
public class UpdateProductDto {
	
	@NotNull
	private Long id;
	@Size(min = 3, max = 25, message = "not able to update product, name too big or too long ")
	private String name;
	@Size(min = 4, max = 250, message = "not able to update product, description too big or too long")
	private String description;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
