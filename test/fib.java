class test/fib {
	public static void main(String[] args) { 


fib(new RyInt(4, 50));
	}
public static Value fib(Value n){ 	
if ((n.compareTo(new RyInt(1, 50))  == 0)||(n.compareTo(new RyInt(0, 50))  == 0)) {		
	return n;
}else{
	return fib(n.min(new RyInt(1, 50))).add(fib(n.min(new RyInt(2, 50))));
}
}
}
