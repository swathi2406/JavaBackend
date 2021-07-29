package com.accenture.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.util.Objects;
@Entity
@Table(name = "users")
public class User {
    private @Id @GeneratedValue long id;
    private @NotBlank String username;
    private @NotBlank String password;
    private @NotBlank boolean loggedIn;
    private @NotBlank boolean needSpecialCare;
    private @NotBlank String address;
    private @NotBlank String number;
    private @NotBlank String email;
    public User() {
    }
    public boolean isNeedSpecialCare() {
		return needSpecialCare;
	}
	public String getAddress() {
		return address;
	}
	public String getNumber() {
		return number;
	}
	public String getEmail() {
		return email;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setNeedSpecialCare(boolean needSpecialCare) {
		this.needSpecialCare = needSpecialCare;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isLoggedIn() {
        return loggedIn;
    }
    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) &&
                Objects.equals(password, user.password);
    }
    public User(long id, @NotBlank String username, @NotBlank String password, @NotBlank boolean loggedIn,
			@NotBlank boolean needSpecialCare, @NotBlank String address, @NotBlank String number,
			@NotBlank String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.loggedIn = loggedIn;
		this.needSpecialCare = needSpecialCare;
		this.address = address;
		this.number = number;
		this.email = email;
	}
	@Override
    public int hashCode() {
        return Objects.hash(id, username, password, 
                            loggedIn);
    }
    @Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", loggedIn=" + loggedIn
				+ ", needSpecialCare=" + needSpecialCare + ", address=" + address + ", number=" + number + ", email="
				+ email + "]";
	}
}