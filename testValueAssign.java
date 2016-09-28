import java.text.Normalizer;

class testValueAssign {
	public static void main(String[] args) { 








Value a = new RyInt(5, 50);
Value b = new RyFloat(3.4f, 51);
Value c = new RyString("Hello",1);
Value a1 = a.add(new RyInt(5, 50));
Value a2 = a.add(b);
Value a3 = a.add(c);
Value a4 = b.add(c);
Value a5 = c.mul(new RyInt(3, 50));
        Formatter.classCastHelper(a);
        Formatter.classCastHelper(b);
        Formatter.classCastHelper(c);
        Formatter.classCastHelper(a1);
        Formatter.classCastHelper(a2);
	}
}
