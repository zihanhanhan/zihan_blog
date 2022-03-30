package com.zihan.blog.service;

import com.zihan.blog.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface TypeService {

    Type saveType(Type type);
    Type getType(Long id);

    Type getTypeByName(String name);

    Page<Type> listtype(Pageable pageable);

    Type updateType(Long id,Type type);

    void deleteType(Long id);
}
