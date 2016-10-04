public class Value {
    int TAG;

    Value(int TAG) {
        this.TAG = TAG;
    }

    public void setTag(int TAG) {
        this.TAG = TAG;
    }

    public int getTag() {
        return this.TAG;
    }

    public Value add(Value other) {
        return other;
    }

    public Value min(Value other) {
        return other;
    }

    public Value mul(Value other) {
        return other;
    }

    public Value div(Value other) {
        return other;
    }

    public Value mod(Value other) {
        return other;
    }

    public int compareTo(Value other) {
        int ret_res = 0;
        // cast self type
        switch (this.TAG) {
            case RyParser.INT:
                ret_res = ((RyInt)this).compareTo(other);
            case RyParser.FLOAT:
                ret_res = ((RyFloat)this).compareTo(other);
            case RyParser.LITERAL:
                // TODO: throw type exception error
                break;
            case RyParser.ID:
                // TODO: throw type exception error
                break;
        }

        return ret_res;
    }
}
