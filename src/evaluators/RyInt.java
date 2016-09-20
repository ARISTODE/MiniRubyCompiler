package src.evaluators;

public class RyInt extends Value {
	int value;

	RyInt(int value, int TAG) {
		super(TAG);
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	public void setValue() {
		this.value = value;
	}

	public Value add (Value other) {
		if (TAG == other.getTag()) {
			    // both are int
			return new RyInt(this.value + ((RyInt)other).getValue() ,this.TAG);
		} else if (other.getTag() == RyLexer.FLOAT) {
			return new RyFloat(this.value + ((RyFloat)other).getValue(), RyLexer.FLOAT);
		} else {
			return new RyString(this.value + ((RyString)other).getValue(), RyLexer.LITERAL);
		}

	}

	public Value mins (Value other) {
		if (TAG == other.getTag()) {
			    // both are int
			return new RyInt(this.value - ((RyInt)other).getValue() ,this.TAG);
		}

		if (other.getTag() == RyLexer.FLOAT) {
			return new RyFloat(this.value - ((RyFloat)other).getValue(), RyLexer.FLOAT);
		}
			// no minus for int and string, type cast exception
		return new RyInt(this.value - ((RyInt)other).getValue() ,this.TAG);
	}

	public Value mul (Value other) {
		if (TAG == other.getTag()) {
			    // both are int
			return new RyInt(this.value * ((RyInt)other).getValue() ,this.TAG);
		}

		if (other.getTag() == RyLexer.FLOAT) {
				// should return a float value
			return new RyFloat(this.value * ((RyFloat)other).getValue() , RyLexer.FLOAT);
		}

			//   default let java take care of cast exception
		return new RyInt(this.value * ((RyInt)other).getValue() ,this.TAG);
	}

	public Value div (Value other) {
		if (TAG == other.getTag()) {
			return new RyInt(this.value / ((RyInt)other).getValue() ,this.TAG);
		}

		if (other.getTag() == RyLexer.FLOAT) {
				// should return a float value
			return new RyFloat(this.value / ((RyFloat)other).getValue() , RyLexer.FLOAT);
		}
		return new RyInt(this.value / ((RyInt)other).getValue() ,this.TAG);
	}

	public Value mod (Value other) {
		if (TAG == other.getTag()) {
			    // both are int
			return new RyInt(this.value % ((RyInt)other).getValue() ,this.TAG);
		}

		if (other.getTag() == RyLexer.FLOAT) {
				// should return a float value
			return new RyFloat(this.value % ((RyFloat)other).getValue() , RyLexer.FLOAT);
		}

        // type cast exception
		return new RyInt(this.value + ((RyInt)other).getValue() ,this.TAG);
	}

}
