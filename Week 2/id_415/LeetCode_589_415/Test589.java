package com.nidong.shop.shoppingMall.biz.suanfa.week2;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个 N 叉树，返回其节点值的前序遍历。
 *
 * 例如，给定一个 3叉树 :

 * 返回其前序遍历: [1,3,5,6,2,4]。
 */
public class Test589 {
    List<Integer> list = new ArrayList<Integer>();
    //  创建list保存数据
    public List<Integer> preorder(Node root) {
        if(root == null) return list;
//      判断如果一开始的root为null就直接返回list
        list.add(root.val);
//      递归之前先把当前数存入list
        for(Node node:root.children){
//      循环遍历root下的子节点
            preorder(node);
//          将子节点递归
        }
        return list;
    }
}
