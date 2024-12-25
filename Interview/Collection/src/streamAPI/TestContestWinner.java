package streamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestWinner {

	public static void main(String[] args) {

		List<ContestWinner> l = new ArrayList<ContestWinner>();

		l.add(new ContestWinner("Shubh", "7575757575"));
		l.add(new ContestWinner("Naman", "8585858585"));
		l.add(new ContestWinner("Pranav", "8383838383"));
		l.add(new ContestWinner("Rahul", "7878787878"));

		l.stream().map(e -> e.getName() + " " + e.getPhoneNo()).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), c -> {
					Collections.shuffle(c);
					return c.stream();
				})).limit(3).forEach(c -> System.out.println(c));
	}
}
