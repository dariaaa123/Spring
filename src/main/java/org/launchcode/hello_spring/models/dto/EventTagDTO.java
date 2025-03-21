package org.launchcode.hello_spring.models.dto;

import jakarta.validation.constraints.NotNull;
import org.launchcode.hello_spring.models.Event;
import org.launchcode.hello_spring.models.Tag;

public class EventTagDTO {
    @NotNull
    private Event event;

    @NotNull
    private Tag tag;

    public EventTagDTO(Event event, Tag tag) {
        this.event = event;
        this.tag = tag;
    }
    public EventTagDTO(){}

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
}
