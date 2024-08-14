package collection_framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

class Personn implements Comparable<Personn> {

	private String name;

	public Personn(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personn other = (Personn) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Personn o) {

		int len1 = name.length();
		int len2 = o.name.length();

		if (len1 > len2)
			return 1;
		else if (len1 < len2)
			return -1;
		else
			// Eger esit uzunluktaysa bunlari alphabetic order a gore siralayacak.
			return name.compareTo(o.name);

		// Bu şekilde verdigimiz zaman set unique elementler içerdiğiginden dolayı aynı
		// uzunlukta olan
		// variablerı aynı sanıp siliyor tutumuyor içinde ama arrayde çalışır.
		// return 0;

		// Compare natural order
		// return name.compareTo(o.name);
	}
}

public class natural_order {

	public static void main(String[] args) {

		List<Personn> arrayList = new ArrayList<Personn>();
		SortedSet<Personn> set = new TreeSet<Personn>();

		addElement(arrayList);
		addElement(set);

		Collections.sort(arrayList);

		showElement(arrayList);
		System.out.println();
		showElement(set);

	}

	private static void addElement(Collection<Personn> col) {

		col.add(new Personn("Zeynep"));
		col.add(new Personn("Ali"));
		col.add(new Personn("Veli"));
		col.add(new Personn("Murat"));
		col.add(new Personn("Mehmet"));
	}

	private static void showElement(Collection<Personn> col) {

		for (Personn p : col) {
			System.out.println(p);
		}
	}

}
