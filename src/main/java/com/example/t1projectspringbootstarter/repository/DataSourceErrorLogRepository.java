package com.example.t1projectspringbootstarter.repository;

import com.example.t1projectspringbootstarter.dto.DataSourceErrorLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataSourceErrorLogRepository extends JpaRepository<DataSourceErrorLog, Long> {
}
