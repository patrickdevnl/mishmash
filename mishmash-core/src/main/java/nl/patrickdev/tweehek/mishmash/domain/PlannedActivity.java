package nl.patrickdev.tweehek.mishmash.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class PlannedActivity {
    private TimeSlot timeSlot;
    private Activity activity;
    private Set<Participant> participants = new HashSet<>();
}
