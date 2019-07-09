package com.exercise.core.string;

import java.nio.charset.Charset;

/**
 * 测试StringBuilder和StringBuffer的线程安全
 * 
 * @author cuiyindeng
 *
 */
public class StringTest3 {
    public static void main( String[] args )
    {
        System.out.println("系统默认字符编码:"+Charset.defaultCharset());
    }
}