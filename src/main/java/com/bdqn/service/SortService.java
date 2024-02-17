package com.bdqn.service;

import com.bdqn.pojo.Sort;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface SortService {
    List<Sort> getAll();
}
