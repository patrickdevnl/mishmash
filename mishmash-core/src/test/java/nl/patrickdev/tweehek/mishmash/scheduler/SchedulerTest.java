package nl.patrickdev.tweehek.mishmash.scheduler;

import com.google.common.collect.Sets;
import nl.patrickdev.tweehek.mishmash.domain.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class SchedulerTest {
    @Test
    public void testScheduler() {
        // Scherm 1: Nieuwe dag maken
        Day day = new Day();
        day.setDate(LocalDate.of(2020, 6, 25));


        // Scherm 2: Tijdvakken toevoegen
        TimeSlot timeSlot1 = new TimeSlot();
        timeSlot1.setStartTime(LocalTime.of(10, 0));
        timeSlot1.setEndTime(LocalTime.of(11, 30));

        TimeSlot timeSlot2 = new TimeSlot();
        timeSlot2.setStartTime(LocalTime.of(13, 0));
        timeSlot2.setEndTime(LocalTime.of(14, 30));

        day.setTimeSlots(Arrays.asList(timeSlot1, timeSlot2));


        // Scherm 3: Kampen toevoegen
        Camp camp1 = new Camp();
        camp1.setName("Techkamp");

        Camp camp2 = new Camp();
        camp2.setName("Girlscamp");

        day.setCamps(Sets.newHashSet(camp1, camp2));


        // Scherm 4: Activiteiten toevoegen
        Activity activity = new Activity();
        activity.setName("Lasergamen");
        activity.setHost("Patrick");
        activity.setNumberOfSlots(16);
        activity.setAvailableDuring(Sets.newHashSet(1, 2));

        day.setActivities(Sets.newHashSet(activity));


        // Schermen af, nu gaan de gebruikers zich inschrijven!

        // Scherm 1: aanmelden
        Participant participant1 = new Participant();
        participant1.setName("Finette");
        participant1.setCamp(camp1);
        participant1.setAvailableDuring(Sets.newHashSet(2, 3));
        participant1.setPreferredActivities(Arrays.asList(activity));

        day.addParticipant(participant1);


        // Aanmelden af, nu kunnen we gaan schedulen!
        Scheduler scheduler = new Scheduler();
        Schedule schedule = scheduler.getScheduleOf(day);

        System.out.println("Planned activities: " + schedule.getPlannedActivities().size());
    }

}
