package com.iit.digitalclock;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitalClockRepo extends JpaRepository<DigitalClock, Integer> {

    @Query(value = "SELECT CURRENT_TIME()", nativeQuery = true)
    public String getCurrentTime();
}
