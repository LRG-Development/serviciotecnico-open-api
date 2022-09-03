package ec.edu.insteclrg.dto;

import lombok.Data;

@Data
public class FacturaFormaPagoDTO {
	
private long id;
	
private FacturaDTO factura;

private String codigo;

private String nombre;

private float valor;

private EmpresaDTO empresa;

}
