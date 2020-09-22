package com.soft1851.qjcoursecenter.service;


import com.soft1851.qjcoursecenter.dao.CourseMapper;
import com.soft1851.qjcoursecenter.domain.entity.Course;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 小半吻
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseService {
    private final CourseMapper courseMapper;

   public List<Course> findAll(){
        return courseMapper.selectAll();
    }
}
