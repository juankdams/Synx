import java.util.ArrayList;
import java.util.Collections;

public class cFX
{
  public static final byte iBb = 1;
  public static final byte iBc = 2;
  public static final byte iBd = 3;
  private short iBe;
  private ArrayList iBf;
  private ArrayList iBg;
  private cQG iBh;
  private cQG iBi;
  private cQG iBj;
  private cQG iBk;
  private boolean iBl;

  public void a(int paramInt1, long paramLong1, long paramLong2, byte paramByte1, short paramShort, byte paramByte2, int paramInt2)
  {
    a(paramInt1, new cQG(paramLong1, paramLong2, paramByte1, paramShort, paramByte2, paramInt2));
  }

  private void a(int paramInt, cQG paramcQG) {
    switch (paramcQG.IS()) {
    case 0:
      c(paramInt, paramcQG);
      break;
    case -1:
      d(paramInt, paramcQG);
      break;
    case -2:
      e(paramInt, paramcQG);
      break;
    default:
      b(paramInt, paramcQG);
    }
  }

  private void b(int paramInt, cQG paramcQG)
  {
    ArrayList localArrayList;
    if (paramInt == 1) {
      if (this.iBf == null) {
        this.iBf = new ArrayList();
      }
      localArrayList = this.iBf;
    } else if (paramInt == 2) {
      if (this.iBg == null) {
        this.iBg = new ArrayList();
      }
      localArrayList = this.iBg;
    } else {
      return;
    }

    localArrayList.add(paramcQG);

    Collections.sort(localArrayList, bTJ.bZX());
  }

  private void c(int paramInt, cQG paramcQG) {
    if (paramInt == 1)
      this.iBh = paramcQG;
    else if (paramInt == 2)
      this.iBi = paramcQG;
  }

  private void d(int paramInt, cQG paramcQG)
  {
    this.iBj = paramcQG;
  }

  private void e(int paramInt, cQG paramcQG)
  {
    this.iBk = paramcQG;
  }

  public ArrayList cBk() {
    return this.iBf;
  }

  public ArrayList cBl() {
    return this.iBg;
  }

  public cQG cBm() {
    return this.iBh;
  }

  public cQG cBn() {
    return this.iBi;
  }

  public cQG cBo() {
    return this.iBj;
  }

  public cQG cBp() {
    return this.iBk;
  }

  public short cBq() {
    return this.iBe;
  }

  public void dC(short paramShort) {
    this.iBe = paramShort;
  }

  public void ie(boolean paramBoolean) {
    this.iBl = paramBoolean;
  }

  public boolean cBr() {
    return this.iBl;
  }

  final void d(aYQ paramaYQ)
  {
    this.iBe = paramaYQ.readShort();

    int i = paramaYQ.readShort();
    cQG localcQG;
    for (int j = 0; j < i; j++) {
      localcQG = new cQG();
      localcQG.d(paramaYQ);
      a(1, localcQG);
    }

    i = paramaYQ.readShort();
    for (j = 0; j < i; j++) {
      localcQG = new cQG();
      localcQG.d(paramaYQ);
      a(2, localcQG);
    }

    i = paramaYQ.readShort();
    for (j = 0; j < i; j++) {
      localcQG = new cQG();
      localcQG.d(paramaYQ);
      a(3, localcQG);
    }

    this.iBl = paramaYQ.bnT();
  }

  final void b(dSw paramdSw) {
    paramdSw.writeShort(this.iBe);

    short s = 0;
    if (this.iBf != null) {
      s = (short)(s + (short)this.iBf.size());
    }
    if (this.iBh != null) {
      s = (short)(s + 1);
    }

    paramdSw.writeShort(s);
    int i;
    int j;
    if (this.iBf != null) {
      i = 0; for (j = this.iBf.size(); i < j; i++) {
        ((cQG)this.iBf.get(i)).b(paramdSw);
      }
    }

    if (this.iBh != null) {
      this.iBh.b(paramdSw);
    }

    s = 0;
    if (this.iBg != null) {
      s = (short)(s + (short)this.iBg.size());
    }
    if (this.iBi != null) {
      s = (short)(s + 1);
    }

    paramdSw.writeShort(s);
    if (this.iBg != null) {
      i = 0; for (j = this.iBg.size(); i < j; i++) {
        ((cQG)this.iBg.get(i)).b(paramdSw);
      }
    }

    if (this.iBi != null) {
      this.iBi.b(paramdSw);
    }

    s = (short)((this.iBj != null ? 1 : 0) + (this.iBk != null ? 1 : 0));
    paramdSw.writeShort(s);
    if (this.iBj != null) {
      this.iBj.b(paramdSw);
    }

    if (this.iBk != null) {
      this.iBk.b(paramdSw);
    }

    paramdSw.lu(this.iBl);
  }

  public boolean a(cFX paramcFX) {
    if (paramcFX == this)
      return true;
    int i;
    int j;
    if ((paramcFX.iBf != null) && (this.iBf != null)) {
      if (paramcFX.iBf.size() != this.iBf.size())
      {
        return false;
      }
      i = 0; for (j = this.iBf.size(); i < j; i++) {
        if (!((cQG)this.iBf.get(i)).equals(paramcFX.iBf.get(i)))
          return false;
      }
    }
    else if ((paramcFX.iBf != null) || (this.iBf != null))
    {
      return false;
    }

    if ((paramcFX.iBg != null) && (this.iBg != null)) {
      if (paramcFX.iBg.size() != this.iBg.size())
      {
        return false;
      }
      i = 0; for (j = this.iBg.size(); i < j; i++) {
        if (!((cQG)this.iBg.get(i)).equals(paramcFX.iBg.get(i)))
          return false;
      }
    }
    else if ((paramcFX.iBg != null) || (this.iBg != null))
    {
      return false;
    }

    if ((this.iBh != null) && (paramcFX.iBh != null)) {
      if (!this.iBh.equals(paramcFX.iBh))
        return false;
    }
    else if ((this.iBh != null) || (paramcFX.iBh != null)) {
      return false;
    }

    if ((this.iBi != null) && (paramcFX.iBi != null)) {
      if (!this.iBi.equals(paramcFX.iBi))
        return false;
    }
    else if ((this.iBi != null) || (paramcFX.iBi != null)) {
      return false;
    }

    if ((this.iBj != null) && (paramcFX.iBj != null)) {
      if (!this.iBj.equals(paramcFX.iBj))
        return false;
    }
    else if ((this.iBj != null) || (paramcFX.iBj != null))
    {
      return false;
    }

    if ((this.iBk != null) && (paramcFX.iBk != null)) {
      if (!this.iBk.equals(paramcFX.iBk))
        return false;
    }
    else if ((this.iBk != null) || (paramcFX.iBk != null))
    {
      return false;
    }

    if (this.iBl != paramcFX.iBl) {
      return false;
    }
    return true;
  }
}