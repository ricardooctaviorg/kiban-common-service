package com.finalsoft.common.domain.bean;

public class HealthCheck {
	
	private String component;
	private String status;
	

	public HealthCheck() {
		super();
	}
	
	public HealthCheck(String component, String status) {
		super();
		this.component = component;
		this.status = status;
	}
	
	public String getComponent() {
		return component;
	}
	public void setComponent(String component) {
		this.component = component;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "HealthCheck [component=" + component + ", status=" + status + "]";
	}
	
}
