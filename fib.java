class fib {
	public static void main(String[] args) { 


Formatter.classCastHelper(fib(new RyInt(6, 51)));
	}
public static Value fib(Value n){ 	
if ((n.compareTo(new RyInt(1, 51))  == 0)||(n.compareTo(new RyInt(0, 51))  == 0)) {		
	return n;
}else{
	return fib(n.min(new RyInt(1, 51))).add(fib(n.min(new RyInt(2, 51))));
}
}
}
