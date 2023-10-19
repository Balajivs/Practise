import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {

		Predicate<Integer> p = number -> (number % 2 == 0);

		System.out.println(p.test(10));// true
		System.out.println(p.test(11));// false

		// Predicate Method :
		// test(), and(), or(),
		
		// negate()

		Predicate<Integer> ageGreaterThan18 = age -> age > 18;

		System.out.println(ageGreaterThan18.negate().test(20));
		System.out.println(ageGreaterThan18.negate().test(13));

	}
}
