package com.example.t1projectspringbootstarter.repository;

import com.example.t1projectspringbootstarter.entity.DataSourceErrorLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataSourceErrorLogRepository extends JpaRepository<DataSourceErrorLog, Long> {
}
