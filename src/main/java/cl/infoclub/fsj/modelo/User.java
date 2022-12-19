package cl.infoclub.fsj.modelo;


import java.util.List;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id", nullable = false, unique = true)
	private Long id;
	@Size(min = 3, message = "Username must be present")
	private String username;
	@Size(min = 5, message = "Email must be greater present and in a valid format")
	private String email;
	@Size(min = 8, message = "Password must be greater than 8 characters")
	private String password;
	@Transient
	private String passwordConfirmation;


// RELACIONES
// 1:N SHOW
	@OneToMany(mappedBy = "creatorShow", fetch = FetchType.LAZY)
	List<Show> userShows;

// 1:N RATING
	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
	private List<Rating> ratings;

// ROLES
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private List<Role> roles;
	
	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}

}