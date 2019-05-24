package com.lushuang.springbootmapstruct.dao;

import com.lushuang.springbootmapstruct.entity.GoodInfoBean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodInfoJPA extends JpaRepository<GoodInfoBean, Long> {
}
