package implementations;

/**
 * A single node in a doubly linked list (DLL), used as the building block
 * for {@link MyDLL} in CPRG 304 at SAIT.
 * <p>
 * Each node stores a {@link String} element and maintains two directional
 * references: a predecessor ({@code pred}) pointing to the node immediately
 * before it in the chain, and a successor ({@code succ}) pointing to the
 * node immediately after it. A {@code null} predecessor indicates the node
 * is the head of the list; a {@code null} successor indicates it is the tail.
 * </p>
 *
 * <p><strong>Design Note – String-Specific Implementation:</strong><br>
 * This class is intentionally designed to store {@link String} elements only.
 * A fully reusable, type-safe design would use Java generics (e.g.,
 * {@code DLLNode<E>}), allowing any object type to be stored in the node.
 * Generic programming is outside the scope of CPRG 304 and has therefore
 * been omitted. All element fields, parameters, and return types are fixed
 * as {@link String} throughout this class and its usages.
 * </p>
 */
public class MyDLLNode
{
	/** The String value stored in this node. */
	private String element;

	/** The node before this one (null if this node is the head). */
	private MyDLLNode pred;

	/** The node after this one (null if this node is the tail). */
	private MyDLLNode succ;

	/**
	 * Creates a new node that holds the given element.
	 * The node is not linked to any other node yet.
	 *
	 * @param element the String value to store in this node
	 */
	public MyDLLNode(String element) {
		this.element = element;
		this.pred = null;
		this.succ = null;
	}

	/**
	 * Returns the String value stored in this node.
	 *
	 * @return the element in this node
	 */
	public String getElement() {
		return element;
	}

	/**
	 * Changes the String value stored in this node.
	 *
	 * @param element the new element to store
	 */
	public void setElement(String element) {
		this.element = element;
	}

	/**
	 * Returns the node before this one.
	 *
	 * @return the previous node, or null if this node is the head
	 */
	public MyDLLNode getPred() {
		return pred;
	}

	/**
	 * Sets the node before this one.
	 *
	 * @param pred the new previous node
	 */
	public void setPred(MyDLLNode pred) {
		this.pred = pred;
	}

	/**
	 * Returns the node after this one.
	 *
	 * @return the next node, or null if this node is the tail
	 */
	public MyDLLNode getSucc() {
		return succ;
	}

	/**
	 * Sets the node after this one.
	 *
	 * @param succ the new next node
	 */
	public void setSucc(MyDLLNode succ) {
		this.succ = succ;
	}
}
