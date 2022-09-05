package ec.edu.insteclrg.dto;

import lombok.Data;

@Data
public class ProductoDTO {

	private long id;

	private String codigo;

	private String nombre;

	private float precioVenta;

	private float stockMin;

	private float stockMax;

	private float stock;

	private boolean controlaStock;

	private boolean aplicaIva;
	
	private EmpresaDTO empresa;

	
}
