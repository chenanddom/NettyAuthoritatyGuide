package com.test;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: chendom
 * Date: 2018-04-23
 * Time: 9:44
 */
public class JugeUtil {
    /**
     * 添加规范接口
     */
    public interface ConditionStandard {
        void conditionJd();

        void conditionCsc();

        void coditionYy();

    }

    public static final class CondionImpl{
        private static final CondionImpl condition = new CondionImpl();
        public static CondionImpl getInstance(){
            return condition;
        }
        /**
         * 多个条件判断
         * @param conditionStandard 条件
         * @param codition 选择的条件
         */
        public CondionImpl jugeCondition(ConditionStandard conditionStandard, Integer codition) {
            switch (codition.intValue()) {
                case 0:
                    conditionStandard.conditionCsc();
                    break;
                case 1:
                    conditionStandard.conditionJd();
                    break;
                case 2:
                    conditionStandard.coditionYy();
                    break;
                default:
                    break;
            }
            return this;
        }
    }


}
