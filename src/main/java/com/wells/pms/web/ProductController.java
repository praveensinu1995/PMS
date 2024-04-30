package com.wells.pms.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wells.pms.model.Product;

@RestController
@RequestMapping("/product")
public class ProductController {

	@PostMapping("/insertProduct")
	private String insertProduct(@RequestBody Product product) {

		System.out.println(product);
		return "succuessfully inserted the product";
	}
}
