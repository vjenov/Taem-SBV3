package com.taem.web.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taem.web.util.Printer;
@CrossOrigin(origins = "http://localhost:8081")
@RestController
public class PersonController {
	@Autowired
	private PersonRepository personRepository;
	@Autowired private Printer printer;
	@RequestMapping("/")
	public String index() {
		Iterable<Person> all = personRepository.findAll();
		StringBuilder sb = new StringBuilder();
		all.forEach(p -> sb.append(p.getName()+" "));
		return sb.toString();
	}
	@PostMapping("/login")
	public Person login(@RequestBody Person person) {
		printer.accept("로그인진입");
		printer.accept(String.format("UserID: %s", person.getUserid()));
		printer.accept(String.format("Password: %s", person.getPasswd()));
		return person;
	}
}