package nl.patrickdev.tweehek.mishmash.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Activity {
    private String name;
    private String host;
    private int numberOfSlots;
    private Set<Integer> availableDuring = new HashSet<>();
}
