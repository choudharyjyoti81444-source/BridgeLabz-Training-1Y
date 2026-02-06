class StringMethodsDemo {
    public static void main(String[] args){
	String s= "JAVA Programming";
	
	//length
	System.out.println(s.length());  //16
	
	//toUpperCase()
	System.out.println(s.toUpperCase());  //JAVAPROGRAMMING
	
	//toLowerCase()
	System.out.println(s.toLowerCase());   //java programming
	
	//charAt() 
	System.out.println(s.charAt(5));   //P
	
	//substring()
	System.out.println(s.substring(5));   //Programming
	System.out.println(s.substring(0, 4));   //JAVA
	
	//contains()
	System.out.println(s.contains("JAVA"));   //true
	
	//equals()
	System.out.println(s.equals("JAVA Programming"));  //true
	}
}	