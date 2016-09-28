public class RyFloat extends Value {
	float value;

	RyFloat(float value, int TAG) {
		super(TAG);
		this.value = value;
	}

	public float getValue() {
		return this.value;
	}

	public void setValue() {
		this.value = value;
	}

	public Value add (Value other) {
		if (TAG == other.getTag()) {
		    // both are float
			float res = this.value + ((RyFloat)other).getValue();
			System.out.println(res);
			return new RyFloat(res ,this.TAG);
		}

		if (other.getTag() == RyLexer.INT) {
			return new RyFloat(this.value + ((RyInt)other).getValue() ,this.TAG);
		}

		return new RyString(this.value + ((RyString)other).getValue(), RyLexer.LITERAL);
	}

	public Value mins (Value other) {
		if (TAG == other.getTag()) {
		    // both are float
			return new RyFloat(this.value - ((RyFloat)other).getValue() ,this.TAG);
		}

		if (other.getTag() == RyLexer.INT) {
			return new RyFloat(this.value - ((RyInt)other).getValue() ,this.TAG);
		}

		return new RyFloat(this.value - ((RyFloat)other).getValue() ,this.TAG);
	}

	public Value mul (Value other) {
		if (TAG == other.getTag()) {
		    // both are float
			return new RyFloat(this.value * ((RyFloat)other).getValue() ,this.TAG);
		}

		if (other.getTag() == RyLexer.INT) {
			return new RyFloat(this.value * ((RyInt)other).getValue() ,this.TAG);
		}

		return new RyFloat(this.value * ((RyFloat)other).getValue() ,this.TAG);
	}

	public Value div (Value other) {
		if (TAG == other.getTag()) {
			return new RyFloat(this.value / ((RyFloat)other).getValue() ,this.TAG);
		}

		if (other.getTag() == RyLexer.INT) {
			return new RyFloat(this.value / ((RyInt)other).getValue() ,this.TAG);
		}

		return 	new RyFloat(this.value / ((RyFloat)other).getValue() ,this.TAG);
	}

	public Value mod (Value other) {
		if (TAG == other.getTag()) {
		    // both are float
			return new RyFloat(this.value % ((RyFloat)other).getValue(), this.TAG);
		}

		if (other.getTag() == RyLexer.INT) {
			return new RyFloat(this.value % ((RyInt)other).getValue() ,this.TAG);
		}

		return new RyFloat(this.value % ((RyFloat)other).getValue() ,this.TAG);
	}

}
