package pl.tmbazan.googlecalendarintegration.integration.calendar;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/prv/calendar")
@AllArgsConstructor
class CalendarController {
    private CalendarEventService calendarEventService;

    @PostMapping("/event")
    void addEvent(@RequestBody CalendarEventDto calendarEvent){
        calendarEventService.add(calendarEvent);
    }
}
