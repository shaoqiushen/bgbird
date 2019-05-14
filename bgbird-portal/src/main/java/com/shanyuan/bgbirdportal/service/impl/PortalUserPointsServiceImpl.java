package com.shanyuan.bgbirdportal.service.impl;

import com.shanyuan.bgbirdportal.dto.PortalPointsResult;
import com.shanyuan.bgbirdportal.service.PortalUserPointsService;
import com.shanyuan.mapper.UmsUserPointsMapper;
import com.shanyuan.mapper.UmsUserPointsRecordMapper;
import com.shanyuan.model.UmsUserPoints;
import com.shanyuan.model.UmsUserPointsExample;
import com.shanyuan.model.UmsUserPointsRecord;
import com.shanyuan.model.UmsUserPointsRecordExample;
import com.shanyuan.utils.MyDateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * author  shenshaoqiu
 * <p>
 * create 2019-05-09 17:55
 * <p>
 * desc
 **/
@Service
public class PortalUserPointsServiceImpl implements PortalUserPointsService {

    @Autowired
    UmsUserPointsRecordMapper umsUserPointsRecordMapper;

    @Autowired
    UmsUserPointsMapper umsUserPointsMapper;

    @Override
    public UmsUserPoints getUserPointsInfo(String userId) {
        UmsUserPointsExample umsUserPointsExample = new UmsUserPointsExample();
        umsUserPointsExample.createCriteria().andUserIdEqualTo( userId );
        List <UmsUserPoints> umsUserPoints=umsUserPointsMapper.selectByExample( umsUserPointsExample );
        return umsUserPoints.get( 0 );
    }

    @Override
    public List<PortalPointsResult> getUserPointsRecord(String userId) {
        UmsUserPointsRecordExample example = new UmsUserPointsRecordExample();
        example.setOrderByClause( "create_time desc" );
        example.createCriteria().andUserIdEqualTo( userId );
        List<UmsUserPointsRecord> dataList = new ArrayList <>(  );
        List<PortalPointsResult> portalPointsResultList = new ArrayList <>(  );
        PortalPointsResult portalPointsResult = new PortalPointsResult();
        Map<String,List> map = new HashMap <>(  );
        List <UmsUserPointsRecord> umsUserPointsRecords=umsUserPointsRecordMapper.selectByExample( example );
        if(umsUserPointsRecords.size() > 0){
            for(UmsUserPointsRecord umsUserPointsRecord : umsUserPointsRecords){
                String time=MyDateUtil.parseDateToTime( umsUserPointsRecord.getCreateTime() );
                if(map.get( time ) == null){
                    dataList = new ArrayList <>(  );
                    portalPointsResult = new PortalPointsResult();
                    portalPointsResult.setMonth( time );
                    dataList.add( umsUserPointsRecord );
                    map.put( time,dataList );
                    portalPointsResult.setDataList( dataList );
                    portalPointsResultList.add( portalPointsResult );
                }else{
                    map.get( time ).add( umsUserPointsRecord );
                }

            }

        }
        return portalPointsResultList;
    }
}