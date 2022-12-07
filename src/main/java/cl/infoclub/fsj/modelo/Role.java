package cl.infoclub.fsj.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "roles")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "role_name")
	private String name;
// RELACIONES
// AGREGAR A la DDBB
// INSERT INTO examen_final.roles (id, name) VALUES (1, 'ROLE_USER');
// INSERT INTO examen_final.roles (id, name) VALUES (2, 'ROLE_ADMIN');
	@ManyToMany(mappedBy = "roles")
	private List<User> users;
}