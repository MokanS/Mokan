package HomeworkNr12;

public enum FuelTypes {
    GASOLINE(true),
    DIESEL(true),
    ELECTRIC(false),
    LPG(false),
    CNG(false);
    private final boolean isLiquid;
    FuelTypes(boolean isLiquid){
        this.isLiquid = isLiquid;
    }
    public boolean isLiquidFuel(){
        return isLiquid;
    }
}
