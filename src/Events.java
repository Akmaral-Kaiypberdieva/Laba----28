public enum Events {
    Typical_Day,
    Rain,
    Smooth_Road,
    Wheel_Broke,
    River,
    Met_A_Local,
    Big_Road_Rogues,
    Roadside_Inn,
    Item_is_Broken;
    public static Events getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }

    public static void printEvent() {
        System.out.println(getRandom());
    }
}
