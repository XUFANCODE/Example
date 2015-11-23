package com.xf.bubblesorts;

import java.util.Comparator;

/**
 * �������ӿ�(����ģʽ: ���㷨��װ�����й�ͬ�ӿڵĶ���������ʹ�����ǿ����໥�滻)
 * 
 * @author��� * /
 * 
 * @author xfan com.xf.sorts ����8:56:20
 */
public interface Sorter {

	/**
	 * ����
	 * 
	 * @param list
	 *            �����������
	 */
	public <T extends Comparable<T>> void sort(T[] list);

	/**
	 * ����
	 * 
	 * @param list
	 *            �����������
	 * @param comp
	 *            �Ƚ���������ıȽ���
	 */
	public <T> void sort(T[] list, Comparator<T> comp);
}