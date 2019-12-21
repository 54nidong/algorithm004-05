package com.nidong.shop.shoppingMall.biz.suanfa.week2;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个 N 叉树，返回其节点值的后序遍历。
 *
 * 例如，给定一个 3叉树 :

 * 返回其后序遍历: [5,6,3,2,4,1].
 */
public class Test590 {

    private static List<Integer> postorder(Node root) {
        List<Integer> res  =  new ArrayList<Integer>();
        if(root == null) return res;
        for(Node cur:root.children){
            res.addAll(postorder(cur));
        }
        res.add(root.val);
        return res;
    }
}
