package fr.istic.tpjpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="ElectronicDevice")
public class ElectronicDevice extends Device {



	public ElectronicDevice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ElectronicDevice(String model_equipement, String conso_equipment) {
		super(model_equipement, conso_equipment);
		// TODO Auto-generated constructor stub
	}
}
