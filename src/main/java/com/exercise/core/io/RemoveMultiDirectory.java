package com.exercise.core.io;

import java.io.File;

public class RemoveMultiDirectory {
    public static void main(java.lang.String[] args) {
        //删除多级空目录
        File file = new File("D:\\硬盘备份\\1\\图片\\相片");
        removeDirectory(file);
    }

    //递归删除多级空目录
    public static void removeDirectory(File file) {
        File[] fileList = file.listFiles();
        for (File f : fileList) {
            if (f.isDirectory()) {
                removeDirectory(f);
            }
        }
        if (file.isDirectory() && (file.listFiles().length < 1)) {
            System.out.println("2, deleted direcroty: " + file.getPath());
            file.delete();
        }
    }
}