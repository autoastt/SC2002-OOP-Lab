public class Plane {
  private PlaneSeat[] seat;
  private int numEmptySeat;

  public Plane() {
    seat = new PlaneSeat[12];
    for (int i = 0; i < 12; i++) {
      seat[i] = new PlaneSeat(i + 1);
    }
    numEmptySeat = 12;
  }

  private PlaneSeat[] sortSeats() {
    PlaneSeat[] ret = new PlaneSeat[12];
    for (int i = 0; i < 12; i++) {
      ret[i] = new PlaneSeat(i + 1);
      if (seat[i].isOccupied()) ret[i].assign(seat[i].getCustomerID());
    }
    for (int i = 1; i < 12; i++) {
      for (int j = i; j > 0; j--) {
        if (ret[j].getCustomerID() < ret[j - 1].getCustomerID()) {
          PlaneSeat tmp = ret[j];
          ret[j] = ret[j - 1];
          ret[j - 1] = tmp;
        }
      }
    }
    return ret;
  }

  public void showNumEmptySeats() {
    System.out.println("There are " + numEmptySeat + " empty seats");
  }

  public void showEmptySeats() {
    System.out.println("The following seats are empty:");
    for (int i = 0; i < 12; i++) {
      if (!seat[i].isOccupied()) System.out.println("SeatID " + seat[i].getSeatID());
    }
  }

  public void showAssignedSeats(boolean bySeatId) {
    PlaneSeat[] s = bySeatId ? seat : sortSeats();
    for (int i = 0; i < 12; i++) {
      if (s[i].isOccupied()) {
        System.out.println("SeatID " + s[i].getSeatID() + " assigned to CustomerID " + s[i].getCustomerID() + ".");
      }
    }
  }

  public void assignSeat(int seatId, int cust_id) {
    if (!seat[seatId - 1].isOccupied()) numEmptySeat--;
    seat[seatId - 1].assign(cust_id);
  }

  public void unAssignSeat(int seatId) {
    seat[seatId - 1].unAssign();
    numEmptySeat++;
  }
}
