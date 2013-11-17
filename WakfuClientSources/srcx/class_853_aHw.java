import java.nio.ByteBuffer;
import java.util.List;

public class aHw
{
  private dFu efm = null;

  private dFu efn = null;

  private dUy efo = null;
  private boolean efp;

  private void aTr()
  {
    if (this.efm == null)
      this.efm = new dFu(3);
  }

  private void aTs() {
    if (this.efn == null)
      this.efn = new dFu(3);
  }

  private void aTt() {
    if (this.efo == null)
      this.efo = new dUy(3);
  }

  public aHw() {
    this.efp = false;
  }

  public void reset()
  {
    if (this.efm != null)
      this.efm.clear();
    if (this.efn != null)
      this.efn.clear();
    if (this.efo != null)
      this.efo.clear();
  }

  public void aTu() {
    if (this.efn != null)
      this.efn.clear();
    if (this.efo != null)
      this.efo.clear();
  }

  public int mC(int paramInt)
  {
    if (this.efm == null)
      return -1;
    if (this.efm.containsKey(paramInt)) {
      return this.efm.get(paramInt);
    }
    return -1;
  }

  private void a(bfE parambfE, alr paramalr) {
    if ((paramalr != null) && ((this.efp) || (parambfE.bsL().bHN() > 0))) {
      long l = b(parambfE, paramalr);
      aTt();
      Integer localInteger = Integer.valueOf(this.efo.kZ(l));
      if (localInteger == null)
        this.efo.G(l, 1);
      else
        this.efo.G(l, localInteger.intValue() + 1);
    }
  }

  private void c(bfE parambfE)
  {
    if ((this.efp) || (parambfE.bsQ() > 0)) {
      aTs();
      Integer localInteger = Integer.valueOf(this.efn.get(parambfE.ok()));
      if (localInteger == null)
        this.efn.fg(parambfE.ok(), 1);
      else
        this.efn.fg(parambfE.ok(), localInteger.intValue() + 1);
    }
  }

  private void a(bfE parambfE, int paramInt)
  {
    if ((this.efp) || (parambfE.bsL().bHO() != 0)) {
      aTr();
      this.efm.fg(parambfE.ok(), paramInt);
    }
  }

  public void a(bfE parambfE, int paramInt, List paramList) {
    a(parambfE, paramInt);
    c(parambfE);
    for (dle localdle : paramList) {
      a(parambfE, paramList, localdle);
      a(parambfE, localdle);
    }
  }

  private void a(bfE parambfE, List paramList, dle paramdle) {
    if (paramdle.atO() != null) {
      Iterable localIterable = paramdle.atO().Cv(bsj.fVk.getId());
      for (aVc localaVc : localIterable) {
        dle localdle = localaVc.bkf();
        if (!paramList.contains(localdle))
          a(parambfE, localdle);
      }
    }
  }

  public int b(bfE parambfE, int paramInt) {
    if ((parambfE.bsL().bHO() != 0) && 
      (this.efm != null) && 
      (this.efm.contains(parambfE.ok()))) {
      return parambfE.bsL().bHO() - (paramInt - this.efm.get(parambfE.ok()));
    }

    return 0;
  }

  public baf c(bfE parambfE, int paramInt) {
    return a(parambfE, paramInt, null);
  }

  public baf a(bfE parambfE, int paramInt, alr paramalr)
  {
    if ((parambfE.bsL().bHO() != 0) && 
      (this.efm != null) && 
      (this.efm.contains(parambfE.ok()))) {
      if ((parambfE.bsL().bHO() < 0) || (paramInt - this.efm.get(parambfE.ok()) < parambfE.bsL().bHO()))
      {
        return baf.fhJ;
      }

      this.efm.wH(parambfE.ok());
    }

    if ((parambfE.bsQ() > 0) && 
      (this.efn != null) && 
      (this.efn.contains(parambfE.ok()))) {
      int i = this.efn.get(parambfE.ok());
      if (i >= parambfE.bsQ()) {
        return baf.fhI;
      }
    }

    if ((paramalr != null) && (parambfE.bsL().bHN() > 0) && 
      (this.efo != null)) {
      long l = b(parambfE, paramalr);
      Integer localInteger = Integer.valueOf(this.efo.kZ(l));
      if ((localInteger != null) && 
        (localInteger.intValue() >= parambfE.bsL().bHN())) {
        return baf.fhH;
      }
    }

    return baf.fhx;
  }

  private long b(bfE parambfE, alr paramalr) {
    return parambfE.bsL().getId() << 32 | asd.af(paramalr);
  }

  public byte[] j() {
    int i = 1 + (this.efm == null ? 0 : this.efm.size() * 8) + 1 + (this.efn == null ? 0 : this.efn.size() * 8) + 1 + (this.efo == null ? 0 : this.efo.size() * 12);

    ByteBuffer localByteBuffer = ByteBuffer.allocate(i);
    Object localObject;
    if (this.efm == null) {
      localByteBuffer.put((byte)0);
    } else {
      localByteBuffer.put((byte)this.efm.size());
      localObject = this.efm.abR();
      while (((aso)localObject).hasNext()) {
        ((aso)localObject).fl();
        localByteBuffer.putInt(((aso)localObject).zY());
        localByteBuffer.putInt(((aso)localObject).value());
      }
    }

    if (this.efn == null) {
      localByteBuffer.put((byte)0);
    } else {
      localByteBuffer.put((byte)this.efn.size());
      localObject = this.efn.abR();
      while (((aso)localObject).hasNext()) {
        ((aso)localObject).fl();
        localByteBuffer.putInt(((aso)localObject).zY());
        localByteBuffer.putInt(((aso)localObject).value());
      }
    }

    if (this.efm == null) {
      localByteBuffer.put((byte)0);
    } else {
      localByteBuffer.put((byte)this.efo.size());
      for (localObject = this.efo.duF(); ((bWe)localObject).hasNext(); ) {
        ((bWe)localObject).fl();
        localByteBuffer.putLong(((bWe)localObject).bic());
        localByteBuffer.putInt(((bWe)localObject).value());
      }
    }

    return localByteBuffer.array();
  }

  public void a(ByteBuffer paramByteBuffer, dno paramdno)
  {
    int i = paramByteBuffer.get() & 0xFF;
    int j;
    bfE localbfE;
    if (i > 0) {
      aTr();
      this.efm.clear();
      for (j = i; j > 0; j--) {
        localbfE = (bfE)paramdno.hh(paramByteBuffer.getInt());
        this.efm.fg(localbfE.ok(), paramByteBuffer.getInt());
      }
    }

    i = paramByteBuffer.get() & 0xFF;
    if (i > 0) {
      aTs();
      this.efn.clear();
      for (j = i; j > 0; j--) {
        localbfE = (bfE)paramdno.hh(paramByteBuffer.getInt());
        this.efn.fg(localbfE.ok(), paramByteBuffer.getInt());
      }
    }

    i = paramByteBuffer.get() & 0xFF;
    if (i > 0) {
      aTt();
      this.efo.clear();
      for (j = i; j > 0; j--)
        this.efo.G(paramByteBuffer.getLong(), paramByteBuffer.getInt());
    }
  }

  public void dr(boolean paramBoolean)
  {
    this.efp = paramBoolean;
  }
}