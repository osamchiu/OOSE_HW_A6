import java.util.ArrayList;
import java.util.ListIterator;


public class CompositeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test
	}

}


//"Component"
abstract class Component {
	abstract void op();
}

//"Composite"
class Question extends Component {
	ArrayList<Component> list;
	
	public Question() {
	   list = new ArrayList<Component>();
	}
	
	void addComponent(Component c) {
	   list.add(c);
	}

	// "operation()" in the "Composite"
	void op() {
		 ListIterator<Component> iterator = list.listIterator();
		 while (iterator.hasNext()) {
		   Component c = iterator.next();
		   c.op();
		 }
	}  
}

class Exam extends Component {
	// OPERATION in LEAF
	void op() {
	// ...
	}
}

//"Client"
class Main {
	void m1(Component[] cc) {
	 for (Component c: cc) 
	   c.op();
	}
}