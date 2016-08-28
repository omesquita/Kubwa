package com.wesleyelliott.kubwa.rule;

/**
 * Created by wesley on 2016/07/28.
 */

public class MobileNumberRule extends RegexRule {

    public MobileNumberRule() {
        super("(\\+\\d{1,3})\\d{10}");
    }
}
