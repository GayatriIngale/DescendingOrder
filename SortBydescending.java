package SortIntegerStream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortBydescending {

	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(43, 256, 755, 89, 131, 45);
		List<Integer> sort = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(sort);
	}
}
