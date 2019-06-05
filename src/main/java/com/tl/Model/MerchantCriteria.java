package com.tl.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MerchantCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MerchantCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andMerchantIdIsNull() {
            addCriterion("merchant_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNotNull() {
            addCriterion("merchant_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdEqualTo(Integer value) {
            addCriterion("merchant_id =", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotEqualTo(Integer value) {
            addCriterion("merchant_id <>", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThan(Integer value) {
            addCriterion("merchant_id >", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("merchant_id >=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThan(Integer value) {
            addCriterion("merchant_id <", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThanOrEqualTo(Integer value) {
            addCriterion("merchant_id <=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIn(List<Integer> values) {
            addCriterion("merchant_id in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotIn(List<Integer> values) {
            addCriterion("merchant_id not in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdBetween(Integer value1, Integer value2) {
            addCriterion("merchant_id between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotBetween(Integer value1, Integer value2) {
            addCriterion("merchant_id not between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIsNull() {
            addCriterion("merchant_name is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIsNotNull() {
            addCriterion("merchant_name is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameEqualTo(String value) {
            addCriterion("merchant_name =", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotEqualTo(String value) {
            addCriterion("merchant_name <>", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThan(String value) {
            addCriterion("merchant_name >", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_name >=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThan(String value) {
            addCriterion("merchant_name <", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThanOrEqualTo(String value) {
            addCriterion("merchant_name <=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLike(String value) {
            addCriterion("merchant_name like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotLike(String value) {
            addCriterion("merchant_name not like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIn(List<String> values) {
            addCriterion("merchant_name in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotIn(List<String> values) {
            addCriterion("merchant_name not in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameBetween(String value1, String value2) {
            addCriterion("merchant_name between", value1, value2, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotBetween(String value1, String value2) {
            addCriterion("merchant_name not between", value1, value2, "merchantName");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andMerchantIntroIsNull() {
            addCriterion("merchant_intro is null");
            return (Criteria) this;
        }

        public Criteria andMerchantIntroIsNotNull() {
            addCriterion("merchant_intro is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantIntroEqualTo(String value) {
            addCriterion("merchant_intro =", value, "merchantIntro");
            return (Criteria) this;
        }

        public Criteria andMerchantIntroNotEqualTo(String value) {
            addCriterion("merchant_intro <>", value, "merchantIntro");
            return (Criteria) this;
        }

        public Criteria andMerchantIntroGreaterThan(String value) {
            addCriterion("merchant_intro >", value, "merchantIntro");
            return (Criteria) this;
        }

        public Criteria andMerchantIntroGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_intro >=", value, "merchantIntro");
            return (Criteria) this;
        }

        public Criteria andMerchantIntroLessThan(String value) {
            addCriterion("merchant_intro <", value, "merchantIntro");
            return (Criteria) this;
        }

        public Criteria andMerchantIntroLessThanOrEqualTo(String value) {
            addCriterion("merchant_intro <=", value, "merchantIntro");
            return (Criteria) this;
        }

        public Criteria andMerchantIntroLike(String value) {
            addCriterion("merchant_intro like", value, "merchantIntro");
            return (Criteria) this;
        }

        public Criteria andMerchantIntroNotLike(String value) {
            addCriterion("merchant_intro not like", value, "merchantIntro");
            return (Criteria) this;
        }

        public Criteria andMerchantIntroIn(List<String> values) {
            addCriterion("merchant_intro in", values, "merchantIntro");
            return (Criteria) this;
        }

        public Criteria andMerchantIntroNotIn(List<String> values) {
            addCriterion("merchant_intro not in", values, "merchantIntro");
            return (Criteria) this;
        }

        public Criteria andMerchantIntroBetween(String value1, String value2) {
            addCriterion("merchant_intro between", value1, value2, "merchantIntro");
            return (Criteria) this;
        }

        public Criteria andMerchantIntroNotBetween(String value1, String value2) {
            addCriterion("merchant_intro not between", value1, value2, "merchantIntro");
            return (Criteria) this;
        }

        public Criteria andMerchantLableIsNull() {
            addCriterion("merchant_lable is null");
            return (Criteria) this;
        }

        public Criteria andMerchantLableIsNotNull() {
            addCriterion("merchant_lable is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantLableEqualTo(String value) {
            addCriterion("merchant_lable =", value, "merchantLable");
            return (Criteria) this;
        }

        public Criteria andMerchantLableNotEqualTo(String value) {
            addCriterion("merchant_lable <>", value, "merchantLable");
            return (Criteria) this;
        }

        public Criteria andMerchantLableGreaterThan(String value) {
            addCriterion("merchant_lable >", value, "merchantLable");
            return (Criteria) this;
        }

        public Criteria andMerchantLableGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_lable >=", value, "merchantLable");
            return (Criteria) this;
        }

        public Criteria andMerchantLableLessThan(String value) {
            addCriterion("merchant_lable <", value, "merchantLable");
            return (Criteria) this;
        }

        public Criteria andMerchantLableLessThanOrEqualTo(String value) {
            addCriterion("merchant_lable <=", value, "merchantLable");
            return (Criteria) this;
        }

        public Criteria andMerchantLableLike(String value) {
            addCriterion("merchant_lable like", value, "merchantLable");
            return (Criteria) this;
        }

        public Criteria andMerchantLableNotLike(String value) {
            addCriterion("merchant_lable not like", value, "merchantLable");
            return (Criteria) this;
        }

        public Criteria andMerchantLableIn(List<String> values) {
            addCriterion("merchant_lable in", values, "merchantLable");
            return (Criteria) this;
        }

        public Criteria andMerchantLableNotIn(List<String> values) {
            addCriterion("merchant_lable not in", values, "merchantLable");
            return (Criteria) this;
        }

        public Criteria andMerchantLableBetween(String value1, String value2) {
            addCriterion("merchant_lable between", value1, value2, "merchantLable");
            return (Criteria) this;
        }

        public Criteria andMerchantLableNotBetween(String value1, String value2) {
            addCriterion("merchant_lable not between", value1, value2, "merchantLable");
            return (Criteria) this;
        }

        public Criteria andMinDeliveryPriceIsNull() {
            addCriterion("min_delivery_price is null");
            return (Criteria) this;
        }

        public Criteria andMinDeliveryPriceIsNotNull() {
            addCriterion("min_delivery_price is not null");
            return (Criteria) this;
        }

        public Criteria andMinDeliveryPriceEqualTo(BigDecimal value) {
            addCriterion("min_delivery_price =", value, "minDeliveryPrice");
            return (Criteria) this;
        }

        public Criteria andMinDeliveryPriceNotEqualTo(BigDecimal value) {
            addCriterion("min_delivery_price <>", value, "minDeliveryPrice");
            return (Criteria) this;
        }

        public Criteria andMinDeliveryPriceGreaterThan(BigDecimal value) {
            addCriterion("min_delivery_price >", value, "minDeliveryPrice");
            return (Criteria) this;
        }

        public Criteria andMinDeliveryPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("min_delivery_price >=", value, "minDeliveryPrice");
            return (Criteria) this;
        }

        public Criteria andMinDeliveryPriceLessThan(BigDecimal value) {
            addCriterion("min_delivery_price <", value, "minDeliveryPrice");
            return (Criteria) this;
        }

        public Criteria andMinDeliveryPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("min_delivery_price <=", value, "minDeliveryPrice");
            return (Criteria) this;
        }

        public Criteria andMinDeliveryPriceIn(List<BigDecimal> values) {
            addCriterion("min_delivery_price in", values, "minDeliveryPrice");
            return (Criteria) this;
        }

        public Criteria andMinDeliveryPriceNotIn(List<BigDecimal> values) {
            addCriterion("min_delivery_price not in", values, "minDeliveryPrice");
            return (Criteria) this;
        }

        public Criteria andMinDeliveryPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_delivery_price between", value1, value2, "minDeliveryPrice");
            return (Criteria) this;
        }

        public Criteria andMinDeliveryPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_delivery_price not between", value1, value2, "minDeliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeleveryPriceIsNull() {
            addCriterion("delevery_price is null");
            return (Criteria) this;
        }

        public Criteria andDeleveryPriceIsNotNull() {
            addCriterion("delevery_price is not null");
            return (Criteria) this;
        }

        public Criteria andDeleveryPriceEqualTo(BigDecimal value) {
            addCriterion("delevery_price =", value, "deleveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeleveryPriceNotEqualTo(BigDecimal value) {
            addCriterion("delevery_price <>", value, "deleveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeleveryPriceGreaterThan(BigDecimal value) {
            addCriterion("delevery_price >", value, "deleveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeleveryPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("delevery_price >=", value, "deleveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeleveryPriceLessThan(BigDecimal value) {
            addCriterion("delevery_price <", value, "deleveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeleveryPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("delevery_price <=", value, "deleveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeleveryPriceIn(List<BigDecimal> values) {
            addCriterion("delevery_price in", values, "deleveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeleveryPriceNotIn(List<BigDecimal> values) {
            addCriterion("delevery_price not in", values, "deleveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeleveryPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("delevery_price between", value1, value2, "deleveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeleveryPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("delevery_price not between", value1, value2, "deleveryPrice");
            return (Criteria) this;
        }

        public Criteria andAvgArriveTimeIsNull() {
            addCriterion("avg_arrive_time is null");
            return (Criteria) this;
        }

        public Criteria andAvgArriveTimeIsNotNull() {
            addCriterion("avg_arrive_time is not null");
            return (Criteria) this;
        }

        public Criteria andAvgArriveTimeEqualTo(Integer value) {
            addCriterion("avg_arrive_time =", value, "avgArriveTime");
            return (Criteria) this;
        }

        public Criteria andAvgArriveTimeNotEqualTo(Integer value) {
            addCriterion("avg_arrive_time <>", value, "avgArriveTime");
            return (Criteria) this;
        }

        public Criteria andAvgArriveTimeGreaterThan(Integer value) {
            addCriterion("avg_arrive_time >", value, "avgArriveTime");
            return (Criteria) this;
        }

        public Criteria andAvgArriveTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("avg_arrive_time >=", value, "avgArriveTime");
            return (Criteria) this;
        }

        public Criteria andAvgArriveTimeLessThan(Integer value) {
            addCriterion("avg_arrive_time <", value, "avgArriveTime");
            return (Criteria) this;
        }

        public Criteria andAvgArriveTimeLessThanOrEqualTo(Integer value) {
            addCriterion("avg_arrive_time <=", value, "avgArriveTime");
            return (Criteria) this;
        }

        public Criteria andAvgArriveTimeIn(List<Integer> values) {
            addCriterion("avg_arrive_time in", values, "avgArriveTime");
            return (Criteria) this;
        }

        public Criteria andAvgArriveTimeNotIn(List<Integer> values) {
            addCriterion("avg_arrive_time not in", values, "avgArriveTime");
            return (Criteria) this;
        }

        public Criteria andAvgArriveTimeBetween(Integer value1, Integer value2) {
            addCriterion("avg_arrive_time between", value1, value2, "avgArriveTime");
            return (Criteria) this;
        }

        public Criteria andAvgArriveTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("avg_arrive_time not between", value1, value2, "avgArriveTime");
            return (Criteria) this;
        }

        public Criteria andNewMerchantIsNull() {
            addCriterion("new_merchant is null");
            return (Criteria) this;
        }

        public Criteria andNewMerchantIsNotNull() {
            addCriterion("new_merchant is not null");
            return (Criteria) this;
        }

        public Criteria andNewMerchantEqualTo(Integer value) {
            addCriterion("new_merchant =", value, "newMerchant");
            return (Criteria) this;
        }

        public Criteria andNewMerchantNotEqualTo(Integer value) {
            addCriterion("new_merchant <>", value, "newMerchant");
            return (Criteria) this;
        }

        public Criteria andNewMerchantGreaterThan(Integer value) {
            addCriterion("new_merchant >", value, "newMerchant");
            return (Criteria) this;
        }

        public Criteria andNewMerchantGreaterThanOrEqualTo(Integer value) {
            addCriterion("new_merchant >=", value, "newMerchant");
            return (Criteria) this;
        }

        public Criteria andNewMerchantLessThan(Integer value) {
            addCriterion("new_merchant <", value, "newMerchant");
            return (Criteria) this;
        }

        public Criteria andNewMerchantLessThanOrEqualTo(Integer value) {
            addCriterion("new_merchant <=", value, "newMerchant");
            return (Criteria) this;
        }

        public Criteria andNewMerchantIn(List<Integer> values) {
            addCriterion("new_merchant in", values, "newMerchant");
            return (Criteria) this;
        }

        public Criteria andNewMerchantNotIn(List<Integer> values) {
            addCriterion("new_merchant not in", values, "newMerchant");
            return (Criteria) this;
        }

        public Criteria andNewMerchantBetween(Integer value1, Integer value2) {
            addCriterion("new_merchant between", value1, value2, "newMerchant");
            return (Criteria) this;
        }

        public Criteria andNewMerchantNotBetween(Integer value1, Integer value2) {
            addCriterion("new_merchant not between", value1, value2, "newMerchant");
            return (Criteria) this;
        }

        public Criteria andInsuranceIsNull() {
            addCriterion("insurance is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceIsNotNull() {
            addCriterion("insurance is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceEqualTo(Integer value) {
            addCriterion("insurance =", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotEqualTo(Integer value) {
            addCriterion("insurance <>", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceGreaterThan(Integer value) {
            addCriterion("insurance >", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceGreaterThanOrEqualTo(Integer value) {
            addCriterion("insurance >=", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLessThan(Integer value) {
            addCriterion("insurance <", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLessThanOrEqualTo(Integer value) {
            addCriterion("insurance <=", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceIn(List<Integer> values) {
            addCriterion("insurance in", values, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotIn(List<Integer> values) {
            addCriterion("insurance not in", values, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceBetween(Integer value1, Integer value2) {
            addCriterion("insurance between", value1, value2, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotBetween(Integer value1, Integer value2) {
            addCriterion("insurance not between", value1, value2, "insurance");
            return (Criteria) this;
        }

        public Criteria andCompensateIsNull() {
            addCriterion("compensate is null");
            return (Criteria) this;
        }

        public Criteria andCompensateIsNotNull() {
            addCriterion("compensate is not null");
            return (Criteria) this;
        }

        public Criteria andCompensateEqualTo(Integer value) {
            addCriterion("compensate =", value, "compensate");
            return (Criteria) this;
        }

        public Criteria andCompensateNotEqualTo(Integer value) {
            addCriterion("compensate <>", value, "compensate");
            return (Criteria) this;
        }

        public Criteria andCompensateGreaterThan(Integer value) {
            addCriterion("compensate >", value, "compensate");
            return (Criteria) this;
        }

        public Criteria andCompensateGreaterThanOrEqualTo(Integer value) {
            addCriterion("compensate >=", value, "compensate");
            return (Criteria) this;
        }

        public Criteria andCompensateLessThan(Integer value) {
            addCriterion("compensate <", value, "compensate");
            return (Criteria) this;
        }

        public Criteria andCompensateLessThanOrEqualTo(Integer value) {
            addCriterion("compensate <=", value, "compensate");
            return (Criteria) this;
        }

        public Criteria andCompensateIn(List<Integer> values) {
            addCriterion("compensate in", values, "compensate");
            return (Criteria) this;
        }

        public Criteria andCompensateNotIn(List<Integer> values) {
            addCriterion("compensate not in", values, "compensate");
            return (Criteria) this;
        }

        public Criteria andCompensateBetween(Integer value1, Integer value2) {
            addCriterion("compensate between", value1, value2, "compensate");
            return (Criteria) this;
        }

        public Criteria andCompensateNotBetween(Integer value1, Integer value2) {
            addCriterion("compensate not between", value1, value2, "compensate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}