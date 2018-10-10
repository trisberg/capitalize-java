package functions;

import java.util.function.Function;

import org.apache.commons.text.WordUtils;
import reactor.core.publisher.Flux;

public class Capitalize implements Function<Flux<String>, Flux<String>> {

	public Flux<String> apply(Flux<String> in) {
		return in.map(s -> WordUtils.capitalizeFully(s));
	}
}
