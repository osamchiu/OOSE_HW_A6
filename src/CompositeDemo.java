import java.util.ArrayList;
import java.util.ListIterator;

public class CompositeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test
		Question q1 = new Question("test1");
		Question q2 = new Question("test2");
		Question q3 = new Question("test3");	
		Exam exam = new Exam();
		exam.addComponent(q1);
		exam.addComponent(q2);
		exam.addComponent(q3);

		exam.print();
	}

}


//"Component"
abstract class Component {
	abstract void print();
}

//"Composite"
class Exam extends Component {
	ArrayList<Component> list;
	
	public Exam() {
	   list = new ArrayList<Component>();
	}
	
	void addComponent(Component c) {
	   list.add(c);
	}

	// "operation()" in the "Composite"
	void print() {
		 ListIterator<Component> iterator = list.listIterator();
		 while (iterator.hasNext()) {
		   Component c = iterator.next();
		   c.print();
		 }
	}  
}

class Question extends Component {
	// OPERATION in LEAF
	String description ;
	public Question (String desc){
		this.description= desc;
	}
	void print() {
		System.out.println(desc);
	}
}

//"Client"
class Main {
	void m1(Component[] cc) {
	 for (Component c: cc) 
	   c.op();
	}
}