package com.LiveasyLogisticproject.LiveasyLogisticDatabase.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="LiveasyLogisticDatabase")
public class LiveasyLogistic {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="loadId")
	private int loadId;
	
	
	@Column(name="LoadingPoint")
	private String loadingPoint ;
	
	
	@Column(name="unLoadingPoint")
	private String unloadingPoint ;
	
	
	@Column(name="TuckType")
	private String truckType;
	
	@Column(name="ProductType")
	private String productType;
	
	
	@Column(name="NoOfTrucks")
	private int noOfTrucks ;
	
	
	@Column(name="Weight")
	private int weight;
	
	
	@Column(name="OptionalComment")
	private String optionalComment ;
	

	@Column(name="ShippedId")
	private String shippedId ;
	
	
	@Column(name="DateOfShipping")
	private Date dateOfShipping ;
	
	
	public LiveasyLogistic() {
		super();
		// TODO Auto-generated constructor stub
	}



	public LiveasyLogistic(int loadId, String loadingPoint, String unloadingPoint, String truckType, String productType,
			int noOfTrucks, int weight, String optionalComment, String shippedId, Date dateOfShipping) {
		super();
		this.loadId = loadId;
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.truckType = truckType;
		this.productType = productType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.optionalComment = optionalComment;
		this.shippedId = shippedId;
		this.dateOfShipping = dateOfShipping;
	}



	public int getLoadId() {
		return loadId;
	}



	public void setLoadId(int loadId) {
		this.loadId = loadId;
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

	public String getTruckType() {
		return truckType;
	}

	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public int getNoOfTrucks() {
		return noOfTrucks;
	}

	public void setNoOfTrucks(int noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getOptionalComment() {
		return optionalComment;
	}

	public void setOptionalComment(String optionalComment) {
		this.optionalComment = optionalComment;
	}

	public String getShippedId() {
		return shippedId;
	}

	public void setShippedId(String shippedId) {
		this.shippedId = shippedId;
	}

	public Date getDateOfShipping() {
		return dateOfShipping;
	}

	public void setDateOfShipping(Date dateOfShipping) {
		this.dateOfShipping = dateOfShipping;
	}

	@Override
	public String toString() {
		return "LiveasyLogistic [loadId=" + loadId + ", loadingPoint=" + loadingPoint + ", unloadingPoint="
				+ unloadingPoint + ", truckType=" + truckType + ", productType=" + productType + ", noOfTrucks="
				+ noOfTrucks + ", weight=" + weight + ", optionalComment=" + optionalComment + ", shippedId="
				+ shippedId + ", dateOfShipping=" + dateOfShipping + "]";
	}



	
	
	
}
