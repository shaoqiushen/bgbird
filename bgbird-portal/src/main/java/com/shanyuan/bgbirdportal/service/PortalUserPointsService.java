package com.shanyuan.bgbirdportal.service;

import com.shanyuan.bgbirdportal.dto.PortalPointsResult;
import com.shanyuan.model.UmsUserMember;

import java.util.List;

/**
 * author  shenshaoqiu
 * <p>
 * create 2019-05-09 17:55
 * <p>
 * desc
 **/
public interface PortalUserPointsService {
    UmsUserMember getUserPointsInfo(String userId);
    List<PortalPointsResult> getUserPointsRecord(String userId);
}
