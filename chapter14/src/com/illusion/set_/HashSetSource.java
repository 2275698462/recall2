package com.illusion.set_;

import java.util.HashSet;

@SuppressWarnings("all")
public class HashSetSource {
    public static void main(String[] args) {

        HashSet hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");
        System.out.println("set=" + hashSet);

        /*
        源码解读：
        1、执行 HashSet()
        public HashSet() {
              map = new HashMap<>();
          }
        2、执行add()
        public boolean add(E e) {   //e = "java"
                return map.put(e, PRESENT)==null;   //(static) PRESENT = new Object();
          }
        3、执行put()，该方法会执行 hash(key),得到 key 对应的 hash 值 算法,h = key.hashCode()) ^ (h >>> 16)
        public V put(K key, V value) {     //key = "java" value = PRESENT 共享
               return putVal(hash(key), key, value, false, true);
          }
        4、执行putVal
        final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {
        Node<K,V>[] tab; Node<K,V> p; int n, i;  //定义了辅助变量
        //table是 HashMap的一个数组，类型是Node
        //if 语句表示如果当前table是 nulll或者大小 = 0,就是第一次扩容,到16个空间
        if ((tab = table) == null || (n = tab.length) == 0)
            n = (tab = resize()).length;
        //(1)根据key得到hash,去计算该key应该存放到table表的哪个索引位置,并把这个位置的对象赋给p
        //(2)判断p 是否为null
        //(2.1)如果p 为null，表示还没有存放元素，就创建一个Node(key = "java", value = PRESENT)
        //(2.2)就放在该位置 tab[i] = newNode(hash, key, value, null)

        if ((p = tab[i = (n - 1) & hash]) == null)
            tab[i] = newNode(hash, key, value, null);
        else {
            Node<K,V> e; K k;
            if (p.hash == hash &&
                ((k = p.key) == key || (key != null && key.equals(k))))
                e = p;
            else if (p instanceof TreeNode)
                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
            else {
                for (int binCount = 0; ; ++binCount) {
                    if ((e = p.next) == null) {
                        p.next = newNode(hash, key, value, null);
                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                            treeifyBin(tab, hash);
                        break;
                    }
                    if (e.hash == hash &&
                        ((k = e.key) == key || (key != null && key.equals(k))))
                        break;
                    p = e;
                }
            }
            if (e != null) { // existing mapping for key
                V oldValue = e.value;
                if (!onlyIfAbsent || oldValue == null)
                    e.value = value;
                afterNodeAccess(e);
                return oldValue;
            }
        }
        ++modCount;
        if (++size > threshold)
            resize();
        afterNodeInsertion(evict);
        return null;
    }
         */
    }
}
