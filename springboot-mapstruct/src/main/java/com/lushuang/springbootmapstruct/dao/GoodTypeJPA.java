package com.lushuang.springbootmapstruct.dao;

import com.lushuang.springbootmapstruct.entity.GoodTypeBean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodTypeJPA extends JpaRepository<GoodTypeBean, Long> {
}
