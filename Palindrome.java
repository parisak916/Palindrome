/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Parisa Khan
 */


public class Palindrome<E>  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = "";
       // StringBuilder allinput = new StringBuilder();
        StringBuilder reverseinput = new StringBuilder();

        //stack and queue lists
        Stack<Character> stack = new Stack<Character>();
        Queue<Character> q = new Queue<Character>();
        Scanner keyboard = new Scanner(System.in);
        
        
        
        while(!input.equals("quit"))
        {
            //asks user for input
            StringBuilder allinput = new StringBuilder();
            int newsize = 0;
            System.out.println("Enter input");
            input = keyboard.nextLine();
            input = input.toLowerCase();
            if(input.equals("quit")) {
                System.out.println("All palindrome input backwards: ");
                System.out.println(reverseinput);
            }
            //goes through input and checks for punctuation and spaces --> if there are none, char gets pushed/queued 
            for(int i = 0; i< input.length(); i++)
            {
                char a = input.charAt(i);
                if(!Character.toString(a).matches(" ") && (!Character.toString(a).matches(",")) && !Character.toString(a).matches("\\.") 
                        && !Character.toString(a).matches("'")  && !Character.toString(a).matches("\"")) 
               {
                            
                    stack.push(a);
                    q.enqueue(a);
                    newsize++;
                }
            }
 
            //palindrome checker - compares each char of stack and queue and pops/deques from list
            boolean pal = false;
            int falsecount = 0;
            for(int i = 0; i < newsize; i++) {
                char s = stack.pop();
                char qe = q.dequeue();
                String ss = Character.toString(s);
                String qee = Character.toString(qe);
                allinput = allinput.append(s);
                
                if(ss.matches(qee))
                {
                    pal = true;
                }
                else{
                    pal = false;
                    falsecount++;
                }
            }
            allinput = allinput.append(" ");
            
            //checks/tells user if the input is palindrome or not
            if(pal == true && falsecount == 0)
            {
                System.out.println("PALINDROME");
                //adds palindrome word saved in allinput to the reverseinput string
                reverseinput = reverseinput.append(allinput);
                
            }
            else if(!input.equals("quit")) {
                System.out.println("NOT PALINDROME");
                
                 }
            }
        }
    }