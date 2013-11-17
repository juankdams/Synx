import java.util.EnumMap;

 enum atC
{
  private static final EnumMap dFe = aFN();

  private static EnumMap aFN()
  {
    EnumMap localEnumMap = new EnumMap(atC.class);

    localEnumMap.put(dFb, dFc);
    localEnumMap.put(dFc, dFb);
    localEnumMap.put(dFd, dFc);

    return localEnumMap;
  }

  public atC aFO() {
    return (atC)dFe.get(this);
  }
}