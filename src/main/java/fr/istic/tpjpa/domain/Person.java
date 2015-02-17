package fr.istic.tpjpa.domain;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CascadeType;
@Entity
@Table(name="Person")
public class Person {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_person;
	
	private String name;
	private String mail;
	private String gender;
	
	private Date  date_naiss;
	private String profil_facebook;
	@OneToMany(mappedBy="person")
	private List<Home> homes= new ArrayList<Home>() ;
	@ManyToMany
	@JoinTable(name="Persons_friends",joinColumns=
	@JoinColumn(name="id_person"),
	inverseJoinColumns=@JoinColumn(name="id_friend"))
	private List<Friend> friends= new ArrayList<Friend>() ;


    public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, String mail, String gender, Date date_naiss,
			String profil_facebook) {
		super();
		this.name = name;
		this.mail = mail;
		this.gender = gender;
		this.date_naiss = date_naiss;
		this.profil_facebook = profil_facebook;
	}
	public long getId_person() {
		return id_person;
	}
	public void setId_person(long id_person) {
		this.id_person = id_person;
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
	public List<Home> getHomes() {
		return homes;
	}
	public void setHomes(List<Home> homes) {
		this.homes = homes;
	}
	public List<Friend> getFriends() {
		return friends;
	}
	public void setFriends(List<Friend> friends) {
		this.friends = friends;
	}
}
