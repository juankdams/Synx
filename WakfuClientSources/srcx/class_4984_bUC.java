public class bUC extends bhX
{
  public bUC(Qb paramQb)
  {
    super(paramQb);
  }

  public boolean a(dsl paramdsl, int paramInt) {
    int i = this.erV.abT();
    return (i != 0) && (paramdsl.bDx() < i);
  }

  public boolean b(dsl paramdsl, int paramInt) {
    throw new UnsupportedOperationException("Impossible de retirer d'argent sur ce type d'inventaire");
  }

  public boolean a(aMq paramaMq, int paramInt1, int paramInt2) {
    int i = this.erV.gn(paramInt1);
    int j = paramaMq.nd(paramInt1);
    return (i != 0) && (paramInt2 <= i - j);
  }

  public int b(aMq paramaMq, int paramInt1, int paramInt2) {
    throw new UnsupportedOperationException("Impossible de retirer d'objet sur ce type d'inventaire");
  }
}