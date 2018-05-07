package com.alevel.lecture10.collection;

public class CustomLinkedList<T>  {
    private Node<T> first;
    private Node<T> last;

    public void addFirst(T object) {
        if (isFirst()) {
            first = last = new Node<T>(null, null, object);
        } else {
            Node oldFirstNode = first;
            first = new Node<T>(last, null, object);
            oldFirstNode.prevNode = first;
        }
    }

    public void addLast(T object) {
        if (isFirst()) {
            first = last = new Node<T>(null, null, object);
        } else {
            Node oldLastNode = last;
            last = new Node<T>(null, last, object);
            oldLastNode.nextNode = last;
        }
    }

    public T removeFirst() {
        if (first == null) return null;
        Node<T> prevFirst = first;
        if (isSecond()) {
            first = last = null;
        } else {
            first = first.nextNode;
            first.prevNode = null;
        }
        return prevFirst.object;
    }

    public T removeLast() {
        if (last == null) return null;
        Node<T> prevLast = last;
        if (isSecond()) {
            first = last = null;
        } else {
            last = last.prevNode;
            last.nextNode = null;
        }
        return prevLast.object;
    }

    private boolean isFirst() {
        return first == null && last == null;
    }

    private boolean isSecond() {
        return first == last;
    }

    private class Node<T> {
        public Node nextNode;
        public Node prevNode;
        public T object;

        public Node(Node nextNode, Node prevNode, T object) {
            this.nextNode = nextNode;
            this.prevNode = prevNode;
            this.object = object;
        }
    }
}
