package vn.techmaster;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        // Tiền đang có
        int money = 18000;

        // Menu
        switch (money) {
            case 12000 :
            case 15000 :
            case 17000 :{
                System.out.println("Cafe sữa");
                break;
            }
            case 10000 : {
                System.out.println("Cafe đá");
                break;
            }
            case 8000 : {
                System.out.println("Sting dâu");
                break;
            }
            case 2000 : {
                System.out.println("Trà đá");
                break;
            }
            default: {
                System.out.println("Không có đồ uống nào phù hợp");
                break;
            }
        }
    }
}
