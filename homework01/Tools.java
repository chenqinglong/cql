/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework01;

/**
 * @author
 */
public class Tools {
    /**
     * ��ʮ������numת��Ϊ����������������Ӧ�Ķ����������ַ����ķ�ʽ����
     *
     * @param num
     * @return
     */
    public static String toBinary(int num) {
        String binaryString = "";
        ArrayStack stack = new ArrayStack();
        if (num ==0) {
            return "0";
        }
        while (num != 0) {
            int remainder = num % 2;
            num /= 2;
            stack.push(remainder);
        }
        while (!stack.isEmpty()) {
            binaryString += stack.pop() + "";
        }
        return binaryString;
    }

    /**
     * ��ʮ������numת��Ϊ�˽�������������Ӧ�İ˽��������ַ����ķ�ʽ����
     *
     * @param num
     * @return
     */
    public static String toOctal(int num) {
        //add your code here
        String octalString = "";
        ArrayStack stack = new ArrayStack();
        if (num ==0) {
            return "0";
        }
        while (num != 0) {
            int remainder = num % 8;
            num /= 8;
            stack.push(remainder);
        }
        while (!stack.isEmpty()) {
            octalString += stack.pop() + "";
        }
        return octalString;
    }

    /**
     * ��ʮ������numת��Ϊʮ����������������Ӧ��ʮ�����������ַ����ķ�ʽ����
     *
     * @param num
     * @return
     */
    public static String toHexadecimal(int num) {
        char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String hexadecimalString = "";
        ArrayStack stack = new ArrayStack();
        if (num ==0) {
            return "0";
        }
        while (num != 0) {
            int remainder = num % 16;
            num /= 16;
            stack.push(c[remainder]);
        }
        while (!stack.isEmpty()) {
            hexadecimalString += stack.pop();
        }
        return hexadecimalString;
    }

    /**
     * ����ջ��10����������numת��Ϊd���ƣ�dΪ2��8����16
     *
     * @param num
     * @param d
     * @return
     */
    public static String toOther(int num, int d) {
        String otherString = "";
        ArrayStack stack = new ArrayStack();
        char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        if (num ==0) {
            return "0";
        }
        while (num != 0) {
            int remainder = num % d;
            num /= d;
            stack.push(c[remainder]);
        }
        while (!stack.isEmpty()) {
            otherString += stack.pop();
        }
        return otherString;
    }

    /**
     * ��0-15ת��Ϊ��Ӧ���ַ�'0'--'9'��'A'--'E'
     *
     * @param n
     * @return
     */
    public static char toChar(int n) {
        if (n >= 0 && n <= 9) {
            return (char) ('0' + n);
        } else if (n >= 10 && n <= 15) {
            return (char) ('A' + n - 10);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * ������ʽ�з���'[]'��'()'�Ƿ�ƥ��
     *
     * @param exp
     * @return
     */
    public static boolean isMatch(String exp) {
        Stack s = new ArrayStack();
        for (char c : exp.toCharArray()) {
            if (c == '[' || c == '(') {
                s.push(c);
            } else if (c == ']' || c == ')') {
                if (s.isEmpty()) {
                    return false;
                }
                char str = (Character) s.pop();
                if (c == ']' && str != '[') {
                    return false;
                } else if (c == ')' && str != '(') {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }

}