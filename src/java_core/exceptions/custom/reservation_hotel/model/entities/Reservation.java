package java_core.exceptions.custom.reservation_hotel.model.entities;

import java_core.exceptions.custom.reservation_hotel.model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private int roomNumber;
    private Date checkIn;
    private Date checkOut;

    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(int roomNumber, Date checkin, Date checkout) throws DomainException {
        this.roomNumber = roomNumber;
        updateDates(checkin, checkout);
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration(){
        long diff = getCheckOut().getTime() - getCheckIn().getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates (Date checkIn, Date checkOut) throws DomainException{
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)){
            throw new DomainException("As datas de check-in ou check-out não podem ser anteriores a data atual!");
        }
        if (!checkOut.after(checkIn)) {
            throw new DomainException("A data de check-out não pode ser anterior a data de check-in");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Reservation: Room " +
                roomNumber +
                ", Check-in: " +
                sdf.format(checkIn) +
                ", check-out: " +
                sdf.format(checkOut) + ", " +
                duration() +
                " nights";
    }
}
