public enum auU
{
  private byte hV;
  private cVt dJG;

  private auU(byte arg3, cVt arg4)
  {
    byte b;
    this.hV = b;
    Object localObject;
    this.dJG = localObject;
  }

  public byte bJ() {
    return this.hV;
  }

  public XF aHa() {
    return this.dJG.aHa();
  }

  public static auU br(byte paramByte) {
    for (auU localauU : values()) {
      if (localauU.hV == paramByte) {
        return localauU;
      }
    }

    return null;
  }

  public String toString()
  {
    switch (SX.cuA[ordinal()]) {
    case 1:
      return "Saison";
    case 2:
      return "Température";
    case 3:
      return "Période de la journée";
    case 4:
      return "Type de zone";
    case 5:
      return "Wakfu";
    case 6:
      return "Et";
    case 7:
      return "Ou";
    case 8:
      return "Joueurs alentours";
    case 9:
      return "Altitude";
    }

    return super.toString();
  }

  public static XF j(aYQ paramaYQ) {
    XF localXF = br(paramaYQ.readByte()).aHa();
    localXF.d(paramaYQ);
    return localXF;
  }

  public static void a(dSw paramdSw, XF paramXF) {
    paramdSw.writeByte(paramXF.nq());
    paramXF.b(paramdSw);
  }
}