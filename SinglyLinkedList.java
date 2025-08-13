package sample1;

import javafx.scene.Node;

public class SinglyLinkedList {

Node head;
static class Node{
    String song_title;
    Node next;
    
    Node(String d){
        song_title = d;
        next = null;
    }
}

public static SinglyLinkedList insert(SinglyLinkedList list, String song_title){
    
    Node new_node = new Node(song_title);
    
    if(list.head == null){
        list.head = new_node;
    }
    else{
        Node last = list.head;
        while(last.next != null){
            last = last.next;
        }
        last.next = new_node;
    }
    return list;
}

public static void show(SinglyLinkedList list){
    Node currNode = list.head;
    System.out.println("SinglyLinkedList:");
    while(currNode != null){
        System.out.print(currNode.song_title + " -> ");
        currNode = currNode.next;
    }
    System.out.println("null");
}

public static SinglyLinkedList removesong(SinglyLinkedList list, String song_title){
    Node currNode = list.head;
    Node prev = null;
    
    if(currNode != null && currNode.song_title == song_title){
        list.head = currNode.next;
        System.out.println(song_title + " found and deleted.");
        return list;
    }
    
    while(currNode != null && currNode.song_title != song_title){
        prev = currNode;
        currNode = currNode.next;
    }
        if(currNode != null){
            prev.next = currNode.next;
            System.out.println(song_title + " found and deleted");
        }
        
        if(currNode == null){
            System.out.print(song_title + " not found in the list.");
        }
    return list;
}
    

    public static void main(String[] args){
        SinglyLinkedList list = new SinglyLinkedList();
        
        list = insert(list, "Sing A");
        list = insert(list, "Sing B");
        list = insert(list, "Sing C");
        
        show(list);
        
        removesong(list, "Sing B");
        
        show(list);
    }
    
}


