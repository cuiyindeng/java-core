package com.exercise.core.exception;

/**
 * Hello world!
 *
 */
public class ExecutionProcess {

    private int i;

    public static void main( String[] args )
    {
        ExecutionProcess app = new ExecutionProcess();
        System.out.println("result......." + app.getInt());
    }

    private int getInt() {
        try{
            int n = 1 / 0;
            ++i;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(".......1");
            return i;
        } finally {
            ++i;
            System.out.println(".......2");
        }
        System.out.println(".......3");
        return i;
    }
}