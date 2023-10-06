package com.upoint.dto.category;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Component
@Scope("prototype")
public class UpdateCategoryDto {

	@NotNull
	private Integer id;
	
	@Size(min = 3, max = 25, message = "not able to update category, name too big or too long")
	private String name;
	
	@Size(min = 3, max = 300, message = "not able to update category, description too big or too long")
	private String description;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
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
