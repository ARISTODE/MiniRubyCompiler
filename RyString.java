import Exceptions.TypeException;

class RyString extends Value {
	String value;

	RyString(String value, int TAG) {
		super(TAG);
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue() {
		this.value = value;
	}

	public Value add (Value other) {
		if (TAG == other.getTag()) {
		    // both are String
			return new RyString(this.value + ((RyString)other).getValue() ,this.TAG);
		} else if (other.getTag() == RyLexer.INT) {
			return new RyString(this.value + ((RyInt)other).getValue() ,this.TAG);
		} else {
			return new RyString(this.value + ((RyFloat)other).getValue() ,this.TAG);
		}
	}

	public Value mul(Value other) {
		return other;
	}

	public int s_compareTo(Value other)throws TypeException {
        if (this.TAG != other.getTag()) {
            throw new TypeException("comparison of String with" + other.toString()  + "failed (ArgumentTypeError) ");
        }
        return this.getValue().compareTo(((RyString)other).getValue());
    }

    public String toString() {
        return this.getValue();
    }
}


