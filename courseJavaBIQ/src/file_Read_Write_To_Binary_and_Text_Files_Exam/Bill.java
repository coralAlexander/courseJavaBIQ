package file_Read_Write_To_Binary_and_Text_Files_Exam;

public enum Bill {
    _20(20, 150),
    _50(50, 157),
    _100(100, 164),
    _200(200, 168);

   

	private int monetaryValue;
    private int getAmount;


    private Bill(int monetaryValue, int getAmount) {
        this.monetaryValue = monetaryValue;
        this.getAmount = getAmount;
       
    }

   public int getMonetaryValue() {
        return monetaryValue;
    }

    public int getAmount() {
        return getAmount;
    }
    public void setMonetaryValue(int monetaryValue) {
		this.monetaryValue = monetaryValue;
	}

	public void setGetAmount(int getAmount) {
		this.getAmount = getAmount;
	}
}
