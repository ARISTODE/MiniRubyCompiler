class Formatter {	
	public static String wrap(String sourceStr, String className) {
		String header = "class " + className + " { \n\tpublic static void main(String[] args) { \n";
		String tail = "\t}\n}\n";
		String wholeScript = header + sourceStr + tail;
		return wholeScript;	
	}

	public static void classCastHelper(Value val) {
		String className = val.getClass().toString().substring(6);
		switch (className) {
			case "RyString":
				System.out.println(((RyString)val).getValue());
				break;
			case "RyInt":
				System.out.println(((RyInt)val).getValue());
				break;
			case "RyFloat":
				System.out.println(((RyFloat)val).getValue());
				break;
			default:
				break;
		}
	}
	
	public static void main(String[] args) {
		
	}
}