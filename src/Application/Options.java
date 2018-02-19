package Application;

public enum Options {
	EXIT(0, "Wyj�cie z programu."), EVEN_OR_ODD(1, "Parzysta nieparzysta."), POINT_NUMBER(2,
			"Wska� liczb� na klawiaturze."), POINT_LETTER(3,
					"Wska� liter� na klawiaturze."), GUESS_NUMBER(4, "Zgadnij liczb�.");

	private int value;
	private String description;

	private Options(int value, String description) {
		this.value = value;
		this.description = description;
	}

	public int getValue() {
		return value;
	}

	public String getDescription() {
		return description;
	}

	public static Options createFromInt(int number) {
		return Options.values()[number];

	}

	@Override
	public String toString() {

		return value + " -> " + description;
	}

}
