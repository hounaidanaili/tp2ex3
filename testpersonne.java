public class testpersonne {
    public static void main(String[] args) {

        persomme p1=new persomme();
        p1.setFirstname("naili");
        p1.setName("hounaida");
        p1.setDateNaiss(1,7,2001);
        System.out.println("==>"+p1.firstname+"/"+p1.name+"/("+p1.daynaiss+","+p1.monthnaiss+","+p1.yearnaiss+")");
        System.out.println("l'age="+p1.ageEN2023());

    }
}
