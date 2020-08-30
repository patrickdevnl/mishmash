package nl.patrickdev.tweehek.mishmash.domain;

import lombok.Getter;

import java.time.LocalTime;

@Getter
public class TimeSlot {
    private LocalTime startTime;
    private LocalTime endTime;
}
