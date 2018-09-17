package java_fundamentals;

public class TestMedicine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medicine m;
		m=new Medicine();
		m.displayMedicine();
		Medicine m1;
		m1=new Medicine("swsad",67.86f);
		m1.displayMedicine();
		m.getMedicineName();
		m.getMedicinePrice();
		m.setMedicineName("erw");
		m.setMedicinePrice(42.4f);
		m.displayMedicine();

	}

}
