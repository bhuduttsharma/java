package com.bhu.abstraction;

public class SBIBank implements Bank {

	@Override
    public double rateOfInterest(int p, int r, int t) {
        return p * r * t;
    }
}
