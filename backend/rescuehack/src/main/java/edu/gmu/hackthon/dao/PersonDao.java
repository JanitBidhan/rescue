package edu.gmu.hackthon.dao;

import edu.gmu.hackthon.model.person.InfoProvided;
import edu.gmu.hackthon.model.person.Person;

public interface PersonDao {
    Person getPerson(String id);

    boolean insertPerson(Person person);

    boolean insertInformations(InfoProvided data);
}
