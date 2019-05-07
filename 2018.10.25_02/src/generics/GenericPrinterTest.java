package generics;

class Powder extends Material {
	public void doPrinting() {
		System.out.println("Powder ���� ����մϴ�.");
	}
	public String toString() {
		return "���� Powder �Դϴ�.";
	}
}

class Plastic extends Material {
	public void doPrinting() {
		System.out.println("Plastic ���� ����մϴ�.");
	}
	public String toString() {
		return "���� Plastic �Դϴ�.";
	}
}

class GenericPrinter<T extends Material> {
	private T material;
	public void setMaterial(T material) {
		this.material = material;
	}
	public T getMaterial() {
		return material;
	}
	public String toString() {
		return material.toString();
	}
	public void printing() {
		material.doPrinting();
	}
}

abstract class Material {
	public abstract void doPrinting();
}

public class GenericPrinterTest {
	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powder);
		powder.doPrinting();
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();

		plasticPrinter.setMaterial(new Plastic());
//		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
		plasticPrinter.printing();
	}

}
