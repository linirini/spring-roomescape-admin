package roomescape.domain;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ReservationTime {
    private final static String TIME_FORMAT = "HH:mm";
    private final static long NO_ID = 0;

    private final long id;
    private final LocalTime time;

    public ReservationTime(long id, LocalTime time) {
        this.id = id;
        this.time = time;
    }

    public ReservationTime(long id, ReservationTime reservationTime) {
        this(id, reservationTime.time);
    }

    public ReservationTime(long id, String time) {
        this(id, LocalTime.parse(time));
    }

    public ReservationTime(String time) {
        this(NO_ID, LocalTime.parse(time));
    }

    public long getId() {
        return id;
    }

    public String getTime() {
        return time.format(DateTimeFormatter.ofPattern(TIME_FORMAT));
    }
}
