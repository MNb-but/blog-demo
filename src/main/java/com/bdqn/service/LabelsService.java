package com.bdqn.service;

import com.bdqn.pojo.Labels;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface LabelsService {
    List<Labels> getAll();
}
