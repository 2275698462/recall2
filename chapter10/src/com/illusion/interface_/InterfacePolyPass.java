package com.illusion.interface_;

public class InterfacePolyPass {
    public static void main(String[] args) {
        IG ig = new Teach();
        IH ih = new Teach();
    }
}
interface IH{}
interface IG extends IH{}
class Teach implements IG{}