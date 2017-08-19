package com.rodrigo.soukef.microservice.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Car {

	@Id
	@GeneratedValue
	private Long id;
	private String car_name;
	private String chassis;
	private String license_plate;
	private String manufacturer;
	private String color;
	private Date build_year;
	private Date model_year;
	private String owner_name;
	private Long document_cpf;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the car_name
	 */
	public String getCar_name() {
		return car_name;
	}

	/**
	 * @param car_name
	 *            the car_name to set
	 */
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}

	/**
	 * @return the chassis
	 */
	public String getChassis() {
		return chassis;
	}

	/**
	 * @param chassis
	 *            the chassis to set
	 */
	public void setChassis(String chassis) {
		this.chassis = chassis;
	}

	/**
	 * @return the license_plate
	 */
	public String getLicense_plate() {
		return license_plate;
	}

	/**
	 * @param license_plate
	 *            the license_plate to set
	 */
	public void setLicense_plate(String license_plate) {
		this.license_plate = license_plate;
	}

	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * @param manufacturer
	 *            the manufacturer to set
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
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the build_year
	 */
	public Date getBuild_year() {
		return build_year;
	}

	/**
	 * @param build_year
	 *            the build_year to set
	 */
	public void setBuild_year(Date build_year) {
		this.build_year = build_year;
	}

	/**
	 * @return the model_year
	 */
	public Date getModel_year() {
		return model_year;
	}

	/**
	 * @param model_year
	 *            the model_year to set
	 */
	public void setModel_year(Date model_year) {
		this.model_year = model_year;
	}

	/**
	 * @return the owner_name
	 */
	public String getOwner_name() {
		return owner_name;
	}

	/**
	 * @param owner_name
	 *            the owner_name to set
	 */
	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	/**
	 * @return the document_cpf
	 */
	public Long getDocument_cpf() {
		return document_cpf;
	}

	/**
	 * @param document_cpf
	 *            the document_cpf to set
	 */
	public void setDocument_cpf(Long document_cpf) {
		this.document_cpf = document_cpf;
	}

}
