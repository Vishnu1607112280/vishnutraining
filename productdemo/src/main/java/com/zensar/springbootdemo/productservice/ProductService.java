package com.zensar.springbootdemo.productservice;

import java.util.List;

import org.springframework.data.domain.Sort.Direction;

import com.zensar.springbootdemo.productdto.ProductDto;

public interface ProductService {
	public ProductDto getProduct(int productId);

	public List<ProductDto> getProducts(int pageNumber, int pageSize, String sortBy, Direction dir);

	public ProductDto insert(ProductDto productDto);

	public void update(int productId, ProductDto productDto);

	public void delete(int productId);

	public List<ProductDto> getByProductName(String productName);

	public List<ProductDto> getByProductNameAndProductPrice(String productName, int productPrice);

	public List<ProductDto> getByProductNameOrProductPrice(String productName, int productPrice);

	List<ProductDto> getByProductNameOrderByProductQuantity(String productName);

	
}
