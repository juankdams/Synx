public class bCA
{
  public static final int VERSION = 0;
  private final cSR gwP = new cSR();
  boolean cdg;

  public cSR bKY()
  {
    return this.gwP;
  }

  public void b(cSR paramcSR) {
    this.gwP.ensureCapacity(this.gwP.size() + paramcSR.size());
    this.gwP.f(paramcSR);
  }

  public void b(aYQ paramaYQ, boolean paramBoolean)
  {
    d(paramaYQ, paramBoolean);
  }

  public void c(aYQ paramaYQ, boolean paramBoolean) {
    int i = paramaYQ.readByte();
    b(paramaYQ, paramBoolean);
  }

  public void b(dSw paramdSw) {
    g(paramdSw);
  }

  private void d(aYQ paramaYQ, boolean paramBoolean)
  {
    if (paramBoolean) {
      this.gwP.clear();
    }

    int i = paramaYQ.readShort() & 0xFFFF;
    if (i == 0) {
      return;
    }

    for (int j = 0; j < i; j++) {
      avH localavH = new avH();
      localavH.d(paramaYQ);
      this.gwP.put(localavH.aw, localavH);
    }
  }

  private void g(dSw paramdSw) {
    int i = this.gwP.size();
    if (i > 32767) {
      throw new IllegalArgumentException("Nombre de landmark > 32767");
    }

    paramdSw.writeShort((short)(i & 0xFFFF));
    for (dmn localdmn = this.gwP.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      ((avH)localdmn.value()).b(paramdSw);
    }
  }

  public void clear() {
    this.gwP.clear();
  }
}