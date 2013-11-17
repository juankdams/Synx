public class djQ
{
  private final Ej lgX;

  public djQ()
  {
    this.lgX = new Ej(dmV.bEa);
  }
  public void a(byte paramByte, float paramFloat1, float paramFloat2, float paramFloat3) {
    this.lgX.add(new dmV(paramByte, paramFloat1, paramFloat2, paramFloat3));
  }

  public dmV Ar(int paramInt) {
    Object localObject = (dmV)this.lgX.getLast();
    int i = 0; for (int j = this.lgX.size(); i < j; i++) {
      dmV localdmV = (dmV)this.lgX.get(i);

      if (paramInt < dmV.b(localdmV)) {
        return localObject;
      }
      localObject = localdmV;
    }

    return (dmV)this.lgX.getLast();
  }

  public dmV a(dmV paramdmV) {
    int i = this.lgX.indexOf(paramdmV);
    return i < this.lgX.size() - 1 ? (dmV)this.lgX.get(i + 1) : (dmV)this.lgX.getFirst();
  }
}