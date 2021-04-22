public enum Genero {
  CIS {
    @Override
    public String toString() {
      return "cisgênero";
    }
  },
  TRANS {
    @Override
    public String toString() {
        return "transgênero";
    }
  },
  FLUID {
    @Override
    public String toString() {
      return "gênero fluido";
    }
  },
  NONBIN {
    @Override
    public String toString() {
      return "não-binário";
    }
  }
}
