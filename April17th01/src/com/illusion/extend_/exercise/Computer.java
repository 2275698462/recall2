package com.illusion.extend_.exercise;

public class Computer {
    private String CPU;
    private int Memory; //内存
    private String disk;
    public Computer(String CPU, int Memory, String disk) {
        this.CPU = CPU;
        this.Memory = Memory;
        this.disk = disk;
    }
    public String getDetails() {
        return "cpu=" + CPU + " 内存=" + Memory + " 硬盘=" + disk;
    }
    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getMemory() {
        return Memory;
    }

    public void setMemory(int memory) {
        Memory = memory;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }
}
