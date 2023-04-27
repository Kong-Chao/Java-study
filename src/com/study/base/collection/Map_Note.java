package com.study.base.collection;

/**
 * Map<Key,Value>K，v结构
 *  1.TreeMap：基于红黑树实现
 *  2.HashMap：1.7基于Hash表实现，1.8基于数组+链表+红黑树实现
 *  3.HashTable：和HashMap类似，但它是线程安全的。
 *           意义：支持同一时刻多个线程可以同时写入HashTab并且不会导致数据不一致问题。（BUT属于遗留类，不应该去使用它）
 *           现在推荐使用ConcurrentHashMap来支持线程安全，并且ConcurrentHashMap的效率会更高（1.7ConcurrentHashMap 引入分段所，1.8引入了红黑树）
 *  4.LinkedHashMap ：使用双链表来维护元素的顺序，顺序为插入顺序或者最近最少使用(LRU)顺序
 */
public class Map_Note {
}
