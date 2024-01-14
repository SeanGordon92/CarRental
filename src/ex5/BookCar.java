package ex5;

import java.io.Serializable;

/**
 * Class that storing booked cars
 * @author Sean & Bar
 *
 */
public class BookCar implements Serializable  {

	private static final long serialVersionUID = 1L;

	/**
	 * CarID unique number for car
	 * UserEmail the email of the customer who rent a car (unique value)
	 * Booking dates - FromTo object, contains 2 dates, that are the opening hours range
	 */
	
	private int carID;
	private String userEmail;
	private FromTo bookingDates;
	
	public BookCar(int carID, String userEmail, FromTo bookingDates) {
		this.carID = carID;
		this.userEmail = userEmail;
		this.bookingDates = bookingDates;
	}

	public int getCarID() {
		return carID;
	}

	public void setCarID(int carID) {
		this.carID = carID;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public FromTo getBookingDates() {
		return bookingDates;
	}

	public void setBookingDates(FromTo bookingDates) {
		this.bookingDates = bookingDates;
	}

	@Override
	public String toString() {
		return "BookCar [carID=" + carID + ", userEmail=" + userEmail + ", bookingDates=" + bookingDates + "]";
	}
	
	
}
