package ru.otus.java.homework.hw11;

import java.util.ArrayList;
import java.util.List;

class MyTree implements SearchTree {
    private class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    private Node root;

    public MyTree() {
        root = null;
    }

    public void add(int value) {
        root = add(root, value);
    }

    private Node add(Node current, int value) {

        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = add(current.left, value);
        } else if (value > current.value) {
            current.right = add(current.right, value);
        }

        return current;
    }

    @Override
    public Integer find(int element) {
        return find(root, element);
    }

    private Integer find(Node current, int element) {
        if (current == null) {
            return null;
        }
        if (element == current.value) {
            return current.value;
        }
        return element < current.value ? find(current.left, element) : find(current.right, element);
    }

    @Override
    public List<Integer> getSortedList() {
        List<Integer> sortedList = new ArrayList<>();
        getSortedList(root, sortedList);
        return sortedList;
    }

    private void getSortedList(Node node, List<Integer> sortedList) {
        if (node != null) {
            getSortedList(node.left, sortedList);
            sortedList.add(node.value);
            getSortedList(node.right, sortedList);
        }
    }

}
