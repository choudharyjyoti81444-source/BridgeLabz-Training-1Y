// Parent class
class Person{
	void display(){
		System.out.println("This is a person");
	}
}
// Child class 1
class Student extends Person {
    void study() {
        System.out.println("Student studies");
    }
}

// Child class 2
class Teacher extends Person {
    void teach() {
        System.out.println("Teacher teaches");
    }
}

// Main class
public class HierarchicalExample {
    public static void main(String[] args) {
        Student s = new Student();
        Teacher t = new Teacher();

        s.display();  // inherited
        s.study();    // student method

        t.display();  // inherited
        t.teach();    // teacher method
    }
}