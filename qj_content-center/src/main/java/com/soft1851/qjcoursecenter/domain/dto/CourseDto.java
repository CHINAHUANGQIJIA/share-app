package com.soft1851.qjcoursecenter.domain.dto;


import com.soft1851.qjcoursecenter.domain.entity.Course;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseDto {
    private Course course;
    private String userName;
    private String avatarUrl;
}
