package case_study.furama_resort.model;

public class Contract {
    private int contractNumber;
    private int bookingId;
    private int deposit;
    private int allFee;
    private int customerId;

    public Contract() {
    }

    public Contract(int contractNumber, int bookingId, int deposit, int allFee, int customerId) {
        this.contractNumber = contractNumber;
        this.bookingId = bookingId;
        this.deposit = deposit;
        this.allFee = allFee;
        this.customerId = customerId;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getAllFee() {
        return allFee;
    }

    public void setAllFee(int allFee) {
        this.allFee = allFee;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractNumber=" + contractNumber +
                ", bookingId=" + bookingId +
                ", deposit=" + deposit +
                ", allFee=" + allFee +
                ", customerId=" + customerId +
                '}';
    }
}
