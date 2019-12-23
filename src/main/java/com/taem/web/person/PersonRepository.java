package com.taem.web.person;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
	public Person findByUseridAndPasswd(String userid, String passwd);
}