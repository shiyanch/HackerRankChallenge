package Tutorials30DaysOfCode;

import java.util.Scanner;

/**
 * Day 24: More Linked Lists
 *
 * Objective
 * Check out the Tutorial tab for learning materials and an instructional video!
 *
 * Task
 * A Node class is provided for you in the editor.
 * A Node object has an integer data field, data,
 * and a Node instance pointer, next, pointing to another node (i.e.: the next node in a list).
 * A removeDuplicates function is declared in your editor,
 * which takes a pointer to the head node of a linked list as a parameter.
 *
 * Complete removeDuplicates so that it deletes any duplicate nodes
 * from the list and returns the head of the updated list.
 *
 * Note: The head pointer may be null, indicating that the list is empty.
 * Be sure to reset your next pointer when performing deletions to avoid breaking the list.
 *
 * Input Format
 * You do not need to read any input from stdin.
 * The following input is handled by the locked stub code and passed to the removeDuplicates function:
 * The first line contains an integer, N, the number of nodes to be inserted.
 * The N subsequent lines each contain an integer describing the data value of a node being inserted at the list's tail.
 *
 * Constraints
 * The data elements of the linked list argument will always be in non-decreasing order.
 *
 * Output Format
 * Your removeDuplicates function should return the head of the updated linked list.
 * The locked stub code in your editor will print the returned list to stdout.
 *
 * Sample Input
 * 6
 * 1
 * 2
 * 2
 * 3
 * 3
 * 4
 *
 * Sample Output
 * 1 2 3 4
 */
public class Day24MoreLinkedLists {
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }

    }

    public Node removeDuplicates(Node head) {
        if(head == null || head.next == null)
            return head;

        Node cur = head;
        Node nextNode = cur.next;

        while(cur != null) {
            while (nextNode != null && nextNode.data == cur.data) {
                cur.next = nextNode.next;
                nextNode = cur.next;
            }
            cur = cur.next;
        }

        return head;
    }

    public Node insert(Node head,int data)
    {
        Node p=new Node(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }

    public void display(Node head)
    {
        Node start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        int T=sc.nextInt();

        Day24MoreLinkedLists list = new Day24MoreLinkedLists();

        while(T-->0){
            int ele=sc.nextInt();
            head=list.insert(head,ele);
        }
        head=list.removeDuplicates(head);
        list.display(head);

    }
}
