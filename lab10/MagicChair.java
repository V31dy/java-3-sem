package com.company;

public class MagicChair implements Chair {

    public void doMagic() {
        System.out.println("Wooosh!");
    }

    @Override
    public String toString() {
        return "Magic chair";
    }
}
