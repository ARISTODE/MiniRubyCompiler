class testComp {
	public static void main(String[] args) { 









Value a = new RyInt(5, 50);
Value b = new RyInt(4, 50);
a.compareTo(b)  > 0
new RyString("Hello",1).compareTo(new RyInt(5, 50))  > 0
new RyString("Hello",1).compareTo(new RyString("world",1))  > 0
new RyString("Hello",1).compareTo(new RyString("world",1))  >= 0
new RyInt(5, 50).compareTo(new RyFloat(5.5f, 51))  > 0
new RyInt(5, 50).compareTo(new RyInt(6, 50))  < 0
new RyFloat(5.5f, 51).compareTo(new RyInt(4, 50))  > 0	}
}
