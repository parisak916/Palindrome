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
public class Stack<E> {
   
    private Node<E> top;
    int size = 0;

	public Stack() {
		this.top =null;
	}
	
	
	/*
	 * places element on the top of the stack
	 */
	public void push(E element){
            Node<E> node = new Node<E>(element);
            
           	//first node in the stack
		if(size == 0)
                {
                    this.top = node;
                }
                
                //putting nodes in the stack
                else {
                    node.next = top;
                    this.top = node;
                }
		 
                size++;
	}
	
	/*
	 * remove the top node and return its contents
	 */
	public E pop(){
            Node<E> temp = new Node<E>();
            if(size < 0) {
                throw new IndexOutOfBoundsException("index out of bounds");
            }
            
            if(size == 0) {
                temp = this.top;
            }
            else {
                
            temp = this.top;
            this.top = this.top.next;
            }
           
            size--;
            return temp.getElement();
            
            
	}
	
	/*
	 * Look at the top element of the Stack and return it, without removing
	 */
	public E peek(){
		Node<E> temp = new Node<E>();
                temp = this.top;
                System.out.println(temp.getElement());
                return temp.getElement();
	}
	
	//returns the size of the stack
	public int size(){
            return size;
                                        
	}
        

        }
