package com.taem.web.person;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class PersonInit implements ApplicationRunner {
	private PersonRepository personRepository;
	private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

	@Autowired
	public PersonInit(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		long count = personRepository.count();
		if (count == 0) {
			Person person = null;
			String[][] mtx = { 
					{ "hong", "1", "홍길동", "1980-01-01", "M", "4", "2", "70"}, 
					{ "kim", "1", "김유신", "1980-05-05", "M", "4", "2", "90"},
					{ "park", "1", "박지성", "1981-06-05", "M", "2", "1", "80"},
					{ "harden", "1", "제임스하든", "1988-08-14", "M", "2", "1", "90"},
					{ "jordan", "1", "마이클조던", "1979-10-13", "M", "3", "1", "100"},
					{ "johnson", "1", "매직존슨", "1977-03-13", "M", "3", "2", "95"},
					{ "james", "1", "르브론제임스", "1986-04-21", "M", "2", "2", "85"},
					{ "doncic", "1", "루카돈치치", "1999-12-25", "M", "1", "1", "90"},
					{ "bird", "1", "래리버드", "1975-09-29", "M", "3", "1", "85"},
					{ "oneal", "1", "샤킬오닐", "1982-04-06", "M", "3", "2", "90"},
					{ "leonard", "1", "카와이레너드", "1990-07-06", "M", "1", "2", "90"},
					{ "durant", "1", "케빈듀란트", "1988-03-15", "M", "1", "1", "95"},
					{ "walker", "1", "카일워커", "1988-06-15", "M", "1", "2", "80"},
					{ "curry", "1", "스테판커리", "1990-05-24", "M", "2", "1", "80"},
					{ "thomson", "1", "클레이탐슨", "1991-11-09", "M", "2", "1", "80"},
					{ "davis", "1", "클레이탐슨", "1991-11-09", "M", "1", "1", "80"},
					{ "olajuwon", "1", "하킴올라주원", "1973-11-17", "M", "4", "1", "95"},
					{ "chamberlain", "1", "윌트체임벌린", "1965-02-27", "M", "4", "1", "95"},
					{ "george", "1", "폴조지", "1990-08-18", "M", "2", "2", "95"},
					{ "westbrook", "1", "러셀웨스트브룩", "1990-06-01", "M", "2", "2", "80"},
					{ "irving", "1", "카이리어빙", "1991-10-26", "M", "1", "2", "85"},
					{ "you", "1", "유관순", "1985-09-09", "F", "3", "3", "70"}};
			for (String[] arr : mtx) {
				person = new Person();
				person.setUserid(arr[0]);
				person.setPasswd(arr[1]);
				person.setName(arr[2]);
				person.setBirthday(df.parse(arr[3]));
				person.setGender(arr[4]);
				person.setHak(arr[5]);
				person.setBan(arr[6]);
				person.setScore(arr[7]);
				personRepository.save(person);
			}
		}
		
	}

}