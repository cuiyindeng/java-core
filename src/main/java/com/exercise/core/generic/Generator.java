package com.exercise.core.generic;

public interface Generator<T> {
    //返回类型是参数化的T
    T next();
}
