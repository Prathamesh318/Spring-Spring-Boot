package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.product.dao.ProductRepo;
import com.product.model.Product;
import com.product.services.ProductServiceImpl;

@Controller
public class ProductController {
	@Autowired
	ProductRepo productrepo;
	@Autowired
	ProductServiceImpl productServcie;
	@RequestMapping("/home")
	public ModelAndView home() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("home");
		return mv;
	}
	@GetMapping("/product")
	public ModelAndView product() {
		ModelAndView mv=new ModelAndView();
		Product p=this.productrepo.getByNameAndCompany("Watch","Titan");
		System.out.println(p.getName());
		mv.setViewName("Product");
		return mv;
	}
	@GetMapping("/update")
	public ModelAndView update() {
		ModelAndView mv=new ModelAndView();
		
		mv.setViewName("update");
		return mv;
	}
	@PostMapping("/product")
	public ModelAndView product(Product p) {
		ModelAndView mv=new ModelAndView();
		
		System.out.println("Product Name:"+p.getName());
		this.productServcie.addProduct(p);
		mv.setViewName("home");
		
		return mv;
	}
	@PostMapping("/update")
	public ModelAndView update(Product p) {
ModelAndView mv=new ModelAndView();
	try {
		int id=p.getId();
		int quantity=p.getQuantity();
		System.out.println(quantity);
		Product prod=this.productServcie.findProductById(id);
		System.out.println(prod.getName());
		if(prod!=null) {
			int status=this.productServcie.updateProduct(id,quantity);
			if(status==1) {
				System.out.println("Product successfully updated");
			}
			else {
				System.out.println("Updation failed");
			}
		}
	}
	catch(Exception e) {
		System.out.println("Error");
	}
	
		mv.setViewName("home");
		
		return mv;
	}
	
	@GetMapping("/find")
	public ModelAndView find() {
		ModelAndView mv=new ModelAndView();
		this.productServcie.showAllProducts();
		mv.setViewName("find");
		return mv;
	}
	@PostMapping("/find")
	public ModelAndView find1(Product p) {
		ModelAndView mv=new ModelAndView();
		int id=p.getId();
		System.out.println(id);
		Product prod=this.productServcie.findProductById(id);
		mv.addObject("product", prod);
		mv.setViewName("find");
		return mv;
	}
	@GetMapping("/delete")
	public ModelAndView delete() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("delete");
		
		return mv;
	}
	
	@PostMapping("/delete")
	
	public ModelAndView delete1(Product p) {
		ModelAndView mv=new ModelAndView();
		int id=p.getId();
		System.out.println(id);
		this.productServcie.deleteProduct(id);
		mv.setViewName("delete");
		return mv;
	}
	
	@GetMapping("/ProductInfo")
	public ModelAndView allproduct() {
	ModelAndView mv=new ModelAndView();
	mv.setViewName("ProductInfo");
	List<Product> p=this.productServcie.showAllProducts();
	mv.addObject("prodlist", p);
	return mv;

}
}
