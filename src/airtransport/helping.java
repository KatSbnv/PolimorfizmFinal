package airtransport;


public class helping
{
    public static void main(String[] args)
    {
       Airplane sky = new Airplane();
       sky.fly();

        System.out.println("Airplanes, Helicopters, Dirigible, Air Balloon - whatever u want!! Just ask!");

        AirTransport plane = new AirTransport();
        plane.fly();

        AirbusCorporateJet jet = new AirbusCorporateJet();
        jet.fly();

        Boeing747 big = new Boeing747();
        big.fly();

    }

}
