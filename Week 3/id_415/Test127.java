package com.nidong.shop.shoppingMall.biz.suanfa.week3;

import java.util.*;

/**
 * 给定两个单词（beginWord 和 endWord）和一个字典，找到从 beginWord 到 endWord 的最短转换序列的长度。转换需遵循如下规则：
 *
 * 每次转换只能改变一个字母。
 * 转换过程中的中间单词必须是字典中的单词。
 * 说明:
 *
 * 如果不存在这样的转换序列，返回 0。
 * 所有单词具有相同的长度。
 * 所有单词只由小写字母组成。
 * 字典中不存在重复的单词。
 * 你可以假设 beginWord 和 endWord 是非空的，且二者不相同。
 * 示例 1:
 *
 * 输入:
 * beginWord = "hit",
 * endWord = "cog",
 * wordList = ["hot","dot","dog","lot","log","cog"]
 *
 * 输出: 5
 *
 * 解释: 一个最短转换序列是 "hit" -> "hot" -> "dot" -> "dog" -> "cog",
 *      返回它的长度 5。
 * 示例 2:
 *
 * 输入:
 * beginWord = "hit"
 * endWord = "cog"
 * wordList = ["hot","dot","dog","lot","log"]
 *
 * 输出: 0
 *
 * 解释: endWord "cog" 不在字典中，所以无法进行转换。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/word-ladder
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Test127 {

    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");

        ladderLength("hit", "cog", wordList);
    }

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Map<String, Boolean> marked = new HashMap<>();
        Queue<String> queue = new LinkedList<String>();
        marked.put(beginWord, true);
        queue.add(beginWord);
        int len = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            len++;
            while(size-- > 0){
                String cur = queue.poll();
                for(String next: wordList){
                    if(marked.get(next) != null){
                        continue;
                    }
                    if(!canTransfer(cur, next)){
                        continue;
                    }
                    if(endWord.equals(next)){
                        return ++len;
                    }
                    queue.add(next);
                    marked.put(next, true);
                }
            }
        }

        return 0;
    }

    private static boolean canTransfer(String s1, String s2){
        int index = 0;
        int cnt = 0;
        while(index < s1.length()){
            if(s1.charAt(index) != s2.charAt(index)) {
                cnt++;
                index++;
            }
        }

        return cnt == 1;
    }
}
