class test/fib {
	public static void main(String[] args) { 


fib(4);
	}
public static Value fib(Value n){ 	
if ((n.compareTo(new RyInt(1, 50))  == 0)||(n.compareTo(new RyInt(0, 50))  == 0)) {		
	return n;
}else{
	return fib(n-1).add(fib(n-2));
}
}
}
