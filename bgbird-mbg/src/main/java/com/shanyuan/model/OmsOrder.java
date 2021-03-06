package com.shanyuan.model;

import java.io.Serializable;
import java.util.Date;

public class OmsOrder implements Serializable {
    private Integer id;

    /**
     * 用户id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * 优惠券id
     *
     * @mbggenerated
     */
    private Long couponId;

    /**
     * 订单编号
     *
     * @mbggenerated
     */
    private Long orderId;

    /**
     * 订单总金额
     *
     * @mbggenerated
     */
    private Integer totalAmount;

    /**
     * 实际支付金额
     *
     * @mbggenerated
     */
    private Integer payAmount;

    /**
     * 运费金额
     *
     * @mbggenerated
     */
    private Integer freightAmount;

    /**
     * 促销优惠金额（促销价、满减、阶梯价）
     *
     * @mbggenerated
     */
    private Integer promotionAmount;

    /**
     * 优惠券抵扣金额
     *
     * @mbggenerated
     */
    private Integer couponAmount;

    /**
     * 支付方式:0->未支付,1->微信支付,2->支付宝支付
     *
     * @mbggenerated
     */
    private Integer payType;

    /**
     * 订单来源:0->app订单,1->PC订单
     *
     * @mbggenerated
     */
    private Integer sourceType;

    /**
     * 订单状态：0->待付款；1->已支付，待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     *
     * @mbggenerated
     */
    private Integer orderStatus;

    /**
     * 订单类型：0->正常订单；1->秒杀订单
     *
     * @mbggenerated
     */
    private Integer orderType;

    /**
     * 支付时间
     *
     * @mbggenerated
     */
    private Date paymentTime;

    /**
     * 获得的积分
     *
     * @mbggenerated
     */
    private Integer integration;

    /**
     * 促销活动信息
     *
     * @mbggenerated
     */
    private String promotionInfo;

    /**
     * 订单备注
     *
     * @mbggenerated
     */
    private String notes;

    /**
     * 收货人
     *
     * @mbggenerated
     */
    private String receiverName;

    /**
     * 收货人联系电话
     *
     * @mbggenerated
     */
    private String receiverPhone;

    /**
     * 收货人地址
     *
     * @mbggenerated
     */
    private String receiverAddress;

    /**
     * 发货时间
     *
     * @mbggenerated
     */
    private Date deliveryTime;

    /**
     * 确认收货时间
     *
     * @mbggenerated
     */
    private Date receiveTime;

    /**
     * 评价时间
     *
     * @mbggenerated
     */
    private Date commentTime;

    /**
     * 更新时间
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * 删除状态:0->否，1->是
     *
     * @mbggenerated
     */
    private Integer deleteStatus;

    /**
     * 确认收货:0->否，1->是
     *
     * @mbggenerated
     */
    private Integer confirmStatus;

    /**
     * 送餐方式:0->堂吃，1->配送
     *
     * @mbggenerated
     */
    private Integer eatType;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * 评价状态:0->否,1->是
     *
     * @mbggenerated
     */
    private Integer commentStatus;

    /**
     * 取餐号
     *
     * @mbggenerated
     */
    private String takeMealNo;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getFreightAmount() {
        return freightAmount;
    }

    public void setFreightAmount(Integer freightAmount) {
        this.freightAmount = freightAmount;
    }

    public Integer getPromotionAmount() {
        return promotionAmount;
    }

    public void setPromotionAmount(Integer promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    public Integer getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(Integer couponAmount) {
        this.couponAmount = couponAmount;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    public String getPromotionInfo() {
        return promotionInfo;
    }

    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Integer getConfirmStatus() {
        return confirmStatus;
    }

    public void setConfirmStatus(Integer confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    public Integer getEatType() {
        return eatType;
    }

    public void setEatType(Integer eatType) {
        this.eatType = eatType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(Integer commentStatus) {
        this.commentStatus = commentStatus;
    }

    public String getTakeMealNo() {
        return takeMealNo;
    }

    public void setTakeMealNo(String takeMealNo) {
        this.takeMealNo = takeMealNo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", couponId=").append(couponId);
        sb.append(", orderId=").append(orderId);
        sb.append(", totalAmount=").append(totalAmount);
        sb.append(", payAmount=").append(payAmount);
        sb.append(", freightAmount=").append(freightAmount);
        sb.append(", promotionAmount=").append(promotionAmount);
        sb.append(", couponAmount=").append(couponAmount);
        sb.append(", payType=").append(payType);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", orderType=").append(orderType);
        sb.append(", paymentTime=").append(paymentTime);
        sb.append(", integration=").append(integration);
        sb.append(", promotionInfo=").append(promotionInfo);
        sb.append(", notes=").append(notes);
        sb.append(", receiverName=").append(receiverName);
        sb.append(", receiverPhone=").append(receiverPhone);
        sb.append(", receiverAddress=").append(receiverAddress);
        sb.append(", deliveryTime=").append(deliveryTime);
        sb.append(", receiveTime=").append(receiveTime);
        sb.append(", commentTime=").append(commentTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", deleteStatus=").append(deleteStatus);
        sb.append(", confirmStatus=").append(confirmStatus);
        sb.append(", eatType=").append(eatType);
        sb.append(", createTime=").append(createTime);
        sb.append(", commentStatus=").append(commentStatus);
        sb.append(", takeMealNo=").append(takeMealNo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}