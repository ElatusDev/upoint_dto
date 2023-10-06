package com.upoint.dto.property;

import java.io.Serializable;
import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import jakarta.validation.constraints.Size;

@Component
@Scope("prototype")
public class PropertyDto implements Serializable {
		
	private static final long serialVersionUID = 1L;

	@Size(min = 2, max = 15, message = "property name too long or too short")
	private String propertyName;
	
	@Size(min = 2, max = 10, message = "property unit too long or too short")
	private String propertyUnit;
	

	private List<String> propertyAvailableUnits;
	
	@Size(min = 2, max = 10, message = "property value type too long or too short")
	private String propertyValueType;
	
	public String getPropertyName() {
		return propertyName;
	}
	
	public void  setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	
	public String getPropertyUnit() {
		return propertyUnit;
	}
	
	public void setPropertyUnit(String propertyUnit) {
		this.propertyUnit = propertyUnit;
	}
	
	public List<String> getPropertyAvailableUnits(){
		return propertyAvailableUnits;
	}
	
	public void setPropertyAvailableUnits(List<String> propertyAvailableUnits) {
		this.propertyAvailableUnits = propertyAvailableUnits;
	}
	
	public String getPropertyValueType() {
		return propertyValueType;
	}
	
	public void setPropertyValueType(String propertyValueType) {
		this.propertyValueType = propertyValueType;
	}
	

}
