
public class Gym {

    private String Name;
    private String Address;
    private String Phone_number;
    public static Customer[] Customers;
    public static Admin[] Admins;
    private Equipment[] Sports_equipment;
    private int numberOfEquipments= 0;
    public static Coach[] Coaches;
    private Subscription[] Subscriptions;
    private int numberOfSubscriptions = 0;



    public Gym(String Name, String Address, String Phone_number, Equipment[] Sports_equipment, Subscription[] Subscriptions) {
        this.Name = Name;
        this.Address = Address;
        this.Phone_number = Phone_number;
        this.Sports_equipment = Sports_equipment;
        this.Subscriptions = Subscriptions;
    }


    public void setName(String Name) {
        this.Name = Name;
    }
    public String getName() {
        return Name;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    public String getAddress() {
        return Address;
    }

    public void setPhoneNumber(String Phone_number) {
        this.Phone_number = Phone_number;
    }
    public String getPhoneNumber() {
        return Phone_number;
    }

    public void setNumberOfEquipments(int numberOfEquipments) {

        this.numberOfEquipments = numberOfEquipments;
    }
    public int getNumberOfEquipments() {

        return numberOfEquipments;
    }

    public void setNumberOfSubscriptions(int numberOfSubscriptions) {

        this.numberOfSubscriptions = numberOfSubscriptions;
    }
    public int getNumberOfSubscriptions() {

        return numberOfSubscriptions;
    }

    public void AddEquipment(Equipment equipment){

        Sports_equipment[numberOfEquipments] = equipment;
    }
    public void RemoveEquipment(int Code){
        int removedIndex = 0;

        for(int i = 0; i < 10; i++) {
            if (Sports_equipment[i].getEQUIPMENTCODE() == Code) {
                Sports_equipment[i] = null;
                removedIndex = i;
                break;
            }
        }

        for (int j = 0; j < 10; j++){
            if (j >= removedIndex){
                Sports_equipment[j] = Sports_equipment[j+1];
            }
        }
    }
    public void ViewEquipments(int ID){
        for (int i = 0; i < 10; i++){
            if (Sports_equipment[i].getEQUIPMENTCODE() == ID){
                Sports_equipment[i].DisplayInfo();
                System.out.println("=================");
                break;
            }
        }
    }

    public static void AddAdmin(Admin admin){
        Admins[Admin.adminsCount] = admin;
    }
    public static void RemoveAdmin(int ID){
        int removedIndex = 0;

        for(int i = 0; i < Admin.adminsCount; i++) {
            if (Admins[i].getID() == ID) {
                Admins[i] = null;
                removedIndex = i;
                break;
            }
        }

        for (int j = 0; j < Admin.adminsCount; j++){
            if (j < Admin.adminsCount - 1) {
                if (j >= removedIndex){
                    Admins[j] = Admins[j+1];
                }
            }
        }
        Admin.adminsCount--;
    }
    public static void ViewAdmins(int ID){
        for (int i = 0; i < Admin.adminsCount; i++){
            if (Admins[i].getID() == ID){
                Admins[i].DisplayInfo();
                System.out.println("=================");
                break;
            }
        }
    }

    public static void AddCustomer(Customer customer){
        Customers[Customer.customersCount] = customer;
    }
    public static void RemoveCustomer(int ID){
        int removedIndex = 0;

        for(int i = 0; i < Customer.customersCount; i++) {
            if (Customers[i].getID() == ID) {
                Customers[i] = null;
                removedIndex = i;
                break;
            }
        }

        for (int j = 0; j < Customer.customersCount; j++){
            if (j < Customer.customersCount - 1) {
                if (j >= removedIndex){
                    Customers[j] = Customers[j+1];
                }
            }
        }
        Customer.customersCount--;
    }
    public static void ViewCustomers(int ID){
        for (int i = 0; i < Customer.customersCount; i++){
            if (Customers[i].getID() == ID){
                Customers[i].DisplayInfo();
                System.out.println("=================");
                break;
            }
        }
    }

    public static void AddCoach(Coach coach){
        Coaches[Coach.coachCount] = coach;
    }
    public static void RemoveCoach(int ID){
        int removedIndex = 0;

        for(int i = 0; i < Coach.coachCount; i++) {
            if (Coaches[i].getID() == ID) {
                Coaches[i] = null;
                removedIndex = i;
                break;
            }
        }

        for (int j = 0; j < Coach.coachCount; j++){
            if (j < Coach.coachCount - 1) {
                if (j >= removedIndex){
                    Coaches[j] = Coaches[j+1];
                }
            }
        }
        Coach.coachCount--;
    }
    public static void ViewCoaches(int ID){
        for (int i = 0; i < Coach.coachCount; i++){
            if (Coaches[i].getID() == ID){
                Coaches[i].DisplayInfo();
                System.out.println("=================");
                break;
            }
        }
    }

    public void AddSubscription(Subscription Subscription){

        Subscriptions[numberOfSubscriptions] = Subscription;
    }
    public void RemoveSubscriptions(int ID){
        int removedIndex = 0;

        for(int i = 0; i < 10; i++) {
            if (Subscriptions[i].getID() == ID) {
                Subscriptions[i] = null;
                removedIndex = i;
                break;
            }
        }

        for (int j = 0; j < 10; j++){
            if (j >= removedIndex){
                Subscriptions[j] = Subscriptions[j+1];
            }
        }
    }
    public void ViewSubscriptions(int ID){
        for (int i = 0; i < 10; i++){
            if (Subscriptions[i].getID() == ID){
                Subscriptions[i].DisplaySubscriptionInfo();
                System.out.println("=================");
                break;
            }
        }
    }
}
