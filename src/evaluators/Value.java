package src.evaluators;

public abstract class Value {
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

    public Value mins(Value other) {
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
}
