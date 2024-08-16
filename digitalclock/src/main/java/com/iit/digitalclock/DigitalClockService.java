package com.iit.digitalclock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
public class DigitalClockService {

    @Autowired
    DigitalClockRepo digitalClockRepo;
    public String getTime(){
        return digitalClockRepo.getCurrentTime();
    }



}
