package ec.edu.insteclrg.app.api.v1;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ec.edu.insteclrg.common.dto.ApiResponseDTO;
import ec.edu.insteclrg.domain.InformacionAdicional;
import ec.edu.insteclrg.dto.InformacionAdicionalDTO;
import ec.edu.insteclrg.service.crud.InformacionAdicionalService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping(value = "/api/v1.0/informacionadicional")
public class InformacionAdicionalController {

	@Autowired
	InformacionAdicionalService service;

	@PostMapping
	public ResponseEntity<Object> save(@RequestBody InformacionAdicionalDTO dto) {
		service.save(dto);
		return new ResponseEntity<>(new ApiResponseDTO<>(true, null), HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<Object> update(@RequestBody InformacionAdicionalDTO dto) {
		service.update(dto);
		return new ResponseEntity<>(new ApiResponseDTO<>(true, null), HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<Object> findAll() {
		List<InformacionAdicionalDTO> list = service.findAll(new InformacionAdicionalDTO());
		if (!list.isEmpty()) {
			ApiResponseDTO<List<InformacionAdicionalDTO>> response = new ApiResponseDTO<>(true, list);
			return (new ResponseEntity<Object>(response, HttpStatus.OK));
		} else {
			return new ResponseEntity<>(new ApiResponseDTO<>(false, null), HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<Object> find(@PathVariable Long id) {
		InformacionAdicionalDTO dto = new InformacionAdicionalDTO();
		dto.setId(id);
		Optional<InformacionAdicional> informacionadicional = service.find(dto);
		if (informacionadicional.isPresent()) {
			ApiResponseDTO<InformacionAdicional> response = new ApiResponseDTO<>(true, informacionadicional.get());
			return (new ResponseEntity<Object>(response, HttpStatus.OK));
		} else {
			return new ResponseEntity<>(new ApiResponseDTO<>(false, null), HttpStatus.NOT_FOUND);
		}
	}
}
