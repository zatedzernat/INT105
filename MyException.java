/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throwable;

/**
 *
 * @author INT105
 */
public class MyException extends Exception{
    
    public MyException(String msg) {
        super(msg);
    }
    public MyException() {
        super();
    }
}
