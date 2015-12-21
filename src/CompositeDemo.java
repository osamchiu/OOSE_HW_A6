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
class Composite extends Component {
	ArrayList<Component> list;
	
	public Composite() {
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

//"Client"
class Main {
	void m1(Component[] cc) {
	 for (Component c: cc) 
	   c.op();
	}
}