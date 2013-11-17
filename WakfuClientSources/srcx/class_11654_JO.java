import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public abstract class JO
{
  protected static final Logger K = Logger.getLogger(JO.class);

  protected final blx bUY = new blx();
  private cID bUZ;

  public blx Un()
  {
    return this.bUY;
  }

  public void a(cID paramcID) {
    this.bUZ = paramcID;
  }

  private void c(aid paramaid) {
    this.bUY.clear();
    this.bUY.aRq = paramaid.getId();
  }

  private void d(aid paramaid) {
    aYr localaYr1 = paramaid.auZ();
    bDs localbDs = new bDs();
    this.bUY.aRr = localbDs;
    if (localaYr1 != null)
      localbDs.gyY = localaYr1.bP();
    else {
      localbDs.gyY = -1;
    }
    aYr localaYr2 = paramaid.ava();
    if (localaYr2 != null)
      localbDs.gyZ = localaYr2.bP();
    else {
      localbDs.gyZ = -1;
    }
    bGI localbGI = paramaid.avb();
    if (localbGI != null)
      localbDs.gza = localbGI.getId();
    else {
      localbDs.gza = -1;
    }
    a(paramaid, localbDs);
  }

  private byte[] Uo() {
    return a(this.bUY);
  }

  public byte[] a(blx paramblx) {
    int i = paramblx.O();
    ByteBuffer localByteBuffer = ByteBuffer.allocate(i);
    paramblx.g(localByteBuffer);
    return localByteBuffer.array();
  }

  public byte[] e(aid paramaid)
  {
    c(paramaid);
    d(paramaid);

    this.bUY.aRs = new bPH();
    a(paramaid, this.bUY.aRs);

    this.bUY.aRy = new baA();
    a(paramaid, this.bUY.aRy);

    this.bUY.aRA = new bSk();
    b(paramaid, this.bUY.aRA);

    this.bUY.aRB = new ed();
    a(paramaid, this.bUY.aRB);

    this.bUY.aRC = new aKR();
    a(paramaid, this.bUY.aRC);

    this.bUY.aRu = new ij();
    a(paramaid, this.bUY.aRu);

    this.bUY.aRD = new cZY();
    b(paramaid, this.bUY.aRD);

    return Uo();
  }

  public byte[] f(aid paramaid) {
    c(paramaid);
    d(paramaid);

    this.bUY.aRs = new bPH();
    a(paramaid, this.bUY.aRs);

    this.bUY.aRy = new baA();
    a(paramaid, this.bUY.aRy);

    this.bUY.aRA = new bSk();
    b(paramaid, this.bUY.aRA);

    this.bUY.aRB = new ed();
    a(paramaid, this.bUY.aRB);

    this.bUY.aRC = new aKR();
    a(paramaid, this.bUY.aRC);

    this.bUY.aRu = new ij();
    a(paramaid, this.bUY.aRu);

    this.bUY.aRD = new cZY();
    b(paramaid, this.bUY.aRD);

    return Uo();
  }

  public byte[] g(aid paramaid) {
    c(paramaid);

    this.bUY.aRy = new baA();
    a(paramaid, this.bUY.aRy);

    return Uo();
  }

  public byte[] h(aid paramaid)
  {
    c(paramaid);

    this.bUY.aRt = new cil();
    a(paramaid, this.bUY.aRt);

    this.bUY.aRs = new bPH();
    a(paramaid, this.bUY.aRs);

    this.bUY.aRv = new aTM();
    a(paramaid, this.bUY.aRv);

    this.bUY.aRw = new cvs();
    a(paramaid, this.bUY.aRw);

    this.bUY.aRy = new baA();
    a(paramaid, this.bUY.aRy);

    this.bUY.aRu = new ij();
    a(paramaid, this.bUY.aRu);

    this.bUY.aRz = new dvI();
    a(paramaid, this.bUY.aRz);

    this.bUY.aRB = new ed();
    a(paramaid, this.bUY.aRB);

    this.bUY.aRC = new aKR();
    a(paramaid, this.bUY.aRC);

    this.bUY.aRD = new cZY();
    b(paramaid, this.bUY.aRD);

    return Uo();
  }

  public byte[] i(aid paramaid) {
    c(paramaid);
    d(paramaid);

    this.bUY.aRt = new cil();
    a(paramaid, this.bUY.aRt);

    this.bUY.aRs = new bPH();
    a(paramaid, this.bUY.aRs);

    this.bUY.aRu = new ij();
    a(paramaid, this.bUY.aRu);

    this.bUY.aRw = new cvs();
    a(paramaid, this.bUY.aRw);

    this.bUY.aRy = new baA();
    a(paramaid, this.bUY.aRy);

    this.bUY.aRz = new dvI();
    a(paramaid, this.bUY.aRz);

    this.bUY.aRB = new ed();
    a(paramaid, this.bUY.aRB);

    this.bUY.aRC = new aKR();
    a(paramaid, this.bUY.aRC);

    this.bUY.aRD = new cZY();
    b(paramaid, this.bUY.aRD);

    return Uo();
  }

  public byte[] j(aid paramaid) {
    c(paramaid);
    d(paramaid);

    this.bUY.aRt = new cil();
    a(paramaid, this.bUY.aRt);

    this.bUY.aRs = new bPH();
    a(paramaid, this.bUY.aRs);

    this.bUY.aRu = new ij();
    a(paramaid, this.bUY.aRu);

    this.bUY.aRw = new cvs();
    a(paramaid, this.bUY.aRw);

    this.bUY.aRy = new baA();
    a(paramaid, this.bUY.aRy);

    this.bUY.aRz = new dvI();
    a(paramaid, this.bUY.aRz);

    this.bUY.aRB = new ed();
    a(paramaid, this.bUY.aRB);

    this.bUY.aRC = new aKR();
    a(paramaid, this.bUY.aRC);

    this.bUY.aRx = new ara();
    a(paramaid, this.bUY.aRx);

    this.bUY.aRD = new cZY();
    b(paramaid, this.bUY.aRD);

    return Uo();
  }

  public byte[] k(aid paramaid)
  {
    c(paramaid);
    d(paramaid);

    this.bUY.aRt = new cil();
    a(paramaid, this.bUY.aRt);

    this.bUY.aRs = new bPH();
    a(paramaid, this.bUY.aRs);

    this.bUY.aRB = new ed();
    a(paramaid, this.bUY.aRB);

    this.bUY.aRC = new aKR();
    a(paramaid, this.bUY.aRC);

    return Uo();
  }

  public aid N(ByteBuffer paramByteBuffer)
  {
    if (this.bUZ == null) {
      throw new UnsupportedOperationException("La factory de protecteur doit être définie");
    }
    aid localaid = this.bUZ.ch(-1);
    if (localaid != null) {
      a(paramByteBuffer, localaid);
    }
    return localaid;
  }

  public int O(ByteBuffer paramByteBuffer) {
    this.bUY.clear();
    this.bUY.h(paramByteBuffer);
    return this.bUY.aRq;
  }

  public void a(ByteBuffer paramByteBuffer, aid paramaid) {
    this.bUY.clear();
    this.bUY.h(paramByteBuffer);

    paramaid.d(this.bUY.aRq);

    bDs localbDs = this.bUY.aRr;
    if (localbDs != null) {
      localObject = dsh.luB.BA(localbDs.gyY);
      aYr localaYr = dsh.luB.BA(localbDs.gyZ);
      bGI localbGI = QI.cpK.gq(localbDs.gza);

      paramaid.f((aYr)localObject);
      paramaid.g(localaYr);
      paramaid.b(localbGI);

      b(paramaid, localbDs);
    }

    Object localObject = this.bUY.aRs;
    if (localObject != null) {
      try {
        b(paramaid, (bPH)localObject);
      } catch (Exception localException1) {
        K.error("Exception", localException1);
      }

    }

    cil localcil = this.bUY.aRt;
    if (localcil != null) {
      try {
        b(paramaid, localcil);
      } catch (Exception localException2) {
        K.error("Exception", localException2);
      }

    }

    ij localij = this.bUY.aRu;
    if (localij != null) {
      try {
        b(paramaid, localij);
      } catch (Exception localException3) {
        K.error("Exception", localException3);
      }

    }

    aTM localaTM = this.bUY.aRv;
    if (localaTM != null) {
      try {
        b(paramaid, localaTM);
      } catch (Exception localException4) {
        K.error("Exception", localException4);
      }

    }

    cvs localcvs = this.bUY.aRw;
    if (localcvs != null) {
      try {
        b(paramaid, localcvs);
      } catch (Exception localException5) {
        K.error("Exception", localException5);
      }
    }

    ara localara = this.bUY.aRx;
    if (localara != null) {
      try {
        b(paramaid, localara);
      } catch (Exception localException6) {
        K.error("Exception levee", localException6);
      }

    }

    baA localbaA = this.bUY.aRy;
    if (localbaA != null) {
      try {
        b(paramaid, localbaA);
      } catch (Exception localException7) {
        K.error("Exception", localException7);
      }

    }

    dvI localdvI = this.bUY.aRz;
    if (localdvI != null) {
      try {
        b(paramaid, localdvI);
      } catch (Exception localException8) {
        K.error("Exception", localException8);
      }
    }

    bSk localbSk = this.bUY.aRA;
    if (localbSk != null) {
      try {
        a(paramaid, localbSk);
      } catch (Exception localException9) {
        K.error("Exception", localException9);
      }
    }

    ed localed = this.bUY.aRB;
    if (localed != null) {
      try {
        b(paramaid, localed);
      } catch (Exception localException10) {
        K.error("Exception", localException10);
      }
    }

    aKR localaKR = this.bUY.aRC;
    if (localaKR != null) {
      try {
        b(paramaid, localaKR);
      } catch (Exception localException11) {
        K.error("Exception", localException11);
      }
    }

    cZY localcZY = this.bUY.aRD;
    if (localcZY != null) {
      try {
        a(paramaid, localcZY);
      } catch (Exception localException12) {
        K.error("Exception", localException12);
      }
    }

    l(paramaid);
  }

  public abstract void a(aid paramaid, ara paramara);

  public abstract void b(aid paramaid, ara paramara);

  public abstract void a(aid paramaid, bDs parambDs);

  public abstract void b(aid paramaid, bDs parambDs);

  public abstract void a(aid paramaid, cil paramcil);

  public abstract void b(aid paramaid, cil paramcil);

  public abstract void a(aid paramaid, bPH parambPH);

  public abstract void b(aid paramaid, bPH parambPH);

  public abstract void a(aid paramaid, ij paramij);

  public abstract void b(aid paramaid, ij paramij);

  public abstract void a(aid paramaid, aTM paramaTM);

  public abstract void b(aid paramaid, aTM paramaTM);

  public abstract void a(aid paramaid, cvs paramcvs);

  public abstract void b(aid paramaid, cvs paramcvs);

  public abstract void a(aid paramaid, baA parambaA);

  public abstract void b(aid paramaid, baA parambaA);

  public abstract void a(aid paramaid, dvI paramdvI);

  public abstract void b(aid paramaid, dvI paramdvI);

  protected abstract void a(aid paramaid, aKR paramaKR);

  protected abstract void b(aid paramaid, aKR paramaKR);

  protected abstract void a(aid paramaid, ed paramed);

  protected abstract void b(aid paramaid, ed paramed);

  protected abstract void a(aid paramaid, bSk parambSk);

  protected abstract void b(aid paramaid, bSk parambSk);

  protected abstract void a(aid paramaid, cZY paramcZY);

  protected abstract void b(aid paramaid, cZY paramcZY);

  protected abstract void l(aid paramaid);
}