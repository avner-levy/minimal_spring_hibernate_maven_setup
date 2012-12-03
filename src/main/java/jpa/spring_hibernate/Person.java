package jpa.spring_hibernate;

import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name=Person.ALL_PEOPLE_QUERY, query = "select p from Person p")
})
public class Person {

    public static final String ALL_PEOPLE_QUERY = "allPeople";

	@Id
	private long id;
	
	private String name;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return  "id: " + id + ", name: " + name;
	}

}
