package com.rodrigo.soukef.microservice.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.transaction.annotation.Transactional;

@Entity
@Transactional
public class Car {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	@Column(name = "car_name")
	private String carName;
	@Column(name = "chassis")
	private String chassis;
	@Column(name = "license_plate")
	private String licensePlate;
	@Column(name = "manufacturer")
	private String manufacturer;
	@Column(name = "color")
	private String color;
	@Column(name = "build_year")
	private Date buildYear;
	@Column(name = "model_year")
	private Date modelYear;
	@Column(name = "owner_name")
	private String ownerName;
	@Column(name = "document_cpf")
	private Long documentCpf;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the carName
	 */
	public String getCarName() {
		return carName;
	}
	/**
	 * @param carName the carName to set
	 */
	public void setCarName(String carName) {
		this.carName = carName;
	}
	/**
	 * @return the chassis
	 */
	public String getChassis() {
		return chassis;
	}
	/**
	 * @param chassis the chassis to set
	 */
	public void setChassis(String chassis) {
		this.chassis = chassis;
	}
	/**
	 * @return the licensePlate
	 */
	public String getLicensePlate() {
		return licensePlate;
	}
	/**
	 * @param licensePlate the licensePlate to set
	 */
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}
	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the buildYear
	 */
	public Date getBuildYear() {
		return buildYear;
	}
	/**
	 * @param buildYear the buildYear to set
	 */
	public void setBuildYear(Date buildYear) {
		this.buildYear = buildYear;
	}
	/**
	 * @return the modelYear
	 */
	public Date getModelYear() {
		return modelYear;
	}
	/**
	 * @param modelYear the modelYear to set
	 */
	public void setModelYear(Date modelYear) {
		this.modelYear = modelYear;
	}
	/**
	 * @return the ownerName
	 */
	public String getOwnerName() {
		return ownerName;
	}
	/**
	 * @param ownerName the ownerName to set
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	/**
	 * @return the documentCpf
	 */
	public Long getDocumentCpf() {
		return documentCpf;
	}
	/**
	 * @param documentCpf the documentCpf to set
	 */
	public void setDocumentCpf(Long documentCpf) {
		this.documentCpf = documentCpf;
	}


}
