package com.nidong.shop.shoppingMall.biz.suanfa.week2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个 N 叉树，返回其节点值的层序遍历。 (即从左到右，逐层遍历)。
 *
 * 例如，给定一个 3叉树 :
 *
 * 返回其层序遍历:
 *
 * [
 *      [1],
 *      [3,2,4],
 *      [5,6]
 * ]
 *  
 *
 * 说明:
 *
 * 树的深度不会超过 1000。
 * 树的节点总数不会超过 5000。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Test429 {
    private List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> levelOrder(Node root) {
        LinkedList<Node> queue=new LinkedList<>();
        if(root==null) {
            return list;
        }

        queue.addFirst(root);
        int len=1;
        Node cur=null;
        while(!queue.isEmpty()){
            List<Integer> tmp=new ArrayList<>();
            for(int i=0;i<len;i++){
                cur=queue.removeFirst();
                tmp.add(cur.val);
                if(cur.children!=null){
                    for(Node node:cur.children){
                        queue.addLast(node);
                    }
                }
            }
            len=queue.size();
            list.add(tmp);
        }
        return list;
    }
}
