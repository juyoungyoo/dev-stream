package com.devinfo.sns.repository;

import com.devinfo.sns.domain.Shops;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Shops, Long> {}