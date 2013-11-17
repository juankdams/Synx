class dTM
  implements bhn
{
  private boolean first = true;

  dTM(dPx paramdPx, StringBuilder paramStringBuilder) {  } 
  public boolean b(byte paramByte, Object paramObject) { if (this.first) this.first = false; else {
      this.aBU.append(",");
    }
    this.aBU.append(paramByte);
    this.aBU.append("=");
    this.aBU.append(paramObject);
    return true;
  }
}