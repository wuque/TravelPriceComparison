package com.mobin.serviceDao;

import com.mobin.domain.Page;
import com.mobin.domain.Travel;

import java.util.List;

/**
 * Created by root on 2/9/16.
 */
public interface TravelServiceDao {
    public Page findPage(String num, String ST, String SP, String EP,String TDATA,String HGRADE,String sort,String firstPrice,String secondPrice,String TRAFFIC);
    public Boolean login(String user,String password);


}
