package com.upoint.dto.category;

import java.io.Serializable;
import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Size;

@Component
@Scope("prototype")
public class CategoryDto  implements Serializable {

	private static final long serialVersionUID = 1L;
	@Size(min = 2, max = 25, message = "category name too long or too short")
	private String categoryName;
	@Size(min = 2, max = 300, message = "category description too long or too short")
	private String categoryDescription;
	private List<CategoryDto> children;
	
	
	public String getCategoryName() {
		return categoryName;
	}
	
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	public String getCategoryDescription() {
		return categoryDescription;
	}
	
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	
	public List<CategoryDto> getChildren(){
		return children;
	}
	
	public void setChildren(List<CategoryDto> children) {
		this.children = children;
	}

}
