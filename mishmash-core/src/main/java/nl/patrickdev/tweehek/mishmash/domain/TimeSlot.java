package nl.patrickdev.tweehek.mishmash.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
public class TimeSlot {
    private LocalTime startTime;
    private LocalTime endTime;
}
