package com.zstu.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther Stiles-JKY
 * @date 2020/5/8-18:59
 */
public class Client {

    public static void main(String[] args) {
        College computerCollege = new ComputerCollege();
        College infoCollege = new InfoCollege();

        List<College> colleges = new ArrayList<>();
        colleges.add(computerCollege);
        colleges.add(infoCollege);

        OutputImpl output = new OutputImpl(colleges);
        output.printCollege();
    }
}
