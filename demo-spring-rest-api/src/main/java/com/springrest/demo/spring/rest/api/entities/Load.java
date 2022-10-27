package com.springrest.demo.spring.rest.api.entities;


import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
@Table(name="TruckLoad")
public class Load {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long loadId;
	private String loadingPoint;
	private String unloadingPoint;
	private String productType;
	private String  truckType;
	private Integer  noOfTrucks;
	private Integer weight;
    private String comment;
	private Long shipperId;
	private String date;
	
	 public Load(Long loadid, String loadingPoint, String unloadingPoint, String productType, String truckType,
			 Integer noOfTrucks, Integer weight, String comment, Long shipperId, String date) {
			super();
			this.loadId = loadid;
			this.loadingPoint = loadingPoint;
			this.unloadingPoint = unloadingPoint;
			this.productType = productType;
			this.truckType = truckType;
			this.noOfTrucks = noOfTrucks;
			this.weight = weight;
			this.comment = comment;
			this.shipperId = shipperId;
			this.date = date;
		}

	public Load() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getLoadId() {
		return loadId;
	}

	public void setLoadId(Long loadid) {
		this.loadId = loadid;
	}

	public String getLoadingPoint() {
		return loadingPoint;
	}

	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}

	public String getUnloadingPoint() {
		return unloadingPoint;
	}

	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getTruckType() {
		return truckType;
	}

	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}

	public Integer getNoOfTrucks() {
		return noOfTrucks;
	}

	public void setNoOfTrucks(Integer noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Long getShipperId() {
		return shipperId;
	}

	public void setShipperId(Long shipperId) {
		this.shipperId = shipperId;
	}

	public String getdate() {
		return date;
	}

	public void setdate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Load [loadid=" + loadId + ", loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint
				+ ", productType=" + productType + ", truckType=" + truckType + ", noOfTrucks=" + noOfTrucks
				+ ", weight=" + weight + ", comment=" + comment + ", shipperId=" + shipperId + ", Date=" + date
				+ ", getLoadid()=" + getLoadId() + ", getLoadingPoint()=" + getLoadingPoint() + ", getUnloadingPoint()="
				+ getUnloadingPoint() + ", getProductType()=" + getProductType() + ", getTruckType()=" + getTruckType()
				+ ", getNoOfTrucks()=" + getNoOfTrucks() + ", getWeight()=" + getWeight() + ", getComment()="
				+ getComment() + ", getShipperId()=" + getShipperId() + ", getDate()=" + getdate() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
   
}
