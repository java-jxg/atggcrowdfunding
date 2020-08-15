package com.atguigu.crowd.service;

import com.atguigu.crowd.entity.Menu;

import java.util.List;

public interface MenuService {
    List<Menu> getAll();

    void removeMenu(Integer id);

    void updateMenu(Menu menu);

    void saveMenu(Menu menu);

}
