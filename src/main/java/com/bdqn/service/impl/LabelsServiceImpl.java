package com.bdqn.service.impl;

import com.bdqn.dao.LabelsDao;
import com.bdqn.pojo.Labels;
import com.bdqn.service.LabelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabelsServiceImpl implements LabelsService {

    @Autowired
    private LabelsDao labelsDao;
    @Override
    public List<Labels> getAll() {
        return labelsDao.getAll();
    }
}
