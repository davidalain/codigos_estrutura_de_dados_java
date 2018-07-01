package arvore;

import java.security.InvalidParameterException;
import java.util.List;

public class TreeImplementation<K,V> {
	
	class Node<K,V>{

		K key;
		V value;
		List<Node<K,V>> children;
		Node<K,V> parent;

		public Node(K key_, V value_, Node<K,V> parent_){ 
			
			if(key_ == null)
				throw new InvalidParameterException();
			if(value_ == null)
				throw new InvalidParameterException();
			
			key = key_;
			value = value_;
			children = null;
			parent = parent_;
		}

		public void remove(){

			this.key = null;
			this.value = null;
			this.parent = null;

			for(Node<K,V> child : children){

			}

		}

	}

	private Node<K,V> root = null;

	public TreeImplementation(){
		super();
		root = null;
	}

	public TreeImplementation(K key, V value){
		super();
		root = new Node<K, V>(key, value, null);
	}

	public boolean add(K key, V value){
		return false;
	}

	public V remove(K key){
		Node<K,V> node = getNode(key);

		if(node == null)
			return null;
		
		V value = node.value;
		node.remove();

		return value;
	}

	public V get(K key){
		V value = null;
		Node<K,V> node = getNode(key);
		if(node != null)
			value = node.value;
		return value;
	}

	private Node<K,V> getNode(K key){
		return searchKey(root, key);
	}

	private Node<K,V> searchKey(Node<K,V> current, K key){

		if(current == null)
			return null;
		if(current.key.equals(key))
			return current;
		
		for(Node<K,V> child : current.children){
			
			Node<K,V> nodeKey = searchKey(child, key);
			if(nodeKey != null)
				return nodeKey;
			
		}

//		for(Node<K,V> child : current.children){
//			if(child.key.equals(key))
//				return child;
//		}
//		
//		for(Node<K,V> child : current.children){
//			
//		}

		return null;
	}

	public V set(K key, V value){
		Node<K,V> node = getNode(key);
		V saida = node.value;
		node.value = value;
		return saida;
	}


}


