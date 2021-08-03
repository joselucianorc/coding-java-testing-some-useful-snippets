import java.util.stream.IntStream;

public class ListingStreamLambda {
	
	
	public static void main(String... args) {

		IntStream.iterate(0, x -> x + 1)
			.limit(5)
			.filter(i -> i % 2 == 0)
			.forEach(System.out::print);

		IntStream.iterate(0, y -> y + 1)
			.limit(5)
			.filter(i -> i % 2 == 0)
			.forEach(System.out::print);
			
        //java -cp . ListingStreamLambda
	}
}
