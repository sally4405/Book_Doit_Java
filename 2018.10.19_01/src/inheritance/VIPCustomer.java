package inheritance;

public class VIPCustomer extends Customer{

	private int agentID;
	double saleRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() ������ ȣ��");
	}

	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		//System.out.println("VIPCustomer(int, String) ������ ȣ��");
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	public String showVIPInfo() {
		return super.showCustomerInfo() + "��� ���� ���̵�� " + agentID + "�Դϴ�.";
	}

	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		return super.calcPrice(price) - (int)(price*saleRatio);
	}
	
	
	
	
	
}
