package com.exercise.core.generic;

    /**
     * 这是一个泛型类，T就是类型参数
     * @param <T>
     */
    public class Tool<T> {

        private T a;

        public T get() {
            return this.a;
        }

        public void set(T a) {
            this.a = a;
        }

    }
