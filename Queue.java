/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

/**
 *
 * @author Parisa Khan
 */
public class Queue<E> {
    private Node<E> front;
	private Node<E> back;
        int size = 0;

	public Queue() {
		this.front = null;
		this.back  = null;
                
	}
	
	
	/*
	 * places element in the back of the Queue
	 */
	public void enqueue(E element){
            Node<E> node = new Node<E>(element);
            
            //out of bounds
            if(size < 0) {
                throw new IndexOutOfBoundsException();
            }
            //
            if(size == 0)
            {
                this.front = node;
                this.back = node;
            }
            else {
                back.next = node;
                this.back = node;
            }
            size++;
            
	}
	
	/*
	 * remove the front node of the queue and return it
	 */
	public E dequeue(){
		E item = null;
                Node<E> temp = new Node<E>();
                temp = this.front;
                item = this.front.getElement();
                this.front = this.front.next;
                size--;
		return temp.getElement(); 
	}
	
	/*
	 * Look at the front of the queue and return it, without removing
	 */
	public E peek(){
		Node<E> temp = new Node<E>();
                temp = this.front;
                System.out.println(temp.getElement());
		return temp.getElement();
	}
	
	//returns the size of the queue
	public int size(){
		return size;
	}
        
        
}