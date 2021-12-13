package com.company;

public class Node <T>{
  public    Node next=null;
  public T data;

    public Node(T data) {
        this.data = data;
    }

    public Node() {
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
