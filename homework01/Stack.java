/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework01;

public interface Stack {
    Object pop();  //��ջ
    Object peek(); //����ջ��Ԫ��
    void push(Object e);//��ջ
    void clear();//���ջ
    int size();//ջ�Ĵ�С
    boolean isEmpty();//��ջ��

}
