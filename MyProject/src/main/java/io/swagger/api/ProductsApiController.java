package io.swagger.api;

import io.swagger.model.Product;
import springfox.documentation.spring.web.json.Json;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.dao.ProductRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-21T11:51:13.410Z[GMT]")
@Controller
public class ProductsApiController implements ProductsApi {

    private static final Logger log = LoggerFactory.getLogger(ProductsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    @Autowired
    private ProductRepository productRepository;

    @org.springframework.beans.factory.annotation.Autowired
    public ProductsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Product>> productsGet(@Min(10) @Max(20) @ApiParam(value = "The amount of products returned", allowableValues = "") @Valid @RequestParam(value = "bodyLimit", required = false) Integer bodyLimit,@Min(1) @Max(5) @ApiParam(value = "The pages to return products info", allowableValues = "") @Valid @RequestParam(value = "pageLimit", required = false) Integer pageLimit) {
        String accept = request.getHeader("Accept");
        List<Product> products =  productRepository.findAll();
        System.out.println(productRepository.findAll());
        if (accept != null && accept.contains("application/json")) {
        	 System.out.println(productRepository.findAll());
            try {
            	
                return new ResponseEntity<List<Product>>(objectMapper.readValue("[ {\n  \"ProductName\" : \"Apple\",\n  \"Price\" : 250.56,\n  \"Rating\" : 4.5,\n  \"SellerId\" : 1234,\n  \"Quantity\" : 1,\n  \"ProductId\" : 4\n}, {\n  \"ProductName\" : \"Apple\",\n  \"Price\" : 250.56,\n  \"Rating\" : 4.5,\n  \"SellerId\" : 1234,\n  \"Quantity\" : 1,\n  \"ProductId\" : 4\n} ]", List.class), HttpStatus.ACCEPTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Product>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Product>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Product> productsPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Product body) throws NotFoundException {
        String accept = request.getHeader("Accept");
        
        Product product = productRepository.findOne(body.getProductId());
        if (product!=null) {
			throw new NotFoundException(500, "Product already exist with this productId.");
		}
        else
        product= productRepository.save(body);
        return new ResponseEntity<Product>(product,HttpStatus.ACCEPTED);
    }

    @GetMapping("/products/{ProductId}")
    public ResponseEntity<Product> productsProductIdGet(@ApiParam(value = "",required=true) @PathVariable("ProductId") Integer productId) throws NotFoundException {
        String accept = request.getHeader("Accept");
        Product product = productRepository.findOne(productId);
        if (accept != null) {
        	if(product == null) {
        		throw new NotFoundException(500, "No such resource");
        	}
        	else
            return new ResponseEntity<Product>(product, HttpStatus.ACCEPTED);
        }
        else 
        	
        	return new ResponseEntity<Product>(HttpStatus.NOT_FOUND); 
    }

    public ResponseEntity<List<Product>> productsProductNameGet(@ApiParam(value = "",required=true) @PathVariable("ProductName") String productName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
          // List<Object> productByname=	productRepository.findByProductName(productName);
                return new ResponseEntity<List<Product>>(objectMapper.readValue("[ {\n  \"ProductName\" : \"Apple\",\n  \"Price\" : 250.56,\n  \"Rating\" : 4.5,\n  \"SellerId\" : 1234,\n  \"Quantity\" : 1,\n  \"ProductId\" : 4\n}, {\n  \"ProductName\" : \"Apple\",\n  \"Price\" : 250.56,\n  \"Rating\" : 4.5,\n  \"SellerId\" : 1234,\n  \"Quantity\" : 1,\n  \"ProductId\" : 4\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Product>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Product>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
