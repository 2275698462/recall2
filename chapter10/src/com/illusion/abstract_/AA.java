package com.illusion.abstract_;

public class AA extends Template{
    public void job(){
        long num = 0;
        for (int i = 0; i < 800000; i++) {
            num += i;
        }
    }
}
