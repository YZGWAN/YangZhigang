package sort;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import lambda.Person;

/**
 * @desc 汉语排序
 * @author Administrator
 *
 */
public class ChineseSort {

	private List<Person> getList(List<Person> list) {
		Person[] array = list.toArray(new Person[list.size()]);
		Arrays.sort(array, new Comparator<Person>() {
			Collator cmp = Collator.getInstance(java.util.Locale.CHINA);

			@Override
			public int compare(Person o1, Person o2) {
				String name = o1.getFirstName();
				String name2 = o2.getFirstName();
				if (cmp.compare(name, name2) > 0) {
					return 1;
				} else if (cmp.compare(name, name2) == 0) {
					return 0;
				} else {
					return -1;
				}
			}
		});
		List<Person> list2 = new ArrayList<Person>();
		for (int i = 0; i < array.length; i++) {
			list2.add(array[i]);
		}
		return list2;
	}

}
