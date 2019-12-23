package com.taem.web.person;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;

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
	private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
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
	public HashMap<String, Object> login(@RequestBody Person person) {
		HashMap<String, Object> map = new HashMap<>();
		printer.accept("로그인진입");
		printer.accept(String.format("UserID: %s", person.getUserid()));
		printer.accept(String.format("Password: %s", person.getPasswd()));
		person = personRepository.findByUseridAndPasswd(person.getUserid(), person.getPasswd());
		if(person != null) {
			printer.accept("로그인 성공");
			map.put("result", "SUCCESS");
			map.put("person", person);
		}else {
			printer.accept("로그인 실패");
			map.put("result", "FAIL");
			map.put("person", person);
		}
		return map;
	}
	@PostMapping("/join")
	public void join(@RequestBody Person param) {
		HashMap<String, Object> map = new HashMap<>();
		printer.accept(String.format("UserID: %s", param.getUserid()));
		printer.accept(String.format("Password: %s", param.getPasswd()));
		personRepository.save(param);
		System.out.println(param.getUserid() + "&" + param.getPasswd());
	}
}