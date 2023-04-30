package hw2;

import java.util.List;

public class NodeList {

    Node head;
    Node tail;
    private static class Node{
        int value;
        Node next;
        Node previos;
    }

    public void addTail(int value){
        NodeList.Node node = new NodeList.Node();
        node.value = value;
        if (head == null){
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.previos = tail;
            tail = node;
        }
    }


    public void addMid(int value, Node node){
        Node next = node.next;
        Node newNode = new Node();
        newNode.value = value;
        node.next = newNode;
        newNode.previos = node;
        if (next == null){
            tail = newNode;
        } else {
            next.previos = newNode;
            newNode.next = next;
        }
    }

    public void revert(){
        NodeList.Node currentNode = head;
        while (currentNode != null){
            NodeList.Node next = currentNode.next;
            NodeList.Node previos = currentNode.previos;
            currentNode.next = previos;
            currentNode.previos = next;
            if (previos == null){
                tail = currentNode;
            }
            if (next == null){
                head = currentNode;
            }
            currentNode = next;
        }
    }

    public void duplicateValues(){
        Node curentNode = head;
        while (curentNode != null){
            if (curentNode.value % 2 == 0){
                addMid(curentNode.value, curentNode);
                curentNode = curentNode.next.next;
            }else {
                curentNode = curentNode.next;
            }
        }
    }

    public void divideNodeList(){
        NodeList positiv = new NodeList();
        NodeList negative = new NodeList();
        Node curentNode = head;
        while (curentNode != null){
            if (curentNode.value > 0){
                positiv.addTail(curentNode.value);
            }else {
                negative.addTail(curentNode.value);
            }
            curentNode = curentNode.next;
        }
        System.out.println("Список положительных чисел");
        print(positiv);
        System.out.println("Список отрицательных чисел");
        print(negative);
    }

    public static void print(NodeList list){
        NodeList.Node currentNode = list.head;
        while (currentNode != null){
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println(" ");
    }
}
