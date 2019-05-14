package com.shanyuan.bgbirdportal.dto;

import com.shanyuan.validator.FlagValidator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * author  shenshaoqiu
 * <p>
 * create 2019-05-13 16:14
 * <p>
 * desc
 **/
@Data
@ApiModel
public class PortalAuthorizationParams {
    @ApiModelProperty("加密数据")
    @NotEmpty(message="加密数据不允许为空")
    private String encryptedData;
    @ApiModelProperty("偏移量")
    @NotEmpty(message="偏移量不允许为空")
    private String iv;
    @ApiModelProperty("登陆时获取到的token")
    @NotEmpty(message="token不允许为空")
    private String token;
}
