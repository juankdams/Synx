public enum cVZ
  implements ccI
{
  private final byte hV;
  private final String aKM;
  private final Class bS;

  public static cVZ eI(byte paramByte)
  {
    for (cVZ localcVZ : values()) {
      if (paramByte == localcVZ.hV) {
        return localcVZ;
      }
    }

    throw new IllegalArgumentException("HMIActionType inconnu : '" + paramByte + "'");
  }

  private cVZ(byte paramClass, String arg4, Class arg5) {
    this.hV = paramClass;
    Object localObject1;
    this.aKM = localObject1;
    Object localObject2;
    this.bS = localObject2;
  }

  public short nc() {
    return (short)this.hV;
  }

  public String getLabel() {
    return this.aKM;
  }

  public Class getRepresentationClass() {
    return this.bS;
  }

  public String bK() {
    return Short.toString(nc());
  }

  public String bL() {
    return getLabel();
  }

  public String bN() {
    return getLabel();
  }
}