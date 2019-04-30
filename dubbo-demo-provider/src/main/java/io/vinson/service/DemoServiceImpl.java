package io.vinson.service;

import io.vinson.bean.Player;
import io.vinson.common.CalUtil;
import io.vinson.bean.PlayerType;

/**
 * Created by JiangWeixin on 2018/12/7.
 */
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        System.out.println("");
        return name;
    }

    // 计算向上取整的攻击力
    public int calAttack(PlayerType playerType, int playerAbility) {
        double temp = calAttack(playerType, (double)playerAbility);
        return CalUtil.ceilInt(temp);
    }
    // 计算返回double类型的攻击力
    public double calAttack(PlayerType playerType, double playerAbility) {
        double temp = 0;
        switch (playerType) {
            case cf:
                temp = 0.8 * playerAbility;
                break;
            case mf:
                temp = 0.6 * playerAbility;
                break;
            case cb:
                temp = 0.4 * playerAbility;
                break;
            case gk:
                temp = 0.2 * playerAbility;
                break;
        }
        return temp;
    }
    // 计算向上取整的能力值
    public int calAbility(PlayerType playerType, int attack, int defense, int skill, int character, int goalkeeping) {
        double temp = calAbility(playerType, (double) attack, (double) defense, (double) skill, (double) character, (double) goalkeeping);
        return CalUtil.ceilInt(temp);
    }
    // 计算返回double的能力值
    public double calAbility(PlayerType playerType, double attack, double defense, double skill, double character, double goalkeeping) {
        double temp = 0;
        switch (playerType) {
            case cf:
                temp = Player.RATIO_CF[0] * attack + Player.RATIO_CF[1] * defense + Player.RATIO_CF[2] * skill + Player.RATIO_CF[3] * character + Player.RATIO_CF[4] * goalkeeping;
                break;
            case mf:
                temp = Player.RATIO_MF[0] * attack + Player.RATIO_MF[1] * defense + Player.RATIO_MF[2] * skill + Player.RATIO_MF[3] * character + Player.RATIO_MF[4] * goalkeeping;
                break;
            case cb:
                temp = Player.RATIO_CB[0] * attack + Player.RATIO_CB[1] * defense + Player.RATIO_CB[2] * skill + Player.RATIO_CB[3] * character + Player.RATIO_CB[4] * goalkeeping;
                break;
            case gk:
                temp = Player.RATIO_GK[0] * attack + Player.RATIO_GK[1] * defense + Player.RATIO_GK[2] * skill + Player.RATIO_GK[3] * character + Player.RATIO_GK[4] * goalkeeping;
                break;
        }
        return temp;
    }
}
