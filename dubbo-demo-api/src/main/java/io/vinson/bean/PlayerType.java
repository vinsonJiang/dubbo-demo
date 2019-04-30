package io.vinson.bean;

/**
 * @author: jiangweixin
 * @date: 2019/4/30
 */
public enum PlayerType {
    /**前锋*/
    cf(1),
    /**中场*/
    mf(2),
    /**后卫*/
    cb(3),
    /**门将*/
    gk(4)
    ;

    private Integer value;

    private PlayerType(Integer value) {
        this.value = value;
    }
}
