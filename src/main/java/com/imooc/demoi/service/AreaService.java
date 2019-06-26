package com.imooc.demoi.service;

import com.imooc.demoi.entity.Area;

import java.util.List;

public interface AreaService {

    List<Area> getAreaList();

    Area getAreaById(int areaId);

    boolean addArea(Area area);

    boolean modifyArea(Area area);

    boolean deleteArea(int areaId);

}
