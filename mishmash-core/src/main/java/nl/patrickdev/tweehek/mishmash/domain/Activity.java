package nl.patrickdev.tweehek.mishmash.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Activity {
    private String name;
    private String host;
    private int numberOfSlots;
}
