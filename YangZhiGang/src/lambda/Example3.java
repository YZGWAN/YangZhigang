package lambda;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Example3 {

	public static void main(String[] args) {

		List<Person> javaProgrammers = new ArrayList<Person>() {
			{
				add(new Person("A", "AA", "AAA", "AAAA", 43, 2000));
				add(new Person("B", "BB", "BBB", "BBBB", 23, 1500));
				add(new Person("C", "CC", "CCC", "CCC", 20, 1900));
			}
		};
		// 1:
		javaProgrammers.forEach((p) -> System.out.printf("%s %s; ", p.getFirstName(), p.getLastName()));

		// 2:
		Consumer<Person> giveRaise = e -> e.setSalary(e.getSalary() + 1);
		javaProgrammers.forEach(giveRaise);
		javaProgrammers.forEach((p) -> System.out.printf("%s %s;", p.getFirstName(), p.getSalary()));

		// 3:
		javaProgrammers.stream().filter((p) -> (p.getSalary() > 1600))
				.forEach((p) -> System.out.printf("%s %s; ", p.getFirstName(), p.getLastName()));

		// 4:
		Predicate<Person> ageFilter = (p) -> (p.getAge() > 25);
		Predicate<Person> salaryFilter = (p) -> (p.getSalary() > 1400);
		Predicate<Person> genderFilter = (p) -> ("AAAA".equals(p.getGender()));
		javaProgrammers.stream().filter(ageFilter).filter(salaryFilter).filter(genderFilter)
				.forEach((p) -> System.out.printf("%s %s; ", p.getFirstName(), p.getLastName()));

		// 5:
		javaProgrammers.stream().limit(2)
				.forEach((p) -> System.out.printf("%s %s; ", p.getFirstName(), p.getLastName()));

		// 6:
		javaProgrammers.stream().filter(genderFilter).limit(2)
				.forEach((p) -> System.out.printf("%s %s; ", p.getFirstName(), p.getLastName()));

		// 7:
		List<Person> sortedJavaProgrammers = javaProgrammers.stream()
				.sorted((p, p2) -> (p2.getFirstName().compareTo(p.getFirstName()))).limit(5).collect(toList());
		sortedJavaProgrammers.forEach((p) -> System.out.printf("%s %s;", p.getFirstName(), p.getLastName()));

		// 8:
		sortedJavaProgrammers = javaProgrammers.stream().sorted((p, p2) -> (p.getSalary() - p2.getSalary()))
				.collect(toList());
		sortedJavaProgrammers.forEach((p) -> System.out.printf("%s %s; ", p.getFirstName(), p.getLastName()));

		// 9:
		Person pers = javaProgrammers.stream().min((p1, p2) -> (p1.getSalary() - p2.getSalary())).get();
		System.out.printf("%s %s; ", pers.getFirstName(), pers.getLastName(), pers.getSalary());

		// 10:
		Person person = javaProgrammers.stream().max((p, p2) -> (p.getSalary() - p2.getSalary())).get();
		System.out.printf("%s %s; ", person.getFirstName(), person.getLastName(), person.getSalary());

		// 11:
		String phpDevelopers = javaProgrammers.stream().map(Person::getFirstName).collect(joining(" ; "));
		System.out.println(phpDevelopers);

		// 12
		Set<String> javaDevFirstName = javaProgrammers.stream().map(Person::getFirstName).collect(toSet());
		javaDevFirstName.stream().forEach((s) -> System.out.printf("%s ", s));

		// 13:
		TreeSet<String> javaDevLastName = javaProgrammers.stream().map(Person::getLastName)
				.collect(toCollection(TreeSet::new));
		javaDevLastName.stream().forEach((s) -> System.out.printf("%s ", s));

		// 返回虚拟机最大可用的处理器数量
		int numProcessorsOrCores = Runtime.getRuntime().availableProcessors();

		// 14:
		int totalSalary = javaProgrammers.parallelStream().mapToInt(p -> p.getSalary()).sum();
		System.out.printf("%s ", totalSalary);

		// 15:
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

		System.out.println("最大值 : " + stats.getMax());
		System.out.println("最小值 : " + stats.getMin());
		System.out.println("总值 : " + stats.getSum());
		System.out.println("平均值  : " + stats.getAverage());
	}

}
