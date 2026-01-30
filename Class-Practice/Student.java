class Student {
    String name;
	int age;
	
	void displayDetail() {
	     System.out.println("Name: " + name);
		 System.out.println("Age: " + age);
	}
	
    public static void main(String[] args) {
	Student s1 = new Student(); 
	s1.name = "Anushka";
	s1.age = 18;
	 
	s1.displayDetail();
	}
}	
