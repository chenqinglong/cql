/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework01;

public interface Stack {
    Object pop();  //出栈
    Object peek(); //查找栈顶元素
    void push(Object e);//入栈
    void clear();//清空栈
    int size();//栈的大小
    boolean isEmpty();//判栈空

}
