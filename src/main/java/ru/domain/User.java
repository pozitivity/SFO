package ru.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

import ru.domain.City;
import ru.domain.TypeUser;


@Entity
@Table(name = "user")
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	@Column(name = "login")
	private String login;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "blocked")
	private boolean blocked = true;
	
	@Column(name = "email")
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;
	
	@ManyToOne
	@JoinColumn(name = "type_user_id")
	private TypeUser typeUser;

	
	public User(){
		
	}
	
	public User(Long userId, String login, String password,City city, TypeUser typeUser, String email){
		this.userId = userId;
		this.login = login;
		this.password = password;
		this.city = city;
		this.typeUser = typeUser;
		this.email = email;
	}
	
	public Long getUserId(){
		return userId;
	}
	
	public void setUserId(Long userId){
		this.userId = userId;
	}
	
	public String getLogin(){
		return login;
	}
	
	public void setLogin(String login){
		this.login = login;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public Boolean getBlocked()
	{
		return blocked;
	}
	
	public void setBlocked(boolean blocked)
	{
		this.blocked = blocked;
	}
	
	public City getCity()
	{
		return city;
	}
	
	public void setCity(City city){
		this.city = city;
	}
	
	public TypeUser getTypeUser()
	{
		return typeUser;
	}
	
	public void setTypeUser(TypeUser typeUser){
		this.typeUser = typeUser;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

