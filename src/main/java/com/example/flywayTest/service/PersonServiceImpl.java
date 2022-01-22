package com.example.flywayTest.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.flywayTest.entity.Person;
import com.example.flywayTest.respository.PersonRepository;
@Service
public class PersonServiceImpl implements PersonService{
	@Autowired
	PersonRepository personRepo; //creates a default object to call the methods
	@Override
	public List<Person> getPerson(Long personId) {
		// TODO Auto-generated method stub
		List<Person> pList=new ArrayList<>();
		if(personId!=null && personId>0) {
			//get one 
			Optional<Person> personOp = personRepo.findById(personId);
			if(!personOp.isEmpty()) {
				pList.add(personOp.get()) ;
			}
		}else {
			//get all
			pList=personRepo.findAll();
		}
		return pList;
	}
	@Override
	public Person savePerson(Person person) {
		// TODO Auto-generated method stub

		Person user1 = new Person();
		//user1.setPersonId(01L);
		user1.setName("prasad");
		user1.setMobileNo("8945678521");
		user1.setAge(34);

		return personRepo.save(user1);

	}
	//delete
	//update

}
