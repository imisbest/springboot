package com.csw.service;

import com.csw.HelloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HelloServiceImpl implements HelloService {
    @Autowired
    private HelloDao helloDao;
}
