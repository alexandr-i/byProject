/**
 * 
 */
package com.grabandgo.server.scanner.dto.external;

import java.time.Instant;

import com.grabandgo.server.commons.dto.AbstractDto;

/**
 * @author Alexandr_I
 *
 */
public class Ean13ProductDetailsDto extends AbstractDto {

	private Integer valid;
	private String loc;
	private Instant lastmod;
	private String name;
	private String desc;
	private String man;
	private String brand;
	private String gost;
	private String contry;
	private String sostav;
	private String cat;
	private Double rating;
	private Integer inbase;
	private Integer yourlimit;

	public Integer getValid() {
		return valid;
	}

	public void setValid(Integer valid) {
		this.valid = valid;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public Instant getLastmod() {
		return lastmod;
	}

	public void setLastmod(Instant lastmod) {
		this.lastmod = lastmod;
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

	public String getMan() {
		return man;
	}

	public void setMan(String man) {
		this.man = man;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getGost() {
		return gost;
	}

	public void setGost(String gost) {
		this.gost = gost;
	}

	public String getContry() {
		return contry;
	}

	public void setContry(String contry) {
		this.contry = contry;
	}

	public String getSostav() {
		return sostav;
	}

	public void setSostav(String sostav) {
		this.sostav = sostav;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Integer getInbase() {
		return inbase;
	}

	public void setInbase(Integer inbase) {
		this.inbase = inbase;
	}

	public Integer getYourlimit() {
		return yourlimit;
	}

	public void setYourlimit(Integer yourlimit) {
		this.yourlimit = yourlimit;
	}

}
