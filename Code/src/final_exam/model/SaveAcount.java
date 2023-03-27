package final_exam.model;

public class SaveAcount extends Acount {
    private long saveMoney;
    private String beginDay;
    private double laiXuat;
    private int kiHan;

    public SaveAcount() {

    }

    public SaveAcount(long saveMoney, String beginDay, double laiXuat, int kiHan) {
        this.saveMoney = saveMoney;
        this.beginDay = beginDay;
        this.laiXuat = laiXuat;
        this.kiHan = kiHan;
    }

    public SaveAcount(int id, String acountId, String name, String createDay, long saveMoney, String beginDay, double laiXuat, int kiHan) {
        super(id, acountId, name, createDay);
        this.saveMoney = saveMoney;
        this.beginDay = beginDay;
        this.laiXuat = laiXuat;
        this.kiHan = kiHan;
    }

    public long getSaveMoney() {
        return saveMoney;
    }

    public void setSaveMoney(long saveMoney) {
        this.saveMoney = saveMoney;
    }

    public String getBeginDay() {
        return beginDay;
    }

    public void setBeginDay(String beginDay) {
        this.beginDay = beginDay;
    }

    public double getLaiXuat() {
        return laiXuat;
    }

    public void setLaiXuat(double laiXuat) {
        this.laiXuat = laiXuat;
    }

    public int getKiHan() {
        return kiHan;
    }

    public void setKiHan(int kiHan) {
        this.kiHan = kiHan;
    }

    @Override
    public String toString() {
        return "SaveAcount{" +
                "saveMoney=" + saveMoney +
                ", beginDay='" + beginDay + '\'' +
                ", laiXuat=" + laiXuat +
                ", kiHan=" + kiHan +
                '}';
    }
}
