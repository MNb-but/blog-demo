package com.bdqn.service.impl;

import com.bdqn.dao.SortDao;
import com.bdqn.pojo.Sort;
import com.bdqn.service.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SortServiceImpl implements SortService {

    @Autowired
    private SortDao sortDao;
    @Override
    public List<Sort> getAll() {
        return sortDao.getAll();
    }
}
