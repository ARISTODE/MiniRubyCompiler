class RyId extends Value {
	String value;

	RyId(String value, int TAG) {
		super(TAG);
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue() {
		this.value = value;
	}

	public String toString() {
		return this.getValue() + "";
	}
}
	