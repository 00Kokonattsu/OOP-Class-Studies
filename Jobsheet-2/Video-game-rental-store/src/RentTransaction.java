class RentTransaction{
    int id, pricePerDay;
    String memberName, gameName;

    void showInformation(){
        System.out.println("ID          : " + id);
        System.out.println("Member name : " + memberName);
        System.out.println("Game name   : " + gameName);
        System.out.println("Rent cost per day: " + pricePerDay);
    }

    void showTotalCost(int daysPassed){
        System.out.println("Total cost of renting game" + 
        gameName + " for " + daysPassed + " day(s) is: " 
        + (daysPassed * pricePerDay) + " bucks");
    }
}