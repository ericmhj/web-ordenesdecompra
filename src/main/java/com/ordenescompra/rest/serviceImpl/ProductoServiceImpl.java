package com.ordenescompra.rest.serviceImpl;

import java.io.IOException;
import java.nio.channels.MulticastChannel;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ordenescompra.rest.entities.Producto;
import com.ordenescompra.rest.repository.ProductoRepository;
import com.ordenescompra.rest.service.IProductService;
import org.springframework.web.multipart.MultipartFile;


@Service
public class ProductoServiceImpl implements IProductService {
	
	
	@Autowired
	private ProductoRepository productoRepository;
	@Autowired
    private UploadFile uploadFile;
	

	@Override
	public void save(Producto producto, MultipartFile multipartFile) throws IOException {
		// TODO Auto-generated method stub


        if (producto.getId() !=0){
            if(multipartFile==null){
                producto.setUrlImage(producto.getUrlImage());

            }else{
                producto.setUrlImage(uploadFile.upload(multipartFile));
                System.out.println("Goal");
            }
        }else{
				producto.setUrlImage(uploadFile.upload(multipartFile));

		}

		productoRepository.save(producto);

	}

	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return productoRepository.findAll();
	}

	@Override
	public Optional<Producto> findById(Long id) {
		// TODO Auto-generated method stub
		return productoRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		System.out.println("Borrar Id  = "+id);
		productoRepository.deleteById(id);

	}

	@Override
	public Producto update(Producto producto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePriceProductOrder(String codigo, Producto product) {
		// TODO Auto-generated method stub


		//TODO
	    //List<Long> ordesActualizar = 	productoRepository.findOrdersByCode(codigo);



	}



}
