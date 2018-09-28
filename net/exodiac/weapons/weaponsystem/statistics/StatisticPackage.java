package net.exodiac.weapons.weaponsystem.statistics;

import java.util.HashMap;
import java.util.Map;

public class StatisticPackage {
    Map<Statistic, Integer> stats = new HashMap<>();

    public void addStatistic(Statistic stat, int modifier) {
        stats.put(stat, modifier);
    }

    public Map<Statistic, Integer> getStatistics() {
        return stats;
    }
}
