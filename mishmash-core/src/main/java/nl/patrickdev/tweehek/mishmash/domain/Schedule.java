package nl.patrickdev.tweehek.mishmash.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Schedule {
    private List<PlannedActivity> plannedActivities = new ArrayList<>();
}
