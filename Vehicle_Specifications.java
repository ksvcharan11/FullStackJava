class Mahindra_Specifications
{
    public static void main(String args[])
    {
        String Engine_Type = "mHAWK4cylinder";

        String Displacement = "2184cc";

        String Max_Power =  "130bhp@1600-2800rpm";

        String Max_Torque = "300Nm@1600-2800rpm";

        byte No_Of_Cylinders = 4;

        byte Valves_Per_Cylinder = 4;

        String Fuel_Supply_System = "CRDi";

        boolean isTurbo_Charger = true;

        String Transmission_Type = "Manual";

        String Gear_Box = "6-Speed";

        String  Driver_Type = "RWD";

        System.out.println("The Engine type is" +Engine_Type);
        System.out.println("The Displacement is " +Displacement);
        System.out.println("The Max power is " +Max_Power);
        System.out.println("The maximum torque is " +Max_Torque);
        System.out.println("The Number of Cylinders is " +No_Of_Cylinders);
        System.out.println("The valves per cylinder is " +Valves_Per_Cylinder);
        System.out.println("The fuel supply system is " +Fuel_Supply_System);
        System.out.println("The Turbo charger is " +isTurbo_Charger);
        System.out.println("The Transmission type is " +Transmission_Type);
        System.out.println("The Gear box is " +Gear_Box);
        System.out.println("The driver type is "+Driver_Type);
    }
}