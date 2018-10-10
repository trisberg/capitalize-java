package functions;

import java.util.function.Function;

import org.apache.commons.text.WordUtils;

public class Capitalize implements Function<String, String> {

	public String apply(String s) {
		return WordUtils.capitalizeFully(s);
	}
}
