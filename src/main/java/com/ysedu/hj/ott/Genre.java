package com.ysedu.hj.ott;

import java.sql.Date;

public class Genre {
	public Integer id;
	public String name;
	public Date productionYear;
	public String description;
	public String genre;
	
	
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
	public Date getProductionYear() {
		return productionYear;
	}
	public void setProductionYear(Date productionYear) {
		this.productionYear = productionYear;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
}
