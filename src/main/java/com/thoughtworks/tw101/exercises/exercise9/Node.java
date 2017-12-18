package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node leftChild;
    private Node rightChild;

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode) {
        if (name.compareTo(nameOfNewNode)<=0) {
            addRightChild(nameOfNewNode);
        }
        else {
            addLeftChild(nameOfNewNode);
        }
    }

    private void addLeftChild(String nameOfNewNode) {
        if(leftChild==null){
            leftChild = new Node(nameOfNewNode);
        }
        else{
            leftChild.add(nameOfNewNode);
        }
    }

    private void addRightChild(String nameOfNewNode) {
        if(rightChild==null){
            rightChild = new Node(nameOfNewNode);
        }
        else{
            rightChild.add(nameOfNewNode);
        }
    }

    public List<String> names() {
        List<String> result = new ArrayList<String>();
        if(leftChild!=null){
            result.addAll(leftChild.names());
        }
        result.add(name);
        if (rightChild!=null){
            result.addAll(rightChild.names());
        }
        return result;
    }
}
