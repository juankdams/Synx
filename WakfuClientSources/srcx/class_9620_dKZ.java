class dKZ
  implements aAI
{
  private boolean first = true;

  dKZ(KR paramKR, StringBuilder paramStringBuilder) {  } 
  public boolean f(short paramShort, int paramInt) { if (this.first) this.first = false; else {
      this.aBU.append(",");
    }
    this.aBU.append(paramShort);
    this.aBU.append("=");
    this.aBU.append(paramInt);
    return true;
  }
}