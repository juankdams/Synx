import java.util.ArrayList;

public class czg
{
  public int aw;
  public int inU = -1;
  public boolean inV;
  public boolean inW;
  public boolean inX;
  public String m_name;
  public final ArrayList eVC = new ArrayList();

  public final cbQ inY = new cbQ();
  public byte inZ;
  public boolean gfu;
  public ML gfv;
  public int bJf;
  public byte ioa;
  public byte iob;
  public int dAt;
  public int ioc;
  public int dAv;
  public int dAw;
  public int dAx;
  public int dAy;
  public boolean dAz = true;
  public int dAD;
  public int dAC;
  public int gfh = -1;

  public int iod = -1;
  public int ioe = -1;
  public int dAQ;

  public void d(aYQ paramaYQ)
  {
    this.aw = paramaYQ.readInt();
    this.inU = paramaYQ.readInt();
    this.inV = paramaYQ.bnT();
    this.inW = paramaYQ.bnT();
    this.inX = paramaYQ.bnT();
    this.m_name = paramaYQ.readString();
    this.iod = paramaYQ.readInt();
    this.ioe = paramaYQ.readInt();

    if (this.inW) {
      this.inZ = paramaYQ.readByte();
      this.gfu = paramaYQ.bnT();

      boolean bool = paramaYQ.bnT();
      if (bool) {
        this.gfv = azS.bv(paramaYQ.readByte()).ayR();
        this.gfv.d(paramaYQ);
      }
    }

    if (this.inX) {
      this.bJf = paramaYQ.readInt();
    }

    int i = paramaYQ.readInt();
    this.eVC.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      this.eVC.add(auU.j(paramaYQ));
    }

    j = paramaYQ.readInt();
    this.inY.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      this.inY.add(paramaYQ.readLong());
    }

    if (!this.inV) {
      this.ioa = paramaYQ.readByte();
      this.iob = paramaYQ.readByte();
      this.dAt = paramaYQ.readInt();
      this.ioc = paramaYQ.readInt();
      this.dAv = paramaYQ.readInt();
      this.dAw = paramaYQ.readInt();
      this.dAx = paramaYQ.readInt();
      this.dAy = paramaYQ.readInt();
      this.dAz = paramaYQ.bnT();
      this.dAD = paramaYQ.readInt();
      this.dAC = paramaYQ.readInt();
      this.gfh = paramaYQ.readInt();
      this.dAQ = paramaYQ.readInt();
    }
  }

  public void b(dSw paramdSw) {
    paramdSw.writeInt(this.aw);
    paramdSw.writeInt(this.inU);
    paramdSw.lu(this.inV);
    paramdSw.lu(this.inW);
    paramdSw.lu(this.inX);
    paramdSw.writeString(this.m_name);
    paramdSw.writeInt(this.iod);
    paramdSw.writeInt(this.ioe);

    if (this.inW) {
      paramdSw.writeByte(this.inZ);
      paramdSw.lu(this.gfu);

      paramdSw.lu(this.gfv != null);
      if (this.gfv != null) {
        paramdSw.writeByte(this.gfv.nq());
        this.gfv.b(paramdSw);
      }
    }

    if (this.inX) {
      paramdSw.writeInt(this.bJf);
    }

    paramdSw.writeInt(this.eVC.size());
    int i = 0; for (int j = this.eVC.size(); i < j; i++) {
      auU.a(paramdSw, (XF)this.eVC.get(i));
    }

    paramdSw.writeInt(this.inY.size());
    i = 0; for (j = this.inY.size(); i < j; i++) {
      paramdSw.writeLong(this.inY.get(i));
    }

    if (!this.inV) {
      paramdSw.writeByte(this.ioa);
      paramdSw.writeByte(this.iob);
      paramdSw.writeInt(this.dAt);
      paramdSw.writeInt(this.ioc);
      paramdSw.writeInt(this.dAv);
      paramdSw.writeInt(this.dAw);
      paramdSw.writeInt(this.dAx);
      paramdSw.writeInt(this.dAy);
      paramdSw.lu(this.dAz);
      paramdSw.writeInt(this.dAD);
      paramdSw.writeInt(this.dAC);
      paramdSw.writeInt(this.gfh);
      paramdSw.writeInt(this.dAQ);
    }
  }

  private void a(dSw paramdSw, String paramString1, String paramString2) {
    paramdSw.writeString(paramString1);
    paramdSw.writeString(paramString2);
  }

  private void a(aYQ paramaYQ, String paramString1, String paramString2) {
    if (paramString1.equals("id")) {
      this.aw = bUD.aR(paramString2);
    } else if (paramString1.equals("strataId")) {
      this.inU = bUD.aR(paramString2);
    } else if (paramString1.equals("parentContainer")) {
      this.inV = bUD.getBoolean(paramString2);
    } else if (paramString1.equals("eventContainer")) {
      this.inW = bUD.getBoolean(paramString2);
    } else if (paramString1.equals("audioMarkerContainer")) {
      this.inX = bUD.getBoolean(paramString2);
    } else if (paramString1.equals("audioMarkerType")) {
      this.bJf = bUD.aR(paramString2);
    } else if (paramString1.equals("eventType")) {
      this.inZ = bUD.getByte(paramString2);
    } else if (paramString1.equals("eventIsLocalized")) {
      this.gfu = bUD.getBoolean(paramString2);
    } else if (paramString1.equals("name")) {
      this.m_name = paramString2;
    } else if (paramString1.equals("gain")) {
      this.iod = bUD.aR(paramString2);
    } else if (paramString1.equals("maxGain")) {
      this.ioe = bUD.aR(paramString2);
    } else if (paramString1.equals("hasEventCriterion")) {
      boolean bool = bUD.getBoolean(paramString2);
      if (bool) {
        this.gfv = azS.bv(paramaYQ.readByte()).ayR();
        this.gfv.d(paramaYQ);
      }
    }
    else
    {
      int i;
      int j;
      if (paramString1.equals("criteriaSize")) {
        i = bUD.aR(paramString2);
        this.eVC.ensureCapacity(i);
        for (j = 0; j < i; j++)
          this.eVC.add(auU.j(paramaYQ));
      }
      else if (paramString1.equals("sourcesSize")) {
        i = bUD.aR(paramString2);
        this.inY.ensureCapacity(i);
        for (j = 0; j < i; j++)
          this.inY.add(paramaYQ.readLong());
      }
      else if (paramString1.equals("busId")) {
        this.ioa = bUD.getByte(paramString2);
      } else if (paramString1.equals("busType")) {
        this.iob = bUD.getByte(paramString2);
      } else if (paramString1.equals("playType")) {
        this.dAt = bUD.aR(paramString2);
      } else if (paramString1.equals("transition")) {
        this.ioc = bUD.aR(paramString2);
      } else if (paramString1.equals("transitionMinDuration")) {
        this.dAv = bUD.aR(paramString2);
        this.dAx = this.dAv;
      } else if (paramString1.equals("transitionMaxDuration")) {
        this.dAw = bUD.aR(paramString2);
        this.dAy = this.dAw;
      } else if (paramString1.equals("transitionInMinDuration")) {
        this.dAv = bUD.aR(paramString2);
      } else if (paramString1.equals("transitionInMaxDuration")) {
        this.dAw = bUD.aR(paramString2);
      } else if (paramString1.equals("transitionOutMinDuration")) {
        this.dAx = bUD.aR(paramString2);
      } else if (paramString1.equals("transitionOutMaxDuration")) {
        this.dAy = bUD.aR(paramString2);
      } else if (paramString1.equals("transitionUseSameInOutValues")) {
        this.dAz = bUD.getBoolean(paramString2);
      } else if (paramString1.equals("loopMode")) {
        this.dAD = bUD.aR(paramString2);
      } else if (paramString1.equals("loopDuration")) {
        this.dAC = bUD.aR(paramString2);
      } else if (paramString1.equals("rollOffId")) {
        this.gfh = bUD.aR(paramString2);
      } else if (paramString1.equals("initialDelay")) {
        this.dAQ = bUD.aR(paramString2);
      }
    }
  }

  public void l(aYQ paramaYQ)
  {
    String str1 = paramaYQ.readString();
    if (!str1.equals("rsc")) {
      return;
    }
    paramaYQ.readString();
    while (true)
    {
      String str2 = paramaYQ.readString();
      String str3 = paramaYQ.readString();

      if (str2.equals("/rsc")) {
        return;
      }
      a(paramaYQ, str2, str3);
    }
  }

  public void f(dSw paramdSw) {
    a(paramdSw, "rsc", "");

    a(paramdSw, "id", String.valueOf(this.aw));
    a(paramdSw, "strataId", String.valueOf(this.inU));
    a(paramdSw, "parentContainer", String.valueOf(this.inV));

    a(paramdSw, "eventContainer", String.valueOf(this.inW));
    a(paramdSw, "eventType", String.valueOf(this.inZ));
    a(paramdSw, "eventIsLocalized", String.valueOf(this.gfu));

    a(paramdSw, "audioMarkerContainer", String.valueOf(this.inX));
    a(paramdSw, "audioMarkerType", String.valueOf(this.bJf));

    a(paramdSw, "name", this.m_name);

    a(paramdSw, "gain", String.valueOf(this.iod));
    a(paramdSw, "maxGain", String.valueOf(this.ioe));

    a(paramdSw, "hasEventCriterion", String.valueOf(this.gfv != null));

    if (this.gfv != null) {
      paramdSw.writeByte(this.gfv.nq());
      this.gfv.b(paramdSw);
    }

    a(paramdSw, "criteriaSize", String.valueOf(this.eVC.size()));

    int i = 0; for (int j = this.eVC.size(); i < j; i++) {
      auU.a(paramdSw, (XF)this.eVC.get(i));
    }

    a(paramdSw, "sourcesSize", String.valueOf(this.inY.size()));

    i = 0; for (j = this.inY.size(); i < j; i++) {
      paramdSw.writeLong(this.inY.get(i));
    }

    if (!this.inV) {
      a(paramdSw, "busId", String.valueOf(this.ioa));
      a(paramdSw, "busType", String.valueOf(this.iob));
      a(paramdSw, "playType", String.valueOf(this.dAt));
      a(paramdSw, "transition", String.valueOf(this.ioc));
      a(paramdSw, "transitionInMinDuration", String.valueOf(this.dAv));
      a(paramdSw, "transitionInMaxDuration", String.valueOf(this.dAw));
      a(paramdSw, "transitionOutMinDuration", String.valueOf(this.dAx));
      a(paramdSw, "transitionOutMaxDuration", String.valueOf(this.dAy));
      a(paramdSw, "transitionUseSameInOutValues", String.valueOf(this.dAz));
      a(paramdSw, "loopMode", String.valueOf(this.dAD));
      a(paramdSw, "loopDuration", String.valueOf(this.dAC));
      a(paramdSw, "rollOffId", String.valueOf(this.gfh));
      a(paramdSw, "initialDelay", String.valueOf(this.dAQ));
    }

    a(paramdSw, "/rsc", "");
  }

  public void f(czg paramczg) {
    paramczg.aw = this.aw;
    paramczg.inU = this.inU;
    paramczg.inV = this.inV;
    paramczg.inW = this.inW;
    paramczg.inX = this.inX;
    paramczg.bJf = this.bJf;
    paramczg.inZ = this.inZ;
    paramczg.gfu = this.gfu;
    paramczg.m_name = this.m_name;

    paramczg.gfv = (this.gfv != null ? this.gfv.nr() : null);

    int i = 0; for (int j = this.eVC.size(); i < j; i++) {
      paramczg.eVC.add(((XF)this.eVC.get(i)).ajE());
    }

    i = 0; for (j = this.inY.size(); i < j; i++) {
      paramczg.inY.add(this.inY.get(i));
    }

    paramczg.ioa = this.ioa;
    paramczg.iob = this.iob;
    paramczg.dAt = this.dAt;
    paramczg.ioc = this.ioc;
    paramczg.dAv = this.dAv;
    paramczg.dAw = this.dAw;
    paramczg.dAx = this.dAx;
    paramczg.dAy = this.dAy;
    paramczg.dAz = this.dAz;
    paramczg.dAD = this.dAD;
    paramczg.dAC = this.dAC;
    paramczg.gfh = this.gfh;
    paramczg.iod = this.iod;
    paramczg.ioe = this.ioe;
    paramczg.dAQ = this.dAQ;
  }

  public String toString()
  {
    return this.m_name + " (id=" + this.aw + ")";
  }
}