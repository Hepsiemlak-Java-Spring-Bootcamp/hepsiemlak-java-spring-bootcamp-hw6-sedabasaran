package emlakburada.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import emlakburada.entity.enums.UserType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {

	@Id
	private Integer id;
	private String email;
	private Integer password;
	@Enumerated(EnumType.STRING)
	private UserType userType;
	
	//

	public User(UserType userType, String email, Integer password) {
		super();
		this.userType = userType;
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
