package com.jlu.weatherbetter.repository;

import com.jlu.weatherbetter.model.ZipCode;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ZipCodeRepository extends PagingAndSortingRepository<ZipCode, Long> {
}
