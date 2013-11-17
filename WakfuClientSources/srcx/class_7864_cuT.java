class cuT extends dcj
  implements df
{
  private final axA[] ifB;

  public cuT(axA[] paramArrayOfaxA)
  {
    super(axA.SIZE * (paramArrayOfaxA.length + 1));
    this.ifB = paramArrayOfaxA;
    for (int i = 0; i < paramArrayOfaxA.length; i++) {
      a(i * axA.SIZE, paramArrayOfaxA[i]);
    }
    a(axA.SIZE * paramArrayOfaxA.length, null);
  }
  public void hb() {
    a(0L, this.ifB, 0, this.ifB.length);
  }
}