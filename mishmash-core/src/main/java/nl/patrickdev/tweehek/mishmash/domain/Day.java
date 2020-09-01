package nl.patrickdev.tweehek.mishmash.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
public class Day {
    private LocalDate date;
    private List<TimeSlot> timeSlots = new ArrayList<>();
    private Set<Camp> camps = new HashSet<>();
    private Set<Activity> activities = new HashSet<>();
    private Set<Participant> participants = new HashSet<>();

    public void addParticipant(Participant participant) {
        this.participants.add(participant);
    }
}
