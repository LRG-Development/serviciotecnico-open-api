package ec.edu.insteclrg.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Empresa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private long id;

	@Column(nullable = false, unique = true)
	private String ruc;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String address;
	
	/*@ManyToOne(cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "cityID")
	private Ciudad city;*/
	
	@Column(nullable = false)
	private String phone;
	
	@Column(nullable = false)
	private String email;
}
