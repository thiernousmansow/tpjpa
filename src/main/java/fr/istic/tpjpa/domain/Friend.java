package fr.istic.tpjpa.domain;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="Friend")
public class Friend {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_friend;

	private String name;
	private String mail;
	private String gender;
	private Date  date_naiss;
	private String profil_facebook;
	
	@ManyToMany(mappedBy="friends")
	private List<Person> persons= new ArrayList<Person>() ;
	

	public Friend() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId_friend() {
		return id_friend;
	}

	public void setId_friend(long id_friend) {
		this.id_friend = id_friend;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDate_naiss() {
		return date_naiss;
	}

	public void setDate_naiss(Date date_naiss) {
		this.date_naiss = date_naiss;
	}

	public String getProfil_facebook() {
		return profil_facebook;
	}

	public void setProfil_facebook(String profil_facebook) {
		this.profil_facebook = profil_facebook;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

}
