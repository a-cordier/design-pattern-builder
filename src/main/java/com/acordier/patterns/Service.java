package com.acordier.patterns;

import java.util.Date;

public class Service {
	
	private String name;
	private Date dateOfCreation;
	
	private String desc; // optional parameter	
	
	private Service(ServiceBuilder builder){
		this.name = builder.name;
		this.dateOfCreation = builder.dateOfCreation;
		this.desc = builder.desc;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	/**
	 * Get up time in milliseconds
	 * @return
	 */
	public long getUpTime(){
		return new Date().getTime() - dateOfCreation.getTime();
	}



	@Override
	public String toString() {
		return "Service [name=" + name + ", up time=" + getUpTime()
				+ " ms, desc=" + desc + "]";
	}



	/* Builder class: use this naming convention */
	public static class ServiceBuilder {
		
		private String name;
		private Date dateOfCreation;
		private String desc;
		
		
		public ServiceBuilder(String name){
			this.dateOfCreation = new Date();
			this.name = name;
		}

		public ServiceBuilder setDesc(String desc) {
			this.desc = desc;
			return this;
		}
		
		public Service build(){
			return new Service(this);
		}
		
	}

}
