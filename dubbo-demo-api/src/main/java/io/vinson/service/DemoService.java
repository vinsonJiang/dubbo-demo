package io.vinson.service;

import io.vinson.bean.PlayerType;

/**
 * Created by JiangWeixin on 2018/12/5.
 */
public interface DemoService {
    String sayHello(String name);

    int calAttack(PlayerType playerType, int playerAbility);

    double calAttack(PlayerType playerType, double playerAbility);

    int calAbility(PlayerType playerType, int attack, int defense, int skill, int character, int goalkeeping);

    double calAbility(PlayerType playerType, double attack, double defense, double skill, double character, double goalkeeping);
}
