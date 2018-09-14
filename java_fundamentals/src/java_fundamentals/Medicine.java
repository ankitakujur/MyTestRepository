package java_fundamentals;

public class Medicine {
 private String medicineName;
 private float medicinePrice;
 public Medicine()
 {
	 medicineName="dfs";
	 medicinePrice=44.98f;
	 
 }
 public Medicine(String medicineName,float medicinePrice)
 {
	 this.medicineName=medicineName;
	 this.medicinePrice=medicinePrice;
 }
public String getMedicineName() {
	return medicineName;
}
public void setMedicineName(String medicineName) {
	this.medicineName = medicineName;
}
public float getMedicinePrice() {
	return medicinePrice;
}
public void setMedicinePrice(float medicinePrice) {
	this.medicinePrice = medicinePrice;
}
 public void displayMedicine()
 {
	 System.out.println("Medicine Name: \t"+medicineName+"\t Medicine Price:\t"+medicinePrice);
 }


{
	
}
}
	

