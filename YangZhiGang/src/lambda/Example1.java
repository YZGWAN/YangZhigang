package lambda;

import java.util.Arrays;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {

		String[] array = { "aaa", "bbb", "ccc" };
		List<String> list = Arrays.asList(array);

		// 遍历
		list.forEach((obj) -> System.out.println(obj));

		// 遍历
		list.forEach(System.out::println);

		// 正常线程
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello world !");
			}
		}).start();

		new Thread(() -> System.out.println("Hello world !")).start();

		Runnable race1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello world !");
			}
		};

		Runnable race2 = () -> System.out.println("Hello world !");

		race1.run();
		race2.run();
	}

}
