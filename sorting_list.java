package collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		if (o1.length() > o2.length())
			return 1;

		else if (o1.length() < o2.length())
			return -1;

		return 0;
	}

}

class ReverseAlphabeticOrder implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		return -o1.compareTo(o2);
	}

}

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "ID : " + id + " name : " + name;
	}

}

public class sorting_list {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();

		animals.add("tiger");
		animals.add("lion");
		animals.add("cat");
		animals.add("snake");
		animals.add("mongoose");
		animals.add("elephant");

		////// String Order ///////

		// Natural order
		Collections.sort(animals);

		for (String animal : animals) {
			System.out.println(animal);
		}

		System.out.println(" \n Compare with length \n");

		// Compare with length
		Collections.sort(animals, new StringLengthComparator());

		for (String animal : animals) {
			System.out.println(animal);
		}

		// Reverse alphabetic order

		System.out.println(" \n Reverse Alphabetic order \n");

		Collections.sort(animals, new ReverseAlphabeticOrder());
		for (String animal : animals) {
			System.out.println(animal);
		}

		////// Integer Order ///////

		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(3);
		numbers.add(36);
		numbers.add(73);
		numbers.add(40);
		numbers.add(1);

		Collections.sort(numbers, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return -o1.compareTo(o2);
			}

		});

		System.out.println("\n Compare with integer reverse \n");

		for (Integer number : numbers) {
			System.out.println(number);
		}

		////// Arbitary object Order ///////

		List<Person> persons = new ArrayList<Person>();

		persons.add(new Person(1, "Ali"));
		persons.add(new Person(3, "Mehmet"));
		persons.add(new Person(4, "Burak"));
		persons.add(new Person(2, "Fatih"));

		System.out.println("\n Compare with Objects id \n");

		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				if (o1.getId() > o2.getId())
					return 1;
				else if (o1.getId() < o2.getId())
					return -1;
				return 0;
			}

		});

		for (Person p : persons) {
			System.out.println(p);
		}

		System.out.println("\n Compare with objects name \n");

		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}

		});

		for (Person p : persons) {
			System.out.println(p);
		}

	}

}
