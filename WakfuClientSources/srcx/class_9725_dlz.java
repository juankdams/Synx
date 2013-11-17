public class dlz extends CU
{
  private final int RZ;
  private final int liX;
  private final chC liY = new chC();

  public dlz(long paramLong, int paramInt1, int paramInt2, int paramInt3) {
    super(paramLong, paramInt1);
    this.RZ = paramInt2;
    this.liX = paramInt3;
  }

  public dlz(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, dFN paramdFN) {
    super(paramLong, paramInt1, paramInt4, paramdFN);
    this.RZ = paramInt2;
    this.liX = paramInt3;
  }

  public int gw() {
    return this.RZ;
  }

  public int cTq() {
    return this.liX;
  }

  public agv o(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    return (agv)this.liY.j(paramObject1, paramObject2, paramObject3, paramObject4);
  }

  public agv a(agv paramagv) {
    this.liY.a(paramagv);
    return paramagv;
  }

  public agv AD(int paramInt) {
    return (agv)this.liY.vn(paramInt);
  }
}