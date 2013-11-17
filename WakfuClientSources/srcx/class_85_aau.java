class aau
  implements diA
{
  private boolean first = true;

  aau(cyE paramcyE, StringBuilder paramStringBuilder) {  } 
  public boolean a(byte paramByte, short paramShort) { if (this.first) this.first = false; else {
      this.aBU.append(",");
    }
    this.aBU.append(paramByte);
    this.aBU.append("=");
    this.aBU.append(paramShort);
    return true;
  }
}