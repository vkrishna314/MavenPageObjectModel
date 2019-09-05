package fakermethods;

import java.util.Locale;

public class FakerMethods {

	// creating object for fakevalueservice
	FakeValuesService fakeValuesService = new FakeValuesService(new Locale(
			"en-GB"), new RandomService());

	public static FakeValuesService fakeValuesService = new FakeValuesService(
			new Locale("en-GB"), new RandomService());

	public static String getName() {
		return fakeValuesService.letterify("???????????????");
	}

	public static String getEmail() {
		return fakeValuesService.letterify("???????????@gmail.com");
	}

	public static String getPhNo() {
		return fakeValuesService.numerify("##########");
	}
}
