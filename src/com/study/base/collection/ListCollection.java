package com.study.base.collection;

/**
 * 集合类型
 * List（列表）
 *      1.ArrayList：基于动态数组实现，支持随机访问
 *      2.LinkedList：基于双向链表实现，只能顺序访问，但是可以快速插入和删除元素
 *                    LinkedList另外可以作为栈、队列和双向队列
 *      3.Vector：功能和ArrayList类似，但是它是线程安全的
 * Set（集）
 *      1.TreeSet：基于红黑树实现，支持顺序操作（根据一个范围查找元素的操作，BUT效率不如HashSet，HashSet时间复杂度O（1），TreeSet时间复杂度为O（logN））
 *      2.HashSet: 基于Hash表实现，支持快速查找，BUT不支持有序操作性，失去元素插入顺序信息。使用Iterator遍历HashSet得到的结果不确定
 *      3.LinkedHashSet：具有HashSet的查找效率，且内部使用双向链表维护元素的插入顺序
 * Queue（队列）
 *      1.LinkedList 可以用它来实现双向队列。
 *      2.PriorityQueue 基于堆结构实现，可以用它来实现优先队列
 */
public class ListCollection {

}
