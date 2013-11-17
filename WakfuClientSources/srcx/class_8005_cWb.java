public enum cWb
{
  private final byte hV;

  private cWb(byte arg3)
  {
    byte b;
    this.hV = b;
  }

  public byte bJ()
  {
    return this.hV;
  }

  public String getName() {
    return bU.fH().getString("dungeon.filter." + this.hV);
  }

  public boolean b(aiA paramaiA) {
    switch (apf.duX[ordinal()]) {
    case 1:
      return (paramaiA.avo()) && (!paramaiA.isLocked());
    case 2:
    }
    return true;
  }
}