import java.util.*;


public class GetCommand {
	LoadGraph loadGraph = new LoadGraph();
	Scanner sc = new Scanner(System.in);
	
    public void menu() {
        while(true) {
        	
        	System.out.println("1. �������� ��������");
            System.out.println("2. �������� �������");
            System.out.println("3. Union");
            System.out.println("4. Find");
            
            int temp = sc.nextInt();
            switch (temp){
	            case 1:
	            	Show();
	                break;
                case 2:
                	Add();
                    break;
                case 3:
                	Union();
                    break;
                case 4:
                	Find();
                    break;
            }
        }
    }
    
    private void Show() {
        System.out.println("��������: ");
        ArrayList<Item> Items = loadGraph.getShow();
	    for (Item item : Items) {
	    	System.out.print(item.getItemId() + " ");
	    }
        System.out.println();
    }
    
    private void Add() {
    	System.out.println("����� �������: ");
        int value = sc.nextInt();
        loadGraph.Add(value);        
    }
    
    private void Union() {
        while (true) {
            System.out.println("������� �������: ");
            int firstValue = sc.nextInt();
            if (loadGraph.CheckItem(firstValue)) {
                System.out.println("������� �������� ��� �����������: ");
                int secondValue = sc.nextInt();
                if (loadGraph.CheckItem(secondValue)) {
                	//if (firstValue != secondValue)
                		loadGraph.Union(firstValue, secondValue);
                	//else System.out.println("�� ����� ��� �� �������, ������� ������");
                }
                else System.out.println("�������� " + secondValue + " �������");
                return;
            }
            else System.out.println("�������� " + firstValue + " �������");
            return;
        }
    }
    
    private void Find() {
        System.out.println("������� ��������: ");
        int firstValue = sc.nextInt();
        int secondValue = sc.nextInt();
        //if (firstValue != secondValue)
        	boolean temp = loadGraph.Find(firstValue, secondValue) ? true : false;
        	System.out.println(temp);
        //else System.out.println("�� ����� ��� �� �������, ������� ������");
    }

    
}