package com.shanyuan.bgbirdportal.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * author  shenshaoqiu
 * <p>
 * create 2019-04-30 9:52
 * <p>
 * desc
 **/
@Data
@ApiModel
public class PortalOrderParams {

    @ApiModelProperty(value="收货地址id",required=true)
    private Integer addressId;
    @ApiModelProperty("优惠券id")
    private Long couponId;
    @ApiModelProperty(value="支付方式：0->未支付；1->支付宝；2->微信",required=true)
    private Integer payType;
    @ApiModelProperty(value="商品id",required=true)
    private Integer productId;
    @ApiModelProperty(value="订单来源:0->app订单,1->PC订单",required=true)
    private Integer sourceType;
    @ApiModelProperty(value="订单类型：0->正常订单；1->秒杀订单",required=true)
    private Integer orderType;
    @ApiModelProperty(value="用户id",required=true)
    private String userId;
    @ApiModelProperty("会员卡id")
    private Integer cardId;
    @ApiModelProperty("销售属性1")
    private String sp1;
    @ApiModelProperty("销售属性2")
    private String sp2;
    @ApiModelProperty("销售属性3")
    private String sp3;
    @ApiModelProperty(value="购买数量",required=true)
    private Integer buyCount;
    @ApiModelProperty("购买留言")
    private String notes;

}