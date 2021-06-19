package br.com.abreu.leetcode.problems;

import java.util.Queue;

public class AddingQueueValuesInBST {

    public  class ABB {
        Integer value;
        ABB right;
        ABB left;

        ABB(int x) { value = x; }
    }

     ABB root;


    public ABB adicionar(Queue<Integer> queue){
        while (!queue.isEmpty()){
            root = inserirRecursivamente(queue.poll(), root);
        }

        return root;
    }

    public ABB inserirRecursivamente(Integer value, ABB node) {
        if(node == null) {
            node = new ABB(value);
            return node;
        }

        if (value < node.value){
            if(node.left != null) {
                inserirRecursivamente(value, node.left);
            } else {
                node.left = new ABB(value);
            }
        }
        else if(value > node.value) {
            if (node.right != null) {
                inserirRecursivamente(value, node.right);
            }else {
                node.right = new ABB(value);
            }
        }
        return node;
    }

}
