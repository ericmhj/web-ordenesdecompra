package com.ordenescompra.rest.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ordenescompra.rest.entities.Producto;
import com.ordenescompra.rest.repository.ProductoRepository;
import com.ordenescompra.rest.serviceImpl.ProductoServiceImpl;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {


	

	//private ProductoRepository productoRepository;
	@Autowired
	private ProductoServiceImpl productoServiceImpl;

	
	@GetMapping("/findAll")
	public ResponseEntity<?> getAll(){
        System.out.println("  Encontrar todos los productos ");
		List<Producto> productosList = productoServiceImpl.findAll();
		return ResponseEntity.ok(productosList);

	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteById(@PathVariable Long id){
		Map<String,Object> response = new HashMap<>();
		response.put("message","Deleted Successful!");

		if(id != null) {
			productoServiceImpl.deleteById(id);
			return  ResponseEntity.ok(response);
		}
		return ResponseEntity.badRequest().build();
	}



	@GetMapping("/find/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id){
		System.out.println(" ID a buscar  "+id);
		Optional<Producto> productoOptional = productoServiceImpl.findById(id);
		if (productoOptional.isPresent()) {
		 return 	ResponseEntity.ok(productoOptional.get());
		}
		return ResponseEntity.badRequest().build();
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<?> update(@PathVariable Long id){
		Map<String,Object> response = new HashMap<>();
		response.put("message","Updated Successful!");

		return ResponseEntity.ok(response);
	}


    @PostMapping("/create")
    public ResponseEntity<Producto> createProducto(@RequestParam("precio") BigDecimal precio,
													@RequestParam("id") Long id,
    												@RequestParam("descripcion") String descripcion,
												  	@RequestParam("codigo") String codigo,
													@RequestParam("urlImage") String urlImage,
												    @RequestParam(value = "image", required=false) MultipartFile multipartFile
													) throws URISyntaxException, IOException {

		Producto producto=  new Producto();
		producto.setId(id);
		producto.setCodigo(codigo);
		producto.setPrecio(precio);
		producto.setDescripcion(descripcion);
		producto.setUrlImage(urlImage);


		System.out.println(" **************  Producto  "+producto);
		System.out.println(" **************  multipartFile  "+multipartFile.getOriginalFilename());

		System.out.println(descripcion);


        Map<String,Object> response = new HashMap<>();
        response.put("message","Ceated Successful!");

        if(producto.getCodigo()!=null){

            productoServiceImpl.save(producto,multipartFile);
            return ResponseEntity.created(new URI("/api/producto/save")).build();

        }
        return ResponseEntity.badRequest().build();

    }



	@PutMapping("/updateprice/{codigo}")
	public ResponseEntity<?> update(@PathVariable String codigo ,@RequestBody Producto producto ){

		if (codigo!=null) {

			return ResponseEntity.ok("Precio Modificado");
			
		}
		return ResponseEntity.notFound().build();
		
		
		
	}
	
	
	

}
