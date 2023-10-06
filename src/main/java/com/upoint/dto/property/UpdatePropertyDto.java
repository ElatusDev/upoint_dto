package com.upoint.dto.property;

import java.io.Serializable;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Component
@Scope("prototype")
public class UpdatePropertyDto implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@NotNull
	private Integer propertyId;
	
	@Size(min = 2, max = 15, message = "not able to update property, name too big or too long")
	private String propertyName;
	
	private List<String> propertyAvailableUnits;
	
	public Integer getPropertyid() {
		return propertyId;
	}
	
	public void setpropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}
	
	public String getPropertyName() {
		return propertyName;
	}
	
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	
	public List<String> getPropertyAvaliableUnits() {
		return propertyAvailableUnits;
	}
	
	public void setPropertyAvailableUnits(List<String> propertyAvailableUnits) {
		this.propertyAvailableUnits = propertyAvailableUnits;
	}
}
