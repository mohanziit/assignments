package com.iit.digitalclock;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class DigitalClock {
    @Id
    int id;
    Date time;
}
