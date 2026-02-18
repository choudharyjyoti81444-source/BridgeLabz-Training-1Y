class StudentConstructor{
    int id;
	String name;
	Student(){
	    this(101, "Rishikesh");
		Systrm.out.println("Default Constructor Called");
	}

    Student(int id, String name){
        this.id = id;
        this.name = name;
        Systrm.out.println("Parameterized Constructor Called");
  	}
	
	void display(){
	    System.out.println(id + " " +name);
	}
		
    public static void main(String[] args){
	Student.s = new Student;
	s.display();
    }
}	