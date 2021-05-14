package com.cap.hms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contactus")
@CrossOrigin
public class contactcontroller {

	
	@Autowired
	private contactRepository repository;
	
	@PostMapping("/newmsg")
	public String addmsg(@RequestBody contact contactus)
	{
		repository.save(contactus);
		return "New msg Successfully Added";
	}
	@GetMapping("/findAllmsg")
	public List<contact> getAddmsg()
	{
		return repository.findAll();
	}
	
}
