package ec.edu.insteclrg.dto;

import lombok.Data;

@Data
public class ClienteDTO {

	private long id;

	private String nombres;

	private String apellidos;
	
	private String dni;

	private String direccion;

	private String telefono;
	
	private String celular;

	private String email;

	private String estado;
	
}
