package nl.patrickdev.tweehek.mishmash.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
public class Participant {
    private String name;
    private Camp camp;
    private Set<Integer> availableDuring = new HashSet<>();
    private List<Activity> preferredActivities = new ArrayList<>();
}
